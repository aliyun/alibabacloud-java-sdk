// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class QueryAvailabilityResponseBody extends TeaModel {
    @NameInMap("Data")
    public QueryAvailabilityResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>CityCodeRequired</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>城市编码不能为空</p>
     */
    @NameInMap("ErrorMsg")
    public String errorMsg;

    /**
     * <strong>example:</strong>
     * <p>260E4F99-983D-1919-834C-5C42E98E5B2B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>traceId</p>
     */
    @NameInMap("TracerId")
    public String tracerId;

    public static QueryAvailabilityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAvailabilityResponseBody self = new QueryAvailabilityResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAvailabilityResponseBody setData(QueryAvailabilityResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryAvailabilityResponseBodyData getData() {
        return this.data;
    }

    public QueryAvailabilityResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public QueryAvailabilityResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public QueryAvailabilityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAvailabilityResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryAvailabilityResponseBody setTracerId(String tracerId) {
        this.tracerId = tracerId;
        return this;
    }
    public String getTracerId() {
        return this.tracerId;
    }

    public static class QueryAvailabilityResponseBodyData extends TeaModel {
        @NameInMap("Hotels")
        public java.util.Map<String, java.util.List<DataHotelsValue>> hotels;

        /**
         * <strong>example:</strong>
         * <p>traceId</p>
         */
        @NameInMap("TracerId")
        public String tracerId;

        public static QueryAvailabilityResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryAvailabilityResponseBodyData self = new QueryAvailabilityResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryAvailabilityResponseBodyData setHotels(java.util.Map<String, java.util.List<DataHotelsValue>> hotels) {
            this.hotels = hotels;
            return this;
        }
        public java.util.Map<String, java.util.List<DataHotelsValue>> getHotels() {
            return this.hotels;
        }

        public QueryAvailabilityResponseBodyData setTracerId(String tracerId) {
            this.tracerId = tracerId;
            return this;
        }
        public String getTracerId() {
            return this.tracerId;
        }

    }

}
