// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class SubscriptionBillRequest extends TeaModel {
    /**
     * <p>The start month from which the bills are pushed. Specify the value in the yyyy-MM format.</p>
     * <br>
     * <p>After the subscription is generated, the system automatically pushes the bill data that is generated from the month that you specified to the current point in time. Data of up to six months can be pushed. The current month is included. If you subscribe to the bills for more than six months, the subscription is invalid.</p>
     */
    @NameInMap("BeginBillingCycle")
    public String beginBillingCycle;

    /**
     * <p>The file format of the bill. Valid values: csv and parquet.</p>
     * <br>
     * <p>If you subscribe to the bills of multiple file formats, we recommend that you store the bills in different OSS buckets to prevent file overwriting.</p>
     */
    @NameInMap("BillFormat")
    public String billFormat;

    /**
     * <p>The ID of the user to which the OSS bucket belongs.</p>
     * <br>
     * <p>If you are an eco-partner of Alibaba Cloud and you need to push the bills to the OSS bucket of a subordinate partner account, you must set this parameter to the ID of the subordinate partner account and grant the [AliyunConsumeDump2OSSRole](https://ram.console.aliyun.com/?spm=api-workbench.API%20Document.0.0.68c71e0fhmTSJp#/role/authorize?request=%7B%22Requests%22:%20%7B%22request1%22:%20%7B%22RoleName%22:%20%22AliyunConsumeDump2OSSRole%22,%20%22TemplateId%22:%20%22Dump2OSSRole%22%7D%7D,%20%22ReturnUrl%22:%20%22https:%2F%2Fusercenter2.aliyun.com%22,%20%22Service%22:%20%22Consume%22%7D) permission to the subordinate partner account.</p>
     * <br>
     * <p>If you are an eco-partner of Alibaba Cloud and you need to push the bills to the OSS bucket of your own account, your account must be granted the [AliyunConsumeDump2OSSRole](https://ram.console.aliyun.com/?spm=api-workbench.API%20Document.0.0.68c71e0fhmTSJp#/role/authorize?request=%7B%22Requests%22:%20%7B%22request1%22:%20%7B%22RoleName%22:%20%22AliyunConsumeDump2OSSRole%22,%20%22TemplateId%22:%20%22Dump2OSSRole%22%7D%7D,%20%22ReturnUrl%22:%20%22https:%2F%2Fusercenter2.aliyun.com%22,%20%22Service%22:%20%22Consume%22%7D) permission.</p>
     */
    @NameInMap("BucketOwnerId")
    public Long bucketOwnerId;

    /**
     * <p>The name of the Object Storage Service (OSS) bucket in which you want to store the bills.</p>
     */
    @NameInMap("SubscribeBucket")
    public String subscribeBucket;

    /**
     * <p>The maximum rows in a single bill file. If the number of bill rows exceed the upper limit, the bill is automatically split into multiple files. The name of each split file is in the `uid_billType_billCycle_SquenceNo_fileNo` format.</p>
     * <br>
     * <p>Files whose names are the same except for the fileNo field are of the same type and belong to the same billing cycle.</p>
     */
    @NameInMap("SubscribeSegmentSize")
    public Integer subscribeSegmentSize;

    /**
     * <p>The type of the bill to which you want to subscribe. Valid values: PartnerBillingItemDetailForBillingPeriod, PartnerBillingItemDetailMonthly, PartnerInstanceDetailForBillingPeriod, and PartnerInstanceDetailMonthly.</p>
     */
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
