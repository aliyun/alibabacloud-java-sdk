// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mhub20170825.models;

import com.aliyun.tea.*;

public class DescribeDashboardRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>29201799</p>
     */
    @NameInMap("AppKey")
    public String appKey;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AppType")
    public Integer appType;

    /**
     * <strong>example:</strong>
     * <p>4.8</p>
     */
    @NameInMap("AppVersion")
    public String appVersion;

    /**
     * <strong>example:</strong>
     * <p>1681985390256</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <strong>example:</strong>
     * <p>4.8</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <strong>example:</strong>
     * <p>queryAppVersions</p>
     */
    @NameInMap("ProxyAction")
    public String proxyAction;

    /**
     * <strong>example:</strong>
     * <p>mqc</p>
     */
    @NameInMap("ServiceName")
    public String serviceName;

    /**
     * <strong>example:</strong>
     * <p>1681369984564</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static DescribeDashboardRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDashboardRequest self = new DescribeDashboardRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDashboardRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public DescribeDashboardRequest setAppType(Integer appType) {
        this.appType = appType;
        return this;
    }
    public Integer getAppType() {
        return this.appType;
    }

    public DescribeDashboardRequest setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public DescribeDashboardRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeDashboardRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public DescribeDashboardRequest setProxyAction(String proxyAction) {
        this.proxyAction = proxyAction;
        return this;
    }
    public String getProxyAction() {
        return this.proxyAction;
    }

    public DescribeDashboardRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public DescribeDashboardRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
