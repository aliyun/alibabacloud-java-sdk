// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datav_outer20190402.models;

import com.aliyun.tea.*;

public class GetScreenRequest extends TeaModel {
    @NameInMap("Product")
    public String product;

    @NameInMap("Version")
    public String version;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("ScreenId")
    public Integer screenId;

    @NameInMap("NeedConfig")
    public Boolean needConfig;

    @NameInMap("NeedHook")
    public Boolean needHook;

    @NameInMap("NeedInteraction")
    public Boolean needInteraction;

    public static GetScreenRequest build(java.util.Map<String, ?> map) throws Exception {
        GetScreenRequest self = new GetScreenRequest();
        return TeaModel.build(map, self);
    }

    public GetScreenRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public GetScreenRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public GetScreenRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public GetScreenRequest setScreenId(Integer screenId) {
        this.screenId = screenId;
        return this;
    }
    public Integer getScreenId() {
        return this.screenId;
    }

    public GetScreenRequest setNeedConfig(Boolean needConfig) {
        this.needConfig = needConfig;
        return this;
    }
    public Boolean getNeedConfig() {
        return this.needConfig;
    }

    public GetScreenRequest setNeedHook(Boolean needHook) {
        this.needHook = needHook;
        return this;
    }
    public Boolean getNeedHook() {
        return this.needHook;
    }

    public GetScreenRequest setNeedInteraction(Boolean needInteraction) {
        this.needInteraction = needInteraction;
        return this;
    }
    public Boolean getNeedInteraction() {
        return this.needInteraction;
    }

}
