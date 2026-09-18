// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class SubscriptionOp extends TeaModel {
    /**
     * <p>The operation type.</p>
     * 
     * <strong>example:</strong>
     * <p>create</p>
     */
    @NameInMap("op")
    public String op;

    /**
     * <p>Required for create and update operations.</p>
     */
    @NameInMap("payload")
    public SubscriptionForModify payload;

    /**
     * <p>Required for update and remove operations.</p>
     * 
     * <strong>example:</strong>
     * <p>7076c75c-c804-461e-975f-c6f9ed5af745</p>
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
