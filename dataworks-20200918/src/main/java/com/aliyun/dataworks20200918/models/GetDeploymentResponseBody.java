// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class GetDeploymentResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetDeploymentResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetDeploymentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDeploymentResponseBody self = new GetDeploymentResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDeploymentResponseBody setData(GetDeploymentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDeploymentResponseBodyData getData() {
        return this.data;
    }

    public GetDeploymentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDeploymentResponseBodyDataDeployment extends TeaModel {
        @NameInMap("CheckingStatus")
        public Integer checkingStatus;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("CreatorId")
        public String creatorId;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("ExecuteTime")
        public Long executeTime;

        @NameInMap("FromEnvironment")
        public Integer fromEnvironment;

        @NameInMap("HandlerId")
        public String handlerId;

        @NameInMap("Name")
        public String name;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("ToEnvironment")
        public Integer toEnvironment;

        public static GetDeploymentResponseBodyDataDeployment build(java.util.Map<String, ?> map) throws Exception {
            GetDeploymentResponseBodyDataDeployment self = new GetDeploymentResponseBodyDataDeployment();
            return TeaModel.build(map, self);
        }

        public GetDeploymentResponseBodyDataDeployment setCheckingStatus(Integer checkingStatus) {
            this.checkingStatus = checkingStatus;
            return this;
        }
        public Integer getCheckingStatus() {
            return this.checkingStatus;
        }

        public GetDeploymentResponseBodyDataDeployment setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetDeploymentResponseBodyDataDeployment setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public GetDeploymentResponseBodyDataDeployment setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetDeploymentResponseBodyDataDeployment setExecuteTime(Long executeTime) {
            this.executeTime = executeTime;
            return this;
        }
        public Long getExecuteTime() {
            return this.executeTime;
        }

        public GetDeploymentResponseBodyDataDeployment setFromEnvironment(Integer fromEnvironment) {
            this.fromEnvironment = fromEnvironment;
            return this;
        }
        public Integer getFromEnvironment() {
            return this.fromEnvironment;
        }

        public GetDeploymentResponseBodyDataDeployment setHandlerId(String handlerId) {
            this.handlerId = handlerId;
            return this;
        }
        public String getHandlerId() {
            return this.handlerId;
        }

        public GetDeploymentResponseBodyDataDeployment setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetDeploymentResponseBodyDataDeployment setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetDeploymentResponseBodyDataDeployment setToEnvironment(Integer toEnvironment) {
            this.toEnvironment = toEnvironment;
            return this;
        }
        public Integer getToEnvironment() {
            return this.toEnvironment;
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
