// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class ListTasksResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public ListTasksResponseData data;

    public static ListTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTasksResponse self = new ListTasksResponse();
        return TeaModel.build(map, self);
    }

    public ListTasksResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListTasksResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListTasksResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTasksResponse setData(ListTasksResponseData data) {
        this.data = data;
        return this;
    }
    public ListTasksResponseData getData() {
        return this.data;
    }

    public static class ListTasksResponseDataItems extends TeaModel {
        @NameInMap("CreatedAt")
        @Validation(required = true)
        public String createdAt;

        @NameInMap("Id")
        @Validation(required = true)
        public String id;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("VideoMetaUrl")
        @Validation(required = true)
        public String videoMetaUrl;

        @NameInMap("VideoUrl")
        @Validation(required = true)
        public String videoUrl;

        public static ListTasksResponseDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListTasksResponseDataItems self = new ListTasksResponseDataItems();
            return TeaModel.build(map, self);
        }

        public ListTasksResponseDataItems setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListTasksResponseDataItems setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListTasksResponseDataItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListTasksResponseDataItems setVideoMetaUrl(String videoMetaUrl) {
            this.videoMetaUrl = videoMetaUrl;
            return this;
        }
        public String getVideoMetaUrl() {
            return this.videoMetaUrl;
        }

        public ListTasksResponseDataItems setVideoUrl(String videoUrl) {
            this.videoUrl = videoUrl;
            return this;
        }
        public String getVideoUrl() {
            return this.videoUrl;
        }

    }

    public static class ListTasksResponseData extends TeaModel {
        @NameInMap("TotalElements")
        @Validation(required = true)
        public Long totalElements;

        @NameInMap("TotalPages")
        @Validation(required = true)
        public Integer totalPages;

        @NameInMap("Items")
        @Validation(required = true)
        public java.util.List<ListTasksResponseDataItems> items;

        public static ListTasksResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListTasksResponseData self = new ListTasksResponseData();
            return TeaModel.build(map, self);
        }

        public ListTasksResponseData setTotalElements(Long totalElements) {
            this.totalElements = totalElements;
            return this;
        }
        public Long getTotalElements() {
            return this.totalElements;
        }

        public ListTasksResponseData setTotalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }
        public Integer getTotalPages() {
            return this.totalPages;
        }

        public ListTasksResponseData setItems(java.util.List<ListTasksResponseDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListTasksResponseDataItems> getItems() {
            return this.items;
        }

    }

}
