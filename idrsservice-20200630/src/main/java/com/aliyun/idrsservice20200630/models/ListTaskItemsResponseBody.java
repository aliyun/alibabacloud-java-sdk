// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class ListTaskItemsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListTaskItemsResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static ListTaskItemsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTaskItemsResponseBody self = new ListTaskItemsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTaskItemsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListTaskItemsResponseBody setData(java.util.List<ListTaskItemsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListTaskItemsResponseBodyData> getData() {
        return this.data;
    }

    public ListTaskItemsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListTaskItemsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListTaskItemsResponseBodyData extends TeaModel {
        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("Message")
        public String message;

        @NameInMap("Name")
        public String name;

        @NameInMap("Output")
        public String output;

        @NameInMap("SegmentSeq")
        public Long segmentSeq;

        @NameInMap("Status")
        public String status;

        public static ListTaskItemsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListTaskItemsResponseBodyData self = new ListTaskItemsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListTaskItemsResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListTaskItemsResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListTaskItemsResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListTaskItemsResponseBodyData setOutput(String output) {
            this.output = output;
            return this;
        }
        public String getOutput() {
            return this.output;
        }

        public ListTaskItemsResponseBodyData setSegmentSeq(Long segmentSeq) {
            this.segmentSeq = segmentSeq;
            return this;
        }
        public Long getSegmentSeq() {
            return this.segmentSeq;
        }

        public ListTaskItemsResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
