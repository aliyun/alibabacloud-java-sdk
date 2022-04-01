// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class CreateFunctionHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("X-Fc-Account-Id")
    public String xFcAccountId;

    @NameInMap("X-Fc-Code-Checksum")
    public String xFcCodeChecksum;

    @NameInMap("X-Fc-Date")
    public String xFcDate;

    @NameInMap("X-Fc-Trace-Id")
    public String xFcTraceId;

    public static CreateFunctionHeaders build(java.util.Map<String, ?> map) throws Exception {
        CreateFunctionHeaders self = new CreateFunctionHeaders();
        return TeaModel.build(map, self);
    }

    public CreateFunctionHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public CreateFunctionHeaders setXFcAccountId(String xFcAccountId) {
        this.xFcAccountId = xFcAccountId;
        return this;
    }
    public String getXFcAccountId() {
        return this.xFcAccountId;
    }

    public CreateFunctionHeaders setXFcCodeChecksum(String xFcCodeChecksum) {
        this.xFcCodeChecksum = xFcCodeChecksum;
        return this;
    }
    public String getXFcCodeChecksum() {
        return this.xFcCodeChecksum;
    }

    public CreateFunctionHeaders setXFcDate(String xFcDate) {
        this.xFcDate = xFcDate;
        return this;
    }
    public String getXFcDate() {
        return this.xFcDate;
    }

    public CreateFunctionHeaders setXFcTraceId(String xFcTraceId) {
        this.xFcTraceId = xFcTraceId;
        return this;
    }
    public String getXFcTraceId() {
        return this.xFcTraceId;
    }

}
