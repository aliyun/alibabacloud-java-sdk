// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetInstanceSqlOptimizeStatisticResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetInstanceSqlOptimizeStatisticResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static GetInstanceSqlOptimizeStatisticResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceSqlOptimizeStatisticResponseBody self = new GetInstanceSqlOptimizeStatisticResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceSqlOptimizeStatisticResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetInstanceSqlOptimizeStatisticResponseBody setData(GetInstanceSqlOptimizeStatisticResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetInstanceSqlOptimizeStatisticResponseBodyData getData() {
        return this.data;
    }

    public GetInstanceSqlOptimizeStatisticResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetInstanceSqlOptimizeStatisticResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInstanceSqlOptimizeStatisticResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetInstanceSqlOptimizeStatisticResponseBodyData extends TeaModel {
        @NameInMap("count")
        public Integer count;

        @NameInMap("improvement")
        public Double improvement;

        public static GetInstanceSqlOptimizeStatisticResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceSqlOptimizeStatisticResponseBodyData self = new GetInstanceSqlOptimizeStatisticResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetInstanceSqlOptimizeStatisticResponseBodyData setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public GetInstanceSqlOptimizeStatisticResponseBodyData setImprovement(Double improvement) {
            this.improvement = improvement;
            return this;
        }
        public Double getImprovement() {
            return this.improvement;
        }

    }

}
