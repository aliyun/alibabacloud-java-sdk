// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class NodeExceptionStatisticsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<NodeExceptionStatisticsResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static NodeExceptionStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        NodeExceptionStatisticsResponseBody self = new NodeExceptionStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public NodeExceptionStatisticsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public NodeExceptionStatisticsResponseBody setData(java.util.List<NodeExceptionStatisticsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<NodeExceptionStatisticsResponseBodyData> getData() {
        return this.data;
    }

    public NodeExceptionStatisticsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public NodeExceptionStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public NodeExceptionStatisticsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AllNodeExceptionStatisticsResponseBodyData extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("Timestamp")
        public Long timestamp;

        public static AllNodeExceptionStatisticsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AllNodeExceptionStatisticsResponseBodyData self = new AllNodeExceptionStatisticsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AllNodeExceptionStatisticsResponseBodyData setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public AllNodeExceptionStatisticsResponseBodyData setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

    public static class NodeExceptionStatisticsResponseBodyData extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("Timestamp")
        public Long timestamp;

        public static NodeExceptionStatisticsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            NodeExceptionStatisticsResponseBodyData self = new NodeExceptionStatisticsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public NodeExceptionStatisticsResponseBodyData setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public NodeExceptionStatisticsResponseBodyData setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

}
