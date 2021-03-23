// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryAccountBillRequest extends TeaModel {
    @NameInMap("BillingCycle")
    public String billingCycle;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("OwnerID")
    public Long ownerID;

    @NameInMap("IsGroupByProduct")
    public Boolean isGroupByProduct;

    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("BillOwnerId")
    public Long billOwnerId;

    @NameInMap("Granularity")
    public String granularity;

    @NameInMap("BillingDate")
    public String billingDate;

    public static QueryAccountBillRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAccountBillRequest self = new QueryAccountBillRequest();
        return TeaModel.build(map, self);
    }

    public QueryAccountBillRequest setBillingCycle(String billingCycle) {
        this.billingCycle = billingCycle;
        return this;
    }
    public String getBillingCycle() {
        return this.billingCycle;
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

    public QueryAccountBillRequest setOwnerID(Long ownerID) {
        this.ownerID = ownerID;
        return this;
    }
    public Long getOwnerID() {
        return this.ownerID;
    }

    public QueryAccountBillRequest setIsGroupByProduct(Boolean isGroupByProduct) {
        this.isGroupByProduct = isGroupByProduct;
        return this;
    }
    public Boolean getIsGroupByProduct() {
        return this.isGroupByProduct;
    }

    public QueryAccountBillRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public QueryAccountBillRequest setBillOwnerId(Long billOwnerId) {
        this.billOwnerId = billOwnerId;
        return this;
    }
    public Long getBillOwnerId() {
        return this.billOwnerId;
    }

    public QueryAccountBillRequest setGranularity(String granularity) {
        this.granularity = granularity;
        return this;
    }
    public String getGranularity() {
        return this.granularity;
    }

    public QueryAccountBillRequest setBillingDate(String billingDate) {
        this.billingDate = billingDate;
        return this;
    }
    public String getBillingDate() {
        return this.billingDate;
    }

}
