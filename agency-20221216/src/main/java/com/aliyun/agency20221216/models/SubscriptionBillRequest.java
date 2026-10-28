// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class SubscriptionBillRequest extends TeaModel {
    /**
     * <p>The billing month from which to start pushing bills. Format: yyyy-MM.</p>
     * <p>After a successful subscription, the system automatically pushes data from the start billing cycle to the current time. Data for up to the last six months (including the current month) can be pushed. If the specified month exceeds this range, the subscription is invalid.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-10</p>
     */
    @NameInMap("BeginBillingCycle")
    public String beginBillingCycle;

    /**
     * <p>The bill file format. Valid values:</p>
     * <ul>
     * <li>csv</li>
     * <li>parquet</li>
     * </ul>
     * <p>If you subscribe to multiple file types, use separate buckets to avoid file overwriting.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>csv</p>
     */
    @NameInMap("BillFormat")
    public String billFormat;

    /**
     * <p>The UID of the account that owns the OSS bucket for storing files.</p>
     * <p>If a partner subscribes and needs to push files to the OSS bucket of a subordinate partner account, this account must be a subordinate partner account of the partner account. Grant the <a href="https://ram.console.aliyun.com/?spm=api-workbench.API%20Document.0.0.68c71e0fhmTSJp#/role/authorize?request=%7B%22Requests%22:%20%7B%22request1%22:%20%7B%22RoleName%22:%20%22AliyunConsumeDump2OSSRole%22,%20%22TemplateId%22:%20%22Dump2OSSRole%22%7D%7D,%20%22ReturnUrl%22:%20%22https:%2F%2Fusercenter2.aliyun.com%22,%20%22Service%22:%20%22Consume%22%7D">AliyunConsumeDump2OSSRole</a> permission to the subordinate partner account. </p>
     * <p>If a partner subscribes and pushes files to the partner account\&quot;s own OSS bucket, grant the <a href="https://ram.console.aliyun.com/?spm=api-workbench.API%20Document.0.0.68c71e0fhmTSJp#/role/authorize?request=%7B%22Requests%22:%20%7B%22request1%22:%20%7B%22RoleName%22:%20%22AliyunConsumeDump2OSSRole%22,%20%22TemplateId%22:%20%22Dump2OSSRole%22%7D%7D,%20%22ReturnUrl%22:%20%22https:%2F%2Fusercenter2.aliyun.com%22,%20%22Service%22:%20%22Consume%22%7D">AliyunConsumeDump2OSSRole</a> permission to the partner account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5569414254138836</p>
     */
    @NameInMap("BucketOwnerId")
    public Long bucketOwnerId;

    /**
     * <p>The name of the OSS bucket for storing bill files.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bill-bucket</p>
     */
    @NameInMap("SubscribeBucket")
    public String subscribeBucket;

    /**
     * <p>The row count threshold for a single bill file. If the number of rows exceeds this threshold, the file is automatically split into multiple files. The naming convention for split files is <code>uid_billType_billCycle_SquenceNo_fileNo</code>.</p>
     * <p>All information in the file names is identical except for fileNo. These files belong to the same billing cycle and the same file type but are split into multiple files.</p>
     * 
     * <strong>example:</strong>
     * <p>100000</p>
     */
    @NameInMap("SubscribeSegmentSize")
    public Integer subscribeSegmentSize;

    /**
     * <p>The subscription type. Valid values: </p>
     * <ul>
     * <li>PartnerBillingItemDetailForBillingPeriod: billing item detail.</li>
     * <li>PartnerBillingItemDetailMonthly: billing item monthly bill.</li>
     * <li>PartnerInstanceDetailForBillingPeriod: instance bill detail.</li>
     * <li>PartnerInstanceDetailMonthly: instance monthly bill.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PartnerBillingItemDetailForBillingPeriod</p>
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
