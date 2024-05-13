// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateDatabaseExportOrderRequest extends TeaModel {
    /**
     * <p>The key of the attachment that provides more instructions for the ticket. You can call the [GetUserUploadFileJob](https://help.aliyun.com/document_detail/206069.html) operation to obtain the attachment key.</p>
     */
    @NameInMap("AttachmentKey")
    public String attachmentKey;

    /**
     * <p>The purpose or objective of the ticket. This parameter helps reduce unnecessary communication.</p>
     * <br>
     * <p>This parameter is required.</p>
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
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PluginParam")
    public CreateDatabaseExportOrderRequestPluginParam pluginParam;

    /**
     * <p>The stakeholders involved in this operation.</p>
     */
    @NameInMap("RelatedUserList")
    public java.util.List<Long> relatedUserList;

    /**
     * <p>The tenant ID.</p>
     * <br>
     * <p>> To view the ID of the tenant, move the pointer over the profile picture in the upper-right corner of the DMS console. For more information, see the [View information about the current tenant](https://help.aliyun.com/document_detail/181330.html) section of the "Manage DMS tenants" topic.</p>
     */
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
        /**
         * <p>The export options for big data. The options are used to filter the big data to be exported. You can leave this parameter empty.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("DataOption")
        public java.util.List<String> dataOption;

        /**
         * <p>The type of data that you want to export. Valid values:</p>
         * <br>
         * <p>*   **DATA**: The data of the database is exported.</p>
         * <p>*   **STRUCT**: The schema of the database is exported.</p>
         * <p>*   **DATA_STRUCT**: The data and schema of the database are exported.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("ExportContent")
        public String exportContent;

        /**
         * <p>The types of schemas that you want to export.</p>
         */
        @NameInMap("ExportTypes")
        public java.util.List<String> exportTypes;

        /**
         * <p>The extension options of the SQL script. You can leave this parameter empty.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("SQLExtOption")
        public java.util.List<String> SQLExtOption;

        /**
         * <p>The tables that you want to export.</p>
         */
        @NameInMap("SelectedTables")
        public java.util.List<String> selectedTables;

        /**
         * <p>The conditions used to filter the tables to be exported.</p>
         */
        @NameInMap("Tables")
        public java.util.Map<String, String> tables;

        /**
         * <p>The format in which the database is exported. Valid values:</p>
         * <br>
         * <p>*   **SQL**</p>
         * <p>*   **CSV**</p>
         * <p>*   **XLSX**</p>
         * <br>
         * <p>This parameter is required.</p>
         */
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
        /**
         * <p>The reason for the database export.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Classify")
        public String classify;

        /**
         * <p>The configurations for database export.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Config")
        public CreateDatabaseExportOrderRequestPluginParamConfig config;

        /**
         * <p>The database ID.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("DbId")
        public Long dbId;

        /**
         * <p>The instance ID.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("InstanceId")
        public Long instanceId;

        /**
         * <p>Specifies whether the database is a logical database. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Logic")
        public Boolean logic;

        /**
         * <p>The name that is used to search for the database.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
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
