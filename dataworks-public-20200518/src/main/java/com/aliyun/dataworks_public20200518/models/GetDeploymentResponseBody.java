// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetDeploymentResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetDeploymentResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

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

    public GetDeploymentResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetDeploymentResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetDeploymentResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetDeploymentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDeploymentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetDeploymentResponseBodyDataDeployedItems extends TeaModel {
        @NameInMap("FileId")
        public Long fileId;

        @NameInMap("FileVersion")
        public Long fileVersion;

        @NameInMap("Status")
        public Integer status;

        public static GetDeploymentResponseBodyDataDeployedItems build(java.util.Map<String, ?> map) throws Exception {
            GetDeploymentResponseBodyDataDeployedItems self = new GetDeploymentResponseBodyDataDeployedItems();
            return TeaModel.build(map, self);
        }

        public GetDeploymentResponseBodyDataDeployedItems setFileId(Long fileId) {
            this.fileId = fileId;
            return this;
        }
        public Long getFileId() {
            return this.fileId;
        }

        public GetDeploymentResponseBodyDataDeployedItems setFileVersion(Long fileVersion) {
            this.fileVersion = fileVersion;
            return this;
        }
        public Long getFileVersion() {
            return this.fileVersion;
        }

        public GetDeploymentResponseBodyDataDeployedItems setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

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
        @NameInMap("DeployedItems")
        public java.util.List<GetDeploymentResponseBodyDataDeployedItems> deployedItems;

        @NameInMap("Deployment")
        public GetDeploymentResponseBodyDataDeployment deployment;

        public static GetDeploymentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDeploymentResponseBodyData self = new GetDeploymentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDeploymentResponseBodyData setDeployedItems(java.util.List<GetDeploymentResponseBodyDataDeployedItems> deployedItems) {
            this.deployedItems = deployedItems;
            return this;
        }
        public java.util.List<GetDeploymentResponseBodyDataDeployedItems> getDeployedItems() {
            return this.deployedItems;
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
