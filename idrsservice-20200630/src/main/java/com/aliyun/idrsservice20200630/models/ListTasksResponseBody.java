// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class ListTasksResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    /**
     * <p>-</p>
     */
    @NameInMap("Data")
    public ListTasksResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static ListTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTasksResponseBody self = new ListTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTasksResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListTasksResponseBody setData(ListTasksResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListTasksResponseBodyData getData() {
        return this.data;
    }

    public ListTasksResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListTasksResponseBodyDataItems extends TeaModel {
        @NameInMap("CreatedAt")
        public String createdAt;

        /**
         * <p>ID</p>
         */
        @NameInMap("Id")
        public String id;

        @NameInMap("Status")
        public String status;

        @NameInMap("VideoMetaUrl")
        public String videoMetaUrl;

        @NameInMap("VideoUrl")
        public String videoUrl;

        public static ListTasksResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListTasksResponseBodyDataItems self = new ListTasksResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public ListTasksResponseBodyDataItems setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListTasksResponseBodyDataItems setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListTasksResponseBodyDataItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListTasksResponseBodyDataItems setVideoMetaUrl(String videoMetaUrl) {
            this.videoMetaUrl = videoMetaUrl;
            return this;
        }
        public String getVideoMetaUrl() {
            return this.videoMetaUrl;
        }

        public ListTasksResponseBodyDataItems setVideoUrl(String videoUrl) {
            this.videoUrl = videoUrl;
            return this;
        }
        public String getVideoUrl() {
            return this.videoUrl;
        }

    }

    public static class ListTasksResponseBodyData extends TeaModel {
        @NameInMap("Items")
        public java.util.List<ListTasksResponseBodyDataItems> items;

        @NameInMap("TotalElements")
        public Long totalElements;

        @NameInMap("TotalPages")
        public Integer totalPages;

        public static ListTasksResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListTasksResponseBodyData self = new ListTasksResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListTasksResponseBodyData setItems(java.util.List<ListTasksResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListTasksResponseBodyDataItems> getItems() {
            return this.items;
        }

        public ListTasksResponseBodyData setTotalElements(Long totalElements) {
            this.totalElements = totalElements;
            return this;
        }
        public Long getTotalElements() {
            return this.totalElements;
        }

        public ListTasksResponseBodyData setTotalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }
        public Integer getTotalPages() {
            return this.totalPages;
        }

    }

}
