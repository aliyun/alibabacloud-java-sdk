// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeCloudGtmSummaryResponseBody extends TeaModel {
    /**
     * <p>The total number of instances within the current account.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("InstanceTotalCount")
    public Integer instanceTotalCount;

    /**
     * <p>The total number of configured health check tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MonitorTaskTotalCount")
    public Integer monitorTaskTotalCount;

    /**
     * <p>The quota on the number of health check tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>101</p>
     */
    @NameInMap("MonitorTaskTotalQuota")
    public Integer monitorTaskTotalQuota;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>199C3699-9A7B-41A1-BB5A-F1E862D3CB38</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCloudGtmSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudGtmSummaryResponseBody self = new DescribeCloudGtmSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCloudGtmSummaryResponseBody setInstanceTotalCount(Integer instanceTotalCount) {
        this.instanceTotalCount = instanceTotalCount;
        return this;
    }
    public Integer getInstanceTotalCount() {
        return this.instanceTotalCount;
    }

    public DescribeCloudGtmSummaryResponseBody setMonitorTaskTotalCount(Integer monitorTaskTotalCount) {
        this.monitorTaskTotalCount = monitorTaskTotalCount;
        return this;
    }
    public Integer getMonitorTaskTotalCount() {
        return this.monitorTaskTotalCount;
    }

    public DescribeCloudGtmSummaryResponseBody setMonitorTaskTotalQuota(Integer monitorTaskTotalQuota) {
        this.monitorTaskTotalQuota = monitorTaskTotalQuota;
        return this;
    }
    public Integer getMonitorTaskTotalQuota() {
        return this.monitorTaskTotalQuota;
    }

    public DescribeCloudGtmSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
