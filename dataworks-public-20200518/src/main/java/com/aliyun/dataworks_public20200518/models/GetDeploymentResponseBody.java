// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetDeploymentResponseBody extends TeaModel {
    /**
     * <p>The data about the deployment task.</p>
     */
    @NameInMap("Data")
    public GetDeploymentResponseBodyData data;

    /**
     * <p>The error code returned.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The ID of the request. You can troubleshoot errors based on the ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
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
        /**
         * <p>The check status of one or more files in the deployment task. If the value of the ToEnvironment parameter is 1, the files can be deployed to the production environment only when the value of the Status parameter is 1 and the CheckingStatus parameter is empty. Valid values:</p>
         * <br>
         * <p>*   7: The file failed the check.</p>
         * <p>*   8: The file is being checked.</p>
         */
        @NameInMap("CheckingStatus")
        public Integer checkingStatus;

        /**
         * <p>The time when the deployment task was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The ID of the Alibaba Cloud account used by the user who created the deployment task.</p>
         */
        @NameInMap("CreatorId")
        public String creatorId;

        /**
         * <p>The error message that was returned when the deployment task failed. In this case, the value of the Status parameter is 2.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The time when the deployment task was run. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("ExecuteTime")
        public Long executeTime;

        /**
         * <p>The environment in which the deployment task was run. Valid values: 0 and 1. A value of 0 indicates the on-premises environment. A value of 1 indicates the development environment.</p>
         */
        @NameInMap("FromEnvironment")
        public Integer fromEnvironment;

        /**
         * <p>The ID of the Alibaba Cloud account used by the user who ran the deployment task.</p>
         */
        @NameInMap("HandlerId")
        public String handlerId;

        /**
         * <p>The name of the deployment task. The value is the same as the name of the specific deployment task that is displayed on the Release Package page in the Deploy module.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The status of the deployment task. Valid values: 0, 1, and 2. A value of 0 indicates that the task is ready. A value of 1 indicates that the task was successful. A value of 2 indicates that the task failed.</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The environment to which the file was deployed. Valid values: 1 and 2. A value of 1 indicates the development environment. A value of 2 indicates the production environment.</p>
         */
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

        /**
         * <p>The details of the deployment task.</p>
         */
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
