// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListConnectionsResponseBody extends TeaModel {
    /**
     * <p>The query results for data sources that are returned on multiple pages.</p>
     */
    @NameInMap("Data")
    public ListConnectionsResponseBodyData data;

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

    public static ListConnectionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListConnectionsResponseBody self = new ListConnectionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListConnectionsResponseBody setData(ListConnectionsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListConnectionsResponseBodyData getData() {
        return this.data;
    }

    public ListConnectionsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListConnectionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListConnectionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListConnectionsResponseBodyDataConnections extends TeaModel {
        /**
         * <p>The ID of the compute engine with which the data source is associated.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("BindingCalcEngineId")
        public Integer bindingCalcEngineId;

        /**
         * <p>The status of the data source. Valid values:</p>
         * <ul>
         * <li>1: The data source is normal.</li>
         * <li>2: The data source is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ConnectStatus")
        public Integer connectStatus;

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
         * <p>mysql</p>
         */
        @NameInMap("ConnectionType")
        public String connectionType;

        /**
         * <p>The details of the data source. Examples of details of some common data sources:</p>
         * <ul>
         * <li>odps</li>
         * </ul>
         * <!---->
         * 
         * <pre><code>{
         *   &quot;accessId&quot;: &quot;xssssss&quot;,
         *   &quot;accessKey&quot;: &quot;xsaxsaxsa&quot;,
         *   &quot;authType&quot;: 2,
         *   &quot;endpoint&quot;: &quot;http://service.odps.aliyun.com/api&quot;,
         *   &quot;project&quot;: &quot;xsaxsax&quot;,
         *   &quot;tag&quot;: &quot;public&quot;
         * }
         * </code></pre>
         * <ul>
         * <li>mysql</li>
         * </ul>
         * <!---->
         * 
         * <pre><code>{
         *   &quot;database&quot;: &quot;xsaxsa&quot;,
         *   &quot;instanceName&quot;: &quot;rm-xsaxsa&quot;,
         *   &quot;password&quot;: &quot;xsaxsa&quot;,
         *   &quot;rdsOwnerId&quot;: &quot;xasxsa&quot;,
         *   &quot;regionId&quot;: &quot;cn-shanghai&quot;,
         *   &quot;tag&quot;: &quot;rds&quot;,
         *   &quot;username&quot;: &quot;xsaxsa&quot;
         * }
         * </code></pre>
         * <ul>
         * <li>rds</li>
         * </ul>
         * <!---->
         * 
         * <pre><code>{
         *   &quot;configType&quot;: 1,
         *   &quot;tag&quot;: &quot;rds&quot;,
         *   &quot;database&quot;: &quot;xsaxsa&quot;,
         *   &quot;username&quot;: &quot;xsaxsa&quot;,
         *   &quot;password&quot;: &quot;xssaxsa$32050&quot;,
         *   &quot;instanceName&quot;: &quot;rm-xsaxs&quot;,
         *   &quot;rdsOwnerId&quot;: &quot;11111111&quot;
         * }
         * </code></pre>
         * <ul>
         * <li>oss</li>
         * </ul>
         * <!---->
         * 
         * <pre><code>{
         *   &quot;accessId&quot;: &quot;sssssxx&quot;,
         *   &quot;accessKey&quot;: &quot;xsaxaxsaxs&quot;,
         *   &quot;bucket&quot;: &quot;xsa-xs-xs&quot;,
         *   &quot;endpoint&quot;: &quot;http://oss-cn-shanghai.aliyuncs.com&quot;,
         *   &quot;tag&quot;: &quot;public&quot;
         * }
         * </code></pre>
         * <ul>
         * <li>sqlserver</li>
         * </ul>
         * <!---->
         * 
         * <pre><code>{
         *   &quot;jdbcUrl&quot;: &quot;jdbc:sqlserver://xsaxsa-xsaxsa.database.xxx.cn:123;DatabaseName=xsxs-xsxs&quot;,
         *   &quot;password&quot;: &quot;sdasda$fs&quot;,
         *   &quot;tag&quot;: &quot;public&quot;,
         *   &quot;username&quot;: &quot;sxaxacdacdd&quot;
         * }
         * </code></pre>
         * <ul>
         * <li>polardb</li>
         * </ul>
         * <!---->
         * 
         * <pre><code>{
         *   &quot;clusterId&quot;: &quot;pc-sdadsadsa&quot;,
         *   &quot;database&quot;: &quot;dsadsadsa&quot;,
         *   &quot;ownerId&quot;: &quot;121212122&quot;,
         *   &quot;password&quot;: &quot;sdasdafssa&quot;,
         *   &quot;region&quot;: &quot;cn-shanghai&quot;,
         *   &quot;tag&quot;: &quot;polardb&quot;,
         *   &quot;username&quot;: &quot;asdadsads&quot;
         * }
         * </code></pre>
         * <ul>
         * <li>oracle</li>
         * </ul>
         * <!---->
         * 
         * <pre><code>{
         *   &quot;jdbcUrl&quot;: &quot;jdbc:oracle:saaa:@xxxxx:1521:PROD&quot;,
         *   &quot;password&quot;: &quot;sxasaxsa&quot;,
         *   &quot;tag&quot;: &quot;public&quot;,
         *   &quot;username&quot;: &quot;sasfadfa&quot;
         * }
         * </code></pre>
         * <ul>
         * <li>mongodb</li>
         * </ul>
         * <!---->
         * 
         * <pre><code>{
         *   &quot;address&quot;: &quot;[\\&quot;xsaxxsa.mongodb.rds.aliyuncs.com:3717\\&quot;]&quot;,
         *   &quot;database&quot;: &quot;admin&quot;,
         *   &quot;password&quot;: &quot;sadsda@&quot;,
         *   &quot;tag&quot;: &quot;public&quot;,
         *   &quot;username&quot;: &quot;dsadsadas&quot;
         * }
         * </code></pre>
         * <ul>
         * <li>emr</li>
         * </ul>
         * <!---->
         * 
         * <pre><code>{
         *   &quot;accessId&quot;: &quot;xsaxsa&quot;,
         *   &quot;emrClusterId&quot;: &quot;C-dsads&quot;,
         *   &quot;emrResourceQueueName&quot;: &quot;default&quot;,
         *   &quot;emrEndpoint&quot;: &quot;emr.aliyuncs.com&quot;,
         *   &quot;accessKey&quot;: &quot;dsadsad&quot;,
         *   &quot;emrUserId&quot;: &quot;224833315798889783&quot;,
         *   &quot;name&quot;: &quot;sasdsadsa&quot;,
         *   &quot;emrAccessMode&quot;: &quot;simple&quot;,
         *   &quot;region&quot;: &quot;cn-shanghai&quot;,
         *   &quot;authType&quot;: &quot;2&quot;,
         *   &quot;emrProjectId&quot;: &quot;FP-sdadsad&quot;
         * }
         * </code></pre>
         * <ul>
         * <li>postgresql</li>
         * </ul>
         * <!---->
         * 
         * <pre><code>{
         *   &quot;jdbcUrl&quot;: &quot;jdbc:postgresql://xxxx:1921/ssss&quot;,
         *   &quot;password&quot;: &quot;sdadsads&quot;,
         *   &quot;tag&quot;: &quot;public&quot;,
         *   &quot;username&quot;: &quot;sdsasda&quot;
         * }
         * </code></pre>
         * <ul>
         * <li>analyticdb_for_mysql</li>
         * </ul>
         * <!---->
         * 
         * <pre><code>{
         *   &quot;instanceId&quot;: &quot;am-sadsada&quot;,
         *   &quot;database&quot;: &quot;xsxsx&quot;,
         *   &quot;username&quot;: &quot;xsxsa&quot;,
         *   &quot;password&quot;: &quot;asdadsa&quot;,
         *   &quot;connectionString&quot;: &quot;am-xssxsxs.ads.aliyuncs.com:3306&quot;
         * }
         * </code></pre>
         * <ul>
         * <li>hybriddb_for_postgresql</li>
         * </ul>
         * <!---->
         * 
         * <pre><code>{
         *   &quot;connectionString&quot;: &quot;gp-xsaxsaxa-master.gpdbmaster.rds.aliyuncs.com&quot;,
         *   &quot;database&quot;: &quot;xsaxsaxas&quot;,
         *   &quot;password&quot;: &quot;xsaxsaxsa@11&quot;,
         *   &quot;instanceId&quot;: &quot;gp-xsaxsaxsa&quot;,
         *   &quot;port&quot;: &quot;541132&quot;,
         *   &quot;ownerId&quot;: &quot;xsaxsaxsas&quot;,
         *   &quot;username&quot;: &quot;sadsad&quot;
         * }
         * </code></pre>
         * <ul>
         * <li>holo</li>
         * </ul>
         * <!---->
         * 
         * <pre><code>{
         *   &quot;accessId&quot;: &quot;xsaxsaxs&quot;,
         *   &quot;accessKey&quot;: &quot;xsaxsaxsa&quot;,
         *   &quot;database&quot;: &quot;xsaxsaxsa&quot;,
         *   &quot;instanceId&quot;: &quot;xsaxa&quot;,
         *   &quot;tag&quot;: &quot;aliyun&quot;
         * }
         * </code></pre>
         * <ul>
         * <li>kafka</li>
         * </ul>
         * <!---->
         * 
         * <pre><code>{
         *   &quot;instanceId&quot;: &quot;xsax-cn-xsaxsa&quot;,
         *   &quot;regionId&quot;: &quot;cn-shanghai&quot;,
         *   &quot;tag&quot;: &quot;aliyun&quot;,
         *   &quot;ownerId&quot;: &quot;1212121212112&quot;
         * }
         * </code></pre>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;database\&quot;:\&quot;xxx\&quot;,\&quot;instanceName\&quot;:\&quot;xxx\&quot;,\&quot;password\&quot;:\&quot;xxx\&quot;,\&quot;rdsOwnerId\&quot;:\&quot;xxx\&quot;,\&quot;tag\&quot;:\&quot;rds\&quot;,\&quot;username\&quot;:\&quot;xxx\&quot;}</p>
         */
        @NameInMap("Content")
        public String content;

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
        public Integer id;

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
         * <p>The ID of the workspace with which the data source is associated.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("ProjectId")
        public Integer projectId;

        /**
         * <p>The field that is used to sort data sources. Data sources are sorted in descending order based on the value of this parameter.</p>
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
         * <li>1: The data source is normal.</li>
         * <li>2: The data source is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The subtype of the data source. This parameter is used in scenarios where a type includes subtypes. The following type and subtypes are supported:</p>
         * <ul>
         * <li>Type: <code>rds</code></li>
         * <li>Subtypes: <code>mysql</code>, <code>sqlserver</code>, and <code>postgresql</code>.</li>
         * </ul>
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

        public static ListConnectionsResponseBodyDataConnections build(java.util.Map<String, ?> map) throws Exception {
            ListConnectionsResponseBodyDataConnections self = new ListConnectionsResponseBodyDataConnections();
            return TeaModel.build(map, self);
        }

        public ListConnectionsResponseBodyDataConnections setBindingCalcEngineId(Integer bindingCalcEngineId) {
            this.bindingCalcEngineId = bindingCalcEngineId;
            return this;
        }
        public Integer getBindingCalcEngineId() {
            return this.bindingCalcEngineId;
        }

        public ListConnectionsResponseBodyDataConnections setConnectStatus(Integer connectStatus) {
            this.connectStatus = connectStatus;
            return this;
        }
        public Integer getConnectStatus() {
            return this.connectStatus;
        }

        public ListConnectionsResponseBodyDataConnections setConnectionType(String connectionType) {
            this.connectionType = connectionType;
            return this;
        }
        public String getConnectionType() {
            return this.connectionType;
        }

        public ListConnectionsResponseBodyDataConnections setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListConnectionsResponseBodyDataConnections setDefaultEngine(Boolean defaultEngine) {
            this.defaultEngine = defaultEngine;
            return this;
        }
        public Boolean getDefaultEngine() {
            return this.defaultEngine;
        }

        public ListConnectionsResponseBodyDataConnections setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListConnectionsResponseBodyDataConnections setEnvType(Integer envType) {
            this.envType = envType;
            return this;
        }
        public Integer getEnvType() {
            return this.envType;
        }

        public ListConnectionsResponseBodyDataConnections setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListConnectionsResponseBodyDataConnections setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListConnectionsResponseBodyDataConnections setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public ListConnectionsResponseBodyDataConnections setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListConnectionsResponseBodyDataConnections setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListConnectionsResponseBodyDataConnections setProjectId(Integer projectId) {
            this.projectId = projectId;
            return this;
        }
        public Integer getProjectId() {
            return this.projectId;
        }

        public ListConnectionsResponseBodyDataConnections setSequence(Integer sequence) {
            this.sequence = sequence;
            return this;
        }
        public Integer getSequence() {
            return this.sequence;
        }

        public ListConnectionsResponseBodyDataConnections setShared(Boolean shared) {
            this.shared = shared;
            return this;
        }
        public Boolean getShared() {
            return this.shared;
        }

        public ListConnectionsResponseBodyDataConnections setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListConnectionsResponseBodyDataConnections setSubType(String subType) {
            this.subType = subType;
            return this;
        }
        public String getSubType() {
            return this.subType;
        }

        public ListConnectionsResponseBodyDataConnections setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

    }

    public static class ListConnectionsResponseBodyData extends TeaModel {
        /**
         * <p>The data sources.</p>
         */
        @NameInMap("Connections")
        public java.util.List<ListConnectionsResponseBodyDataConnections> connections;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries per page. Default value: 10. Maximum value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of data sources returned.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListConnectionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListConnectionsResponseBodyData self = new ListConnectionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListConnectionsResponseBodyData setConnections(java.util.List<ListConnectionsResponseBodyDataConnections> connections) {
            this.connections = connections;
            return this;
        }
        public java.util.List<ListConnectionsResponseBodyDataConnections> getConnections() {
            return this.connections;
        }

        public ListConnectionsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListConnectionsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListConnectionsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
