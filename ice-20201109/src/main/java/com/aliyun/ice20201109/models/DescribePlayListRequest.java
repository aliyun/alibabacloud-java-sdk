// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribePlayListRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("BeginTs")
    public String beginTs;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("EndTs")
    public String endTs;

    @NameInMap("OrderName")
    public String orderName;

    @NameInMap("OrderType")
    public String orderType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PlayType")
    public String playType;

    @NameInMap("Status")
    public String status;

    @NameInMap("TraceId")
    public String traceId;

    public static DescribePlayListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePlayListRequest self = new DescribePlayListRequest();
        return TeaModel.build(map, self);
    }

    public DescribePlayListRequest setBeginTs(String beginTs) {
        this.beginTs = beginTs;
        return this;
    }
    public String getBeginTs() {
        return this.beginTs;
    }

    public DescribePlayListRequest setEndTs(String endTs) {
        this.endTs = endTs;
        return this;
    }
    public String getEndTs() {
        return this.endTs;
    }

    public DescribePlayListRequest setOrderName(String orderName) {
        this.orderName = orderName;
        return this;
    }
    public String getOrderName() {
        return this.orderName;
    }

    public DescribePlayListRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public DescribePlayListRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public DescribePlayListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribePlayListRequest setPlayType(String playType) {
        this.playType = playType;
        return this;
    }
    public String getPlayType() {
        return this.playType;
    }

    public DescribePlayListRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribePlayListRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
