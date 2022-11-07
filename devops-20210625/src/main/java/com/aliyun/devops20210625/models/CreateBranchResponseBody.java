// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreateBranchResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public CreateBranchResponseBodyResult result;

    @NameInMap("success")
    public Boolean success;

    public static CreateBranchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateBranchResponseBody self = new CreateBranchResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateBranchResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateBranchResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateBranchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateBranchResponseBody setResult(CreateBranchResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateBranchResponseBodyResult getResult() {
        return this.result;
    }

    public CreateBranchResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateBranchResponseBodyResultCommit extends TeaModel {
        @NameInMap("authorEmail")
        public String authorEmail;

        @NameInMap("authorName")
        public String authorName;

        @NameInMap("authoredDate")
        public String authoredDate;

        @NameInMap("committedDate")
        public String committedDate;

        @NameInMap("committerEmail")
        public String committerEmail;

        @NameInMap("committerName")
        public String committerName;

        @NameInMap("createdAt")
        public String createdAt;

        @NameInMap("id")
        public String id;

        @NameInMap("message")
        public String message;

        @NameInMap("parentIds")
        public java.util.List<String> parentIds;

        @NameInMap("shortId")
        public String shortId;

        @NameInMap("title")
        public String title;

        public static CreateBranchResponseBodyResultCommit build(java.util.Map<String, ?> map) throws Exception {
            CreateBranchResponseBodyResultCommit self = new CreateBranchResponseBodyResultCommit();
            return TeaModel.build(map, self);
        }

        public CreateBranchResponseBodyResultCommit setAuthorEmail(String authorEmail) {
            this.authorEmail = authorEmail;
            return this;
        }
        public String getAuthorEmail() {
            return this.authorEmail;
        }

        public CreateBranchResponseBodyResultCommit setAuthorName(String authorName) {
            this.authorName = authorName;
            return this;
        }
        public String getAuthorName() {
            return this.authorName;
        }

        public CreateBranchResponseBodyResultCommit setAuthoredDate(String authoredDate) {
            this.authoredDate = authoredDate;
            return this;
        }
        public String getAuthoredDate() {
            return this.authoredDate;
        }

        public CreateBranchResponseBodyResultCommit setCommittedDate(String committedDate) {
            this.committedDate = committedDate;
            return this;
        }
        public String getCommittedDate() {
            return this.committedDate;
        }

        public CreateBranchResponseBodyResultCommit setCommitterEmail(String committerEmail) {
            this.committerEmail = committerEmail;
            return this;
        }
        public String getCommitterEmail() {
            return this.committerEmail;
        }

        public CreateBranchResponseBodyResultCommit setCommitterName(String committerName) {
            this.committerName = committerName;
            return this;
        }
        public String getCommitterName() {
            return this.committerName;
        }

        public CreateBranchResponseBodyResultCommit setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public CreateBranchResponseBodyResultCommit setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateBranchResponseBodyResultCommit setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public CreateBranchResponseBodyResultCommit setParentIds(java.util.List<String> parentIds) {
            this.parentIds = parentIds;
            return this;
        }
        public java.util.List<String> getParentIds() {
            return this.parentIds;
        }

        public CreateBranchResponseBodyResultCommit setShortId(String shortId) {
            this.shortId = shortId;
            return this;
        }
        public String getShortId() {
            return this.shortId;
        }

        public CreateBranchResponseBodyResultCommit setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class CreateBranchResponseBodyResult extends TeaModel {
        @NameInMap("commit")
        public CreateBranchResponseBodyResultCommit commit;

        @NameInMap("name")
        public String name;

        @NameInMap("protected")
        public Boolean _protected;

        public static CreateBranchResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateBranchResponseBodyResult self = new CreateBranchResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateBranchResponseBodyResult setCommit(CreateBranchResponseBodyResultCommit commit) {
            this.commit = commit;
            return this;
        }
        public CreateBranchResponseBodyResultCommit getCommit() {
            return this.commit;
        }

        public CreateBranchResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateBranchResponseBodyResult set_protected(Boolean _protected) {
            this._protected = _protected;
            return this;
        }
        public Boolean get_protected() {
            return this._protected;
        }

    }

}
