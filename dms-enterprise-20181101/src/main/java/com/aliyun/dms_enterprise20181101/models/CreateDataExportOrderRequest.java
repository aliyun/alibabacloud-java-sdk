// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateDataExportOrderRequest extends TeaModel {
    @NameInMap("AttachmentKey")
    public String attachmentKey;

    @NameInMap("Comment")
    public String comment;

    @NameInMap("ParentId")
    public Long parentId;

    @NameInMap("PluginParam")
    public CreateDataExportOrderRequestPluginParam pluginParam;

    @NameInMap("RelatedUserList")
    public java.util.List<Long> relatedUserList;

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
        @NameInMap("ColumnName")
        public String columnName;

        @NameInMap("DataWatermark")
        public String dataWatermark;

        @NameInMap("FileWatermark")
        public String fileWatermark;

        @NameInMap("Keys")
        public java.util.List<String> keys;

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
        @NameInMap("AffectRows")
        public Long affectRows;

        @NameInMap("Classify")
        public String classify;

        @NameInMap("DbId")
        public Long dbId;

        @NameInMap("ExeSQL")
        public String exeSQL;

        @NameInMap("IgnoreAffectRows")
        public Boolean ignoreAffectRows;

        @NameInMap("IgnoreAffectRowsReason")
        public String ignoreAffectRowsReason;

        @NameInMap("InstanceId")
        public Long instanceId;

        @NameInMap("Logic")
        public Boolean logic;

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
