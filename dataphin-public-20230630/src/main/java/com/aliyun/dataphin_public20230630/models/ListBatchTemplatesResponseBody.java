// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListBatchTemplatesResponseBody extends TeaModel {
    /**
     * <p>The backend response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The backend exception details.</p>
     * 
     * <strong>example:</strong>
     * <p>internal error</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The paging query result.</p>
     */
    @NameInMap("PageResult")
    public ListBatchTemplatesResponseBodyPageResult pageResult;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListBatchTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBatchTemplatesResponseBody self = new ListBatchTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListBatchTemplatesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListBatchTemplatesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListBatchTemplatesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListBatchTemplatesResponseBody setPageResult(ListBatchTemplatesResponseBodyPageResult pageResult) {
        this.pageResult = pageResult;
        return this;
    }
    public ListBatchTemplatesResponseBodyPageResult getPageResult() {
        return this.pageResult;
    }

    public ListBatchTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListBatchTemplatesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListBatchTemplatesResponseBodyPageResultTemplateListDataSourceConfig extends TeaModel {
        /**
         * <p>The catalog of the data source for the database SQL template.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("Catalog")
        public String catalog;

        /**
         * <p>The ID of the data source for the database SQL template.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("DsId")
        public String dsId;

        /**
         * <p>The schema of the data source for the database SQL template.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("Schema")
        public String schema;

        /**
         * <p>The data source type of the database SQL template. Valid values: MYSQL, ORACLE, ADB_FOR_PG, OUSHUDB, PRESTO, POSTGRE_SQL, STARROCKS, CLICKHOUSE, ANALYTICDB, ADB_FOR_MYSQL_V3, GAUSSDB, SELECTDB, DORIS, SQL_SERVER, HOLOGRES, OPENGAUSS, DAMENG, OCEANBASE, TRINO, POLARDB_X2, LINDORM, EMR_SPARK_SERVERLESS, TDSQL_FOR_PG, TDSQL_FOR_MYSQL, GBASE_8A, and TDENGINE.</p>
         * 
         * <strong>example:</strong>
         * <p>MYSQL</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListBatchTemplatesResponseBodyPageResultTemplateListDataSourceConfig build(java.util.Map<String, ?> map) throws Exception {
            ListBatchTemplatesResponseBodyPageResultTemplateListDataSourceConfig self = new ListBatchTemplatesResponseBodyPageResultTemplateListDataSourceConfig();
            return TeaModel.build(map, self);
        }

        public ListBatchTemplatesResponseBodyPageResultTemplateListDataSourceConfig setCatalog(String catalog) {
            this.catalog = catalog;
            return this;
        }
        public String getCatalog() {
            return this.catalog;
        }

        public ListBatchTemplatesResponseBodyPageResultTemplateListDataSourceConfig setDsId(String dsId) {
            this.dsId = dsId;
            return this;
        }
        public String getDsId() {
            return this.dsId;
        }

        public ListBatchTemplatesResponseBodyPageResultTemplateListDataSourceConfig setSchema(String schema) {
            this.schema = schema;
            return this;
        }
        public String getSchema() {
            return this.schema;
        }

        public ListBatchTemplatesResponseBodyPageResultTemplateListDataSourceConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListBatchTemplatesResponseBodyPageResultTemplateListParams extends TeaModel {
        /**
         * <p>The parameter description.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Specifies whether encryption is enabled for the parameter.</p>
         */
        @NameInMap("EncryptEnabled")
        public Boolean encryptEnabled;

        /**
         * <p>The key of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>param1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The default value of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListBatchTemplatesResponseBodyPageResultTemplateListParams build(java.util.Map<String, ?> map) throws Exception {
            ListBatchTemplatesResponseBodyPageResultTemplateListParams self = new ListBatchTemplatesResponseBodyPageResultTemplateListParams();
            return TeaModel.build(map, self);
        }

        public ListBatchTemplatesResponseBodyPageResultTemplateListParams setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListBatchTemplatesResponseBodyPageResultTemplateListParams setEncryptEnabled(Boolean encryptEnabled) {
            this.encryptEnabled = encryptEnabled;
            return this;
        }
        public Boolean getEncryptEnabled() {
            return this.encryptEnabled;
        }

        public ListBatchTemplatesResponseBodyPageResultTemplateListParams setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListBatchTemplatesResponseBodyPageResultTemplateListParams setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListBatchTemplatesResponseBodyPageResultTemplateListPythonModuleList extends TeaModel {
        /**
         * <p>The ID of the Python third-party package.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The installation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-01 10:00:00</p>
         */
        @NameInMap("InstallTime")
        public String installTime;

        /**
         * <p>The name of the Python third-party package.</p>
         * 
         * <strong>example:</strong>
         * <p>numpy</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The Python version. Valid values: PYTHON_2_7, PYTHON_3_7, and PYTHON_3_11.</p>
         * 
         * <strong>example:</strong>
         * <p>PYTHON_2_7</p>
         */
        @NameInMap("PythonVersion")
        public String pythonVersion;

        /**
         * <p>The status of the third-party package. Valid values: INSTALL_SUCCESS (installed successfully), INSTALL_FAILED (installation failed), INSTALLING (installing), UPGRADE_SUCCESS (upgraded successfully), UPGRADE_FAILED (upgrade failed), and UPGRADING (upgrading).</p>
         * 
         * <strong>example:</strong>
         * <p>INSTALL_SUCCESS</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The version of the third-party package.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.1</p>
         */
        @NameInMap("Version")
        public String version;

        public static ListBatchTemplatesResponseBodyPageResultTemplateListPythonModuleList build(java.util.Map<String, ?> map) throws Exception {
            ListBatchTemplatesResponseBodyPageResultTemplateListPythonModuleList self = new ListBatchTemplatesResponseBodyPageResultTemplateListPythonModuleList();
            return TeaModel.build(map, self);
        }

        public ListBatchTemplatesResponseBodyPageResultTemplateListPythonModuleList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListBatchTemplatesResponseBodyPageResultTemplateListPythonModuleList setInstallTime(String installTime) {
            this.installTime = installTime;
            return this;
        }
        public String getInstallTime() {
            return this.installTime;
        }

        public ListBatchTemplatesResponseBodyPageResultTemplateListPythonModuleList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListBatchTemplatesResponseBodyPageResultTemplateListPythonModuleList setPythonVersion(String pythonVersion) {
            this.pythonVersion = pythonVersion;
            return this;
        }
        public String getPythonVersion() {
            return this.pythonVersion;
        }

        public ListBatchTemplatesResponseBodyPageResultTemplateListPythonModuleList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListBatchTemplatesResponseBodyPageResultTemplateListPythonModuleList setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ListBatchTemplatesResponseBodyPageResultTemplateList extends TeaModel {
        /**
         * <p>The template submission comment.</p>
         * 
         * <strong>example:</strong>
         * <p>Initial submission</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The template content.</p>
         * 
         * <strong>example:</strong>
         * <p>#!/bin/bash
         * echo \&quot;hello world\&quot;</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The latest version.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentVersion")
        public Long currentVersion;

        /**
         * <p>The datasource config of the database SQL template.</p>
         */
        @NameInMap("DataSourceConfig")
        public ListBatchTemplatesResponseBodyPageResultTemplateListDataSourceConfig dataSourceConfig;

        /**
         * <p>The template description.</p>
         * 
         * <strong>example:</strong>
         * <p>Shell template for data processing</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the resource group in the development environment.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("DevResourceGroupId")
        public String devResourceGroupId;

        /**
         * <p>The name of the resource group in the development environment.</p>
         * 
         * <strong>example:</strong>
         * <p>Default resource group for the project</p>
         */
        @NameInMap("DevResourceGroupName")
        public String devResourceGroupName;

        /**
         * <p>The version of the compute engine. Valid values: Python 2.7 and Python 3.7.</p>
         * 
         * <strong>example:</strong>
         * <p>Python 3.7</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <p>The time when the template was created. Format: yyyy-MM-dd HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-01 10:00:00</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the template was updated. Format: yyyy-MM-dd HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-05-28 15:30:00</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The ID of the template. This ID is the same as the menu tree node ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The user who last updated the template.</p>
         * 
         * <strong>example:</strong>
         * <p>Li Si</p>
         */
        @NameInMap("Modifier")
        public String modifier;

        /**
         * <p>The ID of the user who last updated the template.</p>
         * 
         * <strong>example:</strong>
         * <p>100002</p>
         */
        @NameInMap("ModifierId")
        public String modifierId;

        /**
         * <p>The name of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>Data processing template</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The type of the node. Valid values: 10 (Shell) and 21 (Python).</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("OperatorType")
        public Integer operatorType;

        /**
         * <p>The owner of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>Zhang San</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The ID of the template owner.</p>
         * 
         * <strong>example:</strong>
         * <p>100001</p>
         */
        @NameInMap("OwnerId")
        public String ownerId;

        /**
         * <p>The list of template parameters.</p>
         */
        @NameInMap("Params")
        public java.util.List<ListBatchTemplatesResponseBodyPageResultTemplateListParams> params;

        /**
         * <p>The ID of the project.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The list of dependent Python third-party packages.</p>
         */
        @NameInMap("PythonModuleList")
        public java.util.List<ListBatchTemplatesResponseBodyPageResultTemplateListPythonModuleList> pythonModuleList;

        /**
         * <p>The ID of the resource group in the production environment.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The name of the resource group in the production environment.</p>
         * 
         * <strong>example:</strong>
         * <p>Default resource group for the project</p>
         */
        @NameInMap("ResourceGroupName")
        public String resourceGroupName;

        /**
         * <p>Indicates whether runtime resources are shared.</p>
         */
        @NameInMap("ShareRuntimeResource")
        public Boolean shareRuntimeResource;

        /**
         * <p>The status of the template. Valid values: 0 (draft), 2 (submitted), and 100 (in development).</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListBatchTemplatesResponseBodyPageResultTemplateList build(java.util.Map<String, ?> map) throws Exception {
            ListBatchTemplatesResponseBodyPageResultTemplateList self = new ListBatchTemplatesResponseBodyPageResultTemplateList();
            return TeaModel.build(map, self);
        }

        public ListBatchTemplatesResponseBodyPageResultTemplateList setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListBatchTemplatesResponseBodyPageResultTemplateList setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListBatchTemplatesResponseBodyPageResultTemplateList setCurrentVersion(Long currentVersion) {
            this.currentVersion = currentVersion;
            return this;
        }
        public Long getCurrentVersion() {
            return this.currentVersion;
        }

        public ListBatchTemplatesResponseBodyPageResultTemplateList setDataSourceConfig(ListBatchTemplatesResponseBodyPageResultTemplateListDataSourceConfig dataSourceConfig) {
            this.dataSourceConfig = dataSourceConfig;
            return this;
        }
        public ListBatchTemplatesResponseBodyPageResultTemplateListDataSourceConfig getDataSourceConfig() {
            return this.dataSourceConfig;
        }

        public ListBatchTemplatesResponseBodyPageResultTemplateList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListBatchTemplatesResponseBodyPageResultTemplateList setDevResourceGroupId(String devResourceGroupId) {
            this.devResourceGroupId = devResourceGroupId;
            return this;
        }
        public String getDevResourceGroupId() {
            return this.devResourceGroupId;
        }

        public ListBatchTemplatesResponseBodyPageResultTemplateList setDevResourceGroupName(String devResourceGroupName) {
            this.devResourceGroupName = devResourceGroupName;
            return this;
        }
        public String getDevResourceGroupName() {
            return this.devResourceGroupName;
        }

        public ListBatchTemplatesResponseBodyPageResultTemplateList setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public ListBatchTemplatesResponseBodyPageResultTemplateList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListBatchTemplatesResponseBodyPageResultTemplateList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListBatchTemplatesResponseBodyPageResultTemplateList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListBatchTemplatesResponseBodyPageResultTemplateList setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public ListBatchTemplatesResponseBodyPageResultTemplateList setModifierId(String modifierId) {
            this.modifierId = modifierId;
            return this;
        }
        public String getModifierId() {
            return this.modifierId;
        }

        public ListBatchTemplatesResponseBodyPageResultTemplateList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListBatchTemplatesResponseBodyPageResultTemplateList setOperatorType(Integer operatorType) {
            this.operatorType = operatorType;
            return this;
        }
        public Integer getOperatorType() {
            return this.operatorType;
        }

        public ListBatchTemplatesResponseBodyPageResultTemplateList setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListBatchTemplatesResponseBodyPageResultTemplateList setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public ListBatchTemplatesResponseBodyPageResultTemplateList setParams(java.util.List<ListBatchTemplatesResponseBodyPageResultTemplateListParams> params) {
            this.params = params;
            return this;
        }
        public java.util.List<ListBatchTemplatesResponseBodyPageResultTemplateListParams> getParams() {
            return this.params;
        }

        public ListBatchTemplatesResponseBodyPageResultTemplateList setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListBatchTemplatesResponseBodyPageResultTemplateList setPythonModuleList(java.util.List<ListBatchTemplatesResponseBodyPageResultTemplateListPythonModuleList> pythonModuleList) {
            this.pythonModuleList = pythonModuleList;
            return this;
        }
        public java.util.List<ListBatchTemplatesResponseBodyPageResultTemplateListPythonModuleList> getPythonModuleList() {
            return this.pythonModuleList;
        }

        public ListBatchTemplatesResponseBodyPageResultTemplateList setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListBatchTemplatesResponseBodyPageResultTemplateList setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = resourceGroupName;
            return this;
        }
        public String getResourceGroupName() {
            return this.resourceGroupName;
        }

        public ListBatchTemplatesResponseBodyPageResultTemplateList setShareRuntimeResource(Boolean shareRuntimeResource) {
            this.shareRuntimeResource = shareRuntimeResource;
            return this;
        }
        public Boolean getShareRuntimeResource() {
            return this.shareRuntimeResource;
        }

        public ListBatchTemplatesResponseBodyPageResultTemplateList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListBatchTemplatesResponseBodyPageResult extends TeaModel {
        /**
         * <p>The paginated template record list.</p>
         */
        @NameInMap("TemplateList")
        public java.util.List<ListBatchTemplatesResponseBodyPageResultTemplateList> templateList;

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListBatchTemplatesResponseBodyPageResult build(java.util.Map<String, ?> map) throws Exception {
            ListBatchTemplatesResponseBodyPageResult self = new ListBatchTemplatesResponseBodyPageResult();
            return TeaModel.build(map, self);
        }

        public ListBatchTemplatesResponseBodyPageResult setTemplateList(java.util.List<ListBatchTemplatesResponseBodyPageResultTemplateList> templateList) {
            this.templateList = templateList;
            return this;
        }
        public java.util.List<ListBatchTemplatesResponseBodyPageResultTemplateList> getTemplateList() {
            return this.templateList;
        }

        public ListBatchTemplatesResponseBodyPageResult setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
