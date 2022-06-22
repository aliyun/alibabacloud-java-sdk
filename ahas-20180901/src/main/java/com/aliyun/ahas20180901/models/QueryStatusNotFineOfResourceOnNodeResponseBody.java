// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryStatusNotFineOfResourceOnNodeResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<QueryStatusNotFineOfResourceOnNodeResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryStatusNotFineOfResourceOnNodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryStatusNotFineOfResourceOnNodeResponseBody self = new QueryStatusNotFineOfResourceOnNodeResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryStatusNotFineOfResourceOnNodeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryStatusNotFineOfResourceOnNodeResponseBody setData(java.util.List<QueryStatusNotFineOfResourceOnNodeResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryStatusNotFineOfResourceOnNodeResponseBodyData> getData() {
        return this.data;
    }

    public QueryStatusNotFineOfResourceOnNodeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryStatusNotFineOfResourceOnNodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryStatusNotFineOfResourceOnNodeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryStatusNotFineOfResourceOnNodeResponseBodyData extends TeaModel {
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

        public static QueryStatusNotFineOfResourceOnNodeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryStatusNotFineOfResourceOnNodeResponseBodyData self = new QueryStatusNotFineOfResourceOnNodeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryStatusNotFineOfResourceOnNodeResponseBodyData setErrorNum(Float errorNum) {
            this.errorNum = errorNum;
            return this;
        }
        public Float getErrorNum() {
            return this.errorNum;
        }

        public QueryStatusNotFineOfResourceOnNodeResponseBodyData setIs200(Float is200) {
            this.is200 = is200;
            return this;
        }
        public Float getIs200() {
            return this.is200;
        }

        public QueryStatusNotFineOfResourceOnNodeResponseBodyData setLike2xx(Float like2xx) {
            this.like2xx = like2xx;
            return this;
        }
        public Float getLike2xx() {
            return this.like2xx;
        }

        public QueryStatusNotFineOfResourceOnNodeResponseBodyData setLike3xx(Float like3xx) {
            this.like3xx = like3xx;
            return this;
        }
        public Float getLike3xx() {
            return this.like3xx;
        }

        public QueryStatusNotFineOfResourceOnNodeResponseBodyData setLike4xx(Float like4xx) {
            this.like4xx = like4xx;
            return this;
        }
        public Float getLike4xx() {
            return this.like4xx;
        }

        public QueryStatusNotFineOfResourceOnNodeResponseBodyData setLike5xx(Float like5xx) {
            this.like5xx = like5xx;
            return this;
        }
        public Float getLike5xx() {
            return this.like5xx;
        }

        public QueryStatusNotFineOfResourceOnNodeResponseBodyData setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

    }

}
