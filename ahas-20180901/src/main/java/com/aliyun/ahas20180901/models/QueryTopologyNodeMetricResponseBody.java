// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryTopologyNodeMetricResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<QueryTopologyNodeMetricResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryTopologyNodeMetricResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTopologyNodeMetricResponseBody self = new QueryTopologyNodeMetricResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTopologyNodeMetricResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryTopologyNodeMetricResponseBody setData(java.util.List<QueryTopologyNodeMetricResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryTopologyNodeMetricResponseBodyData> getData() {
        return this.data;
    }

    public QueryTopologyNodeMetricResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryTopologyNodeMetricResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTopologyNodeMetricResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryTopologyNodeMetricResponseBodyData extends TeaModel {
        @NameInMap("data")
        public java.util.Map<String, ?> data;

        @NameInMap("key")
        public String key;

        @NameInMap("label")
        public String label;

        @NameInMap("priority")
        public Integer priority;

        public static QueryTopologyNodeMetricResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryTopologyNodeMetricResponseBodyData self = new QueryTopologyNodeMetricResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryTopologyNodeMetricResponseBodyData setData(java.util.Map<String, ?> data) {
            this.data = data;
            return this;
        }
        public java.util.Map<String, ?> getData() {
            return this.data;
        }

        public QueryTopologyNodeMetricResponseBodyData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public QueryTopologyNodeMetricResponseBodyData setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTopologyNodeMetricResponseBodyData setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

    }

}
