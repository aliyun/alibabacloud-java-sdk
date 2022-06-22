// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelHttpApiMatchUpdateDefaultRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("Strategy")
    public String strategy;

    public static SentinelHttpApiMatchUpdateDefaultRequest build(java.util.Map<String, ?> map) throws Exception {
        SentinelHttpApiMatchUpdateDefaultRequest self = new SentinelHttpApiMatchUpdateDefaultRequest();
        return TeaModel.build(map, self);
    }

    public SentinelHttpApiMatchUpdateDefaultRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public SentinelHttpApiMatchUpdateDefaultRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public SentinelHttpApiMatchUpdateDefaultRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SentinelHttpApiMatchUpdateDefaultRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public SentinelHttpApiMatchUpdateDefaultRequest setStrategy(String strategy) {
        this.strategy = strategy;
        return this;
    }
    public String getStrategy() {
        return this.strategy;
    }

}
