// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ExportDataSourcesResponseBody extends TeaModel {
    /**
     * <p>The information about the exported data sources.</p>
     */
    @NameInMap("Data")
    public ExportDataSourcesResponseBodyData data;

    /**
     * <p>The HTTP status code returned. Valid values:</p>
     * <ul>
     * <li>200: The request was successful.</li>
     * <li>Other values: The request failed. You can troubleshoot issues based on the HTTP status code returned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The request ID. You can locate logs and troubleshoot issues based on the ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0bc14115159376359****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ExportDataSourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExportDataSourcesResponseBody self = new ExportDataSourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ExportDataSourcesResponseBody setData(ExportDataSourcesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ExportDataSourcesResponseBodyData getData() {
        return this.data;
    }

    public ExportDataSourcesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ExportDataSourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExportDataSourcesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ExportDataSourcesResponseBodyDataDataSources extends TeaModel {
        /**
         * <p>The ID of the compute engine that is added as the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("BindingCalcEngineId")
        public Integer bindingCalcEngineId;

        /**
         * <p>Indicates whether the data source is connected to an exclusive resource group. Valid values:</p>
         * <ul>
         * <li>1: The data source is connected to at least one exclusive resource group.</li>
         * <li>0: The data source is not connected to any exclusive resource group.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ConnectStatus")
        public Integer connectStatus;

        /**
         * <p>The configuration of the data source.</p>
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
         * <p>Indicates whether the compute engine that is added as the data source is the default compute engine. Valid values:</p>
         * <ul>
         * <li>true: The compute engine is the default compute engine.</li>
         * <li>false: The compute engine is not the default compute engine.</li>
         * </ul>
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
         * <p>The environment in which the data source resides. Valid values:</p>
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
         * <p>The ID of the user who exported the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>193543050****</p>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <p>The ID of the DataWorks workspace to which the data source belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("ProjectId")
        public Integer projectId;

        /**
         * <p>The sequence number of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("Sequence")
        public Integer sequence;

        /**
         * <p>Indicates whether the data source can be shared. Valid values:</p>
         * <ul>
         * <li>true: The data source can be shared.</li>
         * <li>false: The data source cannot be shared.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Shared")
        public Boolean shared;

        /**
         * <p>Indicates whether the data source is available. Valid values:</p>
         * <ul>
         * <li>1: The data source is available.</li>
         * <li>0: The data source is unavailable.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The subtype of the data source. This parameter takes effect only when the DataSourceType parameter is set to rds.</p>
         * <p>If the value of the DataSourceType parameter is rds, the value of this parameter can be mysql, sqlserver, or postgresql.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql</p>
         */
        @NameInMap("SubType")
        public String subType;

        /**
         * <p>The ID of the Alibaba Cloud account to which the data source belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567</p>
         */
        @NameInMap("TenantId")
        public Long tenantId;

        public static ExportDataSourcesResponseBodyDataDataSources build(java.util.Map<String, ?> map) throws Exception {
            ExportDataSourcesResponseBodyDataDataSources self = new ExportDataSourcesResponseBodyDataDataSources();
            return TeaModel.build(map, self);
        }

        public ExportDataSourcesResponseBodyDataDataSources setBindingCalcEngineId(Integer bindingCalcEngineId) {
            this.bindingCalcEngineId = bindingCalcEngineId;
            return this;
        }
        public Integer getBindingCalcEngineId() {
            return this.bindingCalcEngineId;
        }

        public ExportDataSourcesResponseBodyDataDataSources setConnectStatus(Integer connectStatus) {
            this.connectStatus = connectStatus;
            return this;
        }
        public Integer getConnectStatus() {
            return this.connectStatus;
        }

        public ExportDataSourcesResponseBodyDataDataSources setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ExportDataSourcesResponseBodyDataDataSources setDataSourceType(String dataSourceType) {
            this.dataSourceType = dataSourceType;
            return this;
        }
        public String getDataSourceType() {
            return this.dataSourceType;
        }

        public ExportDataSourcesResponseBodyDataDataSources setDefaultEngine(Boolean defaultEngine) {
            this.defaultEngine = defaultEngine;
            return this;
        }
        public Boolean getDefaultEngine() {
            return this.defaultEngine;
        }

        public ExportDataSourcesResponseBodyDataDataSources setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ExportDataSourcesResponseBodyDataDataSources setEnvType(Integer envType) {
            this.envType = envType;
            return this;
        }
        public Integer getEnvType() {
            return this.envType;
        }

        public ExportDataSourcesResponseBodyDataDataSources setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ExportDataSourcesResponseBodyDataDataSources setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ExportDataSourcesResponseBodyDataDataSources setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public ExportDataSourcesResponseBodyDataDataSources setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ExportDataSourcesResponseBodyDataDataSources setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ExportDataSourcesResponseBodyDataDataSources setProjectId(Integer projectId) {
            this.projectId = projectId;
            return this;
        }
        public Integer getProjectId() {
            return this.projectId;
        }

        public ExportDataSourcesResponseBodyDataDataSources setSequence(Integer sequence) {
            this.sequence = sequence;
            return this;
        }
        public Integer getSequence() {
            return this.sequence;
        }

        public ExportDataSourcesResponseBodyDataDataSources setShared(Boolean shared) {
            this.shared = shared;
            return this;
        }
        public Boolean getShared() {
            return this.shared;
        }

        public ExportDataSourcesResponseBodyDataDataSources setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ExportDataSourcesResponseBodyDataDataSources setSubType(String subType) {
            this.subType = subType;
            return this;
        }
        public String getSubType() {
            return this.subType;
        }

        public ExportDataSourcesResponseBodyDataDataSources setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

    }

    public static class ExportDataSourcesResponseBodyData extends TeaModel {
        /**
         * <p>The details of the exported data sources. The value is an array. The following parameters are the elements in the array. The sample values of these parameters show the details of a sample data source.</p>
         */
        @NameInMap("DataSources")
        public java.util.List<ExportDataSourcesResponseBodyDataDataSources> dataSources;

        /**
         * <p>The page number. Pages start from page 1.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ExportDataSourcesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ExportDataSourcesResponseBodyData self = new ExportDataSourcesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ExportDataSourcesResponseBodyData setDataSources(java.util.List<ExportDataSourcesResponseBodyDataDataSources> dataSources) {
            this.dataSources = dataSources;
            return this;
        }
        public java.util.List<ExportDataSourcesResponseBodyDataDataSources> getDataSources() {
            return this.dataSources;
        }

        public ExportDataSourcesResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ExportDataSourcesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ExportDataSourcesResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
