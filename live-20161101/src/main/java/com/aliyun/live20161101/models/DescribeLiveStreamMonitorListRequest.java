// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamMonitorListRequest extends TeaModel {
    @NameInMap("MonitorId")
    public String monitorId;

    @NameInMap("OrderRule")
    public Integer orderRule;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Status")
    public Integer status;

    public static DescribeLiveStreamMonitorListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamMonitorListRequest self = new DescribeLiveStreamMonitorListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamMonitorListRequest setMonitorId(String monitorId) {
        this.monitorId = monitorId;
        return this;
    }
    public String getMonitorId() {
        return this.monitorId;
    }

    public DescribeLiveStreamMonitorListRequest setOrderRule(Integer orderRule) {
        this.orderRule = orderRule;
        return this;
    }
    public Integer getOrderRule() {
        return this.orderRule;
    }

    public DescribeLiveStreamMonitorListRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeLiveStreamMonitorListRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public DescribeLiveStreamMonitorListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeLiveStreamMonitorListRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
