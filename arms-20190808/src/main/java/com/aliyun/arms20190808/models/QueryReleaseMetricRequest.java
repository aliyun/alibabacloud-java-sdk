// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class QueryReleaseMetricRequest extends TeaModel {
    // The ID of the change order.
    @NameInMap("ChangeOrderId")
    public String changeOrderId;

    // The time when the change order was created.
    @NameInMap("CreateTime")
    public Long createTime;

    // The type of the metric that you want to query.
    @NameInMap("MetricType")
    public String metricType;

    // The ID of the Enterprise Distributed Application Service (EDAS) or Kubernetes application.
    @NameInMap("Pid")
    public String pid;

    // This parameter is not in use.
    @NameInMap("ProxyUserId")
    public String proxyUserId;

    // The end time of the version release.
    @NameInMap("ReleaseEndTime")
    public Long releaseEndTime;

    // The start time of the version release.
    @NameInMap("ReleaseStartTime")
    public Long releaseStartTime;

    // The service that you want to query.
    @NameInMap("Service")
    public String service;

    public static QueryReleaseMetricRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryReleaseMetricRequest self = new QueryReleaseMetricRequest();
        return TeaModel.build(map, self);
    }

    public QueryReleaseMetricRequest setChangeOrderId(String changeOrderId) {
        this.changeOrderId = changeOrderId;
        return this;
    }
    public String getChangeOrderId() {
        return this.changeOrderId;
    }

    public QueryReleaseMetricRequest setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public QueryReleaseMetricRequest setMetricType(String metricType) {
        this.metricType = metricType;
        return this;
    }
    public String getMetricType() {
        return this.metricType;
    }

    public QueryReleaseMetricRequest setPid(String pid) {
        this.pid = pid;
        return this;
    }
    public String getPid() {
        return this.pid;
    }

    public QueryReleaseMetricRequest setProxyUserId(String proxyUserId) {
        this.proxyUserId = proxyUserId;
        return this;
    }
    public String getProxyUserId() {
        return this.proxyUserId;
    }

    public QueryReleaseMetricRequest setReleaseEndTime(Long releaseEndTime) {
        this.releaseEndTime = releaseEndTime;
        return this;
    }
    public Long getReleaseEndTime() {
        return this.releaseEndTime;
    }

    public QueryReleaseMetricRequest setReleaseStartTime(Long releaseStartTime) {
        this.releaseStartTime = releaseStartTime;
        return this;
    }
    public Long getReleaseStartTime() {
        return this.releaseStartTime;
    }

    public QueryReleaseMetricRequest setService(String service) {
        this.service = service;
        return this;
    }
    public String getService() {
        return this.service;
    }

}
