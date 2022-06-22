// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelFavoriteDeleteFavoriteResourceRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("Resource")
    public String resource;

    public static SentinelFavoriteDeleteFavoriteResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        SentinelFavoriteDeleteFavoriteResourceRequest self = new SentinelFavoriteDeleteFavoriteResourceRequest();
        return TeaModel.build(map, self);
    }

    public SentinelFavoriteDeleteFavoriteResourceRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public SentinelFavoriteDeleteFavoriteResourceRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public SentinelFavoriteDeleteFavoriteResourceRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public SentinelFavoriteDeleteFavoriteResourceRequest setResource(String resource) {
        this.resource = resource;
        return this;
    }
    public String getResource() {
        return this.resource;
    }

}
