// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class ListRepositoryCommitsResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<ListRepositoryCommitsResponseBodyResult> result;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Total")
    public Long total;

    public static ListRepositoryCommitsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRepositoryCommitsResponseBody self = new ListRepositoryCommitsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRepositoryCommitsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListRepositoryCommitsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListRepositoryCommitsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRepositoryCommitsResponseBody setResult(java.util.List<ListRepositoryCommitsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListRepositoryCommitsResponseBodyResult> getResult() {
        return this.result;
    }

    public ListRepositoryCommitsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListRepositoryCommitsResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListRepositoryCommitsResponseBodyResultSignature extends TeaModel {
        @NameInMap("GpgKeyId")
        public String gpgKeyId;

        @NameInMap("VerificationStatus")
        public String verificationStatus;

        public static ListRepositoryCommitsResponseBodyResultSignature build(java.util.Map<String, ?> map) throws Exception {
            ListRepositoryCommitsResponseBodyResultSignature self = new ListRepositoryCommitsResponseBodyResultSignature();
            return TeaModel.build(map, self);
        }

        public ListRepositoryCommitsResponseBodyResultSignature setGpgKeyId(String gpgKeyId) {
            this.gpgKeyId = gpgKeyId;
            return this;
        }
        public String getGpgKeyId() {
            return this.gpgKeyId;
        }

        public ListRepositoryCommitsResponseBodyResultSignature setVerificationStatus(String verificationStatus) {
            this.verificationStatus = verificationStatus;
            return this;
        }
        public String getVerificationStatus() {
            return this.verificationStatus;
        }

    }

    public static class ListRepositoryCommitsResponseBodyResult extends TeaModel {
        @NameInMap("AuthorDate")
        public String authorDate;

        @NameInMap("AuthorEmail")
        public String authorEmail;

        @NameInMap("AuthorName")
        public String authorName;

        @NameInMap("CommittedDate")
        public String committedDate;

        @NameInMap("CommitterEmail")
        public String committerEmail;

        @NameInMap("CommitterName")
        public String committerName;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("Id")
        public String id;

        @NameInMap("Message")
        public String message;

        @NameInMap("ParentIds")
        public java.util.List<String> parentIds;

        @NameInMap("ShortId")
        public String shortId;

        @NameInMap("Signature")
        public ListRepositoryCommitsResponseBodyResultSignature signature;

        @NameInMap("Title")
        public String title;

        public static ListRepositoryCommitsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListRepositoryCommitsResponseBodyResult self = new ListRepositoryCommitsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListRepositoryCommitsResponseBodyResult setAuthorDate(String authorDate) {
            this.authorDate = authorDate;
            return this;
        }
        public String getAuthorDate() {
            return this.authorDate;
        }

        public ListRepositoryCommitsResponseBodyResult setAuthorEmail(String authorEmail) {
            this.authorEmail = authorEmail;
            return this;
        }
        public String getAuthorEmail() {
            return this.authorEmail;
        }

        public ListRepositoryCommitsResponseBodyResult setAuthorName(String authorName) {
            this.authorName = authorName;
            return this;
        }
        public String getAuthorName() {
            return this.authorName;
        }

        public ListRepositoryCommitsResponseBodyResult setCommittedDate(String committedDate) {
            this.committedDate = committedDate;
            return this;
        }
        public String getCommittedDate() {
            return this.committedDate;
        }

        public ListRepositoryCommitsResponseBodyResult setCommitterEmail(String committerEmail) {
            this.committerEmail = committerEmail;
            return this;
        }
        public String getCommitterEmail() {
            return this.committerEmail;
        }

        public ListRepositoryCommitsResponseBodyResult setCommitterName(String committerName) {
            this.committerName = committerName;
            return this;
        }
        public String getCommitterName() {
            return this.committerName;
        }

        public ListRepositoryCommitsResponseBodyResult setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListRepositoryCommitsResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListRepositoryCommitsResponseBodyResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListRepositoryCommitsResponseBodyResult setParentIds(java.util.List<String> parentIds) {
            this.parentIds = parentIds;
            return this;
        }
        public java.util.List<String> getParentIds() {
            return this.parentIds;
        }

        public ListRepositoryCommitsResponseBodyResult setShortId(String shortId) {
            this.shortId = shortId;
            return this;
        }
        public String getShortId() {
            return this.shortId;
        }

        public ListRepositoryCommitsResponseBodyResult setSignature(ListRepositoryCommitsResponseBodyResultSignature signature) {
            this.signature = signature;
            return this;
        }
        public ListRepositoryCommitsResponseBodyResultSignature getSignature() {
            return this.signature;
        }

        public ListRepositoryCommitsResponseBodyResult setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
