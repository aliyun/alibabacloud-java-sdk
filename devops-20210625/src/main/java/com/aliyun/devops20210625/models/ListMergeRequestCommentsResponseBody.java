// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListMergeRequestCommentsResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<ListMergeRequestCommentsResponseBodyResult> result;

    @NameInMap("success")
    public Boolean success;

    public static ListMergeRequestCommentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMergeRequestCommentsResponseBody self = new ListMergeRequestCommentsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMergeRequestCommentsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListMergeRequestCommentsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListMergeRequestCommentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMergeRequestCommentsResponseBody setResult(java.util.List<ListMergeRequestCommentsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListMergeRequestCommentsResponseBodyResult> getResult() {
        return this.result;
    }

    public ListMergeRequestCommentsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListMergeRequestCommentsResponseBodyResultAuthor extends TeaModel {
        @NameInMap("aliyunPk")
        public String aliyunPk;

        @NameInMap("avatarUrl")
        public String avatarUrl;

        @NameInMap("email")
        public String email;

        @NameInMap("name")
        public String name;

        @NameInMap("state")
        public String state;

        @NameInMap("username")
        public String username;

        public static ListMergeRequestCommentsResponseBodyResultAuthor build(java.util.Map<String, ?> map) throws Exception {
            ListMergeRequestCommentsResponseBodyResultAuthor self = new ListMergeRequestCommentsResponseBodyResultAuthor();
            return TeaModel.build(map, self);
        }

        public ListMergeRequestCommentsResponseBodyResultAuthor setAliyunPk(String aliyunPk) {
            this.aliyunPk = aliyunPk;
            return this;
        }
        public String getAliyunPk() {
            return this.aliyunPk;
        }

        public ListMergeRequestCommentsResponseBodyResultAuthor setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public ListMergeRequestCommentsResponseBodyResultAuthor setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ListMergeRequestCommentsResponseBodyResultAuthor setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListMergeRequestCommentsResponseBodyResultAuthor setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListMergeRequestCommentsResponseBodyResultAuthor setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class ListMergeRequestCommentsResponseBodyResultChildCommentsAuthor extends TeaModel {
        @NameInMap("aliyunPk")
        public String aliyunPk;

        @NameInMap("avatarUrl")
        public String avatarUrl;

        @NameInMap("email")
        public String email;

        @NameInMap("name")
        public String name;

        @NameInMap("state")
        public String state;

        @NameInMap("username")
        public String username;

        public static ListMergeRequestCommentsResponseBodyResultChildCommentsAuthor build(java.util.Map<String, ?> map) throws Exception {
            ListMergeRequestCommentsResponseBodyResultChildCommentsAuthor self = new ListMergeRequestCommentsResponseBodyResultChildCommentsAuthor();
            return TeaModel.build(map, self);
        }

        public ListMergeRequestCommentsResponseBodyResultChildCommentsAuthor setAliyunPk(String aliyunPk) {
            this.aliyunPk = aliyunPk;
            return this;
        }
        public String getAliyunPk() {
            return this.aliyunPk;
        }

        public ListMergeRequestCommentsResponseBodyResultChildCommentsAuthor setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public ListMergeRequestCommentsResponseBodyResultChildCommentsAuthor setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ListMergeRequestCommentsResponseBodyResultChildCommentsAuthor setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListMergeRequestCommentsResponseBodyResultChildCommentsAuthor setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListMergeRequestCommentsResponseBodyResultChildCommentsAuthor setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class ListMergeRequestCommentsResponseBodyResultChildCommentsFinalChildCommentsAuthor extends TeaModel {
        @NameInMap("aliyunPk")
        public String aliyunPk;

        @NameInMap("avatarUrl")
        public String avatarUrl;

        @NameInMap("email")
        public String email;

        @NameInMap("name")
        public String name;

        @NameInMap("state")
        public String state;

        @NameInMap("username")
        public String username;

        public static ListMergeRequestCommentsResponseBodyResultChildCommentsFinalChildCommentsAuthor build(java.util.Map<String, ?> map) throws Exception {
            ListMergeRequestCommentsResponseBodyResultChildCommentsFinalChildCommentsAuthor self = new ListMergeRequestCommentsResponseBodyResultChildCommentsFinalChildCommentsAuthor();
            return TeaModel.build(map, self);
        }

        public ListMergeRequestCommentsResponseBodyResultChildCommentsFinalChildCommentsAuthor setAliyunPk(String aliyunPk) {
            this.aliyunPk = aliyunPk;
            return this;
        }
        public String getAliyunPk() {
            return this.aliyunPk;
        }

        public ListMergeRequestCommentsResponseBodyResultChildCommentsFinalChildCommentsAuthor setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public ListMergeRequestCommentsResponseBodyResultChildCommentsFinalChildCommentsAuthor setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ListMergeRequestCommentsResponseBodyResultChildCommentsFinalChildCommentsAuthor setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListMergeRequestCommentsResponseBodyResultChildCommentsFinalChildCommentsAuthor setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListMergeRequestCommentsResponseBodyResultChildCommentsFinalChildCommentsAuthor setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class ListMergeRequestCommentsResponseBodyResultChildCommentsFinalChildCommentsRelatedPatchSet extends TeaModel {
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

        public static ListMergeRequestCommentsResponseBodyResultChildCommentsFinalChildCommentsRelatedPatchSet build(java.util.Map<String, ?> map) throws Exception {
            ListMergeRequestCommentsResponseBodyResultChildCommentsFinalChildCommentsRelatedPatchSet self = new ListMergeRequestCommentsResponseBodyResultChildCommentsFinalChildCommentsRelatedPatchSet();
            return TeaModel.build(map, self);
        }

        public ListMergeRequestCommentsResponseBodyResultChildCommentsFinalChildCommentsRelatedPatchSet setCommitId(String commitId) {
            this.commitId = commitId;
            return this;
        }
        public String getCommitId() {
            return this.commitId;
        }

        public ListMergeRequestCommentsResponseBodyResultChildCommentsFinalChildCommentsRelatedPatchSet setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListMergeRequestCommentsResponseBodyResultChildCommentsFinalChildCommentsRelatedPatchSet setPatchSetBizId(String patchSetBizId) {
            this.patchSetBizId = patchSetBizId;
            return this;
        }
        public String getPatchSetBizId() {
            return this.patchSetBizId;
        }

        public ListMergeRequestCommentsResponseBodyResultChildCommentsFinalChildCommentsRelatedPatchSet setPatchSetName(String patchSetName) {
            this.patchSetName = patchSetName;
            return this;
        }
        public String getPatchSetName() {
            return this.patchSetName;
        }

        public ListMergeRequestCommentsResponseBodyResultChildCommentsFinalChildCommentsRelatedPatchSet setPatchSetNo(String patchSetNo) {
            this.patchSetNo = patchSetNo;
            return this;
        }
        public String getPatchSetNo() {
            return this.patchSetNo;
        }

        public ListMergeRequestCommentsResponseBodyResultChildCommentsFinalChildCommentsRelatedPatchSet setRelatedMergeItemType(String relatedMergeItemType) {
            this.relatedMergeItemType = relatedMergeItemType;
            return this;
        }
        public String getRelatedMergeItemType() {
            return this.relatedMergeItemType;
        }

        public ListMergeRequestCommentsResponseBodyResultChildCommentsFinalChildCommentsRelatedPatchSet setShortId(String shortId) {
            this.shortId = shortId;
            return this;
        }
        public String getShortId() {
            return this.shortId;
        }

    }

    public static class ListMergeRequestCommentsResponseBodyResultChildCommentsFinalChildComments extends TeaModel {
        @NameInMap("author")
        public ListMergeRequestCommentsResponseBodyResultChildCommentsFinalChildCommentsAuthor author;

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
        public ListMergeRequestCommentsResponseBodyResultChildCommentsFinalChildCommentsRelatedPatchSet relatedPatchSet;

        @NameInMap("resolved")
        public Boolean resolved;

        @NameInMap("rootCommentBizId")
        public String rootCommentBizId;

        @NameInMap("state")
        public String state;

        public static ListMergeRequestCommentsResponseBodyResultChildCommentsFinalChildComments build(java.util.Map<String, ?> map) throws Exception {
            ListMergeRequestCommentsResponseBodyResultChildCommentsFinalChildComments self = new ListMergeRequestCommentsResponseBodyResultChildCommentsFinalChildComments();
            return TeaModel.build(map, self);
        }

        public ListMergeRequestCommentsResponseBodyResultChildCommentsFinalChildComments setAuthor(ListMergeRequestCommentsResponseBodyResultChildCommentsFinalChildCommentsAuthor author) {
            this.author = author;
            return this;
        }
        public ListMergeRequestCommentsResponseBodyResultChildCommentsFinalChildCommentsAuthor getAuthor() {
            return this.author;
        }

        public ListMergeRequestCommentsResponseBodyResultChildCommentsFinalChildComments setCommentBizId(String commentBizId) {
            this.commentBizId = commentBizId;
            return this;
        }
        public String getCommentBizId() {
            return this.commentBizId;
        }

        public ListMergeRequestCommentsResponseBodyResultChildCommentsFinalChildComments setCommentTime(String commentTime) {
            this.commentTime = commentTime;
            return this;
        }
        public String getCommentTime() {
            return this.commentTime;
        }

        public ListMergeRequestCommentsResponseBodyResultChildCommentsFinalChildComments setCommentType(String commentType) {
            this.commentType = commentType;
            return this;
        }
        public String getCommentType() {
            return this.commentType;
        }

        public ListMergeRequestCommentsResponseBodyResultChildCommentsFinalChildComments setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListMergeRequestCommentsResponseBodyResultChildCommentsFinalChildComments setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public ListMergeRequestCommentsResponseBodyResultChildCommentsFinalChildComments setFilePath(String filePath) {
            this.filePath = filePath;
            return this;
        }
        public String getFilePath() {
            return this.filePath;
        }

        public ListMergeRequestCommentsResponseBodyResultChildCommentsFinalChildComments setLastEditTime(String lastEditTime) {
            this.lastEditTime = lastEditTime;
            return this;
        }
        public String getLastEditTime() {
            return this.lastEditTime;
        }

        public ListMergeRequestCommentsResponseBodyResultChildCommentsFinalChildComments setLineNumber(String lineNumber) {
            this.lineNumber = lineNumber;
            return this;
        }
        public String getLineNumber() {
            return this.lineNumber;
        }

        public ListMergeRequestCommentsResponseBodyResultChildCommentsFinalChildComments setParentCommentBizId(String parentCommentBizId) {
            this.parentCommentBizId = parentCommentBizId;
            return this;
        }
        public String getParentCommentBizId() {
            return this.parentCommentBizId;
        }

        public ListMergeRequestCommentsResponseBodyResultChildCommentsFinalChildComments setRelatedPatchSet(ListMergeRequestCommentsResponseBodyResultChildCommentsFinalChildCommentsRelatedPatchSet relatedPatchSet) {
            this.relatedPatchSet = relatedPatchSet;
            return this;
        }
        public ListMergeRequestCommentsResponseBodyResultChildCommentsFinalChildCommentsRelatedPatchSet getRelatedPatchSet() {
            return this.relatedPatchSet;
        }

        public ListMergeRequestCommentsResponseBodyResultChildCommentsFinalChildComments setResolved(Boolean resolved) {
            this.resolved = resolved;
            return this;
        }
        public Boolean getResolved() {
            return this.resolved;
        }

        public ListMergeRequestCommentsResponseBodyResultChildCommentsFinalChildComments setRootCommentBizId(String rootCommentBizId) {
            this.rootCommentBizId = rootCommentBizId;
            return this;
        }
        public String getRootCommentBizId() {
            return this.rootCommentBizId;
        }

        public ListMergeRequestCommentsResponseBodyResultChildCommentsFinalChildComments setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

    public static class ListMergeRequestCommentsResponseBodyResultChildCommentsRelatedPatchSet extends TeaModel {
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

        public static ListMergeRequestCommentsResponseBodyResultChildCommentsRelatedPatchSet build(java.util.Map<String, ?> map) throws Exception {
            ListMergeRequestCommentsResponseBodyResultChildCommentsRelatedPatchSet self = new ListMergeRequestCommentsResponseBodyResultChildCommentsRelatedPatchSet();
            return TeaModel.build(map, self);
        }

        public ListMergeRequestCommentsResponseBodyResultChildCommentsRelatedPatchSet setCommitId(String commitId) {
            this.commitId = commitId;
            return this;
        }
        public String getCommitId() {
            return this.commitId;
        }

        public ListMergeRequestCommentsResponseBodyResultChildCommentsRelatedPatchSet setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListMergeRequestCommentsResponseBodyResultChildCommentsRelatedPatchSet setPatchSetBizId(String patchSetBizId) {
            this.patchSetBizId = patchSetBizId;
            return this;
        }
        public String getPatchSetBizId() {
            return this.patchSetBizId;
        }

        public ListMergeRequestCommentsResponseBodyResultChildCommentsRelatedPatchSet setPatchSetName(String patchSetName) {
            this.patchSetName = patchSetName;
            return this;
        }
        public String getPatchSetName() {
            return this.patchSetName;
        }

        public ListMergeRequestCommentsResponseBodyResultChildCommentsRelatedPatchSet setPatchSetNo(String patchSetNo) {
            this.patchSetNo = patchSetNo;
            return this;
        }
        public String getPatchSetNo() {
            return this.patchSetNo;
        }

        public ListMergeRequestCommentsResponseBodyResultChildCommentsRelatedPatchSet setRelatedMergeItemType(String relatedMergeItemType) {
            this.relatedMergeItemType = relatedMergeItemType;
            return this;
        }
        public String getRelatedMergeItemType() {
            return this.relatedMergeItemType;
        }

        public ListMergeRequestCommentsResponseBodyResultChildCommentsRelatedPatchSet setShortId(String shortId) {
            this.shortId = shortId;
            return this;
        }
        public String getShortId() {
            return this.shortId;
        }

    }

    public static class ListMergeRequestCommentsResponseBodyResultChildComments extends TeaModel {
        @NameInMap("author")
        public ListMergeRequestCommentsResponseBodyResultChildCommentsAuthor author;

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

        @NameInMap("finalChildComments")
        public java.util.List<ListMergeRequestCommentsResponseBodyResultChildCommentsFinalChildComments> finalChildComments;

        @NameInMap("lastEditTime")
        public String lastEditTime;

        @NameInMap("lineNumber")
        public String lineNumber;

        @NameInMap("parentCommentBizId")
        public String parentCommentBizId;

        @NameInMap("relatedPatchSet")
        public ListMergeRequestCommentsResponseBodyResultChildCommentsRelatedPatchSet relatedPatchSet;

        @NameInMap("resolved")
        public Boolean resolved;

        @NameInMap("rootCommentBizId")
        public String rootCommentBizId;

        @NameInMap("state")
        public String state;

        public static ListMergeRequestCommentsResponseBodyResultChildComments build(java.util.Map<String, ?> map) throws Exception {
            ListMergeRequestCommentsResponseBodyResultChildComments self = new ListMergeRequestCommentsResponseBodyResultChildComments();
            return TeaModel.build(map, self);
        }

        public ListMergeRequestCommentsResponseBodyResultChildComments setAuthor(ListMergeRequestCommentsResponseBodyResultChildCommentsAuthor author) {
            this.author = author;
            return this;
        }
        public ListMergeRequestCommentsResponseBodyResultChildCommentsAuthor getAuthor() {
            return this.author;
        }

        public ListMergeRequestCommentsResponseBodyResultChildComments setCommentBizId(String commentBizId) {
            this.commentBizId = commentBizId;
            return this;
        }
        public String getCommentBizId() {
            return this.commentBizId;
        }

        public ListMergeRequestCommentsResponseBodyResultChildComments setCommentTime(String commentTime) {
            this.commentTime = commentTime;
            return this;
        }
        public String getCommentTime() {
            return this.commentTime;
        }

        public ListMergeRequestCommentsResponseBodyResultChildComments setCommentType(String commentType) {
            this.commentType = commentType;
            return this;
        }
        public String getCommentType() {
            return this.commentType;
        }

        public ListMergeRequestCommentsResponseBodyResultChildComments setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListMergeRequestCommentsResponseBodyResultChildComments setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public ListMergeRequestCommentsResponseBodyResultChildComments setFilePath(String filePath) {
            this.filePath = filePath;
            return this;
        }
        public String getFilePath() {
            return this.filePath;
        }

        public ListMergeRequestCommentsResponseBodyResultChildComments setFinalChildComments(java.util.List<ListMergeRequestCommentsResponseBodyResultChildCommentsFinalChildComments> finalChildComments) {
            this.finalChildComments = finalChildComments;
            return this;
        }
        public java.util.List<ListMergeRequestCommentsResponseBodyResultChildCommentsFinalChildComments> getFinalChildComments() {
            return this.finalChildComments;
        }

        public ListMergeRequestCommentsResponseBodyResultChildComments setLastEditTime(String lastEditTime) {
            this.lastEditTime = lastEditTime;
            return this;
        }
        public String getLastEditTime() {
            return this.lastEditTime;
        }

        public ListMergeRequestCommentsResponseBodyResultChildComments setLineNumber(String lineNumber) {
            this.lineNumber = lineNumber;
            return this;
        }
        public String getLineNumber() {
            return this.lineNumber;
        }

        public ListMergeRequestCommentsResponseBodyResultChildComments setParentCommentBizId(String parentCommentBizId) {
            this.parentCommentBizId = parentCommentBizId;
            return this;
        }
        public String getParentCommentBizId() {
            return this.parentCommentBizId;
        }

        public ListMergeRequestCommentsResponseBodyResultChildComments setRelatedPatchSet(ListMergeRequestCommentsResponseBodyResultChildCommentsRelatedPatchSet relatedPatchSet) {
            this.relatedPatchSet = relatedPatchSet;
            return this;
        }
        public ListMergeRequestCommentsResponseBodyResultChildCommentsRelatedPatchSet getRelatedPatchSet() {
            return this.relatedPatchSet;
        }

        public ListMergeRequestCommentsResponseBodyResultChildComments setResolved(Boolean resolved) {
            this.resolved = resolved;
            return this;
        }
        public Boolean getResolved() {
            return this.resolved;
        }

        public ListMergeRequestCommentsResponseBodyResultChildComments setRootCommentBizId(String rootCommentBizId) {
            this.rootCommentBizId = rootCommentBizId;
            return this;
        }
        public String getRootCommentBizId() {
            return this.rootCommentBizId;
        }

        public ListMergeRequestCommentsResponseBodyResultChildComments setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

    public static class ListMergeRequestCommentsResponseBodyResultRelatedPatchSet extends TeaModel {
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

        public static ListMergeRequestCommentsResponseBodyResultRelatedPatchSet build(java.util.Map<String, ?> map) throws Exception {
            ListMergeRequestCommentsResponseBodyResultRelatedPatchSet self = new ListMergeRequestCommentsResponseBodyResultRelatedPatchSet();
            return TeaModel.build(map, self);
        }

        public ListMergeRequestCommentsResponseBodyResultRelatedPatchSet setCommitId(String commitId) {
            this.commitId = commitId;
            return this;
        }
        public String getCommitId() {
            return this.commitId;
        }

        public ListMergeRequestCommentsResponseBodyResultRelatedPatchSet setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListMergeRequestCommentsResponseBodyResultRelatedPatchSet setPatchSetBizId(String patchSetBizId) {
            this.patchSetBizId = patchSetBizId;
            return this;
        }
        public String getPatchSetBizId() {
            return this.patchSetBizId;
        }

        public ListMergeRequestCommentsResponseBodyResultRelatedPatchSet setPatchSetName(String patchSetName) {
            this.patchSetName = patchSetName;
            return this;
        }
        public String getPatchSetName() {
            return this.patchSetName;
        }

        public ListMergeRequestCommentsResponseBodyResultRelatedPatchSet setPatchSetNo(String patchSetNo) {
            this.patchSetNo = patchSetNo;
            return this;
        }
        public String getPatchSetNo() {
            return this.patchSetNo;
        }

        public ListMergeRequestCommentsResponseBodyResultRelatedPatchSet setRelatedMergeItemType(String relatedMergeItemType) {
            this.relatedMergeItemType = relatedMergeItemType;
            return this;
        }
        public String getRelatedMergeItemType() {
            return this.relatedMergeItemType;
        }

        public ListMergeRequestCommentsResponseBodyResultRelatedPatchSet setShortId(String shortId) {
            this.shortId = shortId;
            return this;
        }
        public String getShortId() {
            return this.shortId;
        }

    }

    public static class ListMergeRequestCommentsResponseBodyResult extends TeaModel {
        @NameInMap("author")
        public ListMergeRequestCommentsResponseBodyResultAuthor author;

        @NameInMap("childComments")
        public java.util.List<ListMergeRequestCommentsResponseBodyResultChildComments> childComments;

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
        public ListMergeRequestCommentsResponseBodyResultRelatedPatchSet relatedPatchSet;

        @NameInMap("resolved")
        public Boolean resolved;

        @NameInMap("rootCommentBizId")
        public String rootCommentBizId;

        @NameInMap("state")
        public String state;

        public static ListMergeRequestCommentsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListMergeRequestCommentsResponseBodyResult self = new ListMergeRequestCommentsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListMergeRequestCommentsResponseBodyResult setAuthor(ListMergeRequestCommentsResponseBodyResultAuthor author) {
            this.author = author;
            return this;
        }
        public ListMergeRequestCommentsResponseBodyResultAuthor getAuthor() {
            return this.author;
        }

        public ListMergeRequestCommentsResponseBodyResult setChildComments(java.util.List<ListMergeRequestCommentsResponseBodyResultChildComments> childComments) {
            this.childComments = childComments;
            return this;
        }
        public java.util.List<ListMergeRequestCommentsResponseBodyResultChildComments> getChildComments() {
            return this.childComments;
        }

        public ListMergeRequestCommentsResponseBodyResult setCommentBizId(String commentBizId) {
            this.commentBizId = commentBizId;
            return this;
        }
        public String getCommentBizId() {
            return this.commentBizId;
        }

        public ListMergeRequestCommentsResponseBodyResult setCommentTime(String commentTime) {
            this.commentTime = commentTime;
            return this;
        }
        public String getCommentTime() {
            return this.commentTime;
        }

        public ListMergeRequestCommentsResponseBodyResult setCommentType(String commentType) {
            this.commentType = commentType;
            return this;
        }
        public String getCommentType() {
            return this.commentType;
        }

        public ListMergeRequestCommentsResponseBodyResult setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListMergeRequestCommentsResponseBodyResult setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public ListMergeRequestCommentsResponseBodyResult setFilePath(String filePath) {
            this.filePath = filePath;
            return this;
        }
        public String getFilePath() {
            return this.filePath;
        }

        public ListMergeRequestCommentsResponseBodyResult setLastEditTime(String lastEditTime) {
            this.lastEditTime = lastEditTime;
            return this;
        }
        public String getLastEditTime() {
            return this.lastEditTime;
        }

        public ListMergeRequestCommentsResponseBodyResult setLineNumber(String lineNumber) {
            this.lineNumber = lineNumber;
            return this;
        }
        public String getLineNumber() {
            return this.lineNumber;
        }

        public ListMergeRequestCommentsResponseBodyResult setParentCommentBizId(String parentCommentBizId) {
            this.parentCommentBizId = parentCommentBizId;
            return this;
        }
        public String getParentCommentBizId() {
            return this.parentCommentBizId;
        }

        public ListMergeRequestCommentsResponseBodyResult setRelatedPatchSet(ListMergeRequestCommentsResponseBodyResultRelatedPatchSet relatedPatchSet) {
            this.relatedPatchSet = relatedPatchSet;
            return this;
        }
        public ListMergeRequestCommentsResponseBodyResultRelatedPatchSet getRelatedPatchSet() {
            return this.relatedPatchSet;
        }

        public ListMergeRequestCommentsResponseBodyResult setResolved(Boolean resolved) {
            this.resolved = resolved;
            return this;
        }
        public Boolean getResolved() {
            return this.resolved;
        }

        public ListMergeRequestCommentsResponseBodyResult setRootCommentBizId(String rootCommentBizId) {
            this.rootCommentBizId = rootCommentBizId;
            return this;
        }
        public String getRootCommentBizId() {
            return this.rootCommentBizId;
        }

        public ListMergeRequestCommentsResponseBodyResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
