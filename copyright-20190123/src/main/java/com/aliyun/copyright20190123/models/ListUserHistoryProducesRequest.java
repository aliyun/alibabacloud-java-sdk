// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.copyright20190123.models;

import com.aliyun.tea.*;

public class ListUserHistoryProducesRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("BizType")
    public String bizType;

    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("Status")
    public Integer status;

    @NameInMap("IntentionBizId")
    public String intentionBizId;

    @NameInMap("SolutionBizId")
    public String solutionBizId;

    @NameInMap("ExtCondition")
    public String extCondition;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SortParam")
    public String sortParam;

    public static ListUserHistoryProducesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUserHistoryProducesRequest self = new ListUserHistoryProducesRequest();
        return TeaModel.build(map, self);
    }

    public ListUserHistoryProducesRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public ListUserHistoryProducesRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public ListUserHistoryProducesRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public ListUserHistoryProducesRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public ListUserHistoryProducesRequest setIntentionBizId(String intentionBizId) {
        this.intentionBizId = intentionBizId;
        return this;
    }
    public String getIntentionBizId() {
        return this.intentionBizId;
    }

    public ListUserHistoryProducesRequest setSolutionBizId(String solutionBizId) {
        this.solutionBizId = solutionBizId;
        return this;
    }
    public String getSolutionBizId() {
        return this.solutionBizId;
    }

    public ListUserHistoryProducesRequest setExtCondition(String extCondition) {
        this.extCondition = extCondition;
        return this;
    }
    public String getExtCondition() {
        return this.extCondition;
    }

    public ListUserHistoryProducesRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListUserHistoryProducesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListUserHistoryProducesRequest setSortParam(String sortParam) {
        this.sortParam = sortParam;
        return this;
    }
    public String getSortParam() {
        return this.sortParam;
    }

}
