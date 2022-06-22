// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelFavoriteListFavoriteResourcesRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("Namespace")
    public String namespace;

    public static SentinelFavoriteListFavoriteResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        SentinelFavoriteListFavoriteResourcesRequest self = new SentinelFavoriteListFavoriteResourcesRequest();
        return TeaModel.build(map, self);
    }

    public SentinelFavoriteListFavoriteResourcesRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public SentinelFavoriteListFavoriteResourcesRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public SentinelFavoriteListFavoriteResourcesRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
