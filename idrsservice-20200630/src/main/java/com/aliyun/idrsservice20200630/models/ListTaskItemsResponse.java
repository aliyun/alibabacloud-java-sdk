// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class ListTaskItemsResponse extends TeaModel {
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
    public java.util.List<ListTaskItemsResponseData> data;

    public static ListTaskItemsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTaskItemsResponse self = new ListTaskItemsResponse();
        return TeaModel.build(map, self);
    }

    public ListTaskItemsResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListTaskItemsResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListTaskItemsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTaskItemsResponse setData(java.util.List<ListTaskItemsResponseData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListTaskItemsResponseData> getData() {
        return this.data;
    }

    public static class ListTaskItemsResponseData extends TeaModel {
        @NameInMap("CreatedAt")
        @Validation(required = true)
        public String createdAt;

        @NameInMap("Message")
        @Validation(required = true)
        public String message;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Output")
        @Validation(required = true)
        public String output;

        @NameInMap("SegmentSeq")
        @Validation(required = true)
        public Long segmentSeq;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        public static ListTaskItemsResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListTaskItemsResponseData self = new ListTaskItemsResponseData();
            return TeaModel.build(map, self);
        }

        public ListTaskItemsResponseData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListTaskItemsResponseData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListTaskItemsResponseData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListTaskItemsResponseData setOutput(String output) {
            this.output = output;
            return this;
        }
        public String getOutput() {
            return this.output;
        }

        public ListTaskItemsResponseData setSegmentSeq(Long segmentSeq) {
            this.segmentSeq = segmentSeq;
            return this;
        }
        public Long getSegmentSeq() {
            return this.segmentSeq;
        }

        public ListTaskItemsResponseData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
