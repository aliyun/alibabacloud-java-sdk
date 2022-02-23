// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20210609.models;

import com.aliyun.tea.*;

public class QueryFusionOrderListRequest extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("EndUserId")
    public Long endUserId;

    @NameInMap("OrderId")
    public Long orderId;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("StartTime")
    public String startTime;

    public static QueryFusionOrderListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryFusionOrderListRequest self = new QueryFusionOrderListRequest();
        return TeaModel.build(map, self);
    }

    public QueryFusionOrderListRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public QueryFusionOrderListRequest setEndUserId(Long endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public Long getEndUserId() {
        return this.endUserId;
    }

    public QueryFusionOrderListRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public QueryFusionOrderListRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public QueryFusionOrderListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryFusionOrderListRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
