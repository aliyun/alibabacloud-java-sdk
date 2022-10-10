// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class AddMallConfigRequest extends TeaModel {
    @NameInMap("Channel")
    public String channel;

    @NameInMap("MallId")
    public String mallId;

    @NameInMap("Params")
    public String params;

    public static AddMallConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        AddMallConfigRequest self = new AddMallConfigRequest();
        return TeaModel.build(map, self);
    }

    public AddMallConfigRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public AddMallConfigRequest setMallId(String mallId) {
        this.mallId = mallId;
        return this;
    }
    public String getMallId() {
        return this.mallId;
    }

    public AddMallConfigRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

}
