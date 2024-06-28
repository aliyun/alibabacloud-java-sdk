// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryAccountBillRequest extends TeaModel {
    /**
     * <p>The ID of the member. If you specify a value for this parameter, you can query the bills of the specified member. If you leave this parameter empty, the bills of the current account are queried by default.</p>
     * 
     * <strong>example:</strong>
     * <p>122</p>
     */
    @NameInMap("BillOwnerId")
    public Long billOwnerId;

    /**
     * <p>The billing cycle. Format: YYYY-MM.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2018-07</p>
     */
    @NameInMap("BillingCycle")
    public String billingCycle;

    /**
     * <p>The billing date. This parameter is required only if the Granularity parameter is set to DAILY. Format: YYYY-MM-DD.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-06-01</p>
     */
    @NameInMap("BillingDate")
    public String billingDate;

    /**
     * <p>The granularity at which bills are queried. Valid values:</p>
     * <ul>
     * <li>MONTHLY: queries bills by month. The data queried is consistent with the data that is displayed for the specified billing cycle on the Billing Details tab of the Bill Details page in User Center.</li>
     * <li>DAILY: queries bills by day. The data queried is consistent with the data that is displayed for the specified day on the Billing Details tab of the Bill Details page in User Center.</li>
     * </ul>
     * <p>You must set the BillingDate parameter before you can set the Granularity parameter to DAILY.</p>
     * 
     * <strong>example:</strong>
     * <p>Monthly</p>
     */
    @NameInMap("Granularity")
    public String granularity;

    /**
     * <p>Specifies whether to summarize bills based on service codes. Valid values:</p>
     * <ul>
     * <li>true: summarizes bills based on service codes.</li>
     * <li>false: does not summarize bills based on service codes.</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsGroupByProduct")
    public Boolean isGroupByProduct;

    @NameInMap("OwnerID")
    public Long ownerID;

    /**
     * <p>The number of the page to return. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of entries to return on each page. Default value: 20. Maximum value: 300.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The code of the service.</p>
     * 
     * <strong>example:</strong>
     * <p>rds</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    public static QueryAccountBillRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAccountBillRequest self = new QueryAccountBillRequest();
        return TeaModel.build(map, self);
    }

    public QueryAccountBillRequest setBillOwnerId(Long billOwnerId) {
        this.billOwnerId = billOwnerId;
        return this;
    }
    public Long getBillOwnerId() {
        return this.billOwnerId;
    }

    public QueryAccountBillRequest setBillingCycle(String billingCycle) {
        this.billingCycle = billingCycle;
        return this;
    }
    public String getBillingCycle() {
        return this.billingCycle;
    }

    public QueryAccountBillRequest setBillingDate(String billingDate) {
        this.billingDate = billingDate;
        return this;
    }
    public String getBillingDate() {
        return this.billingDate;
    }

    public QueryAccountBillRequest setGranularity(String granularity) {
        this.granularity = granularity;
        return this;
    }
    public String getGranularity() {
        return this.granularity;
    }

    public QueryAccountBillRequest setIsGroupByProduct(Boolean isGroupByProduct) {
        this.isGroupByProduct = isGroupByProduct;
        return this;
    }
    public Boolean getIsGroupByProduct() {
        return this.isGroupByProduct;
    }

    public QueryAccountBillRequest setOwnerID(Long ownerID) {
        this.ownerID = ownerID;
        return this;
    }
    public Long getOwnerID() {
        return this.ownerID;
    }

    public QueryAccountBillRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public QueryAccountBillRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryAccountBillRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

}
