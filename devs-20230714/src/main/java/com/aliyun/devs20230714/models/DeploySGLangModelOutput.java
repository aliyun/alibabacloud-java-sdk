// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class DeploySGLangModelOutput extends TeaModel {
    @NameInMap("data")
    public DeploySGLangModelOutputData data;

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

    public static DeploySGLangModelOutput build(java.util.Map<String, ?> map) throws Exception {
        DeploySGLangModelOutput self = new DeploySGLangModelOutput();
        return TeaModel.build(map, self);
    }

    public DeploySGLangModelOutput setData(DeploySGLangModelOutputData data) {
        this.data = data;
        return this;
    }
    public DeploySGLangModelOutputData getData() {
        return this.data;
    }

    public DeploySGLangModelOutput setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DeploySGLangModelOutput setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public DeploySGLangModelOutput setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeploySGLangModelOutput setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeploySGLangModelOutputData extends TeaModel {
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

        public static DeploySGLangModelOutputData build(java.util.Map<String, ?> map) throws Exception {
            DeploySGLangModelOutputData self = new DeploySGLangModelOutputData();
            return TeaModel.build(map, self);
        }

        public DeploySGLangModelOutputData setDeploymentTaskID(String deploymentTaskID) {
            this.deploymentTaskID = deploymentTaskID;
            return this;
        }
        public String getDeploymentTaskID() {
            return this.deploymentTaskID;
        }

        public DeploySGLangModelOutputData setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DeploySGLangModelOutputData setFinished(Boolean finished) {
            this.finished = finished;
            return this;
        }
        public Boolean getFinished() {
            return this.finished;
        }

        public DeploySGLangModelOutputData setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public DeploySGLangModelOutputData setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public DeploySGLangModelOutputData setTraceID(String traceID) {
            this.traceID = traceID;
            return this;
        }
        public String getTraceID() {
            return this.traceID;
        }

        public DeploySGLangModelOutputData setUrlInternet(String urlInternet) {
            this.urlInternet = urlInternet;
            return this;
        }
        public String getUrlInternet() {
            return this.urlInternet;
        }

        public DeploySGLangModelOutputData setUrlIntranet(String urlIntranet) {
            this.urlIntranet = urlIntranet;
            return this;
        }
        public String getUrlIntranet() {
            return this.urlIntranet;
        }

    }

}
