// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class UnsubscribeBillToOSSRequest extends TeaModel {
    @NameInMap("SubscribeType")
    @Validation(required = true)
    public String subscribeType;

    @NameInMap("MultAccountRelSubscribe")
    public String multAccountRelSubscribe;

    public static UnsubscribeBillToOSSRequest build(java.util.Map<String, ?> map) throws Exception {
        UnsubscribeBillToOSSRequest self = new UnsubscribeBillToOSSRequest();
        return TeaModel.build(map, self);
    }

}
