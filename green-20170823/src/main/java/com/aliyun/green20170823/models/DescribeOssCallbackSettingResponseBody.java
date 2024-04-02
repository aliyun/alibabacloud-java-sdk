// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeOssCallbackSettingResponseBody extends TeaModel {
    @NameInMap("AuditCallback")
    public Boolean auditCallback;

    @NameInMap("CallbackSeed")
    public String callbackSeed;

    @NameInMap("CallbackUrl")
    public String callbackUrl;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ScanCallback")
    public Boolean scanCallback;

    @NameInMap("ScanCallbackSuggestions")
    public java.util.List<String> scanCallbackSuggestions;

    @NameInMap("ServiceModules")
    public java.util.List<String> serviceModules;

    public static DescribeOssCallbackSettingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOssCallbackSettingResponseBody self = new DescribeOssCallbackSettingResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOssCallbackSettingResponseBody setAuditCallback(Boolean auditCallback) {
        this.auditCallback = auditCallback;
        return this;
    }
    public Boolean getAuditCallback() {
        return this.auditCallback;
    }

    public DescribeOssCallbackSettingResponseBody setCallbackSeed(String callbackSeed) {
        this.callbackSeed = callbackSeed;
        return this;
    }
    public String getCallbackSeed() {
        return this.callbackSeed;
    }

    public DescribeOssCallbackSettingResponseBody setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public DescribeOssCallbackSettingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeOssCallbackSettingResponseBody setScanCallback(Boolean scanCallback) {
        this.scanCallback = scanCallback;
        return this;
    }
    public Boolean getScanCallback() {
        return this.scanCallback;
    }

    public DescribeOssCallbackSettingResponseBody setScanCallbackSuggestions(java.util.List<String> scanCallbackSuggestions) {
        this.scanCallbackSuggestions = scanCallbackSuggestions;
        return this;
    }
    public java.util.List<String> getScanCallbackSuggestions() {
        return this.scanCallbackSuggestions;
    }

    public DescribeOssCallbackSettingResponseBody setServiceModules(java.util.List<String> serviceModules) {
        this.serviceModules = serviceModules;
        return this;
    }
    public java.util.List<String> getServiceModules() {
        return this.serviceModules;
    }

}
