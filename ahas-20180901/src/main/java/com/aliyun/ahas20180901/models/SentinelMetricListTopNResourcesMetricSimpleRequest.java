// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelMetricListTopNResourcesMetricSimpleRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("AhasTimestamp")
    public Long ahasTimestamp;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("OrderBy")
    public Integer orderBy;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static SentinelMetricListTopNResourcesMetricSimpleRequest build(java.util.Map<String, ?> map) throws Exception {
        SentinelMetricListTopNResourcesMetricSimpleRequest self = new SentinelMetricListTopNResourcesMetricSimpleRequest();
        return TeaModel.build(map, self);
    }

    public SentinelMetricListTopNResourcesMetricSimpleRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public SentinelMetricListTopNResourcesMetricSimpleRequest setAhasTimestamp(Long ahasTimestamp) {
        this.ahasTimestamp = ahasTimestamp;
        return this;
    }
    public Long getAhasTimestamp() {
        return this.ahasTimestamp;
    }

    public SentinelMetricListTopNResourcesMetricSimpleRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public SentinelMetricListTopNResourcesMetricSimpleRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SentinelMetricListTopNResourcesMetricSimpleRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public SentinelMetricListTopNResourcesMetricSimpleRequest setOrderBy(Integer orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public Integer getOrderBy() {
        return this.orderBy;
    }

    public SentinelMetricListTopNResourcesMetricSimpleRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
