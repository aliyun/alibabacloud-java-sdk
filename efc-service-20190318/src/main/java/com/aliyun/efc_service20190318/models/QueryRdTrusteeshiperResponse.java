// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.efc_service20190318.models;

import com.aliyun.tea.*;

public class QueryRdTrusteeshiperResponse extends TeaModel {
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
    public QueryRdTrusteeshiperResponseData data;

    public static QueryRdTrusteeshiperResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRdTrusteeshiperResponse self = new QueryRdTrusteeshiperResponse();
        return TeaModel.build(map, self);
    }

    public QueryRdTrusteeshiperResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRdTrusteeshiperResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryRdTrusteeshiperResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryRdTrusteeshiperResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryRdTrusteeshiperResponse setData(QueryRdTrusteeshiperResponseData data) {
        this.data = data;
        return this;
    }
    public QueryRdTrusteeshiperResponseData getData() {
        return this.data;
    }

    public static class QueryRdTrusteeshiperResponseData extends TeaModel {
        @NameInMap("TrusteeshipUserId")
        @Validation(required = true)
        public Long trusteeshipUserId;

        @NameInMap("TrusteeshipUserName")
        @Validation(required = true)
        public String trusteeshipUserName;

        public static QueryRdTrusteeshiperResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryRdTrusteeshiperResponseData self = new QueryRdTrusteeshiperResponseData();
            return TeaModel.build(map, self);
        }

        public QueryRdTrusteeshiperResponseData setTrusteeshipUserId(Long trusteeshipUserId) {
            this.trusteeshipUserId = trusteeshipUserId;
            return this;
        }
        public Long getTrusteeshipUserId() {
            return this.trusteeshipUserId;
        }

        public QueryRdTrusteeshiperResponseData setTrusteeshipUserName(String trusteeshipUserName) {
            this.trusteeshipUserName = trusteeshipUserName;
            return this;
        }
        public String getTrusteeshipUserName() {
            return this.trusteeshipUserName;
        }

    }

}
