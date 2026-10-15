// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class SubscribeBillToOSSRequest extends TeaModel {
    /**
     * <p>The start billing cycle for pushing. After a successful subscription, the system automatically pushes data from the start billing cycle to the current time. This parameter is invalid for monthly bill PDF subscriptions, and historical data is not re-pushed. Data within the last year can be pushed.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-03</p>
     */
    @NameInMap("BeginBillingCycle")
    public String beginBillingCycle;

    /**
     * <p>The UID of the OSS owner that stores the files. Specify this parameter if you are a Bid/Reseller subscriber and need to push files to a sub-account\&quot;s OSS. The specified account must be a sub-account of the calling account, and the AliyunConsumeDump2OSSRole permission must be granted to this account. Regular users do not need to specify this parameter. The default value is the calling account.</p>
     * 
     * <strong>example:</strong>
     * <p>12341324</p>
     */
    @NameInMap("BucketOwnerId")
    public Long bucketOwnerId;

    /**
     * <p>The specified directory under the bucket to which the subscription is delivered.</p>
     * 
     * <strong>example:</strong>
     * <p>testpath</p>
     */
    @NameInMap("BucketPath")
    public String bucketPath;

    /**
     * <p>For multi-level accounts, specifies the type of bills to push. Valid values:</p>
     * <ul>
     * <li>MA: Pushes bills for the primary account and non-trusteeship linked accounts in the financial cloud.</li>
     * <li>ACP1: Pushes bills for Partner Platform V2.0 sub-accounts.</li>
     * </ul>
     * <p>Default value: MA.</p>
     * 
     * <strong>example:</strong>
     * <p>MA</p>
     */
    @NameInMap("MultAccountRelSubscribe")
    public String multAccountRelSubscribe;

    /**
     * <p>The maximum number of rows per file. If a bill file exceeds this limit, it is split into multiple files and compressed into a single archive.</p>
     * 
     * <strong>example:</strong>
     * <p>300000</p>
     */
    @NameInMap("RowLimitPerFile")
    public Integer rowLimitPerFile;

    /**
     * <p>The name of the OSS bucket that stores the subscribed bill files.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxxx-bucket</p>
     */
    @NameInMap("SubscribeBucket")
    public String subscribeBucket;

    /**
     * <p>The type of the subscribed bill. Valid values:</p>
     * <ul>
     * <li>BillingItemDetailForBillingPeriod: billing item details.</li>
     * <li>InstanceDetailForBillingPeriod: instance bill details.</li>
     * <li>BillingItemDetailMonthly: billing item summary by billing cycle.</li>
     * <li>InstanceDetailMonthly: instance bill summary by billing cycle.</li>
     * <li>SplitItemDetailDaily: split bill daily summary.</li>
     * <li>MonthBill: monthly bill PDF. Only MA subscription is supported.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>BillingItemDetailForBillingPeriod</p>
     */
    @NameInMap("SubscribeType")
    public String subscribeType;

    /**
     * <p>Specifies whether to use the Secure Sockets Layer (SSL) encryption protocol to protect network communication. Valid values:</p>
     * <ul>
     * <li><p>true: Enables SSL encryption to ensure the security and integrity of data transmission.</p>
     * </li>
     * <li><p>false (default): Does not enable SSL encryption.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("UsingSsl")
    public String usingSsl;

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

    public SubscribeBillToOSSRequest setUsingSsl(String usingSsl) {
        this.usingSsl = usingSsl;
        return this;
    }
    public String getUsingSsl() {
        return this.usingSsl;
    }

}
