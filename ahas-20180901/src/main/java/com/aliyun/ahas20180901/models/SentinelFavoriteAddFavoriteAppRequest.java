// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelFavoriteAddFavoriteAppRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("AppType")
    public Integer appType;

    @NameInMap("Namespace")
    public String namespace;

    public static SentinelFavoriteAddFavoriteAppRequest build(java.util.Map<String, ?> map) throws Exception {
        SentinelFavoriteAddFavoriteAppRequest self = new SentinelFavoriteAddFavoriteAppRequest();
        return TeaModel.build(map, self);
    }

    public SentinelFavoriteAddFavoriteAppRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public SentinelFavoriteAddFavoriteAppRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public SentinelFavoriteAddFavoriteAppRequest setAppType(Integer appType) {
        this.appType = appType;
        return this;
    }
    public Integer getAppType() {
        return this.appType;
    }

    public SentinelFavoriteAddFavoriteAppRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
