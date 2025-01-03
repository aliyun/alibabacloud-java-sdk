// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetCompareDetailResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SYSTEM_UNKNOWN_ERROR</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>ASSDS-ASSASX-XSAXSA-XSAXSAXS</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public GetCompareDetailResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p><a href="https://tcs-devops.aliyuncs.com/thumbnail/112afcb7a6a35c3f67f1bea827c4/w/100/h/100">https://tcs-devops.aliyuncs.com/thumbnail/112afcb7a6a35c3f67f1bea827c4/w/100/h/100</a></p>
         */
        @NameInMap("avatarUrl")
        public String avatarUrl;

        /**
         * <strong>example:</strong>
         * <p><a href="mailto:username@example.com">username@example.com</a></p>
         */
        @NameInMap("email")
        public String email;

        /**
         * <strong>example:</strong>
         * <p>21396</p>
         */
        @NameInMap("id")
        public Long id;

        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>active</p>
         */
        @NameInMap("state")
        public String state;

        /**
         * <strong>example:</strong>
         * <p>Codeup</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p><a href="https://tcs-devops.aliyuncs.com/thumbnail/112afcb7a6a35c3f67f1bea827c4/w/100/h/100">https://tcs-devops.aliyuncs.com/thumbnail/112afcb7a6a35c3f67f1bea827c4/w/100/h/100</a></p>
         */
        @NameInMap("avatarUrl")
        public String avatarUrl;

        /**
         * <strong>example:</strong>
         * <p><a href="mailto:username@example.com">username@example.com</a></p>
         */
        @NameInMap("email")
        public String email;

        /**
         * <strong>example:</strong>
         * <p>43910</p>
         */
        @NameInMap("id")
        public Long id;

        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>active</p>
         */
        @NameInMap("state")
        public String state;

        /**
         * <strong>example:</strong>
         * <p>Codeup-commiter</p>
         */
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

        /**
         * <strong>example:</strong>
         * <p><a href="mailto:username@example.com">username@example.com</a></p>
         */
        @NameInMap("authorEmail")
        public String authorEmail;

        @NameInMap("authorName")
        public String authorName;

        /**
         * <strong>example:</strong>
         * <p>2023-01-03T15:41:26+08:00</p>
         */
        @NameInMap("authoredDate")
        public String authoredDate;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("commentsCount")
        public Long commentsCount;

        /**
         * <strong>example:</strong>
         * <p>2023-01-03T15:41:26+08:00</p>
         */
        @NameInMap("committedDate")
        public String committedDate;

        @NameInMap("committer")
        public GetCompareDetailResponseBodyResultCommitsCommitter committer;

        /**
         * <strong>example:</strong>
         * <p><a href="mailto:username@example.com">username@example.com</a></p>
         */
        @NameInMap("committerEmail")
        public String committerEmail;

        @NameInMap("committerName")
        public String committerName;

        /**
         * <strong>example:</strong>
         * <p>2023-01-03T15:41:26+08:00</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <strong>example:</strong>
         * <p>b8f6f28520b1936aafe2e638373e19ccafa42b02</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("message")
        public String message;

        @NameInMap("parentIds")
        public java.util.List<String> parentIds;

        /**
         * <strong>example:</strong>
         * <p>b8f6f285</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>100644</p>
         */
        @NameInMap("aMode")
        public String aMode;

        /**
         * <strong>example:</strong>
         * <p>100644</p>
         */
        @NameInMap("bMode")
        public String bMode;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("deletedFile")
        public Boolean deletedFile;

        @NameInMap("diff")
        public String diff;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("isBinary")
        public Boolean isBinary;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("isNewLfs")
        public Boolean isNewLfs;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("isOldLfs")
        public Boolean isOldLfs;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("newFile")
        public Boolean newFile;

        /**
         * <strong>example:</strong>
         * <p>cb75846da2df3d3d7f290c3569236fcf3dd17224</p>
         */
        @NameInMap("newId")
        public String newId;

        /**
         * <strong>example:</strong>
         * <p>new_test.txt</p>
         */
        @NameInMap("newPath")
        public String newPath;

        /**
         * <strong>example:</strong>
         * <p>6c268061a546378276559c713d0ad377d4dsjfh</p>
         */
        @NameInMap("oldId")
        public String oldId;

        /**
         * <strong>example:</strong>
         * <p>test.txt</p>
         */
        @NameInMap("oldPath")
        public String oldPath;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
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
