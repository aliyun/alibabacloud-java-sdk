// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datav_outer20190402.models;

import com.aliyun.tea.*;

public class SetScreenHookRequest extends TeaModel {
    @NameInMap("Product")
    public String product;

    @NameInMap("Version")
    public String version;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("ScreenId")
    public Integer screenId;

    @NameInMap("Hook")
    public String hook;

    public static SetScreenHookRequest build(java.util.Map<String, ?> map) throws Exception {
        SetScreenHookRequest self = new SetScreenHookRequest();
        return TeaModel.build(map, self);
    }

    public SetScreenHookRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public SetScreenHookRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public SetScreenHookRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public SetScreenHookRequest setScreenId(Integer screenId) {
        this.screenId = screenId;
        return this;
    }
    public Integer getScreenId() {
        return this.screenId;
    }

    public SetScreenHookRequest setHook(String hook) {
        this.hook = hook;
        return this;
    }
    public String getHook() {
        return this.hook;
    }

}
