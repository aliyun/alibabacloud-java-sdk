// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetFileLastCommitResponseBody extends TeaModel {
    // 错误码
    @NameInMap("ErrorCode")
    public String errorCode;

    // 错误信息
    @NameInMap("ErrorMessage")
    public String errorMessage;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 响应结果
    @NameInMap("Result")
    public GetFileLastCommitResponseBodyResult result;

    // 请求结果
    @NameInMap("Success")
    public Boolean success;

    public static GetFileLastCommitResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFileLastCommitResponseBody self = new GetFileLastCommitResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFileLastCommitResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetFileLastCommitResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetFileLastCommitResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetFileLastCommitResponseBody setResult(GetFileLastCommitResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetFileLastCommitResponseBodyResult getResult() {
        return this.result;
    }

    public GetFileLastCommitResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetFileLastCommitResponseBodyResultSignature extends TeaModel {
        // GPG密钥ID
        @NameInMap("GpgKeyId")
        public String gpgKeyId;

        // 验证状态
        @NameInMap("VerificationStatus")
        public String verificationStatus;

        public static GetFileLastCommitResponseBodyResultSignature build(java.util.Map<String, ?> map) throws Exception {
            GetFileLastCommitResponseBodyResultSignature self = new GetFileLastCommitResponseBodyResultSignature();
            return TeaModel.build(map, self);
        }

        public GetFileLastCommitResponseBodyResultSignature setGpgKeyId(String gpgKeyId) {
            this.gpgKeyId = gpgKeyId;
            return this;
        }
        public String getGpgKeyId() {
            return this.gpgKeyId;
        }

        public GetFileLastCommitResponseBodyResultSignature setVerificationStatus(String verificationStatus) {
            this.verificationStatus = verificationStatus;
            return this;
        }
        public String getVerificationStatus() {
            return this.verificationStatus;
        }

    }

    public static class GetFileLastCommitResponseBodyResult extends TeaModel {
        // 作者提交时间
        @NameInMap("AuthorDate")
        public String authorDate;

        // 提交者邮箱
        @NameInMap("AuthorEmail")
        public String authorEmail;

        // 作者姓名
        @NameInMap("AuthorName")
        public String authorName;

        // 提交者提交时间
        @NameInMap("CommittedDate")
        public String committedDate;

        // 提交者邮箱
        @NameInMap("CommitterEmail")
        public String committerEmail;

        // 提交者姓名
        @NameInMap("CommitterName")
        public String committerName;

        // 创建时间
        @NameInMap("CreatedAt")
        public String createdAt;

        // Commit ID
        @NameInMap("Id")
        public String id;

        // 提交内容
        @NameInMap("Message")
        public String message;

        // 父提交ID
        @NameInMap("ParentIds")
        public java.util.List<String> parentIds;

        // Commit短ID
        @NameInMap("ShortId")
        public String shortId;

        // 签名
        @NameInMap("Signature")
        public GetFileLastCommitResponseBodyResultSignature signature;

        // 标题，提交的第一行内容
        @NameInMap("Title")
        public String title;

        public static GetFileLastCommitResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetFileLastCommitResponseBodyResult self = new GetFileLastCommitResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetFileLastCommitResponseBodyResult setAuthorDate(String authorDate) {
            this.authorDate = authorDate;
            return this;
        }
        public String getAuthorDate() {
            return this.authorDate;
        }

        public GetFileLastCommitResponseBodyResult setAuthorEmail(String authorEmail) {
            this.authorEmail = authorEmail;
            return this;
        }
        public String getAuthorEmail() {
            return this.authorEmail;
        }

        public GetFileLastCommitResponseBodyResult setAuthorName(String authorName) {
            this.authorName = authorName;
            return this;
        }
        public String getAuthorName() {
            return this.authorName;
        }

        public GetFileLastCommitResponseBodyResult setCommittedDate(String committedDate) {
            this.committedDate = committedDate;
            return this;
        }
        public String getCommittedDate() {
            return this.committedDate;
        }

        public GetFileLastCommitResponseBodyResult setCommitterEmail(String committerEmail) {
            this.committerEmail = committerEmail;
            return this;
        }
        public String getCommitterEmail() {
            return this.committerEmail;
        }

        public GetFileLastCommitResponseBodyResult setCommitterName(String committerName) {
            this.committerName = committerName;
            return this;
        }
        public String getCommitterName() {
            return this.committerName;
        }

        public GetFileLastCommitResponseBodyResult setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetFileLastCommitResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetFileLastCommitResponseBodyResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetFileLastCommitResponseBodyResult setParentIds(java.util.List<String> parentIds) {
            this.parentIds = parentIds;
            return this;
        }
        public java.util.List<String> getParentIds() {
            return this.parentIds;
        }

        public GetFileLastCommitResponseBodyResult setShortId(String shortId) {
            this.shortId = shortId;
            return this;
        }
        public String getShortId() {
            return this.shortId;
        }

        public GetFileLastCommitResponseBodyResult setSignature(GetFileLastCommitResponseBodyResultSignature signature) {
            this.signature = signature;
            return this;
        }
        public GetFileLastCommitResponseBodyResultSignature getSignature() {
            return this.signature;
        }

        public GetFileLastCommitResponseBodyResult setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
