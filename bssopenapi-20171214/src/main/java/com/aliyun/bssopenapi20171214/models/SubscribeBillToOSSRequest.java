// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class SubscribeBillToOSSRequest extends TeaModel {
    @NameInMap("BeginBillingCycle")
    public String beginBillingCycle;

    @NameInMap("BucketOwnerId")
    public Long bucketOwnerId;

    @NameInMap("BucketPath")
    public String bucketPath;

    @NameInMap("MultAccountRelSubscribe")
    public String multAccountRelSubscribe;

    @NameInMap("RowLimitPerFile")
    public Integer rowLimitPerFile;

    @NameInMap("SubscribeBucket")
    public String subscribeBucket;

    @NameInMap("SubscribeType")
    public String subscribeType;

    public static SubscribeBillToOSSRequest build(java.util.Map<String, ?> map) throws Exception {
        SubscribeBillToOSSRequest self = new SubscribeBillToOSSRequest();
        return TeaModel.build(map, self);
    }

    public SubscribeBillToOSSRequest setBeginBillingCycle(String beginBillingCycle) {
        this.beginBillingCycle = beginBillingCycle;
        return this;
    }
    public String getBeginBillingCycle() {
        return this.beginBillingCycle;
    }

    public SubscribeBillToOSSRequest setBucketOwnerId(Long bucketOwnerId) {
        this.bucketOwnerId = bucketOwnerId;
        return this;
    }
    public Long getBucketOwnerId() {
        return this.bucketOwnerId;
    }

    public SubscribeBillToOSSRequest setBucketPath(String bucketPath) {
        this.bucketPath = bucketPath;
        return this;
    }
    public String getBucketPath() {
        return this.bucketPath;
    }

    public SubscribeBillToOSSRequest setMultAccountRelSubscribe(String multAccountRelSubscribe) {
        this.multAccountRelSubscribe = multAccountRelSubscribe;
        return this;
    }
    public String getMultAccountRelSubscribe() {
        return this.multAccountRelSubscribe;
    }

    public SubscribeBillToOSSRequest setRowLimitPerFile(Integer rowLimitPerFile) {
        this.rowLimitPerFile = rowLimitPerFile;
        return this;
    }
    public Integer getRowLimitPerFile() {
        return this.rowLimitPerFile;
    }

    public SubscribeBillToOSSRequest setSubscribeBucket(String subscribeBucket) {
        this.subscribeBucket = subscribeBucket;
        return this;
    }
    public String getSubscribeBucket() {
        return this.subscribeBucket;
    }

    public SubscribeBillToOSSRequest setSubscribeType(String subscribeType) {
        this.subscribeType = subscribeType;
        return this;
    }
    public String getSubscribeType() {
        return this.subscribeType;
    }

}
