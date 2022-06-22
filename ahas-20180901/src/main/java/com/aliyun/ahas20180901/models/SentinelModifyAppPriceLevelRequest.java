// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelModifyAppPriceLevelRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("PriceLevel")
    public Integer priceLevel;

    public static SentinelModifyAppPriceLevelRequest build(java.util.Map<String, ?> map) throws Exception {
        SentinelModifyAppPriceLevelRequest self = new SentinelModifyAppPriceLevelRequest();
        return TeaModel.build(map, self);
    }

    public SentinelModifyAppPriceLevelRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public SentinelModifyAppPriceLevelRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public SentinelModifyAppPriceLevelRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SentinelModifyAppPriceLevelRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public SentinelModifyAppPriceLevelRequest setPriceLevel(Integer priceLevel) {
        this.priceLevel = priceLevel;
        return this;
    }
    public Integer getPriceLevel() {
        return this.priceLevel;
    }

}
