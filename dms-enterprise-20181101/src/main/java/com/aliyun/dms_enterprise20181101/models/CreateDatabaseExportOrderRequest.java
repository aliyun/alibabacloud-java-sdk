// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateDatabaseExportOrderRequest extends TeaModel {
    @NameInMap("AttachmentKey")
    public String attachmentKey;

    @NameInMap("Comment")
    public String comment;

    @NameInMap("ParentId")
    public Long parentId;

    @NameInMap("PluginParam")
    public CreateDatabaseExportOrderRequestPluginParam pluginParam;

    @NameInMap("RelatedUserList")
    public java.util.List<Long> relatedUserList;

    @NameInMap("Tid")
    public Long tid;

    public static CreateDatabaseExportOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDatabaseExportOrderRequest self = new CreateDatabaseExportOrderRequest();
        return TeaModel.build(map, self);
    }

    public CreateDatabaseExportOrderRequest setAttachmentKey(String attachmentKey) {
        this.attachmentKey = attachmentKey;
        return this;
    }
    public String getAttachmentKey() {
        return this.attachmentKey;
    }

    public CreateDatabaseExportOrderRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public CreateDatabaseExportOrderRequest setParentId(Long parentId) {
        this.parentId = parentId;
        return this;
    }
    public Long getParentId() {
        return this.parentId;
    }

    public CreateDatabaseExportOrderRequest setPluginParam(CreateDatabaseExportOrderRequestPluginParam pluginParam) {
        this.pluginParam = pluginParam;
        return this;
    }
    public CreateDatabaseExportOrderRequestPluginParam getPluginParam() {
        return this.pluginParam;
    }

    public CreateDatabaseExportOrderRequest setRelatedUserList(java.util.List<Long> relatedUserList) {
        this.relatedUserList = relatedUserList;
        return this;
    }
    public java.util.List<Long> getRelatedUserList() {
        return this.relatedUserList;
    }

    public CreateDatabaseExportOrderRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public static class CreateDatabaseExportOrderRequestPluginParamConfig extends TeaModel {
        @NameInMap("DataOption")
        public java.util.List<String> dataOption;

        @NameInMap("ExportContent")
        public String exportContent;

        @NameInMap("ExportTypes")
        public java.util.List<String> exportTypes;

        @NameInMap("SQLExtOption")
        public java.util.List<String> SQLExtOption;

        @NameInMap("SelectedTables")
        public java.util.List<String> selectedTables;

        @NameInMap("Tables")
        public java.util.Map<String, String> tables;

        @NameInMap("TargetOption")
        public String targetOption;

        public static CreateDatabaseExportOrderRequestPluginParamConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateDatabaseExportOrderRequestPluginParamConfig self = new CreateDatabaseExportOrderRequestPluginParamConfig();
            return TeaModel.build(map, self);
        }

        public CreateDatabaseExportOrderRequestPluginParamConfig setDataOption(java.util.List<String> dataOption) {
            this.dataOption = dataOption;
            return this;
        }
        public java.util.List<String> getDataOption() {
            return this.dataOption;
        }

        public CreateDatabaseExportOrderRequestPluginParamConfig setExportContent(String exportContent) {
            this.exportContent = exportContent;
            return this;
        }
        public String getExportContent() {
            return this.exportContent;
        }

        public CreateDatabaseExportOrderRequestPluginParamConfig setExportTypes(java.util.List<String> exportTypes) {
            this.exportTypes = exportTypes;
            return this;
        }
        public java.util.List<String> getExportTypes() {
            return this.exportTypes;
        }

        public CreateDatabaseExportOrderRequestPluginParamConfig setSQLExtOption(java.util.List<String> SQLExtOption) {
            this.SQLExtOption = SQLExtOption;
            return this;
        }
        public java.util.List<String> getSQLExtOption() {
            return this.SQLExtOption;
        }

        public CreateDatabaseExportOrderRequestPluginParamConfig setSelectedTables(java.util.List<String> selectedTables) {
            this.selectedTables = selectedTables;
            return this;
        }
        public java.util.List<String> getSelectedTables() {
            return this.selectedTables;
        }

        public CreateDatabaseExportOrderRequestPluginParamConfig setTables(java.util.Map<String, String> tables) {
            this.tables = tables;
            return this;
        }
        public java.util.Map<String, String> getTables() {
            return this.tables;
        }

        public CreateDatabaseExportOrderRequestPluginParamConfig setTargetOption(String targetOption) {
            this.targetOption = targetOption;
            return this;
        }
        public String getTargetOption() {
            return this.targetOption;
        }

    }

    public static class CreateDatabaseExportOrderRequestPluginParam extends TeaModel {
        @NameInMap("Classify")
        public String classify;

        @NameInMap("Config")
        public CreateDatabaseExportOrderRequestPluginParamConfig config;

        @NameInMap("DbId")
        public Long dbId;

        @NameInMap("InstanceId")
        public Long instanceId;

        @NameInMap("Logic")
        public Boolean logic;

        @NameInMap("SearchName")
        public String searchName;

        public static CreateDatabaseExportOrderRequestPluginParam build(java.util.Map<String, ?> map) throws Exception {
            CreateDatabaseExportOrderRequestPluginParam self = new CreateDatabaseExportOrderRequestPluginParam();
            return TeaModel.build(map, self);
        }

        public CreateDatabaseExportOrderRequestPluginParam setClassify(String classify) {
            this.classify = classify;
            return this;
        }
        public String getClassify() {
            return this.classify;
        }

        public CreateDatabaseExportOrderRequestPluginParam setConfig(CreateDatabaseExportOrderRequestPluginParamConfig config) {
            this.config = config;
            return this;
        }
        public CreateDatabaseExportOrderRequestPluginParamConfig getConfig() {
            return this.config;
        }

        public CreateDatabaseExportOrderRequestPluginParam setDbId(Long dbId) {
            this.dbId = dbId;
            return this;
        }
        public Long getDbId() {
            return this.dbId;
        }

        public CreateDatabaseExportOrderRequestPluginParam setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public CreateDatabaseExportOrderRequestPluginParam setLogic(Boolean logic) {
            this.logic = logic;
            return this;
        }
        public Boolean getLogic() {
            return this.logic;
        }

        public CreateDatabaseExportOrderRequestPluginParam setSearchName(String searchName) {
            this.searchName = searchName;
            return this;
        }
        public String getSearchName() {
            return this.searchName;
        }

    }

}
