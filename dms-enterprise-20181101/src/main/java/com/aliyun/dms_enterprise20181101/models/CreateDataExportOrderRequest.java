// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateDataExportOrderRequest extends TeaModel {
    /**
     * <p>The key of the attachment that provides more instructions for the ticket. You can call the <a href="https://help.aliyun.com/document_detail/206069.html">GetUserUploadFileJob</a> operation to obtain the attachment key.</p>
     * 
     * <strong>example:</strong>
     * <p>order_attachment.txt</p>
     */
    @NameInMap("AttachmentKey")
    public String attachmentKey;

    /**
     * <p>The purpose or objective of the ticket. This parameter helps reduce unnecessary communication.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>business_test</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The ID of the parent ticket.</p>
     * 
     * <strong>example:</strong>
     * <p>877****</p>
     */
    @NameInMap("ParentId")
    public Long parentId;

    /**
     * <p>The parameters of the ticket.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PluginParam")
    public CreateDataExportOrderRequestPluginParam pluginParam;

    @NameInMap("RealLoginUserUid")
    public String realLoginUserUid;

    /**
     * <p>The stakeholders involved in this operation.</p>
     */
    @NameInMap("RelatedUserList")
    public java.util.List<Long> relatedUserList;

    /**
     * <p>The tenant ID.</p>
     * <blockquote>
     * <p>To view the ID of the tenant, move the pointer over the profile picture in the upper-right corner of the DMS console. For more information, see the <a href="https://help.aliyun.com/document_detail/181330.html">View information about the current tenant</a> section of the &quot;Manage DMS tenants&quot; topic.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3***</p>
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

    public CreateDataExportOrderRequest setRealLoginUserUid(String realLoginUserUid) {
        this.realLoginUserUid = realLoginUserUid;
        return this;
    }
    public String getRealLoginUserUid() {
        return this.realLoginUserUid;
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
         * 
         * <strong>example:</strong>
         * <p>user_number</p>
         */
        @NameInMap("ColumnName")
        public String columnName;

        /**
         * <p>The information to be embedded as a watermark into data.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("DataWatermark")
        public String dataWatermark;

        /**
         * <p>The information to be embedded as a watermark into files.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AffectRows")
        public Long affectRows;

        /**
         * <p>The reason for the export ticket.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Classify")
        public String classify;

        /**
         * <p>The database ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>18****</p>
         */
        @NameInMap("DbId")
        public Long dbId;

        /**
         * <p>The SQL statements that can be executed.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SELECT * FROM DMS_test
         *  LIMIT 20;</p>
         */
        @NameInMap("ExeSQL")
        public String exeSQL;

        /**
         * <p>Specifies whether to skip verification. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IgnoreAffectRows")
        public Boolean ignoreAffectRows;

        /**
         * <p>The reason for skipping verification. This parameter is required if you set IgnoreAffectRows to true.</p>
         * 
         * <strong>example:</strong>
         * <p>Test only, does not affect the business, and does not require verification.</p>
         */
        @NameInMap("IgnoreAffectRowsReason")
        public String ignoreAffectRowsReason;

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>132****</p>
         */
        @NameInMap("InstanceId")
        public Long instanceId;

        /**
         * <p>Specifies whether the database is a logical database. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * <blockquote>
         * <p>If you set this parameter to <strong>true</strong>, the database that you specify must be a logical database.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
