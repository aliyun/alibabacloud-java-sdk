// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterListBalanceOrdersRequest extends TeaModel {
    /**
     * <p>The balance type filter. Valid values: permanent, monthly. If this parameter is left empty, all types are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>permanent</p>
     */
    @NameInMap("balanceType")
    public String balanceType;

    /**
     * <p>The direction filter. Valid values: in (income), out (expenditure). If this parameter is left empty, all directions are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>in</p>
     */
    @NameInMap("direction")
    public String direction;

    /**
     * <p>The maximum number of results.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token for the next page.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx-xxx-xxxxx</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The change type filter. Valid values: recharge, periodic_recharge, manual_deduct, transfer_out, transfer_in, return_out, return_in, write_off, monthly_expire, and deficit_writeoff. If this parameter is left empty, all types are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>recharge</p>
     */
    @NameInMap("orderType")
    public String orderType;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Integer page;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    public static ModelRouterListBalanceOrdersRequest build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterListBalanceOrdersRequest self = new ModelRouterListBalanceOrdersRequest();
        return TeaModel.build(map, self);
    }

    public ModelRouterListBalanceOrdersRequest setBalanceType(String balanceType) {
        this.balanceType = balanceType;
        return this;
    }
    public String getBalanceType() {
        return this.balanceType;
    }

    public ModelRouterListBalanceOrdersRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public ModelRouterListBalanceOrdersRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ModelRouterListBalanceOrdersRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ModelRouterListBalanceOrdersRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public ModelRouterListBalanceOrdersRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public ModelRouterListBalanceOrdersRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
