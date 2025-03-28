// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class DeployModelScopeModelOutput extends TeaModel {
    @NameInMap("data")
    public DeployModelScopeModelOutputData data;

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

    public static DeployModelScopeModelOutput build(java.util.Map<String, ?> map) throws Exception {
        DeployModelScopeModelOutput self = new DeployModelScopeModelOutput();
        return TeaModel.build(map, self);
    }

    public DeployModelScopeModelOutput setData(DeployModelScopeModelOutputData data) {
        this.data = data;
        return this;
    }
    public DeployModelScopeModelOutputData getData() {
        return this.data;
    }

    public DeployModelScopeModelOutput setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DeployModelScopeModelOutput setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public DeployModelScopeModelOutput setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeployModelScopeModelOutput setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeployModelScopeModelOutputData extends TeaModel {
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

        public static DeployModelScopeModelOutputData build(java.util.Map<String, ?> map) throws Exception {
            DeployModelScopeModelOutputData self = new DeployModelScopeModelOutputData();
            return TeaModel.build(map, self);
        }

        public DeployModelScopeModelOutputData setDeploymentTaskID(String deploymentTaskID) {
            this.deploymentTaskID = deploymentTaskID;
            return this;
        }
        public String getDeploymentTaskID() {
            return this.deploymentTaskID;
        }

        public DeployModelScopeModelOutputData setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DeployModelScopeModelOutputData setFinished(Boolean finished) {
            this.finished = finished;
            return this;
        }
        public Boolean getFinished() {
            return this.finished;
        }

        public DeployModelScopeModelOutputData setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public DeployModelScopeModelOutputData setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public DeployModelScopeModelOutputData setTraceID(String traceID) {
            this.traceID = traceID;
            return this;
        }
        public String getTraceID() {
            return this.traceID;
        }

        public DeployModelScopeModelOutputData setUrlInternet(String urlInternet) {
            this.urlInternet = urlInternet;
            return this;
        }
        public String getUrlInternet() {
            return this.urlInternet;
        }

        public DeployModelScopeModelOutputData setUrlIntranet(String urlIntranet) {
            this.urlIntranet = urlIntranet;
            return this;
        }
        public String getUrlIntranet() {
            return this.urlIntranet;
        }

    }

}
