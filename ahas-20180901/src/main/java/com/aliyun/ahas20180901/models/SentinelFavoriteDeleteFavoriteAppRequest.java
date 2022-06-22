// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelFavoriteDeleteFavoriteAppRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("AppType")
    public Integer appType;

    @NameInMap("Namespace")
    public String namespace;

    public static SentinelFavoriteDeleteFavoriteAppRequest build(java.util.Map<String, ?> map) throws Exception {
        SentinelFavoriteDeleteFavoriteAppRequest self = new SentinelFavoriteDeleteFavoriteAppRequest();
        return TeaModel.build(map, self);
    }

    public SentinelFavoriteDeleteFavoriteAppRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public SentinelFavoriteDeleteFavoriteAppRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public SentinelFavoriteDeleteFavoriteAppRequest setAppType(Integer appType) {
        this.appType = appType;
        return this;
    }
    public Integer getAppType() {
        return this.appType;
    }

    public SentinelFavoriteDeleteFavoriteAppRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
