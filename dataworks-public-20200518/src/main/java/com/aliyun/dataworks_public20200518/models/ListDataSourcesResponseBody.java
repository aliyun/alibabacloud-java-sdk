// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListDataSourcesResponseBody extends TeaModel {
    /**
     * <p>The query result returned.</p>
     */
    @NameInMap("Data")
    public ListDataSourcesResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0bc14115159376359****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
        /**
         * <p>The ID of the compute engine with which the data source is associated.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("BindingCalcEngineId")
        public Long bindingCalcEngineId;

        /**
         * <p>The status of the data source. Valid values:</p>
         * <ul>
         * <li>1: The data source is accessible.</li>
         * <li>2: The data source is inaccessible.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ConnectStatus")
        public Integer connectStatus;

        /**
         * <p>The data connection string. The value of this parameter is in the JSON format. Examples of connection strings of common data sources:</p>
         * <ul>
         * <li><p>MaxCompute</p>
         * <pre><code>{
         *   &quot;pubEndpoint&quot;: &quot;http://service.cn.maxcompute.aliyun.com/api&quot;,
         *   &quot;accessId&quot;: &quot;xxxxxxx&quot;,
         *   &quot;securityToken&quot;: null,
         *   &quot;endpoint&quot;: &quot;http://service.cn.maxcompute.aliyun-inc.com/api&quot;,
         *   &quot;accessKey&quot;: &quot;***&quot;,
         *   &quot;name&quot;: &quot;PRE_PROJECT_A_engine&quot;,
         *   &quot;project&quot;: &quot;PRE_PROJECT_A&quot;,
         *   &quot;vpcEndpoint&quot;: &quot;http://service.cn.maxcompute.aliyun-inc.com/api&quot;,
         *   &quot;region&quot;: &quot;cn-shanghai&quot;,
         *   &quot;authType&quot;: &quot;2&quot;
         * }
         * </code></pre>
         * </li>
         * <li><p>mysql</p>
         * <pre><code>{
         *   &quot;configType&quot;: &quot;1&quot;,
         *   &quot;database&quot;: &quot;mysql_d111b&quot;,
         *   &quot;instanceName&quot;: &quot;rm-xxxxxx&quot;,
         *   &quot;password&quot;: &quot;***&quot;,
         *   &quot;rdsOwnerId&quot;: &quot;12133xxxxxx&quot;,
         *   &quot;tag&quot;: &quot;rds&quot;,
         *   &quot;username&quot;: &quot;mysql_db111&quot;
         * }
         * </code></pre>
         * </li>
         * <li><p>sqlserver</p>
         * <pre><code>{
         *   &quot;configType&quot;: &quot;1&quot;,
         *   &quot;jdbcUrl&quot;: &quot;jdbc:sqlserver://rm-xxxxx.sqlserver.rds.aliyuncs.com:1433;DatabaseName=sqlserver_db1&quot;,
         *   &quot;password&quot;: &quot;***&quot;,
         *   &quot;tag&quot;: &quot;public&quot;,
         *   &quot;username&quot;: &quot;sqlserver_db111&quot;
         * }
         * </code></pre>
         * </li>
         * <li><p>oss</p>
         * <pre><code>{
         *   &quot;accessId&quot;: &quot;***********&quot;,
         *   &quot;accessKey&quot;: &quot;***********&quot;,
         *   &quot;bucket&quot;: &quot;bigxxx1223&quot;,
         *   &quot;configType&quot;: &quot;1&quot;,
         *   &quot;endpoint&quot;: &quot;http://oss-cn-hangzhou.aliyuncs.com&quot;,
         *   &quot;tag&quot;: &quot;public&quot;
         * }
         * </code></pre>
         * </li>
         * <li><p>postgresql</p>
         * <pre><code>{
         *   &quot;configType&quot;: &quot;1&quot;,
         *   &quot;database&quot;: &quot;cdp_xxx&quot;,
         *   &quot;instanceName&quot;: &quot;rm-xxxx&quot;,
         *   &quot;password&quot;: &quot;***&quot;,
         *   &quot;rdsOwnerId&quot;: &quot;121xxxxx&quot;,
         *   &quot;tag&quot;: &quot;rds&quot;,
         *   &quot;username&quot;: &quot;cdp_xxx&quot;
         * }
         * </code></pre>
         * </li>
         * <li><p>ads</p>
         * <pre><code>{
         *   &quot;configType&quot;: &quot;1&quot;,
         *   &quot;password&quot;: &quot;***&quot;,
         *   &quot;schema&quot;: &quot;ads_demo&quot;,
         *   &quot;tag&quot;: &quot;public&quot;,
         *   &quot;url&quot;: &quot;ads-xxx-xxxx.cn-hangzhou-1.ads.aliyuncs.com:3029&quot;,
         *   &quot;username&quot;: &quot;lslslsls&quot;
         * }
         * </code></pre>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;pubEndpoint&quot;:&quot;<a href="http://service.cn.maxcompute.aliyun.com/api%22,%22accessId%22:%22TMP.3KecGjvzy3i8MYfn2BGHgF7EHGyBFZcHm7GgngrABVRyvvKQrfF5kskR36xP361C3dqwbGo7SGYptAeGyiTwHXqLaBUvYC%22,%22securityToken%22:null,%22endpoint%22:%22http://service.cn.maxcompute.aliyun-inc.com/api%22,%22accessKey%22:%22***%22,%22name%22:%22PRE_PROJECT_A_engine%22,%22project%22:%22PRE_PROJECT_A%22,%22vpcEndpoint%22:%22http://service.cn.maxcompute.aliyun-inc.com/api%22,%22region%22:%22cn-shanghai%22,%22authType%22:%222%22%7D">http://service.cn.maxcompute.aliyun.com/api&quot;,&quot;accessId&quot;:&quot;TMP.3KecGjvzy3i8MYfn2BGHgF7EHGyBFZcHm7GgngrABVRyvvKQrfF5kskR36xP361C3dqwbGo7SGYptAeGyiTwHXqLaBUvYC&quot;,&quot;securityToken&quot;:null,&quot;endpoint&quot;:&quot;http://service.cn.maxcompute.aliyun-inc.com/api&quot;,&quot;accessKey&quot;:&quot;***&quot;,&quot;name&quot;:&quot;PRE_PROJECT_A_engine&quot;,&quot;project&quot;:&quot;PRE_PROJECT_A&quot;,&quot;vpcEndpoint&quot;:&quot;http://service.cn.maxcompute.aliyun-inc.com/api&quot;,&quot;region&quot;:&quot;cn-shanghai&quot;,&quot;authType&quot;:&quot;2&quot;}</a></p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The type of the data source. Valid values:</p>
         * <ul>
         * <li>odps</li>
         * <li>mysql</li>
         * <li>rds</li>
         * <li>oss</li>
         * <li>sqlserver</li>
         * <li>polardb</li>
         * <li>oracle</li>
         * <li>mongodb</li>
         * <li>emr</li>
         * <li>postgresql</li>
         * <li>analyticdb_for_mysql</li>
         * <li>hybriddb_for_postgresql</li>
         * <li>holo</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>rds</p>
         */
        @NameInMap("DataSourceType")
        public String dataSourceType;

        /**
         * <p>Indicates whether the compute engine that is associated with the data source is the default compute engine used by data sources of the same type.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("DefaultEngine")
        public Boolean defaultEngine;

        /**
         * <p>The description of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>a connection</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The environment in which the data source is used. Valid values:</p>
         * <ul>
         * <li>0: development environment</li>
         * <li>1: production environment</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("EnvType")
        public Integer envType;

        /**
         * <p>The time when the data source was created. Example: Mar 17, 2021 4:09:32 PM.</p>
         * 
         * <strong>example:</strong>
         * <p>Mar 17, 2021 4:09:32 PM</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the data source was last modified. Example: Mar 17, 2021 4:09:32 PM.</p>
         * 
         * <strong>example:</strong>
         * <p>Mar 17, 2021 4:09:32 PM</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The data source ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the Alibaba Cloud account that is used to last modify the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>193543050****</p>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <p>The ID of the workspace to which the data source belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("ProjectId")
        public Integer projectId;

        /**
         * <p>The sequence number of the data source. Data sources are sorted in descending order based on the value of this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("Sequence")
        public Integer sequence;

        /**
         * <p>Indicates whether the data source is a shared data source.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Shared")
        public Boolean shared;

        /**
         * <p>The status of the data source. Valid values:</p>
         * <ul>
         * <li>1: The data source is accessible.</li>
         * <li>2: The data source is inaccessible.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The subtype of the data source. This parameter takes effect only when the DataSourceType parameter is set to rds.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql</p>
         */
        @NameInMap("SubType")
        public String subType;

        /**
         * <p>The tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567</p>
         */
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
         * <p>The data sources.</p>
         */
        @NameInMap("DataSources")
        public java.util.List<ListDataSourcesResponseBodyDataDataSources> dataSources;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of data sources.</p>
         * 
         * <strong>example:</strong>
         * <p>233</p>
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
