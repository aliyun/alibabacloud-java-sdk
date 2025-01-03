// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreateCommentResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Openapi.RequestError</p>
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
    public CreateCommentResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>284692704493684695</p>
         */
        @NameInMap("aliyunPk")
        public String aliyunPk;

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
         * <p>19927</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>test-codeup</p>
         */
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
         * <p>test-codeup</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>1a072f5367c21f9de3464b8c0ee8546e47764d2d</p>
         */
        @NameInMap("commitId")
        public String commitId;

        /**
         * <strong>example:</strong>
         * <p>2022-03-18 14:24:54</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <strong>example:</strong>
         * <p>513fcfd81a9142d2bb0db4f72c0aa15b</p>
         */
        @NameInMap("patchSetBizId")
        public String patchSetBizId;

        @NameInMap("patchSetName")
        public String patchSetName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("patchSetNo")
        public String patchSetNo;

        /**
         * <strong>example:</strong>
         * <p>MERGE_SOURCE</p>
         */
        @NameInMap("relatedMergeItemType")
        public String relatedMergeItemType;

        /**
         * <strong>example:</strong>
         * <p>1a072f53</p>
         */
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

        /**
         * <strong>example:</strong>
         * <p>5c399e3685e542a28db16d93e9f82abb</p>
         */
        @NameInMap("commentBizId")
        public String commentBizId;

        /**
         * <strong>example:</strong>
         * <p>2022-03-18 14:24:54</p>
         */
        @NameInMap("commentTime")
        public String commentTime;

        /**
         * <strong>example:</strong>
         * <p>GLOBAL_COMMENT</p>
         */
        @NameInMap("commentType")
        public String commentType;

        /**
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("deleted")
        public Boolean deleted;

        /**
         * <strong>example:</strong>
         * <p>src/main/update.txt</p>
         */
        @NameInMap("filePath")
        public String filePath;

        /**
         * <strong>example:</strong>
         * <p>2022-03-18 14:24:54</p>
         */
        @NameInMap("lastEditTime")
        public String lastEditTime;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("lineNumber")
        public String lineNumber;

        /**
         * <strong>example:</strong>
         * <p>4c5dcec6a8dc41e69c369737dadc1841</p>
         */
        @NameInMap("parentCommentBizId")
        public String parentCommentBizId;

        @NameInMap("relatedPatchSet")
        public CreateCommentResponseBodyResultRelatedPatchSet relatedPatchSet;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("resolved")
        public Boolean resolved;

        /**
         * <strong>example:</strong>
         * <p>dcf2b23cebfc418f98dbd35e423d9fd3</p>
         */
        @NameInMap("rootCommentBizId")
        public String rootCommentBizId;

        /**
         * <strong>example:</strong>
         * <p>OPENED</p>
         */
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
