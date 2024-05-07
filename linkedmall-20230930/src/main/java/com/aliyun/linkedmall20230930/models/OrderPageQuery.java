// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class OrderPageQuery extends TeaModel {
    @NameInMap("orderIdList")
    public java.util.List<String> orderIdList;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("purchaseOrderId")
    public String purchaseOrderId;

    public static OrderPageQuery build(java.util.Map<String, ?> map) throws Exception {
        OrderPageQuery self = new OrderPageQuery();
        return TeaModel.build(map, self);
    }

    public OrderPageQuery setOrderIdList(java.util.List<String> orderIdList) {
        this.orderIdList = orderIdList;
        return this;
    }
    public java.util.List<String> getOrderIdList() {
        return this.orderIdList;
    }

    public OrderPageQuery setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public OrderPageQuery setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public OrderPageQuery setPurchaseOrderId(String purchaseOrderId) {
        this.purchaseOrderId = purchaseOrderId;
        return this;
    }
    public String getPurchaseOrderId() {
        return this.purchaseOrderId;
    }

}
