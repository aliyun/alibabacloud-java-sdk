// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QuerySettleBillRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("BillOwnerId")
    public Long billOwnerId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2018-07</p>
     */
    @NameInMap("BillingCycle")
    public String billingCycle;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsDisplayLocalCurrency")
    public Boolean isDisplayLocalCurrency;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsHideZeroCharge")
    public Boolean isHideZeroCharge;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>CAESEgoQCg4KCmdtdF9jcmVhdGUEARgBIkgKCQBwhGmPcAEAAAo7AzYAAAAxTDgwMDcxMjg3ZDJhNmM3ZDguTDgwMDAwMDAwMDAwMzE1MTIuTDgwMDcyZDMyZTJkYzg3N2U</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <strong>example:</strong>
     * <p>rds</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <strong>example:</strong>
     * <p>rds</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <strong>example:</strong>
     * <p>12233</p>
     */
    @NameInMap("RecordID")
    public String recordID;

    /**
     * <strong>example:</strong>
     * <p>Subscription</p>
     */
    @NameInMap("SubscriptionType")
    public String subscriptionType;

    /**
     * <strong>example:</strong>
     * <p>SubscriptionOrder</p>
     */
    @NameInMap("Type")
    public String type;

    public static QuerySettleBillRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySettleBillRequest self = new QuerySettleBillRequest();
        return TeaModel.build(map, self);
    }

    public QuerySettleBillRequest setBillOwnerId(Long billOwnerId) {
        this.billOwnerId = billOwnerId;
        return this;
    }
    public Long getBillOwnerId() {
        return this.billOwnerId;
    }

    public QuerySettleBillRequest setBillingCycle(String billingCycle) {
        this.billingCycle = billingCycle;
        return this;
    }
    public String getBillingCycle() {
        return this.billingCycle;
    }

    public QuerySettleBillRequest setIsDisplayLocalCurrency(Boolean isDisplayLocalCurrency) {
        this.isDisplayLocalCurrency = isDisplayLocalCurrency;
        return this;
    }
    public Boolean getIsDisplayLocalCurrency() {
        return this.isDisplayLocalCurrency;
    }

    public QuerySettleBillRequest setIsHideZeroCharge(Boolean isHideZeroCharge) {
        this.isHideZeroCharge = isHideZeroCharge;
        return this;
    }
    public Boolean getIsHideZeroCharge() {
        return this.isHideZeroCharge;
    }

    public QuerySettleBillRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public QuerySettleBillRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public QuerySettleBillRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QuerySettleBillRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public QuerySettleBillRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public QuerySettleBillRequest setRecordID(String recordID) {
        this.recordID = recordID;
        return this;
    }
    public String getRecordID() {
        return this.recordID;
    }

    public QuerySettleBillRequest setSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
        return this;
    }
    public String getSubscriptionType() {
        return this.subscriptionType;
    }

    public QuerySettleBillRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
