// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QuerySystemResourceMetricOfGroupOnNodeRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("Group")
    public String group;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("ProcessConfigurationId")
    public String processConfigurationId;

    @NameInMap("StartTime")
    public Long startTime;

    public static QuerySystemResourceMetricOfGroupOnNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySystemResourceMetricOfGroupOnNodeRequest self = new QuerySystemResourceMetricOfGroupOnNodeRequest();
        return TeaModel.build(map, self);
    }

    public QuerySystemResourceMetricOfGroupOnNodeRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public QuerySystemResourceMetricOfGroupOnNodeRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QuerySystemResourceMetricOfGroupOnNodeRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public QuerySystemResourceMetricOfGroupOnNodeRequest setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

    public QuerySystemResourceMetricOfGroupOnNodeRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public QuerySystemResourceMetricOfGroupOnNodeRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public QuerySystemResourceMetricOfGroupOnNodeRequest setProcessConfigurationId(String processConfigurationId) {
        this.processConfigurationId = processConfigurationId;
        return this;
    }
    public String getProcessConfigurationId() {
        return this.processConfigurationId;
    }

    public QuerySystemResourceMetricOfGroupOnNodeRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
