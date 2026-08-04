// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterListMemberBalanceOrdersRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>permanent</p>
     */
    @NameInMap("balanceType")
    public String balanceType;

    /**
     * <strong>example:</strong>
     * <p>in</p>
     */
    @NameInMap("direction")
    public String direction;

    /**
     * <strong>example:</strong>
     * <p>recharge</p>
     */
    @NameInMap("orderType")
    public String orderType;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Integer page;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    public static ModelRouterListMemberBalanceOrdersRequest build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterListMemberBalanceOrdersRequest self = new ModelRouterListMemberBalanceOrdersRequest();
        return TeaModel.build(map, self);
    }

    public ModelRouterListMemberBalanceOrdersRequest setBalanceType(String balanceType) {
        this.balanceType = balanceType;
        return this;
    }
    public String getBalanceType() {
        return this.balanceType;
    }

    public ModelRouterListMemberBalanceOrdersRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public ModelRouterListMemberBalanceOrdersRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public ModelRouterListMemberBalanceOrdersRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public ModelRouterListMemberBalanceOrdersRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
