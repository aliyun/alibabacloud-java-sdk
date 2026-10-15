// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DescribeInstanceBillRequest extends TeaModel {
    /**
     * <p>The ID of the resource ownership account. The resource ownership account is the account that actually uses the resource.</p>
     * 
     * <strong>example:</strong>
     * <p>122</p>
     */
    @NameInMap("BillOwnerId")
    public Long billOwnerId;

    /**
     * <p>The billing cycle in the YYYY-MM format. Only the last 18 billing cycles are supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-03</p>
     */
    @NameInMap("BillingCycle")
    public String billingCycle;

    /**
     * <p>The billing date. This parameter is required only when Granularity is set to DAILY. Format: YYYY-MM-DD.</p>
     * <blockquote>
     * <p>The value of BillingDate must be in the same month as the value of BillingCycle. For example, if BillingCycle is set to 2020-03, BillingDate must be set to 2020-03-DD. If the months are inconsistent, the query results are returned based on the time specified by BillingCycle.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2020-03-02</p>
     */
    @NameInMap("BillingDate")
    public String billingDate;

    /**
     * <p>The granularity at which bills are queried. Valid values:</p>
     * <ul>
     * <li>MONTHLY: monthly. The data is consistent with the monthly bills in Expenses and Costs &gt; Bills &gt; Bill Details &gt; Monthly Bills.</li>
     * <li>DAILY: daily. The data is consistent with the daily bills in Expenses and Costs &gt; Bills &gt; Bill Details &gt; Daily Bills.</li>
     * </ul>
     * <blockquote>
     * <p>If you select DAILY, you must specify BillingDate.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>MONTHLY</p>
     */
    @NameInMap("Granularity")
    public String granularity;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("InstanceID")
    public String instanceID;

    /**
     * <p>Specifies whether to retrieve data by billable item. Valid values:</p>
     * <ul>
     * <li>false (default): The data is consistent with the instance bills in Expenses and Costs &gt; Bills &gt; Bill Details &gt; Instance Bills.</li>
     * <li>true: The data is consistent with the billable item bills in Expenses and Costs &gt; Bills &gt; Bill Details &gt; Billable Item Bills.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsBillingItem")
    public Boolean isBillingItem;

    /**
     * <p>Specifies whether to filter out records where both the original price (PretaxGrossAmount) and the payable amount (PretaxAmount) are 0. Valid values:</p>
     * <ul>
     * <li>false</li>
     * <li>true</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsHideZeroCharge")
    public Boolean isHideZeroCharge;

    /**
     * <p>The maximum number of data records to read in the current call. Default value: 20. Maximum value: 300.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The position from which the current call starts to read data. The value must be empty or set to the NextToken value returned in the previous response. Otherwise, an error occurs. An empty value indicates that the reading starts from the beginning.</p>
     * 
     * <strong>example:</strong>
     * <p>CAESEgoQCg4KCm</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The product code, which is consistent with the product code in the bills of the User Center.</p>
     * 
     * <strong>example:</strong>
     * <p>rds</p>
     */
    @NameInMap("PipCode")
    public String pipCode;

    /**
     * <p>The product code.</p>
     * 
     * <strong>example:</strong>
     * <p>rds</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The product type.</p>
     * 
     * <strong>example:</strong>
     * <p>rds</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>The subscription type. Valid values:</p>
     * <ul>
     * <li>Subscription: subscription.</li>
     * <li>PayAsYouGo: pay-as-you-go.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PayAsYouGo</p>
     */
    @NameInMap("SubscriptionType")
    public String subscriptionType;

    public static DescribeInstanceBillRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceBillRequest self = new DescribeInstanceBillRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceBillRequest setBillOwnerId(Long billOwnerId) {
        this.billOwnerId = billOwnerId;
        return this;
    }
    public Long getBillOwnerId() {
        return this.billOwnerId;
    }

    public DescribeInstanceBillRequest setBillingCycle(String billingCycle) {
        this.billingCycle = billingCycle;
        return this;
    }
    public String getBillingCycle() {
        return this.billingCycle;
    }

    public DescribeInstanceBillRequest setBillingDate(String billingDate) {
        this.billingDate = billingDate;
        return this;
    }
    public String getBillingDate() {
        return this.billingDate;
    }

    public DescribeInstanceBillRequest setGranularity(String granularity) {
        this.granularity = granularity;
        return this;
    }
    public String getGranularity() {
        return this.granularity;
    }

    public DescribeInstanceBillRequest setInstanceID(String instanceID) {
        this.instanceID = instanceID;
        return this;
    }
    public String getInstanceID() {
        return this.instanceID;
    }

    public DescribeInstanceBillRequest setIsBillingItem(Boolean isBillingItem) {
        this.isBillingItem = isBillingItem;
        return this;
    }
    public Boolean getIsBillingItem() {
        return this.isBillingItem;
    }

    public DescribeInstanceBillRequest setIsHideZeroCharge(Boolean isHideZeroCharge) {
        this.isHideZeroCharge = isHideZeroCharge;
        return this;
    }
    public Boolean getIsHideZeroCharge() {
        return this.isHideZeroCharge;
    }

    public DescribeInstanceBillRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeInstanceBillRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeInstanceBillRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeInstanceBillRequest setPipCode(String pipCode) {
        this.pipCode = pipCode;
        return this;
    }
    public String getPipCode() {
        return this.pipCode;
    }

    public DescribeInstanceBillRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public DescribeInstanceBillRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public DescribeInstanceBillRequest setSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
        return this;
    }
    public String getSubscriptionType() {
        return this.subscriptionType;
    }

}
