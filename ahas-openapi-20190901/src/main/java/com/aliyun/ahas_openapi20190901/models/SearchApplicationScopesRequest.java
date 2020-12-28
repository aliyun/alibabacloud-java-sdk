// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class SearchApplicationScopesRequest extends TeaModel {
    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("Page")
    public Integer page;

    @NameInMap("Size")
    public Integer size;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("Ip")
    public String ip;

    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    public static SearchApplicationScopesRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchApplicationScopesRequest self = new SearchApplicationScopesRequest();
        return TeaModel.build(map, self);
    }

    public SearchApplicationScopesRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public SearchApplicationScopesRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public SearchApplicationScopesRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public SearchApplicationScopesRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public SearchApplicationScopesRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public SearchApplicationScopesRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public SearchApplicationScopesRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

}
