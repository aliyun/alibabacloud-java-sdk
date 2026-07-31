// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetSemanticJobDetailResponseBody extends TeaModel {
    /**
     * <p>The job details returned by the executor. Used to determine the run status and view the actual runtime configuration.</p>
     */
    @NameInMap("Data")
    public GetSemanticJobDetailResponseBodyData data;

    /**
     * <p>The request ID. Used for locating logs and troubleshooting issues.</p>
     * 
     * <strong>example:</strong>
     * <p>676271D6-53B4-57BE-89FA-72F7AE1418DF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetSemanticJobDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSemanticJobDetailResponseBody self = new GetSemanticJobDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSemanticJobDetailResponseBody setData(GetSemanticJobDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSemanticJobDetailResponseBodyData getData() {
        return this.data;
    }

    public GetSemanticJobDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSemanticJobDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetSemanticJobDetailResponseBodyData extends TeaModel {
        /**
         * <p>The advanced runtime settings returned by the executor.</p>
         */
        @NameInMap("AdvanceSettings")
        public java.util.Map<String, ?> advanceSettings;

        /**
         * <p>The code parameter information returned by the executor. Used for troubleshooting the runtime configuration of this run.</p>
         * 
         * <strong>example:</strong>
         * <p>--limit 100</p>
         */
        @NameInMap("CodeParameters")
        public String codeParameters;

        /**
         * <p>The index of the SQL fragment currently being processed by the executor.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CurrentSqlIndex")
        public Integer currentSqlIndex;

        /**
         * <p>The customer identifier of the executor job.</p>
         * 
         * <strong>example:</strong>
         * <p>meta_semantic</p>
         */
        @NameInMap("CustomerName")
        public String customerName;

        /**
         * <p>The data source identifier used by the executor job.</p>
         * 
         * <strong>example:</strong>
         * <p>maxcompute</p>
         */
        @NameInMap("Datasource")
        public String datasource;

        /**
         * <p>The runtime environment identifier returned by the executor.</p>
         * 
         * <strong>example:</strong>
         * <p>PROD</p>
         */
        @NameInMap("Env")
        public String env;

        /**
         * <p>The list of execution type codes returned by the executor.</p>
         */
        @NameInMap("ExecTypes")
        public java.util.List<Integer> execTypes;

        /**
         * <p>The executor job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>exec-job-demo</p>
         */
        @NameInMap("ExecutorJobId")
        public String executorJobId;

        /**
         * <p>The node type code of the executor. Semantic jobs use Shell node code 6.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("FileType")
        public Integer fileType;

        /**
         * <p>The DataWorks workspace ID associated with the executor job.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The ID of the resource group that actually executed the job.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-demo</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The list of resource URLs associated with the executor job.</p>
         */
        @NameInMap("ResourceUrls")
        public java.util.List<java.util.Map<String, ?>> resourceUrls;

        /**
         * <p>The list of status codes returned by the executor. Used to determine the current or final status of the job.</p>
         */
        @NameInMap("Statuses")
        public java.util.List<Integer> statuses;

        public static GetSemanticJobDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSemanticJobDetailResponseBodyData self = new GetSemanticJobDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSemanticJobDetailResponseBodyData setAdvanceSettings(java.util.Map<String, ?> advanceSettings) {
            this.advanceSettings = advanceSettings;
            return this;
        }
        public java.util.Map<String, ?> getAdvanceSettings() {
            return this.advanceSettings;
        }

        public GetSemanticJobDetailResponseBodyData setCodeParameters(String codeParameters) {
            this.codeParameters = codeParameters;
            return this;
        }
        public String getCodeParameters() {
            return this.codeParameters;
        }

        public GetSemanticJobDetailResponseBodyData setCurrentSqlIndex(Integer currentSqlIndex) {
            this.currentSqlIndex = currentSqlIndex;
            return this;
        }
        public Integer getCurrentSqlIndex() {
            return this.currentSqlIndex;
        }

        public GetSemanticJobDetailResponseBodyData setCustomerName(String customerName) {
            this.customerName = customerName;
            return this;
        }
        public String getCustomerName() {
            return this.customerName;
        }

        public GetSemanticJobDetailResponseBodyData setDatasource(String datasource) {
            this.datasource = datasource;
            return this;
        }
        public String getDatasource() {
            return this.datasource;
        }

        public GetSemanticJobDetailResponseBodyData setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
        }

        public GetSemanticJobDetailResponseBodyData setExecTypes(java.util.List<Integer> execTypes) {
            this.execTypes = execTypes;
            return this;
        }
        public java.util.List<Integer> getExecTypes() {
            return this.execTypes;
        }

        public GetSemanticJobDetailResponseBodyData setExecutorJobId(String executorJobId) {
            this.executorJobId = executorJobId;
            return this;
        }
        public String getExecutorJobId() {
            return this.executorJobId;
        }

        public GetSemanticJobDetailResponseBodyData setFileType(Integer fileType) {
            this.fileType = fileType;
            return this;
        }
        public Integer getFileType() {
            return this.fileType;
        }

        public GetSemanticJobDetailResponseBodyData setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetSemanticJobDetailResponseBodyData setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public GetSemanticJobDetailResponseBodyData setResourceUrls(java.util.List<java.util.Map<String, ?>> resourceUrls) {
            this.resourceUrls = resourceUrls;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getResourceUrls() {
            return this.resourceUrls;
        }

        public GetSemanticJobDetailResponseBodyData setStatuses(java.util.List<Integer> statuses) {
            this.statuses = statuses;
            return this;
        }
        public java.util.List<Integer> getStatuses() {
            return this.statuses;
        }

    }

}
