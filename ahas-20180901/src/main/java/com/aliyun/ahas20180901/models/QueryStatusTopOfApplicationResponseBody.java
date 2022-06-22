// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryStatusTopOfApplicationResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<QueryStatusTopOfApplicationResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryStatusTopOfApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryStatusTopOfApplicationResponseBody self = new QueryStatusTopOfApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryStatusTopOfApplicationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryStatusTopOfApplicationResponseBody setData(java.util.List<QueryStatusTopOfApplicationResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryStatusTopOfApplicationResponseBodyData> getData() {
        return this.data;
    }

    public QueryStatusTopOfApplicationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryStatusTopOfApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryStatusTopOfApplicationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryStatusTopOfApplicationResponseBodyData extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("ProcessConfigurationId")
        public String processConfigurationId;

        @NameInMap("Time")
        public Long time;

        @NameInMap("Val")
        public Float val;

        public static QueryStatusTopOfApplicationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryStatusTopOfApplicationResponseBodyData self = new QueryStatusTopOfApplicationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryStatusTopOfApplicationResponseBodyData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public QueryStatusTopOfApplicationResponseBodyData setProcessConfigurationId(String processConfigurationId) {
            this.processConfigurationId = processConfigurationId;
            return this;
        }
        public String getProcessConfigurationId() {
            return this.processConfigurationId;
        }

        public QueryStatusTopOfApplicationResponseBodyData setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public QueryStatusTopOfApplicationResponseBodyData setVal(Float val) {
            this.val = val;
            return this;
        }
        public Float getVal() {
            return this.val;
        }

    }

}
