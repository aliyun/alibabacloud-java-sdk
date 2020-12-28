// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class ListActiveAppsRequest extends TeaModel {
    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("AppType")
    public Integer appType;

    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    public static ListActiveAppsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListActiveAppsRequest self = new ListActiveAppsRequest();
        return TeaModel.build(map, self);
    }

    public ListActiveAppsRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ListActiveAppsRequest setAppType(Integer appType) {
        this.appType = appType;
        return this;
    }
    public Integer getAppType() {
        return this.appType;
    }

    public ListActiveAppsRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

}
