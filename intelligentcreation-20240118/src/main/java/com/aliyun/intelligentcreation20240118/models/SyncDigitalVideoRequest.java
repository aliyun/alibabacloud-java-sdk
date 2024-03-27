// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240118.models;

import com.aliyun.tea.*;

public class SyncDigitalVideoRequest extends TeaModel {
    @NameInMap("body")
    public SyncDigitalHumanVideoCmd body;

    public static SyncDigitalVideoRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncDigitalVideoRequest self = new SyncDigitalVideoRequest();
        return TeaModel.build(map, self);
    }

    public SyncDigitalVideoRequest setBody(SyncDigitalHumanVideoCmd body) {
        this.body = body;
        return this;
    }
    public SyncDigitalHumanVideoCmd getBody() {
        return this.body;
    }

}
