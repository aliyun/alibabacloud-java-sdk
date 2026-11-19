// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class GeneralBillPageQuery extends TeaModel {
    /**
     * <p>asc</p>
     */
    @NameInMap("asc")
    public Boolean asc;

    /**
     * <p>billId</p>
     * 
     * <strong>example:</strong>
     * <p>bill_demo_001</p>
     */
    @NameInMap("billId")
    public String billId;

    /**
     * <p>billPeriod</p>
     * 
     * <strong>example:</strong>
     * <p>2022-08</p>
     */
    @NameInMap("billPeriod")
    public String billPeriod;

    /**
     * <p>limit</p>
     */
    @NameInMap("limit")
    public Integer limit;

    /**
     * <p>orderBy</p>
     */
    @NameInMap("orderBy")
    public String orderBy;

    /**
     * <p>orderDirection</p>
     */
    @NameInMap("orderDirection")
    public String orderDirection;

    /**
     * <p>pageNumber</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>pageSize</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>shopId</p>
     * 
     * <strong>example:</strong>
     * <p>21000017</p>
     */
    @NameInMap("shopId")
    public String shopId;

    /**
     * <p>start</p>
     */
    @NameInMap("start")
    public Integer start;

    public static GeneralBillPageQuery build(java.util.Map<String, ?> map) throws Exception {
        GeneralBillPageQuery self = new GeneralBillPageQuery();
        return TeaModel.build(map, self);
    }

    public GeneralBillPageQuery setAsc(Boolean asc) {
        this.asc = asc;
        return this;
    }
    public Boolean getAsc() {
        return this.asc;
    }

    public GeneralBillPageQuery setBillId(String billId) {
        this.billId = billId;
        return this;
    }
    public String getBillId() {
        return this.billId;
    }

    public GeneralBillPageQuery setBillPeriod(String billPeriod) {
        this.billPeriod = billPeriod;
        return this;
    }
    public String getBillPeriod() {
        return this.billPeriod;
    }

    public GeneralBillPageQuery setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public GeneralBillPageQuery setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public GeneralBillPageQuery setOrderDirection(String orderDirection) {
        this.orderDirection = orderDirection;
        return this;
    }
    public String getOrderDirection() {
        return this.orderDirection;
    }

    public GeneralBillPageQuery setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public GeneralBillPageQuery setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GeneralBillPageQuery setShopId(String shopId) {
        this.shopId = shopId;
        return this;
    }
    public String getShopId() {
        return this.shopId;
    }

    public GeneralBillPageQuery setStart(Integer start) {
        this.start = start;
        return this;
    }
    public Integer getStart() {
        return this.start;
    }

}
