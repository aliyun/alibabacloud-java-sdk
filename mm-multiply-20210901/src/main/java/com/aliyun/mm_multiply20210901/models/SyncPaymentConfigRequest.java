// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class SyncPaymentConfigRequest extends TeaModel {
    @NameInMap("Channel")
    public String channel;

    @NameInMap("MallId")
    public String mallId;

    public static SyncPaymentConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncPaymentConfigRequest self = new SyncPaymentConfigRequest();
        return TeaModel.build(map, self);
    }

    public SyncPaymentConfigRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public SyncPaymentConfigRequest setMallId(String mallId) {
        this.mallId = mallId;
        return this;
    }
    public String getMallId() {
        return this.mallId;
    }

}
