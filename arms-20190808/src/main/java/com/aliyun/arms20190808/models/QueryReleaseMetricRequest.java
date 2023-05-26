// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class QueryReleaseMetricRequest extends TeaModel {
    @NameInMap("ChangeOrderId")
    public String changeOrderId;

    @NameInMap("CreateTime")
    public Long createTime;

    @NameInMap("MetricType")
    public String metricType;

    @NameInMap("Pid")
    public String pid;

    @NameInMap("ProxyUserId")
    public String proxyUserId;

    @NameInMap("ReleaseEndTime")
    public Long releaseEndTime;

    @NameInMap("ReleaseStartTime")
    public Long releaseStartTime;

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
