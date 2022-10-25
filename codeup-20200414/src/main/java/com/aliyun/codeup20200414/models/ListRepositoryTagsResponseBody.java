// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class ListRepositoryTagsResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<ListRepositoryTagsResponseBodyResult> result;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Total")
    public Long total;

    public static ListRepositoryTagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRepositoryTagsResponseBody self = new ListRepositoryTagsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRepositoryTagsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListRepositoryTagsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListRepositoryTagsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRepositoryTagsResponseBody setResult(java.util.List<ListRepositoryTagsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListRepositoryTagsResponseBodyResult> getResult() {
        return this.result;
    }

    public ListRepositoryTagsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListRepositoryTagsResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListRepositoryTagsResponseBodyResultCommitSignature extends TeaModel {
        @NameInMap("GpgKeyId")
        public String gpgKeyId;

        @NameInMap("VerificationStatus")
        public String verificationStatus;

        public static ListRepositoryTagsResponseBodyResultCommitSignature build(java.util.Map<String, ?> map) throws Exception {
            ListRepositoryTagsResponseBodyResultCommitSignature self = new ListRepositoryTagsResponseBodyResultCommitSignature();
            return TeaModel.build(map, self);
        }

        public ListRepositoryTagsResponseBodyResultCommitSignature setGpgKeyId(String gpgKeyId) {
            this.gpgKeyId = gpgKeyId;
            return this;
        }
        public String getGpgKeyId() {
            return this.gpgKeyId;
        }

        public ListRepositoryTagsResponseBodyResultCommitSignature setVerificationStatus(String verificationStatus) {
            this.verificationStatus = verificationStatus;
            return this;
        }
        public String getVerificationStatus() {
            return this.verificationStatus;
        }

    }

    public static class ListRepositoryTagsResponseBodyResultCommit extends TeaModel {
        @NameInMap("AuthorEmail")
        public String authorEmail;

        @NameInMap("AuthorName")
        public String authorName;

        @NameInMap("AuthoredDate")
        public String authoredDate;

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
        public ListRepositoryTagsResponseBodyResultCommitSignature signature;

        @NameInMap("Title")
        public String title;

        public static ListRepositoryTagsResponseBodyResultCommit build(java.util.Map<String, ?> map) throws Exception {
            ListRepositoryTagsResponseBodyResultCommit self = new ListRepositoryTagsResponseBodyResultCommit();
            return TeaModel.build(map, self);
        }

        public ListRepositoryTagsResponseBodyResultCommit setAuthorEmail(String authorEmail) {
            this.authorEmail = authorEmail;
            return this;
        }
        public String getAuthorEmail() {
            return this.authorEmail;
        }

        public ListRepositoryTagsResponseBodyResultCommit setAuthorName(String authorName) {
            this.authorName = authorName;
            return this;
        }
        public String getAuthorName() {
            return this.authorName;
        }

        public ListRepositoryTagsResponseBodyResultCommit setAuthoredDate(String authoredDate) {
            this.authoredDate = authoredDate;
            return this;
        }
        public String getAuthoredDate() {
            return this.authoredDate;
        }

        public ListRepositoryTagsResponseBodyResultCommit setCommittedDate(String committedDate) {
            this.committedDate = committedDate;
            return this;
        }
        public String getCommittedDate() {
            return this.committedDate;
        }

        public ListRepositoryTagsResponseBodyResultCommit setCommitterEmail(String committerEmail) {
            this.committerEmail = committerEmail;
            return this;
        }
        public String getCommitterEmail() {
            return this.committerEmail;
        }

        public ListRepositoryTagsResponseBodyResultCommit setCommitterName(String committerName) {
            this.committerName = committerName;
            return this;
        }
        public String getCommitterName() {
            return this.committerName;
        }

        public ListRepositoryTagsResponseBodyResultCommit setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListRepositoryTagsResponseBodyResultCommit setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListRepositoryTagsResponseBodyResultCommit setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListRepositoryTagsResponseBodyResultCommit setParentIds(java.util.List<String> parentIds) {
            this.parentIds = parentIds;
            return this;
        }
        public java.util.List<String> getParentIds() {
            return this.parentIds;
        }

        public ListRepositoryTagsResponseBodyResultCommit setShortId(String shortId) {
            this.shortId = shortId;
            return this;
        }
        public String getShortId() {
            return this.shortId;
        }

        public ListRepositoryTagsResponseBodyResultCommit setSignature(ListRepositoryTagsResponseBodyResultCommitSignature signature) {
            this.signature = signature;
            return this;
        }
        public ListRepositoryTagsResponseBodyResultCommitSignature getSignature() {
            return this.signature;
        }

        public ListRepositoryTagsResponseBodyResultCommit setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class ListRepositoryTagsResponseBodyResultSignature extends TeaModel {
        @NameInMap("GpgKeyId")
        public String gpgKeyId;

        @NameInMap("VerificationStatus")
        public String verificationStatus;

        public static ListRepositoryTagsResponseBodyResultSignature build(java.util.Map<String, ?> map) throws Exception {
            ListRepositoryTagsResponseBodyResultSignature self = new ListRepositoryTagsResponseBodyResultSignature();
            return TeaModel.build(map, self);
        }

        public ListRepositoryTagsResponseBodyResultSignature setGpgKeyId(String gpgKeyId) {
            this.gpgKeyId = gpgKeyId;
            return this;
        }
        public String getGpgKeyId() {
            return this.gpgKeyId;
        }

        public ListRepositoryTagsResponseBodyResultSignature setVerificationStatus(String verificationStatus) {
            this.verificationStatus = verificationStatus;
            return this;
        }
        public String getVerificationStatus() {
            return this.verificationStatus;
        }

    }

    public static class ListRepositoryTagsResponseBodyResult extends TeaModel {
        @NameInMap("Commit")
        public ListRepositoryTagsResponseBodyResultCommit commit;

        @NameInMap("Id")
        public String id;

        @NameInMap("Message")
        public String message;

        @NameInMap("Name")
        public String name;

        @NameInMap("Signature")
        public ListRepositoryTagsResponseBodyResultSignature signature;

        public static ListRepositoryTagsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListRepositoryTagsResponseBodyResult self = new ListRepositoryTagsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListRepositoryTagsResponseBodyResult setCommit(ListRepositoryTagsResponseBodyResultCommit commit) {
            this.commit = commit;
            return this;
        }
        public ListRepositoryTagsResponseBodyResultCommit getCommit() {
            return this.commit;
        }

        public ListRepositoryTagsResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListRepositoryTagsResponseBodyResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListRepositoryTagsResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListRepositoryTagsResponseBodyResult setSignature(ListRepositoryTagsResponseBodyResultSignature signature) {
            this.signature = signature;
            return this;
        }
        public ListRepositoryTagsResponseBodyResultSignature getSignature() {
            return this.signature;
        }

    }

}
