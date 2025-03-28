// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class DeployOllamaModelOutput extends TeaModel {
    @NameInMap("data")
    public DeployOllamaModelOutputData data;

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

    public static DeployOllamaModelOutput build(java.util.Map<String, ?> map) throws Exception {
        DeployOllamaModelOutput self = new DeployOllamaModelOutput();
        return TeaModel.build(map, self);
    }

    public DeployOllamaModelOutput setData(DeployOllamaModelOutputData data) {
        this.data = data;
        return this;
    }
    public DeployOllamaModelOutputData getData() {
        return this.data;
    }

    public DeployOllamaModelOutput setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DeployOllamaModelOutput setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public DeployOllamaModelOutput setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeployOllamaModelOutput setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeployOllamaModelOutputData extends TeaModel {
        @NameInMap("deploymentTaskID")
        public String deploymentTaskID;

        @NameInMap("errorMessage")
        public String errorMessage;

        @NameInMap("finished")
        public Boolean finished;

        @NameInMap("modelName")
        public String modelName;

        @NameInMap("serviceName")
        public String serviceName;

        @NameInMap("traceID")
        public String traceID;

        @NameInMap("urlInternet")
        public String urlInternet;

        @NameInMap("urlIntranet")
        public String urlIntranet;

        public static DeployOllamaModelOutputData build(java.util.Map<String, ?> map) throws Exception {
            DeployOllamaModelOutputData self = new DeployOllamaModelOutputData();
            return TeaModel.build(map, self);
        }

        public DeployOllamaModelOutputData setDeploymentTaskID(String deploymentTaskID) {
            this.deploymentTaskID = deploymentTaskID;
            return this;
        }
        public String getDeploymentTaskID() {
            return this.deploymentTaskID;
        }

        public DeployOllamaModelOutputData setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DeployOllamaModelOutputData setFinished(Boolean finished) {
            this.finished = finished;
            return this;
        }
        public Boolean getFinished() {
            return this.finished;
        }

        public DeployOllamaModelOutputData setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public DeployOllamaModelOutputData setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public DeployOllamaModelOutputData setTraceID(String traceID) {
            this.traceID = traceID;
            return this;
        }
        public String getTraceID() {
            return this.traceID;
        }

        public DeployOllamaModelOutputData setUrlInternet(String urlInternet) {
            this.urlInternet = urlInternet;
            return this;
        }
        public String getUrlInternet() {
            return this.urlInternet;
        }

        public DeployOllamaModelOutputData setUrlIntranet(String urlIntranet) {
            this.urlIntranet = urlIntranet;
            return this;
        }
        public String getUrlIntranet() {
            return this.urlIntranet;
        }

    }

}
