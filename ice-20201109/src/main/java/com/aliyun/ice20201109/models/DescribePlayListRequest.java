// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribePlayListRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1676170500011</p>
     */
    @NameInMap("BeginTs")
    public String beginTs;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1682474405173</p>
     */
    @NameInMap("EndTs")
    public String endTs;

    /**
     * <strong>example:</strong>
     * <p>FirstFrameDuration</p>
     */
    @NameInMap("OrderName")
    public String orderName;

    /**
     * <strong>example:</strong>
     * <p>DESC</p>
     */
    @NameInMap("OrderType")
    public String orderType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>vod</p>
     */
    @NameInMap("PlayType")
    public String playType;

    /**
     * <strong>example:</strong>
     * <p>complete</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>0bc5e70516766285805381012d271e</p>
     */
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
