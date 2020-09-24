// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryUserOmsDataResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Data")
    @Validation(required = true)
    public QueryUserOmsDataResponseData data;

    public static QueryUserOmsDataResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUserOmsDataResponse self = new QueryUserOmsDataResponse();
        return TeaModel.build(map, self);
    }

    public QueryUserOmsDataResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryUserOmsDataResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryUserOmsDataResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryUserOmsDataResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryUserOmsDataResponse setData(QueryUserOmsDataResponseData data) {
        this.data = data;
        return this;
    }
    public QueryUserOmsDataResponseData getData() {
        return this.data;
    }

    public static class QueryUserOmsDataResponseData extends TeaModel {
        @NameInMap("Marker")
        @Validation(required = true)
        public String marker;

        @NameInMap("HostId")
        @Validation(required = true)
        public String hostId;

        @NameInMap("OmsData")
        @Validation(required = true)
        public java.util.List<java.util.Map<String, ?>> omsData;

        public static QueryUserOmsDataResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryUserOmsDataResponseData self = new QueryUserOmsDataResponseData();
            return TeaModel.build(map, self);
        }

        public QueryUserOmsDataResponseData setMarker(String marker) {
            this.marker = marker;
            return this;
        }
        public String getMarker() {
            return this.marker;
        }

        public QueryUserOmsDataResponseData setHostId(String hostId) {
            this.hostId = hostId;
            return this;
        }
        public String getHostId() {
            return this.hostId;
        }

        public QueryUserOmsDataResponseData setOmsData(java.util.List<java.util.Map<String, ?>> omsData) {
            this.omsData = omsData;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getOmsData() {
            return this.omsData;
        }

    }

}
