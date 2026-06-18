// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class ListQuotaResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("nextToken")
    public String nextToken;

    @NameInMap("quotas")
    public java.util.List<Quota> quotas;

    @NameInMap("requestId")
    public String requestId;

    public static ListQuotaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListQuotaResponseBody self = new ListQuotaResponseBody();
        return TeaModel.build(map, self);
    }

    public ListQuotaResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListQuotaResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListQuotaResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListQuotaResponseBody setQuotas(java.util.List<Quota> quotas) {
        this.quotas = quotas;
        return this;
    }
    public java.util.List<Quota> getQuotas() {
        return this.quotas;
    }

    public ListQuotaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
