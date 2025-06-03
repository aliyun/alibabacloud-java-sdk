// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetFileVersionResponseBody extends TeaModel {
    /**
     * <p>The details of the file version.</p>
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
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0000-ABCD-EFG****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
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
         * <p>The type of the change to the file of the current version. Valid values: CREATE, UPDATE, and DELETE.</p>
         * 
         * <strong>example:</strong>
         * <p>UPDATE</p>
         */
        @NameInMap("ChangeType")
        public String changeType;

        /**
         * <p>The description of the file version.</p>
         * 
         * <strong>example:</strong>
         * <p>Second version submission</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The time when the file version was generated. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1593881265000</p>
         */
        @NameInMap("CommitTime")
        public Long commitTime;

        /**
         * <p>The ID of the Alibaba Cloud account that is used to generate the file of the current version.</p>
         * 
         * <strong>example:</strong>
         * <p>7384234****</p>
         */
        @NameInMap("CommitUser")
        public String commitUser;

        /**
         * <p>The code in the file of the current version.</p>
         * 
         * <strong>example:</strong>
         * <p>SHOW TABLES;</p>
         */
        @NameInMap("FileContent")
        public String fileContent;

        /**
         * <p>The name of the file of the current version.</p>
         * 
         * <strong>example:</strong>
         * <p>ods_user_info_d</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>The basic information about the file of the current version.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;fileName&quot;:&quot;ods_user_info_d&quot;,&quot;fileType&quot;:10}</p>
         */
        @NameInMap("FilePropertyContent")
        public String filePropertyContent;

        /**
         * <p>The file version.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("FileVersion")
        public Integer fileVersion;

        /**
         * <p>Indicates whether the version is the latest version in the production environment. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsCurrentProd")
        public Boolean isCurrentProd;

        /**
         * <p>The scheduling configurations of the node that corresponds to the file of the current version.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;cycleType&quot;:0,&quot;cronExpress&quot;:&quot;00 05 00 * * ?&quot;}</p>
         */
        @NameInMap("NodeContent")
        public String nodeContent;

        /**
         * <p>The ID of the node that corresponds to the file version.</p>
         * 
         * <strong>example:</strong>
         * <p>3000001</p>
         */
        @NameInMap("NodeId")
        public Long nodeId;

        /**
         * <p>The status of the file version. Valid values:</p>
         * <ul>
         * <li>COMMITTING</li>
         * <li>COMMITTED or CHECK_OK</li>
         * <li>PACKAGED</li>
         * <li>DEPLOYING</li>
         * <li>DEPLOYED</li>
         * <li>CANCELLED</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>COMMITTED</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The module to which the file belongs. Valid values:</p>
         * <ul>
         * <li>0: NORMAL, which indicates that the file is used for DataStudio.</li>
         * <li>1: MANUAL, which indicates that the file is used for a manually triggered node.</li>
         * <li>2: MANUAL_BIZ, which indicates that the file is used for a manually triggered workflow.</li>
         * <li>3: SKIP, which indicates that the file is used for a dry-run node in DataStudio.</li>
         * <li>10: ADHOCQUERY, which indicates that the file is used for an ad hoc query.</li>
         * <li>30: COMPONENT, which indicates that the file is used for a script template.</li>
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
