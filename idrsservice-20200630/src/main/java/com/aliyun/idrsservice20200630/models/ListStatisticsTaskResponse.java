// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class ListStatisticsTaskResponse extends TeaModel {
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
    public ListStatisticsTaskResponseData data;

    public static ListStatisticsTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ListStatisticsTaskResponse self = new ListStatisticsTaskResponse();
        return TeaModel.build(map, self);
    }

    public ListStatisticsTaskResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListStatisticsTaskResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListStatisticsTaskResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListStatisticsTaskResponse setData(ListStatisticsTaskResponseData data) {
        this.data = data;
        return this;
    }
    public ListStatisticsTaskResponseData getData() {
        return this.data;
    }

    public static class ListStatisticsTaskResponseDataItems extends TeaModel {
        @NameInMap("CreatedAt")
        @Validation(required = true)
        public String createdAt;

        @NameInMap("FileUrl")
        @Validation(required = true)
        public String fileUrl;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Status")
        @Validation(required = true)
        public Integer status;

        public static ListStatisticsTaskResponseDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListStatisticsTaskResponseDataItems self = new ListStatisticsTaskResponseDataItems();
            return TeaModel.build(map, self);
        }

        public ListStatisticsTaskResponseDataItems setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListStatisticsTaskResponseDataItems setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public ListStatisticsTaskResponseDataItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListStatisticsTaskResponseDataItems setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

    public static class ListStatisticsTaskResponseData extends TeaModel {
        @NameInMap("TotalElements")
        @Validation(required = true)
        public Long totalElements;

        @NameInMap("TotalPages")
        @Validation(required = true)
        public Integer totalPages;

        @NameInMap("Items")
        @Validation(required = true)
        public java.util.List<ListStatisticsTaskResponseDataItems> items;

        public static ListStatisticsTaskResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListStatisticsTaskResponseData self = new ListStatisticsTaskResponseData();
            return TeaModel.build(map, self);
        }

        public ListStatisticsTaskResponseData setTotalElements(Long totalElements) {
            this.totalElements = totalElements;
            return this;
        }
        public Long getTotalElements() {
            return this.totalElements;
        }

        public ListStatisticsTaskResponseData setTotalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }
        public Integer getTotalPages() {
            return this.totalPages;
        }

        public ListStatisticsTaskResponseData setItems(java.util.List<ListStatisticsTaskResponseDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListStatisticsTaskResponseDataItems> getItems() {
            return this.items;
        }

    }

}
