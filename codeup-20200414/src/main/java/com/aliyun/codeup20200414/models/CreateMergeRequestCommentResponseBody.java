// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class CreateMergeRequestCommentResponseBody extends TeaModel {
    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Result")
    public CreateMergeRequestCommentResponseBodyResult result;

    public static CreateMergeRequestCommentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMergeRequestCommentResponseBody self = new CreateMergeRequestCommentResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMergeRequestCommentResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateMergeRequestCommentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateMergeRequestCommentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateMergeRequestCommentResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateMergeRequestCommentResponseBody setResult(CreateMergeRequestCommentResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateMergeRequestCommentResponseBodyResult getResult() {
        return this.result;
    }

    public static class CreateMergeRequestCommentResponseBodyResultAuthor extends TeaModel {
        @NameInMap("ExternUserId")
        public String externUserId;

        @NameInMap("Email")
        public String email;

        @NameInMap("Name")
        public String name;

        @NameInMap("AvatarUrl")
        public String avatarUrl;

        @NameInMap("Id")
        public Long id;

        public static CreateMergeRequestCommentResponseBodyResultAuthor build(java.util.Map<String, ?> map) throws Exception {
            CreateMergeRequestCommentResponseBodyResultAuthor self = new CreateMergeRequestCommentResponseBodyResultAuthor();
            return TeaModel.build(map, self);
        }

        public CreateMergeRequestCommentResponseBodyResultAuthor setExternUserId(String externUserId) {
            this.externUserId = externUserId;
            return this;
        }
        public String getExternUserId() {
            return this.externUserId;
        }

        public CreateMergeRequestCommentResponseBodyResultAuthor setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public CreateMergeRequestCommentResponseBodyResultAuthor setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateMergeRequestCommentResponseBodyResultAuthor setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public CreateMergeRequestCommentResponseBodyResultAuthor setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class CreateMergeRequestCommentResponseBodyResult extends TeaModel {
        @NameInMap("OutDated")
        public Boolean outDated;

        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("RangeContext")
        public String rangeContext;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("ParentNoteId")
        public Long parentNoteId;

        @NameInMap("IsDraft")
        public Boolean isDraft;

        @NameInMap("Closed")
        public Integer closed;

        @NameInMap("Line")
        public Long line;

        @NameInMap("Side")
        public String side;

        @NameInMap("Path")
        public String path;

        @NameInMap("Note")
        public String note;

        @NameInMap("UpdatedAt")
        public String updatedAt;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Author")
        public CreateMergeRequestCommentResponseBodyResultAuthor author;

        public static CreateMergeRequestCommentResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateMergeRequestCommentResponseBodyResult self = new CreateMergeRequestCommentResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateMergeRequestCommentResponseBodyResult setOutDated(Boolean outDated) {
            this.outDated = outDated;
            return this;
        }
        public Boolean getOutDated() {
            return this.outDated;
        }

        public CreateMergeRequestCommentResponseBodyResult setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public CreateMergeRequestCommentResponseBodyResult setRangeContext(String rangeContext) {
            this.rangeContext = rangeContext;
            return this;
        }
        public String getRangeContext() {
            return this.rangeContext;
        }

        public CreateMergeRequestCommentResponseBodyResult setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public CreateMergeRequestCommentResponseBodyResult setParentNoteId(Long parentNoteId) {
            this.parentNoteId = parentNoteId;
            return this;
        }
        public Long getParentNoteId() {
            return this.parentNoteId;
        }

        public CreateMergeRequestCommentResponseBodyResult setIsDraft(Boolean isDraft) {
            this.isDraft = isDraft;
            return this;
        }
        public Boolean getIsDraft() {
            return this.isDraft;
        }

        public CreateMergeRequestCommentResponseBodyResult setClosed(Integer closed) {
            this.closed = closed;
            return this;
        }
        public Integer getClosed() {
            return this.closed;
        }

        public CreateMergeRequestCommentResponseBodyResult setLine(Long line) {
            this.line = line;
            return this;
        }
        public Long getLine() {
            return this.line;
        }

        public CreateMergeRequestCommentResponseBodyResult setSide(String side) {
            this.side = side;
            return this;
        }
        public String getSide() {
            return this.side;
        }

        public CreateMergeRequestCommentResponseBodyResult setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public CreateMergeRequestCommentResponseBodyResult setNote(String note) {
            this.note = note;
            return this;
        }
        public String getNote() {
            return this.note;
        }

        public CreateMergeRequestCommentResponseBodyResult setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public CreateMergeRequestCommentResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CreateMergeRequestCommentResponseBodyResult setAuthor(CreateMergeRequestCommentResponseBodyResultAuthor author) {
            this.author = author;
            return this;
        }
        public CreateMergeRequestCommentResponseBodyResultAuthor getAuthor() {
            return this.author;
        }

    }

}
