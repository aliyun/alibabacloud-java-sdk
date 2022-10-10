// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class UpdateMallConfigRequest extends TeaModel {
    @NameInMap("Channel")
    public String channel;

    @NameInMap("MallId")
    public String mallId;

    @NameInMap("Params")
    public String params;

    public static UpdateMallConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMallConfigRequest self = new UpdateMallConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMallConfigRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public UpdateMallConfigRequest setMallId(String mallId) {
        this.mallId = mallId;
        return this;
    }
    public String getMallId() {
        return this.mallId;
    }

    public UpdateMallConfigRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

}
