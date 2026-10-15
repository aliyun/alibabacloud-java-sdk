// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DescribeSplitItemBillRequest extends TeaModel {
    /**
     * <p>The ID of the resource ownership account. The resource ownership account is the account that actually uses the resource.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("BillOwnerId")
    public Long billOwnerId;

    /**
     * <p>The billing cycle. Format: YYYY-MM.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-03</p>
     */
    @NameInMap("BillingCycle")
    public String billingCycle;

    /**
     * <p>The billing date. This parameter is required only when Granularity is set to DAILY. Format: YYYY-MM-DD.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-03-02</p>
     */
    @NameInMap("BillingDate")
    public String billingDate;

    /**
     * <p>The granularity at which bills are queried. Valid values:</p>
     * <ul>
     * <li>MONTHLY: monthly. This value corresponds to the monthly bills on the Split Bill page in the User Center.</li>
     * <li>DAILY: daily. This value corresponds to the daily bills on the Split Bill page in the User Center.</li>
     * </ul>
     * <blockquote>
     * <p>If you set this parameter to DAILY, you must specify the BillingDate parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Monthly</p>
     */
    @NameInMap("Granularity")
    public String granularity;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>i-kjhdskjgshfdlkjfdh</p>
     */
    @NameInMap("InstanceID")
    public String instanceID;

    /**
     * <p>Specifies whether to filter out bills where both the original price (PretaxGrossAmount) and the payable amount (PretaxAmount) are 0. Valid values:</p>
     * <ul>
     * <li>false: does not filter out the bills.</li>
     * <li>true: filters out the bills.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsHideZeroCharge")
    public Boolean isHideZeroCharge;

    /**
     * <p>The maximum number of entries to return in the current call. Default value: 20. Maximum value: 300.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that specifies the position from which the current call starts to read data. The value must be empty or the value of NextToken returned in the previous response. Otherwise, an error occurs. An empty value indicates that the read operation starts from the beginning.</p>
     * 
     * <strong>example:</strong>
     * <p>CAESEgoQCg4KCmd</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The product code. This value is the same as the product code in the bills of the User Center.</p>
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
     * <p>The ID of the attached resource.</p>
     * 
     * <strong>example:</strong>
     * <p>i-kjhdskjgshfdlkjfdh</p>
     */
    @NameInMap("SplitItemID")
    public String splitItemID;

    /**
     * <p>The subscription type. Valid values:</p>
     * <ul>
     * <li>Subscription: subscription.</li>
     * <li>PayAsYouGo: pay-as-you-go.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter must be used together with the ProductCode parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>PayAsYouGo</p>
     */
    @NameInMap("SubscriptionType")
    public String subscriptionType;

    /**
     * <p>The tag filter conditions. Multiple sets of TagValues query conditions are supported. The logical relationship between multiple sets of TagValues conditions is OR.</p>
     */
    @NameInMap("TagFilter")
    public java.util.List<DescribeSplitItemBillRequestTagFilter> tagFilter;

    public static DescribeSplitItemBillRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSplitItemBillRequest self = new DescribeSplitItemBillRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSplitItemBillRequest setBillOwnerId(Long billOwnerId) {
        this.billOwnerId = billOwnerId;
        return this;
    }
    public Long getBillOwnerId() {
        return this.billOwnerId;
    }

    public DescribeSplitItemBillRequest setBillingCycle(String billingCycle) {
        this.billingCycle = billingCycle;
        return this;
    }
    public String getBillingCycle() {
        return this.billingCycle;
    }

    public DescribeSplitItemBillRequest setBillingDate(String billingDate) {
        this.billingDate = billingDate;
        return this;
    }
    public String getBillingDate() {
        return this.billingDate;
    }

    public DescribeSplitItemBillRequest setGranularity(String granularity) {
        this.granularity = granularity;
        return this;
    }
    public String getGranularity() {
        return this.granularity;
    }

    public DescribeSplitItemBillRequest setInstanceID(String instanceID) {
        this.instanceID = instanceID;
        return this;
    }
    public String getInstanceID() {
        return this.instanceID;
    }

    public DescribeSplitItemBillRequest setIsHideZeroCharge(Boolean isHideZeroCharge) {
        this.isHideZeroCharge = isHideZeroCharge;
        return this;
    }
    public Boolean getIsHideZeroCharge() {
        return this.isHideZeroCharge;
    }

    public DescribeSplitItemBillRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeSplitItemBillRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeSplitItemBillRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeSplitItemBillRequest setPipCode(String pipCode) {
        this.pipCode = pipCode;
        return this;
    }
    public String getPipCode() {
        return this.pipCode;
    }

    public DescribeSplitItemBillRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public DescribeSplitItemBillRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public DescribeSplitItemBillRequest setSplitItemID(String splitItemID) {
        this.splitItemID = splitItemID;
        return this;
    }
    public String getSplitItemID() {
        return this.splitItemID;
    }

    public DescribeSplitItemBillRequest setSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
        return this;
    }
    public String getSubscriptionType() {
        return this.subscriptionType;
    }

    public DescribeSplitItemBillRequest setTagFilter(java.util.List<DescribeSplitItemBillRequestTagFilter> tagFilter) {
        this.tagFilter = tagFilter;
        return this;
    }
    public java.util.List<DescribeSplitItemBillRequestTagFilter> getTagFilter() {
        return this.tagFilter;
    }

    public static class DescribeSplitItemBillRequestTagFilter extends TeaModel {
        /**
         * <p>TagFilter.N is used to query bills that match the specified tags. It consists of a key-value pair. The tag key must be 1 to 128 characters in length. Valid values of N: 1 to 20.</p>
         * <ul>
         * <li>If you specify only TagFilter.N.TagKey, all bills associated with the tag key are returned.</li>
         * <li>If you specify multiple tag key-value pairs, bills that match any of the tag key-value pairs are returned.</li>
         * <li>If the tags on a resource change, you can only query the bills generated during the period when the tags were attached to the resource.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>TagValues.N is used to query bills that match the specified tag values. It consists of a list of strings. The tag value must be 1 to 128 characters in length. Valid values of N: 1 to 20.</p>
         * <ul>
         * <li>If you specify TagValues.N, you must also specify TagFilter.N.TagKey. Otherwise, the InvalidParameter.TagValues error is reported.</li>
         * <li>If you specify multiple tag values, bills that match any of the tag values are returned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("TagValues")
        public java.util.List<String> tagValues;

        public static DescribeSplitItemBillRequestTagFilter build(java.util.Map<String, ?> map) throws Exception {
            DescribeSplitItemBillRequestTagFilter self = new DescribeSplitItemBillRequestTagFilter();
            return TeaModel.build(map, self);
        }

        public DescribeSplitItemBillRequestTagFilter setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeSplitItemBillRequestTagFilter setTagValues(java.util.List<String> tagValues) {
            this.tagValues = tagValues;
            return this;
        }
        public java.util.List<String> getTagValues() {
            return this.tagValues;
        }

    }

}
