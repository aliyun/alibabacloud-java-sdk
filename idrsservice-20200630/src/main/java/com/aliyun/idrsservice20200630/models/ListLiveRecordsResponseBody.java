// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class ListLiveRecordsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListLiveRecordsResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static ListLiveRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLiveRecordsResponseBody self = new ListLiveRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLiveRecordsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListLiveRecordsResponseBody setData(ListLiveRecordsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListLiveRecordsResponseBodyData getData() {
        return this.data;
    }

    public ListLiveRecordsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListLiveRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListLiveRecordsResponseBodyDataItems extends TeaModel {
        @NameInMap("Channel")
        public String channel;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("Id")
        public String id;

        @NameInMap("SourceType")
        public Long sourceType;

        @NameInMap("VideoUrl")
        public String videoUrl;

        public static ListLiveRecordsResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListLiveRecordsResponseBodyDataItems self = new ListLiveRecordsResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public ListLiveRecordsResponseBodyDataItems setChannel(String channel) {
            this.channel = channel;
            return this;
        }
        public String getChannel() {
            return this.channel;
        }

        public ListLiveRecordsResponseBodyDataItems setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListLiveRecordsResponseBodyDataItems setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListLiveRecordsResponseBodyDataItems setSourceType(Long sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public Long getSourceType() {
            return this.sourceType;
        }

        public ListLiveRecordsResponseBodyDataItems setVideoUrl(String videoUrl) {
            this.videoUrl = videoUrl;
            return this;
        }
        public String getVideoUrl() {
            return this.videoUrl;
        }

    }

    public static class ListLiveRecordsResponseBodyData extends TeaModel {
        @NameInMap("Items")
        public java.util.List<ListLiveRecordsResponseBodyDataItems> items;

        @NameInMap("TotalElements")
        public Long totalElements;

        @NameInMap("TotalPages")
        public Integer totalPages;

        public static ListLiveRecordsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListLiveRecordsResponseBodyData self = new ListLiveRecordsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListLiveRecordsResponseBodyData setItems(java.util.List<ListLiveRecordsResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListLiveRecordsResponseBodyDataItems> getItems() {
            return this.items;
        }

        public ListLiveRecordsResponseBodyData setTotalElements(Long totalElements) {
            this.totalElements = totalElements;
            return this;
        }
        public Long getTotalElements() {
            return this.totalElements;
        }

        public ListLiveRecordsResponseBodyData setTotalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }
        public Integer getTotalPages() {
            return this.totalPages;
        }

    }

}
