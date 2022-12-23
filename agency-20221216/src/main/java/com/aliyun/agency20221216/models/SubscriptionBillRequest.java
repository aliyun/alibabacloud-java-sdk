// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class SubscriptionBillRequest extends TeaModel {
    @NameInMap("BeginBillingCycle")
    public String beginBillingCycle;

    @NameInMap("BillFormat")
    public String billFormat;

    @NameInMap("BucketOwnerId")
    public Long bucketOwnerId;

    @NameInMap("SubscribeBucket")
    public String subscribeBucket;

    @NameInMap("SubscribeSegmentSize")
    public Integer subscribeSegmentSize;

    @NameInMap("SubscribeType")
    public String subscribeType;

    public static SubscriptionBillRequest build(java.util.Map<String, ?> map) throws Exception {
        SubscriptionBillRequest self = new SubscriptionBillRequest();
        return TeaModel.build(map, self);
    }

    public SubscriptionBillRequest setBeginBillingCycle(String beginBillingCycle) {
        this.beginBillingCycle = beginBillingCycle;
        return this;
    }
    public String getBeginBillingCycle() {
        return this.beginBillingCycle;
    }

    public SubscriptionBillRequest setBillFormat(String billFormat) {
        this.billFormat = billFormat;
        return this;
    }
    public String getBillFormat() {
        return this.billFormat;
    }

    public SubscriptionBillRequest setBucketOwnerId(Long bucketOwnerId) {
        this.bucketOwnerId = bucketOwnerId;
        return this;
    }
    public Long getBucketOwnerId() {
        return this.bucketOwnerId;
    }

    public SubscriptionBillRequest setSubscribeBucket(String subscribeBucket) {
        this.subscribeBucket = subscribeBucket;
        return this;
    }
    public String getSubscribeBucket() {
        return this.subscribeBucket;
    }

    public SubscriptionBillRequest setSubscribeSegmentSize(Integer subscribeSegmentSize) {
        this.subscribeSegmentSize = subscribeSegmentSize;
        return this;
    }
    public Integer getSubscribeSegmentSize() {
        return this.subscribeSegmentSize;
    }

    public SubscriptionBillRequest setSubscribeType(String subscribeType) {
        this.subscribeType = subscribeType;
        return this;
    }
    public String getSubscribeType() {
        return this.subscribeType;
    }

}
