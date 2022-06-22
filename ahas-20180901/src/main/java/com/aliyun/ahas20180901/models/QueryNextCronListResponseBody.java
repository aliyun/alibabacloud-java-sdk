// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryNextCronListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<QueryNextCronListResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryNextCronListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryNextCronListResponseBody self = new QueryNextCronListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryNextCronListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryNextCronListResponseBody setData(java.util.List<QueryNextCronListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryNextCronListResponseBodyData> getData() {
        return this.data;
    }

    public QueryNextCronListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryNextCronListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryNextCronListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryNextCronListResponseBodyData extends TeaModel {
        @NameInMap("Expression")
        public String expression;

        @NameInMap("RepeatTime")
        public java.util.List<String> repeatTime;

        @NameInMap("TimeList")
        public java.util.List<String> timeList;

        @NameInMap("Valid")
        public Boolean valid;

        public static QueryNextCronListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryNextCronListResponseBodyData self = new QueryNextCronListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryNextCronListResponseBodyData setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public QueryNextCronListResponseBodyData setRepeatTime(java.util.List<String> repeatTime) {
            this.repeatTime = repeatTime;
            return this;
        }
        public java.util.List<String> getRepeatTime() {
            return this.repeatTime;
        }

        public QueryNextCronListResponseBodyData setTimeList(java.util.List<String> timeList) {
            this.timeList = timeList;
            return this;
        }
        public java.util.List<String> getTimeList() {
            return this.timeList;
        }

        public QueryNextCronListResponseBodyData setValid(Boolean valid) {
            this.valid = valid;
            return this;
        }
        public Boolean getValid() {
            return this.valid;
        }

    }

}
