// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribePalyListRequest extends TeaModel {
    @NameInMap("BeginTs")
    public String beginTs;

    @NameInMap("EndTs")
    public String endTs;

    @NameInMap("OrderName")
    public String orderName;

    @NameInMap("OrderType")
    public String orderType;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PlayType")
    public String playType;

    @NameInMap("Status")
    public String status;

    @NameInMap("TraceId")
    public String traceId;

    public static DescribePalyListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePalyListRequest self = new DescribePalyListRequest();
        return TeaModel.build(map, self);
    }

    public DescribePalyListRequest setBeginTs(String beginTs) {
        this.beginTs = beginTs;
        return this;
    }
    public String getBeginTs() {
        return this.beginTs;
    }

    public DescribePalyListRequest setEndTs(String endTs) {
        this.endTs = endTs;
        return this;
    }
    public String getEndTs() {
        return this.endTs;
    }

    public DescribePalyListRequest setOrderName(String orderName) {
        this.orderName = orderName;
        return this;
    }
    public String getOrderName() {
        return this.orderName;
    }

    public DescribePalyListRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public DescribePalyListRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public DescribePalyListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribePalyListRequest setPlayType(String playType) {
        this.playType = playType;
        return this;
    }
    public String getPlayType() {
        return this.playType;
    }

    public DescribePalyListRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribePalyListRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
