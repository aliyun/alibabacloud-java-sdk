// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class ListLiveRecordTemplatesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListLiveRecordTemplatesResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static ListLiveRecordTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLiveRecordTemplatesResponseBody self = new ListLiveRecordTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLiveRecordTemplatesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListLiveRecordTemplatesResponseBody setData(ListLiveRecordTemplatesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListLiveRecordTemplatesResponseBodyData getData() {
        return this.data;
    }

    public ListLiveRecordTemplatesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListLiveRecordTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListLiveRecordTemplatesResponseBodyDataItems extends TeaModel {
        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("RtcCode")
        public String rtcCode;

        @NameInMap("UpdatedAt")
        public String updatedAt;

        public static ListLiveRecordTemplatesResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListLiveRecordTemplatesResponseBodyDataItems self = new ListLiveRecordTemplatesResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public ListLiveRecordTemplatesResponseBodyDataItems setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListLiveRecordTemplatesResponseBodyDataItems setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListLiveRecordTemplatesResponseBodyDataItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListLiveRecordTemplatesResponseBodyDataItems setRtcCode(String rtcCode) {
            this.rtcCode = rtcCode;
            return this;
        }
        public String getRtcCode() {
            return this.rtcCode;
        }

        public ListLiveRecordTemplatesResponseBodyDataItems setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

    }

    public static class ListLiveRecordTemplatesResponseBodyData extends TeaModel {
        @NameInMap("Items")
        public java.util.List<ListLiveRecordTemplatesResponseBodyDataItems> items;

        @NameInMap("TotalElements")
        public Long totalElements;

        @NameInMap("TotalPages")
        public Integer totalPages;

        public static ListLiveRecordTemplatesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListLiveRecordTemplatesResponseBodyData self = new ListLiveRecordTemplatesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListLiveRecordTemplatesResponseBodyData setItems(java.util.List<ListLiveRecordTemplatesResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListLiveRecordTemplatesResponseBodyDataItems> getItems() {
            return this.items;
        }

        public ListLiveRecordTemplatesResponseBodyData setTotalElements(Long totalElements) {
            this.totalElements = totalElements;
            return this;
        }
        public Long getTotalElements() {
            return this.totalElements;
        }

        public ListLiveRecordTemplatesResponseBodyData setTotalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }
        public Integer getTotalPages() {
            return this.totalPages;
        }

    }

}
