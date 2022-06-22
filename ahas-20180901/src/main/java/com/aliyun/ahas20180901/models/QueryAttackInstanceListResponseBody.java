// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryAttackInstanceListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<QueryAttackInstanceListResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryAttackInstanceListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAttackInstanceListResponseBody self = new QueryAttackInstanceListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAttackInstanceListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryAttackInstanceListResponseBody setData(java.util.List<QueryAttackInstanceListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryAttackInstanceListResponseBodyData> getData() {
        return this.data;
    }

    public QueryAttackInstanceListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryAttackInstanceListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAttackInstanceListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryAttackInstanceListResponseBodyData extends TeaModel {
        @NameInMap("attackSuitInstanceId")
        public String attackSuitInstanceId;

        @NameInMap("durableTime")
        public String durableTime;

        @NameInMap("startTime")
        public Long startTime;

        public static QueryAttackInstanceListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryAttackInstanceListResponseBodyData self = new QueryAttackInstanceListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryAttackInstanceListResponseBodyData setAttackSuitInstanceId(String attackSuitInstanceId) {
            this.attackSuitInstanceId = attackSuitInstanceId;
            return this;
        }
        public String getAttackSuitInstanceId() {
            return this.attackSuitInstanceId;
        }

        public QueryAttackInstanceListResponseBodyData setDurableTime(String durableTime) {
            this.durableTime = durableTime;
            return this;
        }
        public String getDurableTime() {
            return this.durableTime;
        }

        public QueryAttackInstanceListResponseBodyData setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

}
