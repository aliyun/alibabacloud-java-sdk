// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class DeployCustomContainerOutput extends TeaModel {
    @NameInMap("data")
    public DeployCustomContainerOutputData data;

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

    public static DeployCustomContainerOutput build(java.util.Map<String, ?> map) throws Exception {
        DeployCustomContainerOutput self = new DeployCustomContainerOutput();
        return TeaModel.build(map, self);
    }

    public DeployCustomContainerOutput setData(DeployCustomContainerOutputData data) {
        this.data = data;
        return this;
    }
    public DeployCustomContainerOutputData getData() {
        return this.data;
    }

    public DeployCustomContainerOutput setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DeployCustomContainerOutput setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public DeployCustomContainerOutput setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeployCustomContainerOutput setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeployCustomContainerOutputData extends TeaModel {
        @NameInMap("deploymentTaskID")
        public String deploymentTaskID;

        @NameInMap("errorMessage")
        public String errorMessage;

        @NameInMap("finished")
        public Boolean finished;

        @NameInMap("nasConfigStr")
        public String nasConfigStr;

        @NameInMap("serviceName")
        public String serviceName;

        @NameInMap("traceID")
        public String traceID;

        @NameInMap("urlInternet")
        public String urlInternet;

        @NameInMap("urlIntranet")
        public String urlIntranet;

        @NameInMap("vpcConfigStr")
        public String vpcConfigStr;

        public static DeployCustomContainerOutputData build(java.util.Map<String, ?> map) throws Exception {
            DeployCustomContainerOutputData self = new DeployCustomContainerOutputData();
            return TeaModel.build(map, self);
        }

        public DeployCustomContainerOutputData setDeploymentTaskID(String deploymentTaskID) {
            this.deploymentTaskID = deploymentTaskID;
            return this;
        }
        public String getDeploymentTaskID() {
            return this.deploymentTaskID;
        }

        public DeployCustomContainerOutputData setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DeployCustomContainerOutputData setFinished(Boolean finished) {
            this.finished = finished;
            return this;
        }
        public Boolean getFinished() {
            return this.finished;
        }

        public DeployCustomContainerOutputData setNasConfigStr(String nasConfigStr) {
            this.nasConfigStr = nasConfigStr;
            return this;
        }
        public String getNasConfigStr() {
            return this.nasConfigStr;
        }

        public DeployCustomContainerOutputData setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public DeployCustomContainerOutputData setTraceID(String traceID) {
            this.traceID = traceID;
            return this;
        }
        public String getTraceID() {
            return this.traceID;
        }

        public DeployCustomContainerOutputData setUrlInternet(String urlInternet) {
            this.urlInternet = urlInternet;
            return this;
        }
        public String getUrlInternet() {
            return this.urlInternet;
        }

        public DeployCustomContainerOutputData setUrlIntranet(String urlIntranet) {
            this.urlIntranet = urlIntranet;
            return this;
        }
        public String getUrlIntranet() {
            return this.urlIntranet;
        }

        public DeployCustomContainerOutputData setVpcConfigStr(String vpcConfigStr) {
            this.vpcConfigStr = vpcConfigStr;
            return this;
        }
        public String getVpcConfigStr() {
            return this.vpcConfigStr;
        }

    }

}
