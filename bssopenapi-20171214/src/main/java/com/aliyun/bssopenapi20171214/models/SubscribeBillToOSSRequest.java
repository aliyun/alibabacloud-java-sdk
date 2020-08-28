// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class SubscribeBillToOSSRequest extends TeaModel {
    @NameInMap("SubscribeBucket")
    @Validation(required = true)
    public String subscribeBucket;

    @NameInMap("SubscribeType")
    public String subscribeType;

    @NameInMap("MultAccountRelSubscribe")
    public String multAccountRelSubscribe;

    @NameInMap("BucketOwnerId")
    public Long bucketOwnerId;

    public static SubscribeBillToOSSRequest build(java.util.Map<String, ?> map) throws Exception {
        SubscribeBillToOSSRequest self = new SubscribeBillToOSSRequest();
        return TeaModel.build(map, self);
    }

}
