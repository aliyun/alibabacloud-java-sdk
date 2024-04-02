// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class UpdateOssCallbackSettingRequest extends TeaModel {
    @NameInMap("AuditCallback")
    public Boolean auditCallback;

    @NameInMap("CallbackSeed")
    public String callbackSeed;

    @NameInMap("CallbackUrl")
    public String callbackUrl;

    @NameInMap("ScanCallback")
    public Boolean scanCallback;

    @NameInMap("ScanCallbackSuggestions")
    public String scanCallbackSuggestions;

    @NameInMap("ServiceModules")
    public String serviceModules;

    public static UpdateOssCallbackSettingRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateOssCallbackSettingRequest self = new UpdateOssCallbackSettingRequest();
        return TeaModel.build(map, self);
    }

    public UpdateOssCallbackSettingRequest setAuditCallback(Boolean auditCallback) {
        this.auditCallback = auditCallback;
        return this;
    }
    public Boolean getAuditCallback() {
        return this.auditCallback;
    }

    public UpdateOssCallbackSettingRequest setCallbackSeed(String callbackSeed) {
        this.callbackSeed = callbackSeed;
        return this;
    }
    public String getCallbackSeed() {
        return this.callbackSeed;
    }

    public UpdateOssCallbackSettingRequest setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public UpdateOssCallbackSettingRequest setScanCallback(Boolean scanCallback) {
        this.scanCallback = scanCallback;
        return this;
    }
    public Boolean getScanCallback() {
        return this.scanCallback;
    }

    public UpdateOssCallbackSettingRequest setScanCallbackSuggestions(String scanCallbackSuggestions) {
        this.scanCallbackSuggestions = scanCallbackSuggestions;
        return this;
    }
    public String getScanCallbackSuggestions() {
        return this.scanCallbackSuggestions;
    }

    public UpdateOssCallbackSettingRequest setServiceModules(String serviceModules) {
        this.serviceModules = serviceModules;
        return this;
    }
    public String getServiceModules() {
        return this.serviceModules;
    }

}
