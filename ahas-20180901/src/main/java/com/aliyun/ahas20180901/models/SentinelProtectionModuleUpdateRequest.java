// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelProtectionModuleUpdateRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("FallbackId")
    public Long fallbackId;

    @NameInMap("Id")
    public Long id;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Namespace")
    public String namespace;

    public static SentinelProtectionModuleUpdateRequest build(java.util.Map<String, ?> map) throws Exception {
        SentinelProtectionModuleUpdateRequest self = new SentinelProtectionModuleUpdateRequest();
        return TeaModel.build(map, self);
    }

    public SentinelProtectionModuleUpdateRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public SentinelProtectionModuleUpdateRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public SentinelProtectionModuleUpdateRequest setFallbackId(Long fallbackId) {
        this.fallbackId = fallbackId;
        return this;
    }
    public Long getFallbackId() {
        return this.fallbackId;
    }

    public SentinelProtectionModuleUpdateRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public SentinelProtectionModuleUpdateRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SentinelProtectionModuleUpdateRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
