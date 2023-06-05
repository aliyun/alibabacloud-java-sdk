// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListDataSourcesResponseBody extends TeaModel {
    /**
     * <p>The number of entries returned per page. Default value: 10. Maximum value: 100.</p>
     */
    @NameInMap("Data")
    public ListDataSourcesResponseBodyData data;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The query result.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListDataSourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataSourcesResponseBody self = new ListDataSourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataSourcesResponseBody setData(ListDataSourcesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListDataSourcesResponseBodyData getData() {
        return this.data;
    }

    public ListDataSourcesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListDataSourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDataSourcesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListDataSourcesResponseBodyDataDataSources extends TeaModel {
        @NameInMap("BindingCalcEngineId")
        public Long bindingCalcEngineId;

        /**
         * <p>The description of the data source.</p>
         */
        @NameInMap("ConnectStatus")
        public Integer connectStatus;

        /**
         * <p>The ID of the compute engine instance with which the data source is associated.</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>Indicates whether the compute engine instance that is associated with the data source is the default compute engine instance used by data sources of the same type.</p>
         */
        @NameInMap("DataSourceType")
        public String dataSourceType;

        /**
         * <p>The ID of the Alibaba Cloud account that is used to last modify the data source.</p>
         */
        @NameInMap("DefaultEngine")
        public Boolean defaultEngine;

        /**
         * <p>The time when the data source was created. Example: Mar 17, 2021 4:09:32 PM.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The field that is used to sort data sources. Data sources are sorted in descending order based on the value of this parameter.</p>
         */
        @NameInMap("EnvType")
        public Integer envType;

        /**
         * <p>Indicates whether the data source is a shared data source.</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The status of the data source. Valid values:</p>
         * <br>
         * <p>*   1: The data source is accessible.</p>
         * <p>*   2: The data source is inaccessible.</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The ID of the tenant.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The ID of the data source.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The data connection string. The value of this parameter is in the JSON format. Sample connection strings of common data sources:</p>
         * <br>
         * <p>*   MaxCompute</p>
         * <br>
         * <p><!----></p>
         * <br>
         * <p>    json</p>
         * <p>    {</p>
         * <p>      "pubEndpoint": "http://service.cn.maxcompute.aliyun.com/api",</p>
         * <p>      "accessId": "xxxxxxx",</p>
         * <p>      "securityToken": null,</p>
         * <p>      "endpoint": "http://service.cn.maxcompute.aliyun-inc.com/api",</p>
         * <p>      "accessKey": "***",</p>
         * <p>      "name": "PRE_PROJECT_A_engine",</p>
         * <p>      "project": "PRE_PROJECT_A",</p>
         * <p>      "vpcEndpoint": "http://service.cn.maxcompute.aliyun-inc.com/api",</p>
         * <p>      "region": "cn-shanghai",</p>
         * <p>      "authType": "2"</p>
         * <p>    }</p>
         * <br>
         * <p>*   mysql</p>
         * <br>
         * <p><!----></p>
         * <br>
         * <p>    json</p>
         * <p>    {</p>
         * <p>      "configType": "1",</p>
         * <p>      "database": "mysql_d111b",</p>
         * <p>      "instanceName": "rm-xxxxxx",</p>
         * <p>      "password": "***",</p>
         * <p>      "rdsOwnerId": "12133xxxxxx",</p>
         * <p>      "tag": "rds",</p>
         * <p>      "username": "mysql_db111"</p>
         * <p>    }</p>
         * <br>
         * <p>*   sqlserver</p>
         * <br>
         * <p><!----></p>
         * <br>
         * <p>    json</p>
         * <p>    {</p>
         * <p>      "configType": "1",</p>
         * <p>      "jdbcUrl": "jdbc:sqlserver://rm-xxxxx.sqlserver.rds.aliyuncs.com:1433;DatabaseName=sqlserver_db1",</p>
         * <p>      "password": "***",</p>
         * <p>      "tag": "public",</p>
         * <p>      "username": "sqlserver_db111"</p>
         * <p>    }</p>
         * <br>
         * <p>*   oss</p>
         * <br>
         * <p><!----></p>
         * <br>
         * <p>    json</p>
         * <p>    {</p>
         * <p>      "accessId": "LTAINbR9Uxxxx",</p>
         * <p>      "accessKey": "***",</p>
         * <p>      "bucket": "bigxxx1223",</p>
         * <p>      "configType": "1",</p>
         * <p>      "endpoint": "http://oss-cn-hangzhou.aliyuncs.com",</p>
         * <p>      "tag": "public"</p>
         * <p>    }</p>
         * <br>
         * <p>*   postgresql</p>
         * <br>
         * <p><!----></p>
         * <br>
         * <p>    json</p>
         * <p>    {</p>
         * <p>      "configType": "1",</p>
         * <p>      "database": "cdp_xxx",</p>
         * <p>      "instanceName": "rm-xxxx",</p>
         * <p>      "password": "***",</p>
         * <p>      "rdsOwnerId": "121xxxxx",</p>
         * <p>      "tag": "rds",</p>
         * <p>      "username": "cdp_xxx"</p>
         * <p>    }</p>
         * <br>
         * <p>*   ads</p>
         * <br>
         * <p><!----></p>
         * <br>
         * <p>    json</p>
         * <p>    {</p>
         * <p>      "configType": "1",</p>
         * <p>      "password": "***",</p>
         * <p>      "schema": "ads_demo",</p>
         * <p>      "tag": "public",</p>
         * <p>      "url": "ads-xxx-xxxx.cn-hangzhou-1.ads.aliyuncs.com:3029",</p>
         * <p>      "username": "lslslsls"</p>
         * <p>    }</p>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <p>The time when the data source was last modified. Example: Mar 17, 2021 4:09:32 PM.</p>
         */
        @NameInMap("ProjectId")
        public Integer projectId;

        /**
         * <p>The type of the data source. Valid values:</p>
         * <br>
         * <p>*   odps</p>
         * <p>*   mysql</p>
         * <p>*   rds</p>
         * <p>*   oss</p>
         * <p>*   sqlserver</p>
         * <p>*   polardb</p>
         * <p>*   oracle</p>
         * <p>*   mongodb</p>
         * <p>*   emr</p>
         * <p>*   postgresql</p>
         * <p>*   analyticdb_for_mysql</p>
         * <p>*   hybriddb_for_postgresql</p>
         * <p>*   holo</p>
         */
        @NameInMap("Sequence")
        public Integer sequence;

        /**
         * <p>The name of the data source.</p>
         */
        @NameInMap("Shared")
        public Boolean shared;

        /**
         * <p>The subtype of the data source. This parameter takes effect only if the DataSourceType parameter is set to rds.</p>
         * <br>
         * <p>If the DataSourceType parameter is set to rds, this parameter can be set to mysql, sqlserver, or postgresql.</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The environment in which the data source is used. Valid values:</p>
         * <br>
         * <p>*   0: development environment</p>
         * <p>*   1: production environment</p>
         */
        @NameInMap("SubType")
        public String subType;

        @NameInMap("TenantId")
        public Long tenantId;

        public static ListDataSourcesResponseBodyDataDataSources build(java.util.Map<String, ?> map) throws Exception {
            ListDataSourcesResponseBodyDataDataSources self = new ListDataSourcesResponseBodyDataDataSources();
            return TeaModel.build(map, self);
        }

        public ListDataSourcesResponseBodyDataDataSources setBindingCalcEngineId(Long bindingCalcEngineId) {
            this.bindingCalcEngineId = bindingCalcEngineId;
            return this;
        }
        public Long getBindingCalcEngineId() {
            return this.bindingCalcEngineId;
        }

        public ListDataSourcesResponseBodyDataDataSources setConnectStatus(Integer connectStatus) {
            this.connectStatus = connectStatus;
            return this;
        }
        public Integer getConnectStatus() {
            return this.connectStatus;
        }

        public ListDataSourcesResponseBodyDataDataSources setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListDataSourcesResponseBodyDataDataSources setDataSourceType(String dataSourceType) {
            this.dataSourceType = dataSourceType;
            return this;
        }
        public String getDataSourceType() {
            return this.dataSourceType;
        }

        public ListDataSourcesResponseBodyDataDataSources setDefaultEngine(Boolean defaultEngine) {
            this.defaultEngine = defaultEngine;
            return this;
        }
        public Boolean getDefaultEngine() {
            return this.defaultEngine;
        }

        public ListDataSourcesResponseBodyDataDataSources setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListDataSourcesResponseBodyDataDataSources setEnvType(Integer envType) {
            this.envType = envType;
            return this;
        }
        public Integer getEnvType() {
            return this.envType;
        }

        public ListDataSourcesResponseBodyDataDataSources setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListDataSourcesResponseBodyDataDataSources setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListDataSourcesResponseBodyDataDataSources setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListDataSourcesResponseBodyDataDataSources setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDataSourcesResponseBodyDataDataSources setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListDataSourcesResponseBodyDataDataSources setProjectId(Integer projectId) {
            this.projectId = projectId;
            return this;
        }
        public Integer getProjectId() {
            return this.projectId;
        }

        public ListDataSourcesResponseBodyDataDataSources setSequence(Integer sequence) {
            this.sequence = sequence;
            return this;
        }
        public Integer getSequence() {
            return this.sequence;
        }

        public ListDataSourcesResponseBodyDataDataSources setShared(Boolean shared) {
            this.shared = shared;
            return this;
        }
        public Boolean getShared() {
            return this.shared;
        }

        public ListDataSourcesResponseBodyDataDataSources setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListDataSourcesResponseBodyDataDataSources setSubType(String subType) {
            this.subType = subType;
            return this;
        }
        public String getSubType() {
            return this.subType;
        }

        public ListDataSourcesResponseBodyDataDataSources setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

    }

    public static class ListDataSourcesResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the workspace to which the data source belongs.</p>
         */
        @NameInMap("DataSources")
        public java.util.List<ListDataSourcesResponseBodyDataDataSources> dataSources;

        /**
         * <p>The total number of data sources.</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The data sources.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The status of the data source. Valid values:</p>
         * <br>
         * <p>*   1: The data source is accessible.</p>
         * <p>*   2: The data source is inaccessible.</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListDataSourcesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDataSourcesResponseBodyData self = new ListDataSourcesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDataSourcesResponseBodyData setDataSources(java.util.List<ListDataSourcesResponseBodyDataDataSources> dataSources) {
            this.dataSources = dataSources;
            return this;
        }
        public java.util.List<ListDataSourcesResponseBodyDataDataSources> getDataSources() {
            return this.dataSources;
        }

        public ListDataSourcesResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListDataSourcesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListDataSourcesResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
