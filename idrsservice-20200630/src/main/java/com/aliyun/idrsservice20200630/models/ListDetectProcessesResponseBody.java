// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class ListDetectProcessesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListDetectProcessesResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static ListDetectProcessesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDetectProcessesResponseBody self = new ListDetectProcessesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDetectProcessesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDetectProcessesResponseBody setData(ListDetectProcessesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListDetectProcessesResponseBodyData getData() {
        return this.data;
    }

    public ListDetectProcessesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDetectProcessesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDetectProcessesResponseBodyDataItems extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("ContentAt")
        public String contentAt;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("Draft")
        public String draft;

        @NameInMap("DraftAt")
        public String draftAt;

        @NameInMap("FileUrl")
        public String fileUrl;

        /**
         * <p>ID</p>
         */
        @NameInMap("Id")
        public String id;

        @NameInMap("Md5")
        public String md5;

        @NameInMap("Name")
        public String name;

        @NameInMap("NewVersion")
        public Boolean newVersion;

        @NameInMap("Published")
        public Boolean published;

        @NameInMap("Type")
        public String type;

        @NameInMap("UpdatedAt")
        public String updatedAt;

        public static ListDetectProcessesResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListDetectProcessesResponseBodyDataItems self = new ListDetectProcessesResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public ListDetectProcessesResponseBodyDataItems setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListDetectProcessesResponseBodyDataItems setContentAt(String contentAt) {
            this.contentAt = contentAt;
            return this;
        }
        public String getContentAt() {
            return this.contentAt;
        }

        public ListDetectProcessesResponseBodyDataItems setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListDetectProcessesResponseBodyDataItems setDraft(String draft) {
            this.draft = draft;
            return this;
        }
        public String getDraft() {
            return this.draft;
        }

        public ListDetectProcessesResponseBodyDataItems setDraftAt(String draftAt) {
            this.draftAt = draftAt;
            return this;
        }
        public String getDraftAt() {
            return this.draftAt;
        }

        public ListDetectProcessesResponseBodyDataItems setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public ListDetectProcessesResponseBodyDataItems setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListDetectProcessesResponseBodyDataItems setMd5(String md5) {
            this.md5 = md5;
            return this;
        }
        public String getMd5() {
            return this.md5;
        }

        public ListDetectProcessesResponseBodyDataItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDetectProcessesResponseBodyDataItems setNewVersion(Boolean newVersion) {
            this.newVersion = newVersion;
            return this;
        }
        public Boolean getNewVersion() {
            return this.newVersion;
        }

        public ListDetectProcessesResponseBodyDataItems setPublished(Boolean published) {
            this.published = published;
            return this;
        }
        public Boolean getPublished() {
            return this.published;
        }

        public ListDetectProcessesResponseBodyDataItems setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListDetectProcessesResponseBodyDataItems setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

    }

    public static class ListDetectProcessesResponseBodyData extends TeaModel {
        @NameInMap("Items")
        public java.util.List<ListDetectProcessesResponseBodyDataItems> items;

        @NameInMap("TotalElements")
        public Long totalElements;

        @NameInMap("TotalPages")
        public Integer totalPages;

        public static ListDetectProcessesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDetectProcessesResponseBodyData self = new ListDetectProcessesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDetectProcessesResponseBodyData setItems(java.util.List<ListDetectProcessesResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListDetectProcessesResponseBodyDataItems> getItems() {
            return this.items;
        }

        public ListDetectProcessesResponseBodyData setTotalElements(Long totalElements) {
            this.totalElements = totalElements;
            return this;
        }
        public Long getTotalElements() {
            return this.totalElements;
        }

        public ListDetectProcessesResponseBodyData setTotalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }
        public Integer getTotalPages() {
            return this.totalPages;
        }

    }

}
