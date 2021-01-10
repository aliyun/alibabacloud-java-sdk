// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class ListTaskItemsResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public java.util.List<ListTaskItemsResponseBodyData> data;

    @NameInMap("Code")
    public String code;

    public static ListTaskItemsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTaskItemsResponseBody self = new ListTaskItemsResponseBody();
        return TeaModel.build(map, self);
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

    public ListTaskItemsResponseBody setData(java.util.List<ListTaskItemsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListTaskItemsResponseBodyData> getData() {
        return this.data;
    }

    public ListTaskItemsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class ListTaskItemsResponseBodyData extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("Message")
        public String message;

        @NameInMap("Output")
        public String output;

        @NameInMap("Name")
        public String name;

        @NameInMap("SegmentSeq")
        public Long segmentSeq;

        public static ListTaskItemsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListTaskItemsResponseBodyData self = new ListTaskItemsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListTaskItemsResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
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

        public ListTaskItemsResponseBodyData setOutput(String output) {
            this.output = output;
            return this;
        }
        public String getOutput() {
            return this.output;
        }

        public ListTaskItemsResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListTaskItemsResponseBodyData setSegmentSeq(Long segmentSeq) {
            this.segmentSeq = segmentSeq;
            return this;
        }
        public Long getSegmentSeq() {
            return this.segmentSeq;
        }

    }

}
