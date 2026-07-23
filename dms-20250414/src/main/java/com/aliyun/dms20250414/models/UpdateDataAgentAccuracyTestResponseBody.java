// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class UpdateDataAgentAccuracyTestResponseBody extends TeaModel {
    /**
     * <p>The response struct.</p>
     */
    @NameInMap("Data")
    public UpdateDataAgentAccuracyTestResponseBodyData data;

    /**
     * <p>The error code returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>Specified parameter Tid is not valid.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>E0D21075-xxx-FD8AD04A63B6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The request was successful.                                 </li>
     * <li><strong>false</strong>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static UpdateDataAgentAccuracyTestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataAgentAccuracyTestResponseBody self = new UpdateDataAgentAccuracyTestResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDataAgentAccuracyTestResponseBody setData(UpdateDataAgentAccuracyTestResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateDataAgentAccuracyTestResponseBodyData getData() {
        return this.data;
    }

    public UpdateDataAgentAccuracyTestResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public UpdateDataAgentAccuracyTestResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public UpdateDataAgentAccuracyTestResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateDataAgentAccuracyTestResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class UpdateDataAgentAccuracyTestResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the accuracy test item.</p>
         * 
         * <strong>example:</strong>
         * <p>at-106n4rg17gv9fxxxxxxxxxx</p>
         */
        @NameInMap("AccuracyTest")
        public String accuracyTest;

        /**
         * <p>Agent Id</p>
         * 
         * <strong>example:</strong>
         * <p>cu0cs*******mf</p>
         */
        @NameInMap("AgentId")
        public String agentId;

        /**
         * <p>The data source. We recommend that you configure this parameter in a custom agent.</p>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;DataSourceType\&quot;:\&quot;database\&quot;,\&quot;RegionId\&quot;:\&quot;cn-hangzhou\&quot;,\&quot;DmsInstanceId\&quot;:\&quot;27xxxxx\&quot;,\&quot;DmsDatabaseId\&quot;:\&quot;752xxxxx\&quot;,\&quot;Database\&quot;:\&quot;employees\&quot;,\&quot;Tables\&quot;:[\&quot;employees\&quot;,\&quot;salaries\&quot;,\&quot;departments\&quot;]}]</p>
         */
        @NameInMap("Dataset")
        public String dataset;

        @NameInMap("Datasource")
        public String datasource;

        @NameInMap("Desc")
        public String desc;

        /**
         * <p>The accuracy evaluation criteria. An empty value indicates the default criteria.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("EvaluationPrompt")
        public String evaluationPrompt;

        /**
         * <p>The file ID.</p>
         * 
         * <strong>example:</strong>
         * <p>f-8*******01m</p>
         */
        @NameInMap("FileId")
        public String fileId;

        @NameInMap("MaxConcurrent")
        public Integer maxConcurrent;

        /**
         * <p>The analysis mode.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Mode")
        public Integer mode;

        @NameInMap("Name")
        public String name;

        @NameInMap("NeedDelete")
        public Boolean needDelete;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8wfig6l33n4f4xxxxxxxxxx</p>
         */
        @NameInMap("WorkspaceId")
        public String workspaceId;

        public static UpdateDataAgentAccuracyTestResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataAgentAccuracyTestResponseBodyData self = new UpdateDataAgentAccuracyTestResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateDataAgentAccuracyTestResponseBodyData setAccuracyTest(String accuracyTest) {
            this.accuracyTest = accuracyTest;
            return this;
        }
        public String getAccuracyTest() {
            return this.accuracyTest;
        }

        public UpdateDataAgentAccuracyTestResponseBodyData setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public UpdateDataAgentAccuracyTestResponseBodyData setDataset(String dataset) {
            this.dataset = dataset;
            return this;
        }
        public String getDataset() {
            return this.dataset;
        }

        public UpdateDataAgentAccuracyTestResponseBodyData setDatasource(String datasource) {
            this.datasource = datasource;
            return this;
        }
        public String getDatasource() {
            return this.datasource;
        }

        public UpdateDataAgentAccuracyTestResponseBodyData setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public UpdateDataAgentAccuracyTestResponseBodyData setEvaluationPrompt(String evaluationPrompt) {
            this.evaluationPrompt = evaluationPrompt;
            return this;
        }
        public String getEvaluationPrompt() {
            return this.evaluationPrompt;
        }

        public UpdateDataAgentAccuracyTestResponseBodyData setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

        public UpdateDataAgentAccuracyTestResponseBodyData setMaxConcurrent(Integer maxConcurrent) {
            this.maxConcurrent = maxConcurrent;
            return this;
        }
        public Integer getMaxConcurrent() {
            return this.maxConcurrent;
        }

        public UpdateDataAgentAccuracyTestResponseBodyData setMode(Integer mode) {
            this.mode = mode;
            return this;
        }
        public Integer getMode() {
            return this.mode;
        }

        public UpdateDataAgentAccuracyTestResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateDataAgentAccuracyTestResponseBodyData setNeedDelete(Boolean needDelete) {
            this.needDelete = needDelete;
            return this;
        }
        public Boolean getNeedDelete() {
            return this.needDelete;
        }

        public UpdateDataAgentAccuracyTestResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
