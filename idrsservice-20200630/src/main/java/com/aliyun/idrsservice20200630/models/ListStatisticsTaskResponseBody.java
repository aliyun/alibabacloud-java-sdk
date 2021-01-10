// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class ListStatisticsTaskResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public ListStatisticsTaskResponseBodyData data;

    @NameInMap("Code")
    public String code;

    public static ListStatisticsTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListStatisticsTaskResponseBody self = new ListStatisticsTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public ListStatisticsTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListStatisticsTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListStatisticsTaskResponseBody setData(ListStatisticsTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListStatisticsTaskResponseBodyData getData() {
        return this.data;
    }

    public ListStatisticsTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class ListStatisticsTaskResponseBodyDataItems extends TeaModel {
        @NameInMap("Status")
        public Integer status;

        @NameInMap("FileUrl")
        public String fileUrl;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("Name")
        public String name;

        public static ListStatisticsTaskResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListStatisticsTaskResponseBodyDataItems self = new ListStatisticsTaskResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public ListStatisticsTaskResponseBodyDataItems setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListStatisticsTaskResponseBodyDataItems setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public ListStatisticsTaskResponseBodyDataItems setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListStatisticsTaskResponseBodyDataItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListStatisticsTaskResponseBodyData extends TeaModel {
        @NameInMap("Items")
        public java.util.List<ListStatisticsTaskResponseBodyDataItems> items;

        @NameInMap("TotalPages")
        public Integer totalPages;

        @NameInMap("TotalElements")
        public Long totalElements;

        public static ListStatisticsTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListStatisticsTaskResponseBodyData self = new ListStatisticsTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListStatisticsTaskResponseBodyData setItems(java.util.List<ListStatisticsTaskResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListStatisticsTaskResponseBodyDataItems> getItems() {
            return this.items;
        }

        public ListStatisticsTaskResponseBodyData setTotalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }
        public Integer getTotalPages() {
            return this.totalPages;
        }

        public ListStatisticsTaskResponseBodyData setTotalElements(Long totalElements) {
            this.totalElements = totalElements;
            return this;
        }
        public Long getTotalElements() {
            return this.totalElements;
        }

    }

}
