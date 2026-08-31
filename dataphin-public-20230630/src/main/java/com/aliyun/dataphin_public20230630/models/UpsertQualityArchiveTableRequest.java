// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpsertQualityArchiveTableRequest extends TeaModel {
    /**
     * <p>The tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>The ID of the operator.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    /**
     * <p>The upsert command.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("UpsertCommand")
    public UpsertQualityArchiveTableRequestUpsertCommand upsertCommand;

    public static UpsertQualityArchiveTableRequest build(java.util.Map<String, ?> map) throws Exception {
        UpsertQualityArchiveTableRequest self = new UpsertQualityArchiveTableRequest();
        return TeaModel.build(map, self);
    }

    public UpsertQualityArchiveTableRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public UpsertQualityArchiveTableRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public UpsertQualityArchiveTableRequest setUpsertCommand(UpsertQualityArchiveTableRequestUpsertCommand upsertCommand) {
        this.upsertCommand = upsertCommand;
        return this;
    }
    public UpsertQualityArchiveTableRequestUpsertCommand getUpsertCommand() {
        return this.upsertCommand;
    }

    public static class UpsertQualityArchiveTableRequestUpsertCommand extends TeaModel {
        /**
         * <p>The mode for adding the archived table. Valid values:</p>
         * <ul>
         * <li>CREATE_NEW_TABLE: creates a new table.</li>
         * <li>BIND_EXIST_TABLE: binds an existing table.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CREATE_NEW_TABLE</p>
         */
        @NameInMap("AddMode")
        public String addMode;

        /**
         * <p>The ID of the archived table. If this parameter is specified, the operation runs in update mode, and you cannot specify AddMode or NewTableNamePrefix. If this parameter is not specified, the operation runs in create mode.</p>
         * 
         * <strong>example:</strong>
         * <p>88012</p>
         */
        @NameInMap("ArchiveTableId")
        public Long archiveTableId;

        /**
         * <p>The name of the existing table. This parameter is required when AddMode is set to BIND_EXIST_TABLE. For Dataphin tables, use the format &quot;project_name.table_name&quot; (for example, dataphin03.ads_region_order_summary). For datasource tables, use the format &quot;database/schema.table_name&quot; (for example, order_db.order_exception_data). The table must belong to the same project or datasource as the monitored object, and the table schema must contain system fields with the dataphin_quality_ prefix.</p>
         * 
         * <strong>example:</strong>
         * <p>dataphin03.ads_region_order_summary</p>
         */
        @NameInMap("ExistTableName")
        public String existTableName;

        /**
         * <p>The lifecycle of the table, in days. The value must be a positive integer. If this parameter is not specified, no lifecycle is set. This parameter is valid only when creating a new table or in edit pattern, and only when the table belongs to MaxCompute, Hadoop series, or Hive. This parameter cannot be specified when AddMode is set to BIND_EXIST_TABLE.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Lifecycle")
        public Integer lifecycle;

        /**
         * <p>The maximum number of archived rows. A positive integer specifies the limit on the number of archived rows. The console provides options of 10,000, 100,000, and 500,000. A value of -1 indicates full archiving. Default value: 10000. This parameter is supported only for MaxCompute, Hadoop series, or Hive.</p>
         * 
         * <strong>example:</strong>
         * <p>100000</p>
         */
        @NameInMap("MaxArchiveCount")
        public Long maxArchiveCount;

        /**
         * <p>The table name prefix for the new archived table. This parameter is required when AddMode is set to CREATE_NEW_TABLE. The system automatically appends the _exception_data suffix. For example, if you specify vip_user_tips112, the actual table name is vip_user_tips112_exception_data.</p>
         * 
         * <strong>example:</strong>
         * <p>vip_user_tips112</p>
         */
        @NameInMap("NewTableNamePrefix")
        public String newTableNamePrefix;

        /**
         * <p>Specifies whether to set the archived table as the active table. Only the value true is supported. After the table is set as active, the previously active table under the same monitored object is automatically deactivated (only one active table is allowed at a time). If you set this parameter to false, an InvalidParameter error is returned. If this parameter is not specified, the default value true is used. If this parameter is left empty, the active status remains unchanged.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SetActive")
        public Boolean setActive;

        /**
         * <p>The ID of the monitored object to which the archived table belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("WatchId")
        public Long watchId;

        public static UpsertQualityArchiveTableRequestUpsertCommand build(java.util.Map<String, ?> map) throws Exception {
            UpsertQualityArchiveTableRequestUpsertCommand self = new UpsertQualityArchiveTableRequestUpsertCommand();
            return TeaModel.build(map, self);
        }

        public UpsertQualityArchiveTableRequestUpsertCommand setAddMode(String addMode) {
            this.addMode = addMode;
            return this;
        }
        public String getAddMode() {
            return this.addMode;
        }

        public UpsertQualityArchiveTableRequestUpsertCommand setArchiveTableId(Long archiveTableId) {
            this.archiveTableId = archiveTableId;
            return this;
        }
        public Long getArchiveTableId() {
            return this.archiveTableId;
        }

        public UpsertQualityArchiveTableRequestUpsertCommand setExistTableName(String existTableName) {
            this.existTableName = existTableName;
            return this;
        }
        public String getExistTableName() {
            return this.existTableName;
        }

        public UpsertQualityArchiveTableRequestUpsertCommand setLifecycle(Integer lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }
        public Integer getLifecycle() {
            return this.lifecycle;
        }

        public UpsertQualityArchiveTableRequestUpsertCommand setMaxArchiveCount(Long maxArchiveCount) {
            this.maxArchiveCount = maxArchiveCount;
            return this;
        }
        public Long getMaxArchiveCount() {
            return this.maxArchiveCount;
        }

        public UpsertQualityArchiveTableRequestUpsertCommand setNewTableNamePrefix(String newTableNamePrefix) {
            this.newTableNamePrefix = newTableNamePrefix;
            return this;
        }
        public String getNewTableNamePrefix() {
            return this.newTableNamePrefix;
        }

        public UpsertQualityArchiveTableRequestUpsertCommand setSetActive(Boolean setActive) {
            this.setActive = setActive;
            return this;
        }
        public Boolean getSetActive() {
            return this.setActive;
        }

        public UpsertQualityArchiveTableRequestUpsertCommand setWatchId(Long watchId) {
            this.watchId = watchId;
            return this;
        }
        public Long getWatchId() {
            return this.watchId;
        }

    }

}
