// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datav_outer20190402.models;

import com.aliyun.tea.*;

public class SetScreenInteractionRequest extends TeaModel {
    @NameInMap("Product")
    public String product;

    @NameInMap("Version")
    public String version;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("ScreenId")
    public Integer screenId;

    @NameInMap("Interaction")
    public String interaction;

    public static SetScreenInteractionRequest build(java.util.Map<String, ?> map) throws Exception {
        SetScreenInteractionRequest self = new SetScreenInteractionRequest();
        return TeaModel.build(map, self);
    }

    public SetScreenInteractionRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public SetScreenInteractionRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public SetScreenInteractionRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public SetScreenInteractionRequest setScreenId(Integer screenId) {
        this.screenId = screenId;
        return this;
    }
    public Integer getScreenId() {
        return this.screenId;
    }

    public SetScreenInteractionRequest setInteraction(String interaction) {
        this.interaction = interaction;
        return this;
    }
    public String getInteraction() {
        return this.interaction;
    }

}
