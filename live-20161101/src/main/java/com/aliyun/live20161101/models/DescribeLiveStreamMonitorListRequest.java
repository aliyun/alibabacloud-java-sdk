// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamMonitorListRequest extends TeaModel {
    /**
     * <p>The ID of the monitoring session.</p>
     * <blockquote>
     * <p> You can obtain the monitoring session ID from the response parameter MonitorId of the <a href="https://help.aliyun.com/document_detail/2848129.html">CreateLiveStreamMonitor</a> operation. If you leave this parameter empty, the data of all monitoring sessions is returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>445409ec-7eaa-461d-8f29-4bec2eb9****</p>
     */
    @NameInMap("MonitorId")
    public String monitorId;

    /**
     * <p>The sorting order of monitoring sessions. Valid values:</p>
     * <ul>
     * <li>0: Monitoring sessions are sorted by status.</li>
     * <li>1: Monitoring sessions are sorted by start time in descending order.</li>
     * <li>2: Monitoring sessions are sorted by start time in ascending order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("OrderRule")
    public Integer orderRule;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of monitoring sessions to return per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The status of the monitoring session. Valid values:</p>
     * <ul>
     * <li>1: Monitoring</li>
     * <li>0: Unmonitored</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
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

    public DescribeLiveStreamMonitorListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeLiveStreamMonitorListRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
