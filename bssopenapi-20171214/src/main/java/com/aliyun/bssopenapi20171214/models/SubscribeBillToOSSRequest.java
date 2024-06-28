// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class SubscribeBillToOSSRequest extends TeaModel {
    /**
     * <p>The initial billing cycle from which bills start to be pushed. After you subscribe to the bills, the system automatically pushes the data that is generated from the initial billing cycle to the current time. If the SubscribeType parameter is set to MonthBill, this parameter is invalid. Historical data is not pushed again. The data generated within the last year can be pushed.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-03</p>
     */
    @NameInMap("BeginBillingCycle")
    public String beginBillingCycle;

    /**
     * <p>The owner ID of the OSS bucket that stores the bills. This parameter is required if you are a bidder or reseller and want to push data to an OSS bucket of a member account. In this case, you must specify this account as the account used to call this operation and grant the AliyunConsumeDump2OSSRole permission to this account. If you are a regular user, you do not need to set this parameter. By default, your account is used to call this operation.</p>
     * 
     * <strong>example:</strong>
     * <p>12341324</p>
     */
    @NameInMap("BucketOwnerId")
    public Long bucketOwnerId;

    /**
     * <p>The path of the OSS bucket.</p>
     * 
     * <strong>example:</strong>
     * <p>testpath</p>
     */
    @NameInMap("BucketPath")
    public String bucketPath;

    /**
     * <p>The type of the account whose bills are to be pushed if multi-tier accounts are involved. Valid values:</p>
     * <ul>
     * <li>MA: the master account and a non-managed member account in Finance Cloud</li>
     * <li>ACP1: a member account of a virtual network operator (VNO)</li>
     * </ul>
     * <p>Default value: MA.</p>
     * 
     * <strong>example:</strong>
     * <p>MA</p>
     */
    @NameInMap("MultAccountRelSubscribe")
    public String multAccountRelSubscribe;

    /**
     * <p>The upper limit of the number of lines in a single file. When the bill file exceeds the upper limit, it will be split into multiple files and merged into a compressed package.</p>
     * 
     * <strong>example:</strong>
     * <p>300000</p>
     */
    @NameInMap("RowLimitPerFile")
    public Integer rowLimitPerFile;

    /**
     * <p>The OSS bucket that stores the bills to which you want to subscribe.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxxx-bucket</p>
     */
    @NameInMap("SubscribeBucket")
    public String subscribeBucket;

    /**
     * <p>The type of the bill to which you want to subscribe. Valid values:</p>
     * <ul>
     * <li>BillingItemDetailForBillingPeriod: detailed bills of billable items</li>
     * <li>InstanceDetailForBillingPeriod: detailed bills of instances</li>
     * <li>BillingItemDetailMonthly: billable item-based bills summarized by billing cycle</li>
     * <li>InstanceDetailMonthly: instance-based bills summarized by billing cycle</li>
     * <li>SplitItemDetailDaily: split bills summarized by day</li>
     * <li>MonthBill: monthly bills in the PDF format. You can subscribe to the monthly PDF bills only of the master account.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>BillingItemDetailForBillingPeriod</p>
     */
    @NameInMap("SubscribeType")
    public String subscribeType;

    /**
     * <p>Whether to protect network communications through the SSL (Secure Sockets Layer) encryption protocol. When this parameter is set to true, it means that SSL encryption is enabled to ensure the security and integrity of data transmission.</p>
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
