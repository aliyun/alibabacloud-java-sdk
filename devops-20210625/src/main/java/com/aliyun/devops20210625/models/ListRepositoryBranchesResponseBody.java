// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListRepositoryBranchesResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<ListRepositoryBranchesResponseBodyResult> result;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("total")
    public Long total;

    public static ListRepositoryBranchesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRepositoryBranchesResponseBody self = new ListRepositoryBranchesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRepositoryBranchesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListRepositoryBranchesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListRepositoryBranchesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRepositoryBranchesResponseBody setResult(java.util.List<ListRepositoryBranchesResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListRepositoryBranchesResponseBodyResult> getResult() {
        return this.result;
    }

    public ListRepositoryBranchesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListRepositoryBranchesResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListRepositoryBranchesResponseBodyResultCommit extends TeaModel {
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

        public static ListRepositoryBranchesResponseBodyResultCommit build(java.util.Map<String, ?> map) throws Exception {
            ListRepositoryBranchesResponseBodyResultCommit self = new ListRepositoryBranchesResponseBodyResultCommit();
            return TeaModel.build(map, self);
        }

        public ListRepositoryBranchesResponseBodyResultCommit setAuthorEmail(String authorEmail) {
            this.authorEmail = authorEmail;
            return this;
        }
        public String getAuthorEmail() {
            return this.authorEmail;
        }

        public ListRepositoryBranchesResponseBodyResultCommit setAuthorName(String authorName) {
            this.authorName = authorName;
            return this;
        }
        public String getAuthorName() {
            return this.authorName;
        }

        public ListRepositoryBranchesResponseBodyResultCommit setAuthoredDate(String authoredDate) {
            this.authoredDate = authoredDate;
            return this;
        }
        public String getAuthoredDate() {
            return this.authoredDate;
        }

        public ListRepositoryBranchesResponseBodyResultCommit setCommittedDate(String committedDate) {
            this.committedDate = committedDate;
            return this;
        }
        public String getCommittedDate() {
            return this.committedDate;
        }

        public ListRepositoryBranchesResponseBodyResultCommit setCommitterEmail(String committerEmail) {
            this.committerEmail = committerEmail;
            return this;
        }
        public String getCommitterEmail() {
            return this.committerEmail;
        }

        public ListRepositoryBranchesResponseBodyResultCommit setCommitterName(String committerName) {
            this.committerName = committerName;
            return this;
        }
        public String getCommitterName() {
            return this.committerName;
        }

        public ListRepositoryBranchesResponseBodyResultCommit setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListRepositoryBranchesResponseBodyResultCommit setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListRepositoryBranchesResponseBodyResultCommit setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListRepositoryBranchesResponseBodyResultCommit setParentIds(java.util.List<String> parentIds) {
            this.parentIds = parentIds;
            return this;
        }
        public java.util.List<String> getParentIds() {
            return this.parentIds;
        }

        public ListRepositoryBranchesResponseBodyResultCommit setShortId(String shortId) {
            this.shortId = shortId;
            return this;
        }
        public String getShortId() {
            return this.shortId;
        }

        public ListRepositoryBranchesResponseBodyResultCommit setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class ListRepositoryBranchesResponseBodyResult extends TeaModel {
        @NameInMap("commit")
        public ListRepositoryBranchesResponseBodyResultCommit commit;

        @NameInMap("name")
        public String name;

        @NameInMap("protected")
        public String _protected;

        public static ListRepositoryBranchesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListRepositoryBranchesResponseBodyResult self = new ListRepositoryBranchesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListRepositoryBranchesResponseBodyResult setCommit(ListRepositoryBranchesResponseBodyResultCommit commit) {
            this.commit = commit;
            return this;
        }
        public ListRepositoryBranchesResponseBodyResultCommit getCommit() {
            return this.commit;
        }

        public ListRepositoryBranchesResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListRepositoryBranchesResponseBodyResult set_protected(String _protected) {
            this._protected = _protected;
            return this;
        }
        public String get_protected() {
            return this._protected;
        }

    }

}
