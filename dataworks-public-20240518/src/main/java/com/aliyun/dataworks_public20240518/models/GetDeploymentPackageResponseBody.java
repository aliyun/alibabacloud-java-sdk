// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetDeploymentPackageResponseBody extends TeaModel {
    /**
     * <p>The details of the deployment package.</p>
     */
    @NameInMap("Data")
    public GetDeploymentPackageResponseBodyData data;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>Invalid.Tenant.ConnectionNotExists</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>You have no permission.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The request ID. You can use this ID to locate logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>0bc1ec92159376****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     * <ul>
     * <li><strong>true</strong>: The call was successful.</li>
     * <li><strong>false</strong>: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetDeploymentPackageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDeploymentPackageResponseBody self = new GetDeploymentPackageResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDeploymentPackageResponseBody setData(GetDeploymentPackageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDeploymentPackageResponseBodyData getData() {
        return this.data;
    }

    public GetDeploymentPackageResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetDeploymentPackageResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetDeploymentPackageResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetDeploymentPackageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDeploymentPackageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetDeploymentPackageResponseBodyDataDeployedItems extends TeaModel {
        /**
         * <p>The ID of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>5076****</p>
         */
        @NameInMap("FileId")
        public Long fileId;

        /**
         * <p>The version of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("FileVersion")
        public Long fileVersion;

        /**
         * <p>The status of the deployed item. Valid values:</p>
         * <ul>
         * <li>UNPUBLISHED(0): not published</li>
         * <li>SUCCESS(1): published successfully</li>
         * <li>ERROR(2): publishing failed</li>
         * <li>CLONED(3): cloned successfully</li>
         * <li>DEPLOY_ERROR(4): publishing failed</li>
         * <li>CLONING(5): cloning in progress</li>
         * <li>REJECT(6): publishing rejected</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        public static GetDeploymentPackageResponseBodyDataDeployedItems build(java.util.Map<String, ?> map) throws Exception {
            GetDeploymentPackageResponseBodyDataDeployedItems self = new GetDeploymentPackageResponseBodyDataDeployedItems();
            return TeaModel.build(map, self);
        }

        public GetDeploymentPackageResponseBodyDataDeployedItems setFileId(Long fileId) {
            this.fileId = fileId;
            return this;
        }
        public Long getFileId() {
            return this.fileId;
        }

        public GetDeploymentPackageResponseBodyDataDeployedItems setFileVersion(Long fileVersion) {
            this.fileVersion = fileVersion;
            return this;
        }
        public Long getFileVersion() {
            return this.fileVersion;
        }

        public GetDeploymentPackageResponseBodyDataDeployedItems setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

    public static class GetDeploymentPackageResponseBodyDataDeployment extends TeaModel {
        /**
         * <p>The check status of the nodes involved in the deployment package. When the target environment is the development environment (toEnvironment=1), you can publish the file to the production environment only when the Status of the deployment package is 1 and CheckingStatus is empty.</p>
         * <ul>
         * <li>7: The check failed.</li>
         * <li>8: The check is in progress.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("CheckingStatus")
        public Integer checkingStatus;

        /**
         * <p>The timestamp when the deployment package was generated, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1593877765000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The Alibaba Cloud user ID of the user who created the deployment package.</p>
         * 
         * <strong>example:</strong>
         * <p>20030****</p>
         */
        @NameInMap("CreatorId")
        public String creatorId;

        /**
         * <p>The error message recorded when the deployment package fails to run (status is 2).</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The timestamp when the deployment package started to run, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1593877765000</p>
         */
        @NameInMap("ExecuteTime")
        public Long executeTime;

        /**
         * <p>The environment from which the deployment is initiated. Valid values:</p>
         * <ul>
         * <li>0: local</li>
         * <li>1: development environment</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("FromEnvironment")
        public Integer fromEnvironment;

        /**
         * <p>The Alibaba Cloud user ID of the user who executed the deployment package.</p>
         * 
         * <strong>example:</strong>
         * <p>2003****</p>
         */
        @NameInMap("HandlerId")
        public String handlerId;

        /**
         * <p>The name of the deployment package, which is displayed on the Task Publish &gt; Deployment Package List page.</p>
         * 
         * <strong>example:</strong>
         * <p>ods_user_info_d-2020-07-04_20030****</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The current status of the deployment package. Valid values:</p>
         * <ul>
         * <li>0: ready</li>
         * <li>1: successful</li>
         * <li>2: failed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The target environment to which the file information is published. Valid values:</p>
         * <ul>
         * <li>1: development environment</li>
         * <li>2: production environment</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ToEnvironment")
        public Integer toEnvironment;

        public static GetDeploymentPackageResponseBodyDataDeployment build(java.util.Map<String, ?> map) throws Exception {
            GetDeploymentPackageResponseBodyDataDeployment self = new GetDeploymentPackageResponseBodyDataDeployment();
            return TeaModel.build(map, self);
        }

        public GetDeploymentPackageResponseBodyDataDeployment setCheckingStatus(Integer checkingStatus) {
            this.checkingStatus = checkingStatus;
            return this;
        }
        public Integer getCheckingStatus() {
            return this.checkingStatus;
        }

        public GetDeploymentPackageResponseBodyDataDeployment setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetDeploymentPackageResponseBodyDataDeployment setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public GetDeploymentPackageResponseBodyDataDeployment setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetDeploymentPackageResponseBodyDataDeployment setExecuteTime(Long executeTime) {
            this.executeTime = executeTime;
            return this;
        }
        public Long getExecuteTime() {
            return this.executeTime;
        }

        public GetDeploymentPackageResponseBodyDataDeployment setFromEnvironment(Integer fromEnvironment) {
            this.fromEnvironment = fromEnvironment;
            return this;
        }
        public Integer getFromEnvironment() {
            return this.fromEnvironment;
        }

        public GetDeploymentPackageResponseBodyDataDeployment setHandlerId(String handlerId) {
            this.handlerId = handlerId;
            return this;
        }
        public String getHandlerId() {
            return this.handlerId;
        }

        public GetDeploymentPackageResponseBodyDataDeployment setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetDeploymentPackageResponseBodyDataDeployment setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetDeploymentPackageResponseBodyDataDeployment setToEnvironment(Integer toEnvironment) {
            this.toEnvironment = toEnvironment;
            return this;
        }
        public Integer getToEnvironment() {
            return this.toEnvironment;
        }

    }

    public static class GetDeploymentPackageResponseBodyData extends TeaModel {
        /**
         * <p>The details of the deployed items.</p>
         */
        @NameInMap("DeployedItems")
        public java.util.List<GetDeploymentPackageResponseBodyDataDeployedItems> deployedItems;

        /**
         * <p>The details of the deployment package.</p>
         */
        @NameInMap("Deployment")
        public GetDeploymentPackageResponseBodyDataDeployment deployment;

        public static GetDeploymentPackageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDeploymentPackageResponseBodyData self = new GetDeploymentPackageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDeploymentPackageResponseBodyData setDeployedItems(java.util.List<GetDeploymentPackageResponseBodyDataDeployedItems> deployedItems) {
            this.deployedItems = deployedItems;
            return this;
        }
        public java.util.List<GetDeploymentPackageResponseBodyDataDeployedItems> getDeployedItems() {
            return this.deployedItems;
        }

        public GetDeploymentPackageResponseBodyData setDeployment(GetDeploymentPackageResponseBodyDataDeployment deployment) {
            this.deployment = deployment;
            return this;
        }
        public GetDeploymentPackageResponseBodyDataDeployment getDeployment() {
            return this.deployment;
        }

    }

}
