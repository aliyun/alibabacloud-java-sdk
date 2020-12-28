// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class GetMetricsOfResourceRequest extends TeaModel {
    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("Resource")
    public String resource;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    public static GetMetricsOfResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMetricsOfResourceRequest self = new GetMetricsOfResourceRequest();
        return TeaModel.build(map, self);
    }

    public GetMetricsOfResourceRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public GetMetricsOfResourceRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetMetricsOfResourceRequest setResource(String resource) {
        this.resource = resource;
        return this;
    }
    public String getResource() {
        return this.resource;
    }

    public GetMetricsOfResourceRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public GetMetricsOfResourceRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetMetricsOfResourceRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

}
