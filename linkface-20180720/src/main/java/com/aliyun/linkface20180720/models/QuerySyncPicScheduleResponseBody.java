// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkface20180720.models;

import com.aliyun.tea.*;

public class QuerySyncPicScheduleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public QuerySyncPicScheduleResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>9CA3B1E8-2A1C-4702-995F-B54BC6DE80BB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QuerySyncPicScheduleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySyncPicScheduleResponseBody self = new QuerySyncPicScheduleResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySyncPicScheduleResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public QuerySyncPicScheduleResponseBody setData(QuerySyncPicScheduleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QuerySyncPicScheduleResponseBodyData getData() {
        return this.data;
    }

    public QuerySyncPicScheduleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QuerySyncPicScheduleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySyncPicScheduleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QuerySyncPicScheduleResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>34.56</p>
         */
        @NameInMap("Rate")
        public Float rate;

        public static QuerySyncPicScheduleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QuerySyncPicScheduleResponseBodyData self = new QuerySyncPicScheduleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QuerySyncPicScheduleResponseBodyData setRate(Float rate) {
            this.rate = rate;
            return this;
        }
        public Float getRate() {
            return this.rate;
        }

    }

}
