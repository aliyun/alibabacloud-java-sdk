// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20181219.models;

import com.aliyun.tea.*;

public class SearchTracesRequest extends TeaModel {
    @NameInMap("AppType")
    public String appType;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("MinDuration")
    public Long minDuration;

    @NameInMap("OperationName")
    public String operationName;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ServiceName")
    public String serviceName;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("Tag1")
    public String tag1;

    @NameInMap("Tag2")
    public String tag2;

    public static SearchTracesRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchTracesRequest self = new SearchTracesRequest();
        return TeaModel.build(map, self);
    }

    public SearchTracesRequest setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public SearchTracesRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public SearchTracesRequest setMinDuration(Long minDuration) {
        this.minDuration = minDuration;
        return this;
    }
    public Long getMinDuration() {
        return this.minDuration;
    }

    public SearchTracesRequest setOperationName(String operationName) {
        this.operationName = operationName;
        return this;
    }
    public String getOperationName() {
        return this.operationName;
    }

    public SearchTracesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SearchTracesRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public SearchTracesRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public SearchTracesRequest setTag1(String tag1) {
        this.tag1 = tag1;
        return this;
    }
    public String getTag1() {
        return this.tag1;
    }

    public SearchTracesRequest setTag2(String tag2) {
        this.tag2 = tag2;
        return this;
    }
    public String getTag2() {
        return this.tag2;
    }

}
