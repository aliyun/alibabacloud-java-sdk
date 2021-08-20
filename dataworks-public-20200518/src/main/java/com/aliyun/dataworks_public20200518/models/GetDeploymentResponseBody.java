// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetDeploymentResponseBody extends TeaModel {
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public GetDeploymentResponseBodyData data;

    public static GetDeploymentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDeploymentResponseBody self = new GetDeploymentResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDeploymentResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetDeploymentResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetDeploymentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDeploymentResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetDeploymentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetDeploymentResponseBody setData(GetDeploymentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDeploymentResponseBodyData getData() {
        return this.data;
    }

    public static class GetDeploymentResponseBodyDataDeployment extends TeaModel {
        @NameInMap("Status")
        public Integer status;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("FromEnvironment")
        public Integer fromEnvironment;

        @NameInMap("ToEnvironment")
        public Integer toEnvironment;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("HandlerId")
        public String handlerId;

        @NameInMap("CreatorId")
        public String creatorId;

        @NameInMap("ExecuteTime")
        public Long executeTime;

        @NameInMap("Name")
        public String name;

        public static GetDeploymentResponseBodyDataDeployment build(java.util.Map<String, ?> map) throws Exception {
            GetDeploymentResponseBodyDataDeployment self = new GetDeploymentResponseBodyDataDeployment();
            return TeaModel.build(map, self);
        }

        public GetDeploymentResponseBodyDataDeployment setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetDeploymentResponseBodyDataDeployment setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetDeploymentResponseBodyDataDeployment setFromEnvironment(Integer fromEnvironment) {
            this.fromEnvironment = fromEnvironment;
            return this;
        }
        public Integer getFromEnvironment() {
            return this.fromEnvironment;
        }

        public GetDeploymentResponseBodyDataDeployment setToEnvironment(Integer toEnvironment) {
            this.toEnvironment = toEnvironment;
            return this;
        }
        public Integer getToEnvironment() {
            return this.toEnvironment;
        }

        public GetDeploymentResponseBodyDataDeployment setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetDeploymentResponseBodyDataDeployment setHandlerId(String handlerId) {
            this.handlerId = handlerId;
            return this;
        }
        public String getHandlerId() {
            return this.handlerId;
        }

        public GetDeploymentResponseBodyDataDeployment setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public GetDeploymentResponseBodyDataDeployment setExecuteTime(Long executeTime) {
            this.executeTime = executeTime;
            return this;
        }
        public Long getExecuteTime() {
            return this.executeTime;
        }

        public GetDeploymentResponseBodyDataDeployment setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetDeploymentResponseBodyData extends TeaModel {
        @NameInMap("Deployment")
        public GetDeploymentResponseBodyDataDeployment deployment;

        public static GetDeploymentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDeploymentResponseBodyData self = new GetDeploymentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDeploymentResponseBodyData setDeployment(GetDeploymentResponseBodyDataDeployment deployment) {
            this.deployment = deployment;
            return this;
        }
        public GetDeploymentResponseBodyDataDeployment getDeployment() {
            return this.deployment;
        }

    }

}
