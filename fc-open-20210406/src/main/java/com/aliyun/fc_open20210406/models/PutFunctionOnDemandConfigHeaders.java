// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class PutFunctionOnDemandConfigHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    // If the ETag specified in the request matches the ETag value of the OndemandConfig, FC returns 200 OK. If the ETag specified in the request does not match the ETag value of the object, FC returns 412 Precondition Failed.
    @NameInMap("If-Match")
    public String ifMatch;

    // The ID of your Alibaba Cloud account.
    @NameInMap("X-Fc-Account-Id")
    public String xFcAccountId;

    // The start time when the function is invoked. Specify the time in the **EEE,d MMM yyyy HH:mm:ss GMT** format.
    @NameInMap("X-Fc-Date")
    public String xFcDate;

    // The trace ID of the request for Function Compute API, which is also the unique ID of the request.
    @NameInMap("X-Fc-Trace-Id")
    public String xFcTraceId;

    public static PutFunctionOnDemandConfigHeaders build(java.util.Map<String, ?> map) throws Exception {
        PutFunctionOnDemandConfigHeaders self = new PutFunctionOnDemandConfigHeaders();
        return TeaModel.build(map, self);
    }

    public PutFunctionOnDemandConfigHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public PutFunctionOnDemandConfigHeaders setIfMatch(String ifMatch) {
        this.ifMatch = ifMatch;
        return this;
    }
    public String getIfMatch() {
        return this.ifMatch;
    }

    public PutFunctionOnDemandConfigHeaders setXFcAccountId(String xFcAccountId) {
        this.xFcAccountId = xFcAccountId;
        return this;
    }
    public String getXFcAccountId() {
        return this.xFcAccountId;
    }

    public PutFunctionOnDemandConfigHeaders setXFcDate(String xFcDate) {
        this.xFcDate = xFcDate;
        return this;
    }
    public String getXFcDate() {
        return this.xFcDate;
    }

    public PutFunctionOnDemandConfigHeaders setXFcTraceId(String xFcTraceId) {
        this.xFcTraceId = xFcTraceId;
        return this;
    }
    public String getXFcTraceId() {
        return this.xFcTraceId;
    }

}
