// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class SubscriptionOp extends TeaModel {
    @NameInMap("op")
    public String op;

    /**
     * <p>create/update 必填</p>
     */
    @NameInMap("payload")
    public SubscriptionForModify payload;

    /**
     * <p>update/remove 必填</p>
     */
    @NameInMap("uuid")
    public String uuid;

    public static SubscriptionOp build(java.util.Map<String, ?> map) throws Exception {
        SubscriptionOp self = new SubscriptionOp();
        return TeaModel.build(map, self);
    }

    public SubscriptionOp setOp(String op) {
        this.op = op;
        return this;
    }
    public String getOp() {
        return this.op;
    }

    public SubscriptionOp setPayload(SubscriptionForModify payload) {
        this.payload = payload;
        return this;
    }
    public SubscriptionForModify getPayload() {
        return this.payload;
    }

    public SubscriptionOp setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
