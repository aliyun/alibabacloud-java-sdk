// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetFileVersionResponseBody extends TeaModel {
    /**
     * <p>The version details of the file.</p>
     */
    @NameInMap("Data")
    public GetFileVersionResponseBodyData data;

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
     * <p>The connection does not exist.</p>
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
     * <p>The unique ID of the request. You can use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>0000-ABCD-EFG****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <ul>
     * <li>true: The call was successful.</li>
     * <li>false: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetFileVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFileVersionResponseBody self = new GetFileVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFileVersionResponseBody setData(GetFileVersionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetFileVersionResponseBodyData getData() {
        return this.data;
    }

    public GetFileVersionResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetFileVersionResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetFileVersionResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetFileVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetFileVersionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetFileVersionResponseBodyData extends TeaModel {
        /**
         * <p>The change type of this file version. Valid values: CREATE, UPDATE, and DELETE.</p>
         * 
         * <strong>example:</strong>
         * <p>UPDATE</p>
         */
        @NameInMap("ChangeType")
        public String changeType;

        /**
         * <p>The description of this file version.</p>
         * 
         * <strong>example:</strong>
         * <p>Second version submission</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The timestamp when the file version was generated, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1593881265000</p>
         */
        @NameInMap("CommitTime")
        public Long commitTime;

        /**
         * <p>The Alibaba Cloud user ID that generated this file version.</p>
         * 
         * <strong>example:</strong>
         * <p>7384234****</p>
         */
        @NameInMap("CommitUser")
        public String commitUser;

        /**
         * <p>The file code that generated this file version.</p>
         * 
         * <strong>example:</strong>
         * <p>SHOW TABLES;</p>
         */
        @NameInMap("FileContent")
        public String fileContent;

        /**
         * <p>The name of the file that generated this file version.</p>
         * 
         * <strong>example:</strong>
         * <p>ods_user_info_d</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>The basic file information when this file version was generated.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;fileName&quot;:&quot;ods_user_info_d&quot;,&quot;fileType&quot;:10}</p>
         */
        @NameInMap("FilePropertyContent")
        public String filePropertyContent;

        /**
         * <p>The version of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("FileVersion")
        public Integer fileVersion;

        /**
         * <p>Indicates whether this file version is the latest version in the production environment. Valid values:</p>
         * <ul>
         * <li>true: The version is the latest version.</li>
         * <li>false: The version is not the latest version.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsCurrentProd")
        public Boolean isCurrentProd;

        /**
         * <p>The scheduling configuration when this file version was generated.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;cycleType&quot;:0,&quot;cronExpress&quot;:&quot;00 05 00 * * ?&quot;}</p>
         */
        @NameInMap("NodeContent")
        public String nodeContent;

        /**
         * <p>The ID of the scheduling node associated with the file version when it was generated.</p>
         * 
         * <strong>example:</strong>
         * <p>3000001</p>
         */
        @NameInMap("NodeId")
        public Long nodeId;

        /**
         * <p>The current status of the file version. Valid values:</p>
         * <ul>
         * <li>COMMITTING: The version is being committed.</li>
         * <li>COMMITTED or CHECK_OK: The version has been committed.</li>
         * <li>PACKAGED: The version is ready for deployment.</li>
         * <li>DEPLOYING: The version is being deployed.</li>
         * <li>DEPLOYED: The version has been deployed.</li>
         * <li>CANCELLED: The deployment has been canceled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>COMMITTED</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The functional module to which the file belongs. Valid values:</p>
         * <ul>
         * <li>0: NORMAL (DataStudio)</li>
         * <li>1: MANUAL (manual node)</li>
         * <li>2: MANUAL_BIZ (manual workflow)</li>
         * <li>3: SKIP (dry-run scheduling in DataStudio)</li>
         * <li>10: ADHOCQUERY (ad hoc query)</li>
         * <li>30: COMPONENT (component management)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("UseType")
        public String useType;

        public static GetFileVersionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetFileVersionResponseBodyData self = new GetFileVersionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetFileVersionResponseBodyData setChangeType(String changeType) {
            this.changeType = changeType;
            return this;
        }
        public String getChangeType() {
            return this.changeType;
        }

        public GetFileVersionResponseBodyData setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public GetFileVersionResponseBodyData setCommitTime(Long commitTime) {
            this.commitTime = commitTime;
            return this;
        }
        public Long getCommitTime() {
            return this.commitTime;
        }

        public GetFileVersionResponseBodyData setCommitUser(String commitUser) {
            this.commitUser = commitUser;
            return this;
        }
        public String getCommitUser() {
            return this.commitUser;
        }

        public GetFileVersionResponseBodyData setFileContent(String fileContent) {
            this.fileContent = fileContent;
            return this;
        }
        public String getFileContent() {
            return this.fileContent;
        }

        public GetFileVersionResponseBodyData setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public GetFileVersionResponseBodyData setFilePropertyContent(String filePropertyContent) {
            this.filePropertyContent = filePropertyContent;
            return this;
        }
        public String getFilePropertyContent() {
            return this.filePropertyContent;
        }

        public GetFileVersionResponseBodyData setFileVersion(Integer fileVersion) {
            this.fileVersion = fileVersion;
            return this;
        }
        public Integer getFileVersion() {
            return this.fileVersion;
        }

        public GetFileVersionResponseBodyData setIsCurrentProd(Boolean isCurrentProd) {
            this.isCurrentProd = isCurrentProd;
            return this;
        }
        public Boolean getIsCurrentProd() {
            return this.isCurrentProd;
        }

        public GetFileVersionResponseBodyData setNodeContent(String nodeContent) {
            this.nodeContent = nodeContent;
            return this;
        }
        public String getNodeContent() {
            return this.nodeContent;
        }

        public GetFileVersionResponseBodyData setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

        public GetFileVersionResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetFileVersionResponseBodyData setUseType(String useType) {
            this.useType = useType;
            return this;
        }
        public String getUseType() {
            return this.useType;
        }

    }

}
