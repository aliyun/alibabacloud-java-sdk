// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class CreateTagResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public CreateTagResponseBodyResult result;

    public static CreateTagResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTagResponseBody self = new CreateTagResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTagResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTagResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateTagResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateTagResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateTagResponseBody setResult(CreateTagResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateTagResponseBodyResult getResult() {
        return this.result;
    }

    public static class CreateTagResponseBodyResultRelease extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("TagName")
        public String tagName;

        public static CreateTagResponseBodyResultRelease build(java.util.Map<String, ?> map) throws Exception {
            CreateTagResponseBodyResultRelease self = new CreateTagResponseBodyResultRelease();
            return TeaModel.build(map, self);
        }

        public CreateTagResponseBodyResultRelease setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateTagResponseBodyResultRelease setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

    }

    public static class CreateTagResponseBodyResultCommitInfo extends TeaModel {
        @NameInMap("ShortId")
        public String shortId;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("Message")
        public String message;

        @NameInMap("AuthoredDate")
        public String authoredDate;

        @NameInMap("ParentIds")
        public java.util.List<String> parentIds;

        @NameInMap("AuthorName")
        public String authorName;

        @NameInMap("CommitterName")
        public String committerName;

        @NameInMap("Title")
        public String title;

        @NameInMap("AuthorEmail")
        public String authorEmail;

        @NameInMap("CommitterEmail")
        public String committerEmail;

        @NameInMap("Id")
        public String id;

        @NameInMap("CommittedDate")
        public String committedDate;

        public static CreateTagResponseBodyResultCommitInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateTagResponseBodyResultCommitInfo self = new CreateTagResponseBodyResultCommitInfo();
            return TeaModel.build(map, self);
        }

        public CreateTagResponseBodyResultCommitInfo setShortId(String shortId) {
            this.shortId = shortId;
            return this;
        }
        public String getShortId() {
            return this.shortId;
        }

        public CreateTagResponseBodyResultCommitInfo setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public CreateTagResponseBodyResultCommitInfo setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public CreateTagResponseBodyResultCommitInfo setAuthoredDate(String authoredDate) {
            this.authoredDate = authoredDate;
            return this;
        }
        public String getAuthoredDate() {
            return this.authoredDate;
        }

        public CreateTagResponseBodyResultCommitInfo setParentIds(java.util.List<String> parentIds) {
            this.parentIds = parentIds;
            return this;
        }
        public java.util.List<String> getParentIds() {
            return this.parentIds;
        }

        public CreateTagResponseBodyResultCommitInfo setAuthorName(String authorName) {
            this.authorName = authorName;
            return this;
        }
        public String getAuthorName() {
            return this.authorName;
        }

        public CreateTagResponseBodyResultCommitInfo setCommitterName(String committerName) {
            this.committerName = committerName;
            return this;
        }
        public String getCommitterName() {
            return this.committerName;
        }

        public CreateTagResponseBodyResultCommitInfo setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public CreateTagResponseBodyResultCommitInfo setAuthorEmail(String authorEmail) {
            this.authorEmail = authorEmail;
            return this;
        }
        public String getAuthorEmail() {
            return this.authorEmail;
        }

        public CreateTagResponseBodyResultCommitInfo setCommitterEmail(String committerEmail) {
            this.committerEmail = committerEmail;
            return this;
        }
        public String getCommitterEmail() {
            return this.committerEmail;
        }

        public CreateTagResponseBodyResultCommitInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateTagResponseBodyResultCommitInfo setCommittedDate(String committedDate) {
            this.committedDate = committedDate;
            return this;
        }
        public String getCommittedDate() {
            return this.committedDate;
        }

    }

    public static class CreateTagResponseBodyResult extends TeaModel {
        @NameInMap("Release")
        public CreateTagResponseBodyResultRelease release;

        @NameInMap("Message")
        public String message;

        @NameInMap("CommitInfo")
        public CreateTagResponseBodyResultCommitInfo commitInfo;

        @NameInMap("Name")
        public String name;

        public static CreateTagResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateTagResponseBodyResult self = new CreateTagResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateTagResponseBodyResult setRelease(CreateTagResponseBodyResultRelease release) {
            this.release = release;
            return this;
        }
        public CreateTagResponseBodyResultRelease getRelease() {
            return this.release;
        }

        public CreateTagResponseBodyResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public CreateTagResponseBodyResult setCommitInfo(CreateTagResponseBodyResultCommitInfo commitInfo) {
            this.commitInfo = commitInfo;
            return this;
        }
        public CreateTagResponseBodyResultCommitInfo getCommitInfo() {
            return this.commitInfo;
        }

        public CreateTagResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
