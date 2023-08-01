// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetCompareDetailResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public GetCompareDetailResponseBodyResult result;

    @NameInMap("success")
    public Boolean success;

    public static GetCompareDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCompareDetailResponseBody self = new GetCompareDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCompareDetailResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetCompareDetailResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetCompareDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCompareDetailResponseBody setResult(GetCompareDetailResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetCompareDetailResponseBodyResult getResult() {
        return this.result;
    }

    public GetCompareDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetCompareDetailResponseBodyResultCommitsAuthor extends TeaModel {
        @NameInMap("avatarUrl")
        public String avatarUrl;

        @NameInMap("email")
        public String email;

        @NameInMap("id")
        public Long id;

        @NameInMap("name")
        public String name;

        @NameInMap("state")
        public String state;

        @NameInMap("username")
        public String username;

        public static GetCompareDetailResponseBodyResultCommitsAuthor build(java.util.Map<String, ?> map) throws Exception {
            GetCompareDetailResponseBodyResultCommitsAuthor self = new GetCompareDetailResponseBodyResultCommitsAuthor();
            return TeaModel.build(map, self);
        }

        public GetCompareDetailResponseBodyResultCommitsAuthor setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public GetCompareDetailResponseBodyResultCommitsAuthor setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public GetCompareDetailResponseBodyResultCommitsAuthor setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetCompareDetailResponseBodyResultCommitsAuthor setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetCompareDetailResponseBodyResultCommitsAuthor setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public GetCompareDetailResponseBodyResultCommitsAuthor setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class GetCompareDetailResponseBodyResultCommitsCommitter extends TeaModel {
        @NameInMap("avatarUrl")
        public String avatarUrl;

        @NameInMap("email")
        public String email;

        @NameInMap("id")
        public Long id;

        @NameInMap("name")
        public String name;

        @NameInMap("state")
        public String state;

        @NameInMap("username")
        public String username;

        public static GetCompareDetailResponseBodyResultCommitsCommitter build(java.util.Map<String, ?> map) throws Exception {
            GetCompareDetailResponseBodyResultCommitsCommitter self = new GetCompareDetailResponseBodyResultCommitsCommitter();
            return TeaModel.build(map, self);
        }

        public GetCompareDetailResponseBodyResultCommitsCommitter setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public GetCompareDetailResponseBodyResultCommitsCommitter setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public GetCompareDetailResponseBodyResultCommitsCommitter setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetCompareDetailResponseBodyResultCommitsCommitter setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetCompareDetailResponseBodyResultCommitsCommitter setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public GetCompareDetailResponseBodyResultCommitsCommitter setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class GetCompareDetailResponseBodyResultCommits extends TeaModel {
        @NameInMap("author")
        public GetCompareDetailResponseBodyResultCommitsAuthor author;

        @NameInMap("authorEmail")
        public String authorEmail;

        @NameInMap("authorName")
        public String authorName;

        @NameInMap("authoredDate")
        public String authoredDate;

        @NameInMap("commentsCount")
        public Long commentsCount;

        @NameInMap("committedDate")
        public String committedDate;

        @NameInMap("committer")
        public GetCompareDetailResponseBodyResultCommitsCommitter committer;

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

        public static GetCompareDetailResponseBodyResultCommits build(java.util.Map<String, ?> map) throws Exception {
            GetCompareDetailResponseBodyResultCommits self = new GetCompareDetailResponseBodyResultCommits();
            return TeaModel.build(map, self);
        }

        public GetCompareDetailResponseBodyResultCommits setAuthor(GetCompareDetailResponseBodyResultCommitsAuthor author) {
            this.author = author;
            return this;
        }
        public GetCompareDetailResponseBodyResultCommitsAuthor getAuthor() {
            return this.author;
        }

        public GetCompareDetailResponseBodyResultCommits setAuthorEmail(String authorEmail) {
            this.authorEmail = authorEmail;
            return this;
        }
        public String getAuthorEmail() {
            return this.authorEmail;
        }

        public GetCompareDetailResponseBodyResultCommits setAuthorName(String authorName) {
            this.authorName = authorName;
            return this;
        }
        public String getAuthorName() {
            return this.authorName;
        }

        public GetCompareDetailResponseBodyResultCommits setAuthoredDate(String authoredDate) {
            this.authoredDate = authoredDate;
            return this;
        }
        public String getAuthoredDate() {
            return this.authoredDate;
        }

        public GetCompareDetailResponseBodyResultCommits setCommentsCount(Long commentsCount) {
            this.commentsCount = commentsCount;
            return this;
        }
        public Long getCommentsCount() {
            return this.commentsCount;
        }

        public GetCompareDetailResponseBodyResultCommits setCommittedDate(String committedDate) {
            this.committedDate = committedDate;
            return this;
        }
        public String getCommittedDate() {
            return this.committedDate;
        }

        public GetCompareDetailResponseBodyResultCommits setCommitter(GetCompareDetailResponseBodyResultCommitsCommitter committer) {
            this.committer = committer;
            return this;
        }
        public GetCompareDetailResponseBodyResultCommitsCommitter getCommitter() {
            return this.committer;
        }

        public GetCompareDetailResponseBodyResultCommits setCommitterEmail(String committerEmail) {
            this.committerEmail = committerEmail;
            return this;
        }
        public String getCommitterEmail() {
            return this.committerEmail;
        }

        public GetCompareDetailResponseBodyResultCommits setCommitterName(String committerName) {
            this.committerName = committerName;
            return this;
        }
        public String getCommitterName() {
            return this.committerName;
        }

        public GetCompareDetailResponseBodyResultCommits setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetCompareDetailResponseBodyResultCommits setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetCompareDetailResponseBodyResultCommits setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetCompareDetailResponseBodyResultCommits setParentIds(java.util.List<String> parentIds) {
            this.parentIds = parentIds;
            return this;
        }
        public java.util.List<String> getParentIds() {
            return this.parentIds;
        }

        public GetCompareDetailResponseBodyResultCommits setShortId(String shortId) {
            this.shortId = shortId;
            return this;
        }
        public String getShortId() {
            return this.shortId;
        }

        public GetCompareDetailResponseBodyResultCommits setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class GetCompareDetailResponseBodyResultDiffs extends TeaModel {
        @NameInMap("aMode")
        public String aMode;

        @NameInMap("bMode")
        public String bMode;

        @NameInMap("deletedFile")
        public Boolean deletedFile;

        @NameInMap("diff")
        public String diff;

        @NameInMap("isBinary")
        public Boolean isBinary;

        @NameInMap("isNewLfs")
        public Boolean isNewLfs;

        @NameInMap("isOldLfs")
        public Boolean isOldLfs;

        @NameInMap("newFile")
        public Boolean newFile;

        @NameInMap("newId")
        public String newId;

        @NameInMap("newPath")
        public String newPath;

        @NameInMap("oldId")
        public String oldId;

        @NameInMap("oldPath")
        public String oldPath;

        @NameInMap("renamedFile")
        public Boolean renamedFile;

        public static GetCompareDetailResponseBodyResultDiffs build(java.util.Map<String, ?> map) throws Exception {
            GetCompareDetailResponseBodyResultDiffs self = new GetCompareDetailResponseBodyResultDiffs();
            return TeaModel.build(map, self);
        }

        public GetCompareDetailResponseBodyResultDiffs setAMode(String aMode) {
            this.aMode = aMode;
            return this;
        }
        public String getAMode() {
            return this.aMode;
        }

        public GetCompareDetailResponseBodyResultDiffs setBMode(String bMode) {
            this.bMode = bMode;
            return this;
        }
        public String getBMode() {
            return this.bMode;
        }

        public GetCompareDetailResponseBodyResultDiffs setDeletedFile(Boolean deletedFile) {
            this.deletedFile = deletedFile;
            return this;
        }
        public Boolean getDeletedFile() {
            return this.deletedFile;
        }

        public GetCompareDetailResponseBodyResultDiffs setDiff(String diff) {
            this.diff = diff;
            return this;
        }
        public String getDiff() {
            return this.diff;
        }

        public GetCompareDetailResponseBodyResultDiffs setIsBinary(Boolean isBinary) {
            this.isBinary = isBinary;
            return this;
        }
        public Boolean getIsBinary() {
            return this.isBinary;
        }

        public GetCompareDetailResponseBodyResultDiffs setIsNewLfs(Boolean isNewLfs) {
            this.isNewLfs = isNewLfs;
            return this;
        }
        public Boolean getIsNewLfs() {
            return this.isNewLfs;
        }

        public GetCompareDetailResponseBodyResultDiffs setIsOldLfs(Boolean isOldLfs) {
            this.isOldLfs = isOldLfs;
            return this;
        }
        public Boolean getIsOldLfs() {
            return this.isOldLfs;
        }

        public GetCompareDetailResponseBodyResultDiffs setNewFile(Boolean newFile) {
            this.newFile = newFile;
            return this;
        }
        public Boolean getNewFile() {
            return this.newFile;
        }

        public GetCompareDetailResponseBodyResultDiffs setNewId(String newId) {
            this.newId = newId;
            return this;
        }
        public String getNewId() {
            return this.newId;
        }

        public GetCompareDetailResponseBodyResultDiffs setNewPath(String newPath) {
            this.newPath = newPath;
            return this;
        }
        public String getNewPath() {
            return this.newPath;
        }

        public GetCompareDetailResponseBodyResultDiffs setOldId(String oldId) {
            this.oldId = oldId;
            return this;
        }
        public String getOldId() {
            return this.oldId;
        }

        public GetCompareDetailResponseBodyResultDiffs setOldPath(String oldPath) {
            this.oldPath = oldPath;
            return this;
        }
        public String getOldPath() {
            return this.oldPath;
        }

        public GetCompareDetailResponseBodyResultDiffs setRenamedFile(Boolean renamedFile) {
            this.renamedFile = renamedFile;
            return this;
        }
        public Boolean getRenamedFile() {
            return this.renamedFile;
        }

    }

    public static class GetCompareDetailResponseBodyResult extends TeaModel {
        @NameInMap("commits")
        public java.util.List<GetCompareDetailResponseBodyResultCommits> commits;

        @NameInMap("diffs")
        public java.util.List<GetCompareDetailResponseBodyResultDiffs> diffs;

        @NameInMap("messages")
        public java.util.List<String> messages;

        public static GetCompareDetailResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetCompareDetailResponseBodyResult self = new GetCompareDetailResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetCompareDetailResponseBodyResult setCommits(java.util.List<GetCompareDetailResponseBodyResultCommits> commits) {
            this.commits = commits;
            return this;
        }
        public java.util.List<GetCompareDetailResponseBodyResultCommits> getCommits() {
            return this.commits;
        }

        public GetCompareDetailResponseBodyResult setDiffs(java.util.List<GetCompareDetailResponseBodyResultDiffs> diffs) {
            this.diffs = diffs;
            return this;
        }
        public java.util.List<GetCompareDetailResponseBodyResultDiffs> getDiffs() {
            return this.diffs;
        }

        public GetCompareDetailResponseBodyResult setMessages(java.util.List<String> messages) {
            this.messages = messages;
            return this;
        }
        public java.util.List<String> getMessages() {
            return this.messages;
        }

    }

}
