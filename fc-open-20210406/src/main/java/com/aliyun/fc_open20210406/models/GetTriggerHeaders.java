// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class GetTriggerHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("X-Fc-Account-Id")
    public String xFcAccountId;

    @NameInMap("X-Fc-Code-Checksum")
    public String xFcCodeChecksum;

    @NameInMap("X-Fc-Date")
    public String xFcDate;

    @NameInMap("X-Fc-Invocation-Type")
    public String xFcInvocationType;

    @NameInMap("X-Fc-Log-Type")
    public String xFcLogType;

    @NameInMap("X-Fc-Trace-Id")
    public String xFcTraceId;

    public static GetTriggerHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetTriggerHeaders self = new GetTriggerHeaders();
        return TeaModel.build(map, self);
    }

    public GetTriggerHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetTriggerHeaders setXFcAccountId(String xFcAccountId) {
        this.xFcAccountId = xFcAccountId;
        return this;
    }
    public String getXFcAccountId() {
        return this.xFcAccountId;
    }

    public GetTriggerHeaders setXFcCodeChecksum(String xFcCodeChecksum) {
        this.xFcCodeChecksum = xFcCodeChecksum;
        return this;
    }
    public String getXFcCodeChecksum() {
        return this.xFcCodeChecksum;
    }

    public GetTriggerHeaders setXFcDate(String xFcDate) {
        this.xFcDate = xFcDate;
        return this;
    }
    public String getXFcDate() {
        return this.xFcDate;
    }

    public GetTriggerHeaders setXFcInvocationType(String xFcInvocationType) {
        this.xFcInvocationType = xFcInvocationType;
        return this;
    }
    public String getXFcInvocationType() {
        return this.xFcInvocationType;
    }

    public GetTriggerHeaders setXFcLogType(String xFcLogType) {
        this.xFcLogType = xFcLogType;
        return this;
    }
    public String getXFcLogType() {
        return this.xFcLogType;
    }

    public GetTriggerHeaders setXFcTraceId(String xFcTraceId) {
        this.xFcTraceId = xFcTraceId;
        return this;
    }
    public String getXFcTraceId() {
        return this.xFcTraceId;
    }

}
