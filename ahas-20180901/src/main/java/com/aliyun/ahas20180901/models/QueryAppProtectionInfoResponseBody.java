// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryAppProtectionInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryAppProtectionInfoResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryAppProtectionInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAppProtectionInfoResponseBody self = new QueryAppProtectionInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAppProtectionInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryAppProtectionInfoResponseBody setData(QueryAppProtectionInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryAppProtectionInfoResponseBodyData getData() {
        return this.data;
    }

    public QueryAppProtectionInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryAppProtectionInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAppProtectionInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryAppProtectionInfoResponseBodyData extends TeaModel {
        @NameInMap("AppProtections")
        public java.util.Map<String, ?> appProtections;

        @NameInMap("Total")
        public Long total;

        public static QueryAppProtectionInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryAppProtectionInfoResponseBodyData self = new QueryAppProtectionInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryAppProtectionInfoResponseBodyData setAppProtections(java.util.Map<String, ?> appProtections) {
            this.appProtections = appProtections;
            return this;
        }
        public java.util.Map<String, ?> getAppProtections() {
            return this.appProtections;
        }

        public QueryAppProtectionInfoResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
