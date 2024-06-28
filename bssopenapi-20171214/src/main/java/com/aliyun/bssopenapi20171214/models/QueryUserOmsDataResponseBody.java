// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryUserOmsDataResponseBody extends TeaModel {
    /**
     * <p>The status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public QueryUserOmsDataResponseBodyData data;

    /**
     * <p>The message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>Successful！</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>6000EE23-274B-4E07-A697-FF2E999520A4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryUserOmsDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryUserOmsDataResponseBody self = new QueryUserOmsDataResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryUserOmsDataResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryUserOmsDataResponseBody setData(QueryUserOmsDataResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryUserOmsDataResponseBodyData getData() {
        return this.data;
    }

    public QueryUserOmsDataResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryUserOmsDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryUserOmsDataResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryUserOmsDataResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the host.</p>
         * 
         * <strong>example:</strong>
         * <p>cn</p>
         */
        @NameInMap("HostId")
        public String hostId;

        /**
         * <p>Indicates that the returned usage data starts from the next page. If no value is returned for this parameter or this parameter is not returned, no data can be queried.</p>
         * 
         * <strong>example:</strong>
         * <p>NextToken</p>
         */
        @NameInMap("Marker")
        public String marker;

        @NameInMap("OmsData")
        public java.util.List<java.util.Map<String, ?>> omsData;

        public static QueryUserOmsDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryUserOmsDataResponseBodyData self = new QueryUserOmsDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryUserOmsDataResponseBodyData setHostId(String hostId) {
            this.hostId = hostId;
            return this;
        }
        public String getHostId() {
            return this.hostId;
        }

        public QueryUserOmsDataResponseBodyData setMarker(String marker) {
            this.marker = marker;
            return this;
        }
        public String getMarker() {
            return this.marker;
        }

        public QueryUserOmsDataResponseBodyData setOmsData(java.util.List<java.util.Map<String, ?>> omsData) {
            this.omsData = omsData;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getOmsData() {
            return this.omsData;
        }

    }

}
