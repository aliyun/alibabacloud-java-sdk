// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetDeploymentResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("ErrorCode")
    @Validation(required = true)
    public String errorCode;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("HttpStatusCode")
    @Validation(required = true)
    public Integer httpStatusCode;

    @NameInMap("Data")
    @Validation(required = true)
    public GetDeploymentResponseData data;

    public static GetDeploymentResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDeploymentResponse self = new GetDeploymentResponse();
        return TeaModel.build(map, self);
    }

    public GetDeploymentResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDeploymentResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetDeploymentResponse setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetDeploymentResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetDeploymentResponse setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetDeploymentResponse setData(GetDeploymentResponseData data) {
        this.data = data;
        return this;
    }
    public GetDeploymentResponseData getData() {
        return this.data;
    }

    public static class GetDeploymentResponseDataDeployment extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("CreatorId")
        @Validation(required = true)
        public String creatorId;

        @NameInMap("HandlerId")
        @Validation(required = true)
        public String handlerId;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public Long createTime;

        @NameInMap("ExecuteTime")
        @Validation(required = true)
        public Long executeTime;

        @NameInMap("Status")
        @Validation(required = true)
        public Integer status;

        @NameInMap("FromEnvironment")
        @Validation(required = true)
        public Integer fromEnvironment;

        @NameInMap("ToEnvironment")
        @Validation(required = true)
        public Integer toEnvironment;

        @NameInMap("ErrorMessage")
        @Validation(required = true)
        public String errorMessage;

        public static GetDeploymentResponseDataDeployment build(java.util.Map<String, ?> map) throws Exception {
            GetDeploymentResponseDataDeployment self = new GetDeploymentResponseDataDeployment();
            return TeaModel.build(map, self);
        }

        public GetDeploymentResponseDataDeployment setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetDeploymentResponseDataDeployment setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public GetDeploymentResponseDataDeployment setHandlerId(String handlerId) {
            this.handlerId = handlerId;
            return this;
        }
        public String getHandlerId() {
            return this.handlerId;
        }

        public GetDeploymentResponseDataDeployment setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetDeploymentResponseDataDeployment setExecuteTime(Long executeTime) {
            this.executeTime = executeTime;
            return this;
        }
        public Long getExecuteTime() {
            return this.executeTime;
        }

        public GetDeploymentResponseDataDeployment setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetDeploymentResponseDataDeployment setFromEnvironment(Integer fromEnvironment) {
            this.fromEnvironment = fromEnvironment;
            return this;
        }
        public Integer getFromEnvironment() {
            return this.fromEnvironment;
        }

        public GetDeploymentResponseDataDeployment setToEnvironment(Integer toEnvironment) {
            this.toEnvironment = toEnvironment;
            return this;
        }
        public Integer getToEnvironment() {
            return this.toEnvironment;
        }

        public GetDeploymentResponseDataDeployment setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

    }

    public static class GetDeploymentResponseData extends TeaModel {
        @NameInMap("Deployment")
        @Validation(required = true)
        public GetDeploymentResponseDataDeployment deployment;

        public static GetDeploymentResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetDeploymentResponseData self = new GetDeploymentResponseData();
            return TeaModel.build(map, self);
        }

        public GetDeploymentResponseData setDeployment(GetDeploymentResponseDataDeployment deployment) {
            this.deployment = deployment;
            return this;
        }
        public GetDeploymentResponseDataDeployment getDeployment() {
            return this.deployment;
        }

    }

}
