// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class CommitContactFlowVersionModificationResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ContactFlowVersion")
    public CommitContactFlowVersionModificationResponseBodyContactFlowVersion contactFlowVersion;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static CommitContactFlowVersionModificationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CommitContactFlowVersionModificationResponseBody self = new CommitContactFlowVersionModificationResponseBody();
        return TeaModel.build(map, self);
    }

    public CommitContactFlowVersionModificationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CommitContactFlowVersionModificationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CommitContactFlowVersionModificationResponseBody setContactFlowVersion(CommitContactFlowVersionModificationResponseBodyContactFlowVersion contactFlowVersion) {
        this.contactFlowVersion = contactFlowVersion;
        return this;
    }
    public CommitContactFlowVersionModificationResponseBodyContactFlowVersion getContactFlowVersion() {
        return this.contactFlowVersion;
    }

    public CommitContactFlowVersionModificationResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CommitContactFlowVersionModificationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CommitContactFlowVersionModificationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CommitContactFlowVersionModificationResponseBodyContactFlowVersion extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("LastModified")
        public String lastModified;

        @NameInMap("Canvas")
        public String canvas;

        @NameInMap("LockedBy")
        public String lockedBy;

        @NameInMap("Version")
        public String version;

        @NameInMap("ContactFlowVersionId")
        public String contactFlowVersionId;

        @NameInMap("LastModifiedBy")
        public String lastModifiedBy;

        @NameInMap("ContactFlowVersionDescription")
        public String contactFlowVersionDescription;

        @NameInMap("Content")
        public String content;

        public static CommitContactFlowVersionModificationResponseBodyContactFlowVersion build(java.util.Map<String, ?> map) throws Exception {
            CommitContactFlowVersionModificationResponseBodyContactFlowVersion self = new CommitContactFlowVersionModificationResponseBodyContactFlowVersion();
            return TeaModel.build(map, self);
        }

        public CommitContactFlowVersionModificationResponseBodyContactFlowVersion setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CommitContactFlowVersionModificationResponseBodyContactFlowVersion setLastModified(String lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public String getLastModified() {
            return this.lastModified;
        }

        public CommitContactFlowVersionModificationResponseBodyContactFlowVersion setCanvas(String canvas) {
            this.canvas = canvas;
            return this;
        }
        public String getCanvas() {
            return this.canvas;
        }

        public CommitContactFlowVersionModificationResponseBodyContactFlowVersion setLockedBy(String lockedBy) {
            this.lockedBy = lockedBy;
            return this;
        }
        public String getLockedBy() {
            return this.lockedBy;
        }

        public CommitContactFlowVersionModificationResponseBodyContactFlowVersion setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public CommitContactFlowVersionModificationResponseBodyContactFlowVersion setContactFlowVersionId(String contactFlowVersionId) {
            this.contactFlowVersionId = contactFlowVersionId;
            return this;
        }
        public String getContactFlowVersionId() {
            return this.contactFlowVersionId;
        }

        public CommitContactFlowVersionModificationResponseBodyContactFlowVersion setLastModifiedBy(String lastModifiedBy) {
            this.lastModifiedBy = lastModifiedBy;
            return this;
        }
        public String getLastModifiedBy() {
            return this.lastModifiedBy;
        }

        public CommitContactFlowVersionModificationResponseBodyContactFlowVersion setContactFlowVersionDescription(String contactFlowVersionDescription) {
            this.contactFlowVersionDescription = contactFlowVersionDescription;
            return this;
        }
        public String getContactFlowVersionDescription() {
            return this.contactFlowVersionDescription;
        }

        public CommitContactFlowVersionModificationResponseBodyContactFlowVersion setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

}
