// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DescribeSplitItemBillRequest extends TeaModel {
    /**
     * <p>The ID of the member. If you specify this parameter, the bills of the member are queried. If you do not specify this parameter, the bills of the current account are queried by default.</p>
     */
    @NameInMap("BillOwnerId")
    public Long billOwnerId;

    /**
     * <p>The billing cycle. Specify the parameter in the YYYY-MM format.</p>
     */
    @NameInMap("BillingCycle")
    public String billingCycle;

    /**
     * <p>The billing date. This parameter is required only when the Granularity parameter is set to DAILY. Format: YYYY-MM-DD.</p>
     */
    @NameInMap("BillingDate")
    public String billingDate;

    /**
     * <p>The granularity at which bills are queried. Valid values:</p>
     * <br>
     * <p>*   MONTHLY: queries bills on a monthly basis. The data that you query is the same as the data that is queried by billing cycles in the Split Bill module of the User Center console.</p>
     * <p>*   DAILY: queries bills on a daily basis. The data that you query is the same as the data that is queried by days in the Split Bill module of the User Center console.</p>
     * <br>
     * <p>If you specify DAILY for this parameter, the BillingDate parameter is required.</p>
     */
    @NameInMap("Granularity")
    public String granularity;

    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("InstanceID")
    public String instanceID;

    /**
     * <p>The maximum number of entries to query. Default value: 20. Maximum value: 300.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used for the next query. The parameter must be left empty or set to the value of the NextToken parameter returned in the last call. Otherwise, an error is returned. If the parameter is left empty, the data is queried from the first entry.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The code of the service.</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The type of the service.</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>The ID of the split item.</p>
     */
    @NameInMap("SplitItemID")
    public String splitItemID;

    /**
     * <p>The billing method. Valid values: Subscription: the subscription billing method. PayAsYouGo: the pay-as-you-go billing method. This parameter must be used with the ProductCode parameter.</p>
     */
    @NameInMap("SubscriptionType")
    public String subscriptionType;

    /**
     * <p>The tags that are used to filter split bills. You can specify multiple tag values. If you specify multiple tag values, split bills that match one of the tag values are queried.</p>
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
         * <p>The TagFilter.N parameter is used to query bills that match a specified tag. The value of the TagFilter.N parameter must be a key-value pair. The tag key must be 1 to 128 characters in length. Valid values of N: 1 to 20.</p>
         * <br>
         * <p>*   If only the TagFilter.N.TagKey parameter is specified, all bills associated with the tag key are queried.</p>
         * <p>*   If you specify multiple tag key-value pairs at the same time, bills that meet any one of the tag key-value pairs are queried.</p>
         * <p>*   If the tags added to resources change, you can query only the bills that are generated within the period in which the tags and resources are associated.</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>You can specify the TagValues.N parameter to query bills that match the specified tag value. The value of the TagValues.N parameter must be a string. The tag value must be 1 to 128 characters in length. Valid values of N: 1 to 20.</p>
         * <br>
         * <p>*   If you specify the TagValues.N parameter, the TagFilter.N.TagKey parameter is required. Otherwise, the error message InvalidParameter.TagValues is returned.</p>
         * <p>*   If you specify multiple tag values, split bills that match one of the tag values are queried.</p>
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
