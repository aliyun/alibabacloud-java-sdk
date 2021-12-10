// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class PublishServiceVersionHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("If-Match")
    public String ifMatch;

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

    public static PublishServiceVersionHeaders build(java.util.Map<String, ?> map) throws Exception {
        PublishServiceVersionHeaders self = new PublishServiceVersionHeaders();
        return TeaModel.build(map, self);
    }

    public PublishServiceVersionHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public PublishServiceVersionHeaders setIfMatch(String ifMatch) {
        this.ifMatch = ifMatch;
        return this;
    }
    public String getIfMatch() {
        return this.ifMatch;
    }

    public PublishServiceVersionHeaders setXFcAccountId(String xFcAccountId) {
        this.xFcAccountId = xFcAccountId;
        return this;
    }
    public String getXFcAccountId() {
        return this.xFcAccountId;
    }

    public PublishServiceVersionHeaders setXFcCodeChecksum(String xFcCodeChecksum) {
        this.xFcCodeChecksum = xFcCodeChecksum;
        return this;
    }
    public String getXFcCodeChecksum() {
        return this.xFcCodeChecksum;
    }

    public PublishServiceVersionHeaders setXFcDate(String xFcDate) {
        this.xFcDate = xFcDate;
        return this;
    }
    public String getXFcDate() {
        return this.xFcDate;
    }

    public PublishServiceVersionHeaders setXFcInvocationType(String xFcInvocationType) {
        this.xFcInvocationType = xFcInvocationType;
        return this;
    }
    public String getXFcInvocationType() {
        return this.xFcInvocationType;
    }

    public PublishServiceVersionHeaders setXFcLogType(String xFcLogType) {
        this.xFcLogType = xFcLogType;
        return this;
    }
    public String getXFcLogType() {
        return this.xFcLogType;
    }

    public PublishServiceVersionHeaders setXFcTraceId(String xFcTraceId) {
        this.xFcTraceId = xFcTraceId;
        return this;
    }
    public String getXFcTraceId() {
        return this.xFcTraceId;
    }

}
