// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class UnsubscribeBillToOSSRequest extends TeaModel {
    @NameInMap("MultAccountRelSubscribe")
    public String multAccountRelSubscribe;

    @NameInMap("SubscribeType")
    public String subscribeType;

    public static UnsubscribeBillToOSSRequest build(java.util.Map<String, ?> map) throws Exception {
        UnsubscribeBillToOSSRequest self = new UnsubscribeBillToOSSRequest();
        return TeaModel.build(map, self);
    }

    public UnsubscribeBillToOSSRequest setMultAccountRelSubscribe(String multAccountRelSubscribe) {
        this.multAccountRelSubscribe = multAccountRelSubscribe;
        return this;
    }
    public String getMultAccountRelSubscribe() {
        return this.multAccountRelSubscribe;
    }

    public UnsubscribeBillToOSSRequest setSubscribeType(String subscribeType) {
        this.subscribeType = subscribeType;
        return this;
    }
    public String getSubscribeType() {
        return this.subscribeType;
    }

}
