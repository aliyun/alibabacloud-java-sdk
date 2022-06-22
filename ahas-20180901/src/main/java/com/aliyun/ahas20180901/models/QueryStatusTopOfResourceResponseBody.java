// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryStatusTopOfResourceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<QueryStatusTopOfResourceResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryStatusTopOfResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryStatusTopOfResourceResponseBody self = new QueryStatusTopOfResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryStatusTopOfResourceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryStatusTopOfResourceResponseBody setData(java.util.List<QueryStatusTopOfResourceResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryStatusTopOfResourceResponseBodyData> getData() {
        return this.data;
    }

    public QueryStatusTopOfResourceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryStatusTopOfResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryStatusTopOfResourceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryStatusTopOfResourceResponseBodyData extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("ProcessConfigurationId")
        public String processConfigurationId;

        @NameInMap("Time")
        public Long time;

        @NameInMap("Val")
        public Float val;

        public static QueryStatusTopOfResourceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryStatusTopOfResourceResponseBodyData self = new QueryStatusTopOfResourceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryStatusTopOfResourceResponseBodyData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public QueryStatusTopOfResourceResponseBodyData setProcessConfigurationId(String processConfigurationId) {
            this.processConfigurationId = processConfigurationId;
            return this;
        }
        public String getProcessConfigurationId() {
            return this.processConfigurationId;
        }

        public QueryStatusTopOfResourceResponseBodyData setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public QueryStatusTopOfResourceResponseBodyData setVal(Float val) {
            this.val = val;
            return this;
        }
        public Float getVal() {
            return this.val;
        }

    }

}
