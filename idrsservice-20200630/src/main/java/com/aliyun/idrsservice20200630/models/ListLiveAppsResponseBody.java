// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class ListLiveAppsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListLiveAppsResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static ListLiveAppsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLiveAppsResponseBody self = new ListLiveAppsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLiveAppsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListLiveAppsResponseBody setData(ListLiveAppsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListLiveAppsResponseBodyData getData() {
        return this.data;
    }

    public ListLiveAppsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListLiveAppsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListLiveAppsResponseBodyDataItems extends TeaModel {
        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("RtcCode")
        public String rtcCode;

        public static ListLiveAppsResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListLiveAppsResponseBodyDataItems self = new ListLiveAppsResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public ListLiveAppsResponseBodyDataItems setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListLiveAppsResponseBodyDataItems setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListLiveAppsResponseBodyDataItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListLiveAppsResponseBodyDataItems setRtcCode(String rtcCode) {
            this.rtcCode = rtcCode;
            return this;
        }
        public String getRtcCode() {
            return this.rtcCode;
        }

    }

    public static class ListLiveAppsResponseBodyData extends TeaModel {
        @NameInMap("Items")
        public java.util.List<ListLiveAppsResponseBodyDataItems> items;

        @NameInMap("TotalElements")
        public Long totalElements;

        @NameInMap("TotalPages")
        public Integer totalPages;

        public static ListLiveAppsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListLiveAppsResponseBodyData self = new ListLiveAppsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListLiveAppsResponseBodyData setItems(java.util.List<ListLiveAppsResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListLiveAppsResponseBodyDataItems> getItems() {
            return this.items;
        }

        public ListLiveAppsResponseBodyData setTotalElements(Long totalElements) {
            this.totalElements = totalElements;
            return this;
        }
        public Long getTotalElements() {
            return this.totalElements;
        }

        public ListLiveAppsResponseBodyData setTotalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }
        public Integer getTotalPages() {
            return this.totalPages;
        }

    }

}
