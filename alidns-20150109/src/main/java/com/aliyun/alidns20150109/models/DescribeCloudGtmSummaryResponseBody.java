// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeCloudGtmSummaryResponseBody extends TeaModel {
    @NameInMap("InstanceTotalCount")
    public Integer instanceTotalCount;

    @NameInMap("MonitorTaskTotalCount")
    public Integer monitorTaskTotalCount;

    @NameInMap("MonitorTaskTotalQuota")
    public Integer monitorTaskTotalQuota;

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
