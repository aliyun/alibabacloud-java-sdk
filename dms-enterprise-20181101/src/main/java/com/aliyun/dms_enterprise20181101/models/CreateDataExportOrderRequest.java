// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateDataExportOrderRequest extends TeaModel {
    /**
     * <p>The key of the attachment that provides more instructions for the ticket. You can call the [GetUserUploadFileJob](~~206069~~) operation to obtain the attachment key.</p>
     */
    @NameInMap("AttachmentKey")
    public String attachmentKey;

    /**
     * <p>The purpose or objective of the ticket. This parameter helps reduce unnecessary communication.</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The ID of the parent ticket.</p>
     */
    @NameInMap("ParentId")
    public Long parentId;

    /**
     * <p>The parameters of the ticket.</p>
     */
    @NameInMap("PluginParam")
    public CreateDataExportOrderRequestPluginParam pluginParam;

    /**
     * <p>The stakeholders involved in this operation.</p>
     */
    @NameInMap("RelatedUserList")
    public java.util.List<Long> relatedUserList;

    /**
     * <p>The tenant ID.</p>
     * <br>
     * <p>> To view the ID of the tenant, move the pointer over the profile picture in the upper-right corner of the DMS console. For more information, see the [View information about the current tenant](~~181330~~) section of the "Manage DMS tenants" topic.</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static CreateDataExportOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataExportOrderRequest self = new CreateDataExportOrderRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataExportOrderRequest setAttachmentKey(String attachmentKey) {
        this.attachmentKey = attachmentKey;
        return this;
    }
    public String getAttachmentKey() {
        return this.attachmentKey;
    }

    public CreateDataExportOrderRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public CreateDataExportOrderRequest setParentId(Long parentId) {
        this.parentId = parentId;
        return this;
    }
    public Long getParentId() {
        return this.parentId;
    }

    public CreateDataExportOrderRequest setPluginParam(CreateDataExportOrderRequestPluginParam pluginParam) {
        this.pluginParam = pluginParam;
        return this;
    }
    public CreateDataExportOrderRequestPluginParam getPluginParam() {
        return this.pluginParam;
    }

    public CreateDataExportOrderRequest setRelatedUserList(java.util.List<Long> relatedUserList) {
        this.relatedUserList = relatedUserList;
        return this;
    }
    public java.util.List<Long> getRelatedUserList() {
        return this.relatedUserList;
    }

    public CreateDataExportOrderRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public static class CreateDataExportOrderRequestPluginParamWatermark extends TeaModel {
        /**
         * <p>The field into which the watermark is to be embedded.</p>
         */
        @NameInMap("ColumnName")
        public String columnName;

        /**
         * <p>The information to be embedded as a watermark into data.</p>
         */
        @NameInMap("DataWatermark")
        public String dataWatermark;

        /**
         * <p>The information to be embedded as a watermark into files.</p>
         */
        @NameInMap("FileWatermark")
        public String fileWatermark;

        /**
         * <p>One or more primary keys or unique keys.</p>
         */
        @NameInMap("Keys")
        public java.util.List<String> keys;

        /**
         * <p>The methods in which the watermark is embedded.</p>
         */
        @NameInMap("WatermarkTypes")
        public java.util.List<String> watermarkTypes;

        public static CreateDataExportOrderRequestPluginParamWatermark build(java.util.Map<String, ?> map) throws Exception {
            CreateDataExportOrderRequestPluginParamWatermark self = new CreateDataExportOrderRequestPluginParamWatermark();
            return TeaModel.build(map, self);
        }

        public CreateDataExportOrderRequestPluginParamWatermark setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public CreateDataExportOrderRequestPluginParamWatermark setDataWatermark(String dataWatermark) {
            this.dataWatermark = dataWatermark;
            return this;
        }
        public String getDataWatermark() {
            return this.dataWatermark;
        }

        public CreateDataExportOrderRequestPluginParamWatermark setFileWatermark(String fileWatermark) {
            this.fileWatermark = fileWatermark;
            return this;
        }
        public String getFileWatermark() {
            return this.fileWatermark;
        }

        public CreateDataExportOrderRequestPluginParamWatermark setKeys(java.util.List<String> keys) {
            this.keys = keys;
            return this;
        }
        public java.util.List<String> getKeys() {
            return this.keys;
        }

        public CreateDataExportOrderRequestPluginParamWatermark setWatermarkTypes(java.util.List<String> watermarkTypes) {
            this.watermarkTypes = watermarkTypes;
            return this;
        }
        public java.util.List<String> getWatermarkTypes() {
            return this.watermarkTypes;
        }

    }

    public static class CreateDataExportOrderRequestPluginParam extends TeaModel {
        /**
         * <p>The estimated number of data rows to be affected.</p>
         */
        @NameInMap("AffectRows")
        public Long affectRows;

        /**
         * <p>The reason for the export ticket.</p>
         */
        @NameInMap("Classify")
        public String classify;

        /**
         * <p>The database ID.</p>
         */
        @NameInMap("DbId")
        public Long dbId;

        /**
         * <p>The SQL statements that can be executed.</p>
         */
        @NameInMap("ExeSQL")
        public String exeSQL;

        /**
         * <p>Specifies whether to skip verification. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("IgnoreAffectRows")
        public Boolean ignoreAffectRows;

        /**
         * <p>The reason for skipping verification. This parameter is required if you set IgnoreAffectRows to true.</p>
         */
        @NameInMap("IgnoreAffectRowsReason")
        public String ignoreAffectRowsReason;

        /**
         * <p>The instance ID.</p>
         */
        @NameInMap("InstanceId")
        public Long instanceId;

        /**
         * <p>Specifies whether the database is a logical database. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         * <br>
         * <p>> If you set this parameter to **true**, the database that you specify must be a logical database.</p>
         */
        @NameInMap("Logic")
        public Boolean logic;

        /**
         * <p>The information about the watermarks.</p>
         */
        @NameInMap("Watermark")
        public CreateDataExportOrderRequestPluginParamWatermark watermark;

        public static CreateDataExportOrderRequestPluginParam build(java.util.Map<String, ?> map) throws Exception {
            CreateDataExportOrderRequestPluginParam self = new CreateDataExportOrderRequestPluginParam();
            return TeaModel.build(map, self);
        }

        public CreateDataExportOrderRequestPluginParam setAffectRows(Long affectRows) {
            this.affectRows = affectRows;
            return this;
        }
        public Long getAffectRows() {
            return this.affectRows;
        }

        public CreateDataExportOrderRequestPluginParam setClassify(String classify) {
            this.classify = classify;
            return this;
        }
        public String getClassify() {
            return this.classify;
        }

        public CreateDataExportOrderRequestPluginParam setDbId(Long dbId) {
            this.dbId = dbId;
            return this;
        }
        public Long getDbId() {
            return this.dbId;
        }

        public CreateDataExportOrderRequestPluginParam setExeSQL(String exeSQL) {
            this.exeSQL = exeSQL;
            return this;
        }
        public String getExeSQL() {
            return this.exeSQL;
        }

        public CreateDataExportOrderRequestPluginParam setIgnoreAffectRows(Boolean ignoreAffectRows) {
            this.ignoreAffectRows = ignoreAffectRows;
            return this;
        }
        public Boolean getIgnoreAffectRows() {
            return this.ignoreAffectRows;
        }

        public CreateDataExportOrderRequestPluginParam setIgnoreAffectRowsReason(String ignoreAffectRowsReason) {
            this.ignoreAffectRowsReason = ignoreAffectRowsReason;
            return this;
        }
        public String getIgnoreAffectRowsReason() {
            return this.ignoreAffectRowsReason;
        }

        public CreateDataExportOrderRequestPluginParam setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public CreateDataExportOrderRequestPluginParam setLogic(Boolean logic) {
            this.logic = logic;
            return this;
        }
        public Boolean getLogic() {
            return this.logic;
        }

        public CreateDataExportOrderRequestPluginParam setWatermark(CreateDataExportOrderRequestPluginParamWatermark watermark) {
            this.watermark = watermark;
            return this;
        }
        public CreateDataExportOrderRequestPluginParamWatermark getWatermark() {
            return this.watermark;
        }

    }

}
