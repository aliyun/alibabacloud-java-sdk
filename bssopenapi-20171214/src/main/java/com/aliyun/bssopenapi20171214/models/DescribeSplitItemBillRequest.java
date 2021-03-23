// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DescribeSplitItemBillRequest extends TeaModel {
    @NameInMap("BillingCycle")
    public String billingCycle;

    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("ProductType")
    public String productType;

    @NameInMap("SubscriptionType")
    public String subscriptionType;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("BillOwnerId")
    public Long billOwnerId;

    @NameInMap("TagFilter")
    public java.util.List<DescribeSplitItemBillRequestTagFilter> tagFilter;

    @NameInMap("InstanceID")
    public String instanceID;

    @NameInMap("SplitItemID")
    public String splitItemID;

    public static DescribeSplitItemBillRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSplitItemBillRequest self = new DescribeSplitItemBillRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSplitItemBillRequest setBillingCycle(String billingCycle) {
        this.billingCycle = billingCycle;
        return this;
    }
    public String getBillingCycle() {
        return this.billingCycle;
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

    public DescribeSplitItemBillRequest setSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
        return this;
    }
    public String getSubscriptionType() {
        return this.subscriptionType;
    }

    public DescribeSplitItemBillRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeSplitItemBillRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeSplitItemBillRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeSplitItemBillRequest setBillOwnerId(Long billOwnerId) {
        this.billOwnerId = billOwnerId;
        return this;
    }
    public Long getBillOwnerId() {
        return this.billOwnerId;
    }

    public DescribeSplitItemBillRequest setTagFilter(java.util.List<DescribeSplitItemBillRequestTagFilter> tagFilter) {
        this.tagFilter = tagFilter;
        return this;
    }
    public java.util.List<DescribeSplitItemBillRequestTagFilter> getTagFilter() {
        return this.tagFilter;
    }

    public DescribeSplitItemBillRequest setInstanceID(String instanceID) {
        this.instanceID = instanceID;
        return this;
    }
    public String getInstanceID() {
        return this.instanceID;
    }

    public DescribeSplitItemBillRequest setSplitItemID(String splitItemID) {
        this.splitItemID = splitItemID;
        return this;
    }
    public String getSplitItemID() {
        return this.splitItemID;
    }

    public static class DescribeSplitItemBillRequestTagFilter extends TeaModel {
        @NameInMap("TagKey")
        public String tagKey;

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
