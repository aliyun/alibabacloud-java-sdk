// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryStatusNotFineOfApplicationResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<QueryStatusNotFineOfApplicationResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryStatusNotFineOfApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryStatusNotFineOfApplicationResponseBody self = new QueryStatusNotFineOfApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryStatusNotFineOfApplicationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryStatusNotFineOfApplicationResponseBody setData(java.util.List<QueryStatusNotFineOfApplicationResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryStatusNotFineOfApplicationResponseBodyData> getData() {
        return this.data;
    }

    public QueryStatusNotFineOfApplicationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryStatusNotFineOfApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryStatusNotFineOfApplicationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryStatusNotFineOfApplicationResponseBodyData extends TeaModel {
        @NameInMap("ErrorNum")
        public Float errorNum;

        @NameInMap("Is200")
        public Float is200;

        @NameInMap("Like2xx")
        public Float like2xx;

        @NameInMap("Like3xx")
        public Float like3xx;

        @NameInMap("Like4xx")
        public Float like4xx;

        @NameInMap("Like5xx")
        public Float like5xx;

        @NameInMap("Time")
        public Long time;

        public static QueryStatusNotFineOfApplicationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryStatusNotFineOfApplicationResponseBodyData self = new QueryStatusNotFineOfApplicationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryStatusNotFineOfApplicationResponseBodyData setErrorNum(Float errorNum) {
            this.errorNum = errorNum;
            return this;
        }
        public Float getErrorNum() {
            return this.errorNum;
        }

        public QueryStatusNotFineOfApplicationResponseBodyData setIs200(Float is200) {
            this.is200 = is200;
            return this;
        }
        public Float getIs200() {
            return this.is200;
        }

        public QueryStatusNotFineOfApplicationResponseBodyData setLike2xx(Float like2xx) {
            this.like2xx = like2xx;
            return this;
        }
        public Float getLike2xx() {
            return this.like2xx;
        }

        public QueryStatusNotFineOfApplicationResponseBodyData setLike3xx(Float like3xx) {
            this.like3xx = like3xx;
            return this;
        }
        public Float getLike3xx() {
            return this.like3xx;
        }

        public QueryStatusNotFineOfApplicationResponseBodyData setLike4xx(Float like4xx) {
            this.like4xx = like4xx;
            return this;
        }
        public Float getLike4xx() {
            return this.like4xx;
        }

        public QueryStatusNotFineOfApplicationResponseBodyData setLike5xx(Float like5xx) {
            this.like5xx = like5xx;
            return this;
        }
        public Float getLike5xx() {
            return this.like5xx;
        }

        public QueryStatusNotFineOfApplicationResponseBodyData setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

    }

}
