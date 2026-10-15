// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryAccountBillRequest extends TeaModel {
    /**
     * <p>The ID of the account that owns and actually uses the resource.</p>
     * 
     * <strong>example:</strong>
     * <p>122</p>
     */
    @NameInMap("BillOwnerId")
    public Long billOwnerId;

    /**
     * <p>The billing date. Format: YYYY-MM.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2018-07</p>
     */
    @NameInMap("BillingCycle")
    public String billingCycle;

    /**
     * <p>The billing date. This parameter is required only when you set Granularity to DAILY. Format: YYYY-MM-DD.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-06-01</p>
     */
    @NameInMap("BillingDate")
    public String billingDate;

    /**
     * <p>The granularity for querying the bill. Valid values:</p>
     * <ul>
     * <li><p>MONTHLY: Queries bills on a monthly basis. Corresponds to the monthly bills in <strong>Expenses &amp; Costs&#xA;</strong>&gt; <strong>Bills&#xA;</strong>&gt; <strong>Bill Details&#xA;</strong>.</p>
     * </li>
     * <li><p>DAILY: Queries bills on a daily basis. Corresponds to the daily bills in <strong>Expenses &amp; Costs&#xA;</strong>&gt; <strong>Bills&#xA;</strong>&gt; <strong>Bill Details&#xA;</strong>.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you set <code>Granularity</code> to <code>DAILY</code>, you must also specify the <code>BillingDate</code> parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>MONTHLY</p>
     */
    @NameInMap("Granularity")
    public String granularity;

    /**
     * <p>Specifies whether to aggregate the results by product code.</p>
     * <ul>
     * <li><p>true: Results are aggregated by product code.</p>
     * </li>
     * <li><p>false: Results are not aggregated by product code.</p>
     * </li>
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
     * <p>The page number. The default value is 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of entries per page. The default value is 20. The maximum value is 300.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The product code.</p>
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
