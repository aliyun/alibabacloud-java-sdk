// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreateCommentResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public CreateCommentResponseBodyResult result;

    @NameInMap("success")
    public Boolean success;

    public static CreateCommentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCommentResponseBody self = new CreateCommentResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCommentResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateCommentResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateCommentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateCommentResponseBody setResult(CreateCommentResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateCommentResponseBodyResult getResult() {
        return this.result;
    }

    public CreateCommentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateCommentResponseBodyResultAuthor extends TeaModel {
        @NameInMap("aliyunPk")
        public String aliyunPk;

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

        public static CreateCommentResponseBodyResultAuthor build(java.util.Map<String, ?> map) throws Exception {
            CreateCommentResponseBodyResultAuthor self = new CreateCommentResponseBodyResultAuthor();
            return TeaModel.build(map, self);
        }

        public CreateCommentResponseBodyResultAuthor setAliyunPk(String aliyunPk) {
            this.aliyunPk = aliyunPk;
            return this;
        }
        public String getAliyunPk() {
            return this.aliyunPk;
        }

        public CreateCommentResponseBodyResultAuthor setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public CreateCommentResponseBodyResultAuthor setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public CreateCommentResponseBodyResultAuthor setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CreateCommentResponseBodyResultAuthor setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateCommentResponseBodyResultAuthor setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public CreateCommentResponseBodyResultAuthor setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class CreateCommentResponseBodyResultRelatedPatchSet extends TeaModel {
        @NameInMap("commitId")
        public String commitId;

        @NameInMap("createdAt")
        public String createdAt;

        @NameInMap("patchSetBizId")
        public String patchSetBizId;

        @NameInMap("patchSetName")
        public String patchSetName;

        @NameInMap("patchSetNo")
        public String patchSetNo;

        @NameInMap("relatedMergeItemType")
        public String relatedMergeItemType;

        @NameInMap("shortId")
        public String shortId;

        public static CreateCommentResponseBodyResultRelatedPatchSet build(java.util.Map<String, ?> map) throws Exception {
            CreateCommentResponseBodyResultRelatedPatchSet self = new CreateCommentResponseBodyResultRelatedPatchSet();
            return TeaModel.build(map, self);
        }

        public CreateCommentResponseBodyResultRelatedPatchSet setCommitId(String commitId) {
            this.commitId = commitId;
            return this;
        }
        public String getCommitId() {
            return this.commitId;
        }

        public CreateCommentResponseBodyResultRelatedPatchSet setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public CreateCommentResponseBodyResultRelatedPatchSet setPatchSetBizId(String patchSetBizId) {
            this.patchSetBizId = patchSetBizId;
            return this;
        }
        public String getPatchSetBizId() {
            return this.patchSetBizId;
        }

        public CreateCommentResponseBodyResultRelatedPatchSet setPatchSetName(String patchSetName) {
            this.patchSetName = patchSetName;
            return this;
        }
        public String getPatchSetName() {
            return this.patchSetName;
        }

        public CreateCommentResponseBodyResultRelatedPatchSet setPatchSetNo(String patchSetNo) {
            this.patchSetNo = patchSetNo;
            return this;
        }
        public String getPatchSetNo() {
            return this.patchSetNo;
        }

        public CreateCommentResponseBodyResultRelatedPatchSet setRelatedMergeItemType(String relatedMergeItemType) {
            this.relatedMergeItemType = relatedMergeItemType;
            return this;
        }
        public String getRelatedMergeItemType() {
            return this.relatedMergeItemType;
        }

        public CreateCommentResponseBodyResultRelatedPatchSet setShortId(String shortId) {
            this.shortId = shortId;
            return this;
        }
        public String getShortId() {
            return this.shortId;
        }

    }

    public static class CreateCommentResponseBodyResult extends TeaModel {
        @NameInMap("author")
        public CreateCommentResponseBodyResultAuthor author;

        @NameInMap("commentBizId")
        public String commentBizId;

        @NameInMap("commentTime")
        public String commentTime;

        @NameInMap("commentType")
        public String commentType;

        @NameInMap("content")
        public String content;

        @NameInMap("deleted")
        public Boolean deleted;

        @NameInMap("filePath")
        public String filePath;

        @NameInMap("lastEditTime")
        public String lastEditTime;

        @NameInMap("lineNumber")
        public String lineNumber;

        @NameInMap("parentCommentBizId")
        public String parentCommentBizId;

        @NameInMap("relatedPatchSet")
        public CreateCommentResponseBodyResultRelatedPatchSet relatedPatchSet;

        @NameInMap("resolved")
        public Boolean resolved;

        @NameInMap("rootCommentBizId")
        public String rootCommentBizId;

        @NameInMap("state")
        public String state;

        public static CreateCommentResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateCommentResponseBodyResult self = new CreateCommentResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateCommentResponseBodyResult setAuthor(CreateCommentResponseBodyResultAuthor author) {
            this.author = author;
            return this;
        }
        public CreateCommentResponseBodyResultAuthor getAuthor() {
            return this.author;
        }

        public CreateCommentResponseBodyResult setCommentBizId(String commentBizId) {
            this.commentBizId = commentBizId;
            return this;
        }
        public String getCommentBizId() {
            return this.commentBizId;
        }

        public CreateCommentResponseBodyResult setCommentTime(String commentTime) {
            this.commentTime = commentTime;
            return this;
        }
        public String getCommentTime() {
            return this.commentTime;
        }

        public CreateCommentResponseBodyResult setCommentType(String commentType) {
            this.commentType = commentType;
            return this;
        }
        public String getCommentType() {
            return this.commentType;
        }

        public CreateCommentResponseBodyResult setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public CreateCommentResponseBodyResult setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public CreateCommentResponseBodyResult setFilePath(String filePath) {
            this.filePath = filePath;
            return this;
        }
        public String getFilePath() {
            return this.filePath;
        }

        public CreateCommentResponseBodyResult setLastEditTime(String lastEditTime) {
            this.lastEditTime = lastEditTime;
            return this;
        }
        public String getLastEditTime() {
            return this.lastEditTime;
        }

        public CreateCommentResponseBodyResult setLineNumber(String lineNumber) {
            this.lineNumber = lineNumber;
            return this;
        }
        public String getLineNumber() {
            return this.lineNumber;
        }

        public CreateCommentResponseBodyResult setParentCommentBizId(String parentCommentBizId) {
            this.parentCommentBizId = parentCommentBizId;
            return this;
        }
        public String getParentCommentBizId() {
            return this.parentCommentBizId;
        }

        public CreateCommentResponseBodyResult setRelatedPatchSet(CreateCommentResponseBodyResultRelatedPatchSet relatedPatchSet) {
            this.relatedPatchSet = relatedPatchSet;
            return this;
        }
        public CreateCommentResponseBodyResultRelatedPatchSet getRelatedPatchSet() {
            return this.relatedPatchSet;
        }

        public CreateCommentResponseBodyResult setResolved(Boolean resolved) {
            this.resolved = resolved;
            return this;
        }
        public Boolean getResolved() {
            return this.resolved;
        }

        public CreateCommentResponseBodyResult setRootCommentBizId(String rootCommentBizId) {
            this.rootCommentBizId = rootCommentBizId;
            return this;
        }
        public String getRootCommentBizId() {
            return this.rootCommentBizId;
        }

        public CreateCommentResponseBodyResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
