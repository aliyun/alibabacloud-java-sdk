// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class CreateServiceHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    // The ID of your Alibaba Cloud account.
    @NameInMap("X-Fc-Account-Id")
    public String xFcAccountId;

    // The time when the function is invoked. The format is **EEE,d MMM yyyy HH:mm:ss GMT**.
    @NameInMap("X-Fc-Date")
    public String xFcDate;

    // The custom request ID.
    @NameInMap("X-Fc-Trace-Id")
    public String xFcTraceId;

    public static CreateServiceHeaders build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceHeaders self = new CreateServiceHeaders();
        return TeaModel.build(map, self);
    }

    public CreateServiceHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public CreateServiceHeaders setXFcAccountId(String xFcAccountId) {
        this.xFcAccountId = xFcAccountId;
        return this;
    }
    public String getXFcAccountId() {
        return this.xFcAccountId;
    }

    public CreateServiceHeaders setXFcDate(String xFcDate) {
        this.xFcDate = xFcDate;
        return this;
    }
    public String getXFcDate() {
        return this.xFcDate;
    }

    public CreateServiceHeaders setXFcTraceId(String xFcTraceId) {
        this.xFcTraceId = xFcTraceId;
        return this;
    }
    public String getXFcTraceId() {
        return this.xFcTraceId;
    }

}
