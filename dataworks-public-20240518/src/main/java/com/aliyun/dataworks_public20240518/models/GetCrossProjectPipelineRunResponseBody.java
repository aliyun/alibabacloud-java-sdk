// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetCrossProjectPipelineRunResponseBody extends TeaModel {
    /**
     * <p>The business response.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;RequestId&quot;:&quot;735894D1-D5E5-50B8-8A6D-041C90A98B23&quot;,&quot;PipelineRunId&quot;:&quot;fcfd4160-e2ff-4603-9719-09128fe733df&quot;,&quot;DeploymentEnvironmentId&quot;:101,&quot;ObjectId&quot;:&quot;1&quot;,&quot;ObjectType&quot;:&quot;ODPS_SQL&quot;,&quot;ObjectName&quot;:&quot;object-1&quot;,&quot;ObjectVersion&quot;:&quot;7&quot;,&quot;ChangeType&quot;:&quot;ADD&quot;,&quot;Status&quot;:&quot;Ready&quot;,&quot;Description&quot;:&quot;Publish objects that are published in the source project to the target project&quot;,&quot;Creator&quot;:&quot;creator&quot;,&quot;CreateTime&quot;:1788739200000}</p>
     */
    @NameInMap("Data")
    public GetCrossProjectPipelineRunResponseBodyData data;

    /**
     * <p>The request ID, which is used to locate and troubleshoot this API call.</p>
     * 
     * <strong>example:</strong>
     * <p>735894D1-D5E5-50B8-8A6D-041C90A98B23</p>
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

    public static GetCrossProjectPipelineRunResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCrossProjectPipelineRunResponseBody self = new GetCrossProjectPipelineRunResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCrossProjectPipelineRunResponseBody setData(GetCrossProjectPipelineRunResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetCrossProjectPipelineRunResponseBodyData getData() {
        return this.data;
    }

    public GetCrossProjectPipelineRunResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCrossProjectPipelineRunResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetCrossProjectPipelineRunResponseBodyData extends TeaModel {
        /**
         * <p>The termination time. This value is a UNIX timestamp in milliseconds. This parameter is returned only after the flow is terminated.</p>
         * 
         * <strong>example:</strong>
         * <p>1788739260000</p>
         */
        @NameInMap("AbolishTime")
        public Long abolishTime;

        /**
         * <p>The user who terminated the flow.</p>
         * 
         * <strong>example:</strong>
         * <p>operator</p>
         */
        @NameInMap("Abolisher")
        public String abolisher;

        /**
         * <p>The change type.</p>
         * 
         * <strong>example:</strong>
         * <p>ADD</p>
         */
        @NameInMap("ChangeType")
        public String changeType;

        /**
         * <p>The creation time. This value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1788739200000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The creator.</p>
         * 
         * <strong>example:</strong>
         * <p>creator</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <p>The cross-workspace deployment environment ID.</p>
         * 
         * <strong>example:</strong>
         * <p>101</p>
         */
        @NameInMap("DeploymentEnvironmentId")
        public Long deploymentEnvironmentId;

        /**
         * <p>The deployment description.</p>
         * 
         * <strong>example:</strong>
         * <p>Publish objects that are published in the source project to the target project</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>DeploymentFailed</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>Deployment failed</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The execution time. This value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1788739260000</p>
         */
        @NameInMap("ExecuteTime")
        public Long executeTime;

        /**
         * <p>The executor.</p>
         * 
         * <strong>example:</strong>
         * <p>executor</p>
         */
        @NameInMap("Executor")
        public String executor;

        /**
         * <p>The completion time. This value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1788739320000</p>
         */
        @NameInMap("FinishTime")
        public Long finishTime;

        /**
         * <p>The ID of the deployment object.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ObjectId")
        public String objectId;

        /**
         * <p>The name of the deployment object.</p>
         * 
         * <strong>example:</strong>
         * <p>object-1</p>
         */
        @NameInMap("ObjectName")
        public String objectName;

        /**
         * <p>The object type of the publish object.</p>
         * 
         * <strong>example:</strong>
         * <p>ODPS_SQL</p>
         */
        @NameInMap("ObjectType")
        public String objectType;

        /**
         * <p>The version of the deployment object.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("ObjectVersion")
        public String objectVersion;

        /**
         * <p>The cross-workspace deployment flow ID.</p>
         * 
         * <strong>example:</strong>
         * <p>fcfd4160-e2ff-4603-9719-09128fe733df</p>
         */
        @NameInMap("PipelineRunId")
        public String pipelineRunId;

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>735894D1-D5E5-50B8-8A6D-041C90A98B23</p>
         */
        @NameInMap("RequestId")
        public String requestId;

        /**
         * <p>The status of the deployment flow. Valid values:</p>
         * <ul>
         * <li>Building: Building.</li>
         * <li>Ready: Ready and waiting for execution.</li>
         * <li>Running: Running.</li>
         * <li>Termination: Terminated.</li>
         * <li>Success: Execution succeeded.</li>
         * <li>Fail: Execution failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Ready</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetCrossProjectPipelineRunResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCrossProjectPipelineRunResponseBodyData self = new GetCrossProjectPipelineRunResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCrossProjectPipelineRunResponseBodyData setAbolishTime(Long abolishTime) {
            this.abolishTime = abolishTime;
            return this;
        }
        public Long getAbolishTime() {
            return this.abolishTime;
        }

        public GetCrossProjectPipelineRunResponseBodyData setAbolisher(String abolisher) {
            this.abolisher = abolisher;
            return this;
        }
        public String getAbolisher() {
            return this.abolisher;
        }

        public GetCrossProjectPipelineRunResponseBodyData setChangeType(String changeType) {
            this.changeType = changeType;
            return this;
        }
        public String getChangeType() {
            return this.changeType;
        }

        public GetCrossProjectPipelineRunResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetCrossProjectPipelineRunResponseBodyData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public GetCrossProjectPipelineRunResponseBodyData setDeploymentEnvironmentId(Long deploymentEnvironmentId) {
            this.deploymentEnvironmentId = deploymentEnvironmentId;
            return this;
        }
        public Long getDeploymentEnvironmentId() {
            return this.deploymentEnvironmentId;
        }

        public GetCrossProjectPipelineRunResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetCrossProjectPipelineRunResponseBodyData setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public GetCrossProjectPipelineRunResponseBodyData setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetCrossProjectPipelineRunResponseBodyData setExecuteTime(Long executeTime) {
            this.executeTime = executeTime;
            return this;
        }
        public Long getExecuteTime() {
            return this.executeTime;
        }

        public GetCrossProjectPipelineRunResponseBodyData setExecutor(String executor) {
            this.executor = executor;
            return this;
        }
        public String getExecutor() {
            return this.executor;
        }

        public GetCrossProjectPipelineRunResponseBodyData setFinishTime(Long finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public Long getFinishTime() {
            return this.finishTime;
        }

        public GetCrossProjectPipelineRunResponseBodyData setObjectId(String objectId) {
            this.objectId = objectId;
            return this;
        }
        public String getObjectId() {
            return this.objectId;
        }

        public GetCrossProjectPipelineRunResponseBodyData setObjectName(String objectName) {
            this.objectName = objectName;
            return this;
        }
        public String getObjectName() {
            return this.objectName;
        }

        public GetCrossProjectPipelineRunResponseBodyData setObjectType(String objectType) {
            this.objectType = objectType;
            return this;
        }
        public String getObjectType() {
            return this.objectType;
        }

        public GetCrossProjectPipelineRunResponseBodyData setObjectVersion(String objectVersion) {
            this.objectVersion = objectVersion;
            return this;
        }
        public String getObjectVersion() {
            return this.objectVersion;
        }

        public GetCrossProjectPipelineRunResponseBodyData setPipelineRunId(String pipelineRunId) {
            this.pipelineRunId = pipelineRunId;
            return this;
        }
        public String getPipelineRunId() {
            return this.pipelineRunId;
        }

        public GetCrossProjectPipelineRunResponseBodyData setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public GetCrossProjectPipelineRunResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
