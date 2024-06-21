// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class QueryReleaseMetricRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a341a2f2-ed07-4257-aae9-dfb1be******</p>
     */
    @NameInMap("ChangeOrderId")
    public String changeOrderId;

    /**
     * <strong>example:</strong>
     * <p>1634005438000</p>
     */
    @NameInMap("CreateTime")
    public Long createTime;

    /**
     * <strong>example:</strong>
     * <p>SystemContrast</p>
     */
    @NameInMap("MetricType")
    public String metricType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8b46d03f-5947-449d-90fd-3a96c2******</p>
     */
    @NameInMap("Pid")
    public String pid;

    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("ProxyUserId")
    public String proxyUserId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1632798718632</p>
     */
    @NameInMap("ReleaseEndTime")
    public Long releaseEndTime;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1632798686692</p>
     */
    @NameInMap("ReleaseStartTime")
    public Long releaseStartTime;

    /**
     * <strong>example:</strong>
     * <p>clothservice</p>
     */
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
