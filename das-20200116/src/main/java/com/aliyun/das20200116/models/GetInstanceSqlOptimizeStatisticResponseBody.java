// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetInstanceSqlOptimizeStatisticResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The details of the automatic SQL optimization events.</p>
     */
    @NameInMap("Data")
    public GetInstanceSqlOptimizeStatisticResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * <br>
     * <p>>  If the request was successful, **Successful** is returned. If the request failed, an error message such as an error code is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   **true**: The request was successful.</p>
     * <p>*   **false**: The request failed.</p>
     */
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
        /**
         * <p>The total number of automatic SQL optimization events.</p>
         */
        @NameInMap("count")
        public Integer count;

        /**
         * <p>The multiple of the maximum improvement for returned automatic SQL optimization events.</p>
         */
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
