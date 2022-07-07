// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class GetMallConfigRequest extends TeaModel {
    // channel
    @NameInMap("Channel")
    public String channel;

    // mallId
    @NameInMap("MallId")
    public String mallId;

    public static GetMallConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMallConfigRequest self = new GetMallConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetMallConfigRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public GetMallConfigRequest setMallId(String mallId) {
        this.mallId = mallId;
        return this;
    }
    public String getMallId() {
        return this.mallId;
    }

}
