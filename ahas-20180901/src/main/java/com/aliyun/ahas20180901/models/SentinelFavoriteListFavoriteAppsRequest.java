// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelFavoriteListFavoriteAppsRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("AppTypes")
    public String appTypes;

    @NameInMap("Namespace")
    public String namespace;

    public static SentinelFavoriteListFavoriteAppsRequest build(java.util.Map<String, ?> map) throws Exception {
        SentinelFavoriteListFavoriteAppsRequest self = new SentinelFavoriteListFavoriteAppsRequest();
        return TeaModel.build(map, self);
    }

    public SentinelFavoriteListFavoriteAppsRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public SentinelFavoriteListFavoriteAppsRequest setAppTypes(String appTypes) {
        this.appTypes = appTypes;
        return this;
    }
    public String getAppTypes() {
        return this.appTypes;
    }

    public SentinelFavoriteListFavoriteAppsRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
