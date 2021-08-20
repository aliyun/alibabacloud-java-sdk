// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class ListMergeRequestCommentsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Total")
    public Long total;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Result")
    public java.util.List<ListMergeRequestCommentsResponseBodyResult> result;

    public static ListMergeRequestCommentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMergeRequestCommentsResponseBody self = new ListMergeRequestCommentsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMergeRequestCommentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMergeRequestCommentsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListMergeRequestCommentsResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public ListMergeRequestCommentsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListMergeRequestCommentsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListMergeRequestCommentsResponseBody setResult(java.util.List<ListMergeRequestCommentsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListMergeRequestCommentsResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListMergeRequestCommentsResponseBodyResultAuthor extends TeaModel {
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

        public static ListMergeRequestCommentsResponseBodyResultAuthor build(java.util.Map<String, ?> map) throws Exception {
            ListMergeRequestCommentsResponseBodyResultAuthor self = new ListMergeRequestCommentsResponseBodyResultAuthor();
            return TeaModel.build(map, self);
        }

        public ListMergeRequestCommentsResponseBodyResultAuthor setExternUserId(String externUserId) {
            this.externUserId = externUserId;
            return this;
        }
        public String getExternUserId() {
            return this.externUserId;
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

        public ListMergeRequestCommentsResponseBodyResultAuthor setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public ListMergeRequestCommentsResponseBodyResultAuthor setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class ListMergeRequestCommentsResponseBodyResult extends TeaModel {
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
        public ListMergeRequestCommentsResponseBodyResultAuthor author;

        public static ListMergeRequestCommentsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListMergeRequestCommentsResponseBodyResult self = new ListMergeRequestCommentsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListMergeRequestCommentsResponseBodyResult setOutDated(Boolean outDated) {
            this.outDated = outDated;
            return this;
        }
        public Boolean getOutDated() {
            return this.outDated;
        }

        public ListMergeRequestCommentsResponseBodyResult setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListMergeRequestCommentsResponseBodyResult setRangeContext(String rangeContext) {
            this.rangeContext = rangeContext;
            return this;
        }
        public String getRangeContext() {
            return this.rangeContext;
        }

        public ListMergeRequestCommentsResponseBodyResult setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListMergeRequestCommentsResponseBodyResult setParentNoteId(Long parentNoteId) {
            this.parentNoteId = parentNoteId;
            return this;
        }
        public Long getParentNoteId() {
            return this.parentNoteId;
        }

        public ListMergeRequestCommentsResponseBodyResult setIsDraft(Boolean isDraft) {
            this.isDraft = isDraft;
            return this;
        }
        public Boolean getIsDraft() {
            return this.isDraft;
        }

        public ListMergeRequestCommentsResponseBodyResult setClosed(Integer closed) {
            this.closed = closed;
            return this;
        }
        public Integer getClosed() {
            return this.closed;
        }

        public ListMergeRequestCommentsResponseBodyResult setLine(Long line) {
            this.line = line;
            return this;
        }
        public Long getLine() {
            return this.line;
        }

        public ListMergeRequestCommentsResponseBodyResult setSide(String side) {
            this.side = side;
            return this;
        }
        public String getSide() {
            return this.side;
        }

        public ListMergeRequestCommentsResponseBodyResult setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ListMergeRequestCommentsResponseBodyResult setNote(String note) {
            this.note = note;
            return this;
        }
        public String getNote() {
            return this.note;
        }

        public ListMergeRequestCommentsResponseBodyResult setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public ListMergeRequestCommentsResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListMergeRequestCommentsResponseBodyResult setAuthor(ListMergeRequestCommentsResponseBodyResultAuthor author) {
            this.author = author;
            return this;
        }
        public ListMergeRequestCommentsResponseBodyResultAuthor getAuthor() {
            return this.author;
        }

    }

}
