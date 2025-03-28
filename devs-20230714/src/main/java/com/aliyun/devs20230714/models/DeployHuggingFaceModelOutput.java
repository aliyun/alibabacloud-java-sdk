// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class DeployHuggingFaceModelOutput extends TeaModel {
    @NameInMap("data")
    public DeployHuggingFaceModelOutputData data;

    @NameInMap("errCode")
    public String errCode;

    @NameInMap("errMsg")
    public String errMsg;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    public static DeployHuggingFaceModelOutput build(java.util.Map<String, ?> map) throws Exception {
        DeployHuggingFaceModelOutput self = new DeployHuggingFaceModelOutput();
        return TeaModel.build(map, self);
    }

    public DeployHuggingFaceModelOutput setData(DeployHuggingFaceModelOutputData data) {
        this.data = data;
        return this;
    }
    public DeployHuggingFaceModelOutputData getData() {
        return this.data;
    }

    public DeployHuggingFaceModelOutput setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DeployHuggingFaceModelOutput setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public DeployHuggingFaceModelOutput setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeployHuggingFaceModelOutput setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeployHuggingFaceModelOutputData extends TeaModel {
        @NameInMap("deploymentTaskID")
        public String deploymentTaskID;

        @NameInMap("errorMessage")
        public String errorMessage;

        @NameInMap("finished")
        public Boolean finished;

        @NameInMap("serviceName")
        public String serviceName;

        @NameInMap("taskType")
        public String taskType;

        @NameInMap("traceID")
        public String traceID;

        @NameInMap("urlInternet")
        public String urlInternet;

        @NameInMap("urlIntranet")
        public String urlIntranet;

        public static DeployHuggingFaceModelOutputData build(java.util.Map<String, ?> map) throws Exception {
            DeployHuggingFaceModelOutputData self = new DeployHuggingFaceModelOutputData();
            return TeaModel.build(map, self);
        }

        public DeployHuggingFaceModelOutputData setDeploymentTaskID(String deploymentTaskID) {
            this.deploymentTaskID = deploymentTaskID;
            return this;
        }
        public String getDeploymentTaskID() {
            return this.deploymentTaskID;
        }

        public DeployHuggingFaceModelOutputData setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DeployHuggingFaceModelOutputData setFinished(Boolean finished) {
            this.finished = finished;
            return this;
        }
        public Boolean getFinished() {
            return this.finished;
        }

        public DeployHuggingFaceModelOutputData setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public DeployHuggingFaceModelOutputData setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public DeployHuggingFaceModelOutputData setTraceID(String traceID) {
            this.traceID = traceID;
            return this;
        }
        public String getTraceID() {
            return this.traceID;
        }

        public DeployHuggingFaceModelOutputData setUrlInternet(String urlInternet) {
            this.urlInternet = urlInternet;
            return this;
        }
        public String getUrlInternet() {
            return this.urlInternet;
        }

        public DeployHuggingFaceModelOutputData setUrlIntranet(String urlIntranet) {
            this.urlIntranet = urlIntranet;
            return this;
        }
        public String getUrlIntranet() {
            return this.urlIntranet;
        }

    }

}
