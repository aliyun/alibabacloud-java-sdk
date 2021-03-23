// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryUserOmsDataResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Data")
    public QueryUserOmsDataResponseBodyData data;

    public static QueryUserOmsDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryUserOmsDataResponseBody self = new QueryUserOmsDataResponseBody();
        return TeaModel.build(map, self);
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

    public QueryUserOmsDataResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryUserOmsDataResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryUserOmsDataResponseBody setData(QueryUserOmsDataResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryUserOmsDataResponseBodyData getData() {
        return this.data;
    }

    public static class QueryUserOmsDataResponseBodyData extends TeaModel {
        @NameInMap("Marker")
        public String marker;

        @NameInMap("HostId")
        public String hostId;

        @NameInMap("OmsData")
        public java.util.List<java.util.Map<String, String>> omsData;

        public static QueryUserOmsDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryUserOmsDataResponseBodyData self = new QueryUserOmsDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryUserOmsDataResponseBodyData setMarker(String marker) {
            this.marker = marker;
            return this;
        }
        public String getMarker() {
            return this.marker;
        }

        public QueryUserOmsDataResponseBodyData setHostId(String hostId) {
            this.hostId = hostId;
            return this;
        }
        public String getHostId() {
            return this.hostId;
        }

        public QueryUserOmsDataResponseBodyData setOmsData(java.util.List<java.util.Map<String, String>> omsData) {
            this.omsData = omsData;
            return this;
        }
        public java.util.List<java.util.Map<String, String>> getOmsData() {
            return this.omsData;
        }

    }

}
