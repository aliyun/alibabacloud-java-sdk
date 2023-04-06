// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dashscope20230320.models;

import com.aliyun.tea.*;

public class GetInvokeStatisticsRequest extends TeaModel {
    /**
     * <p>ApiKey</p>
     */
    @NameInMap("ApiKey")
    public String apiKey;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("ModelName")
    public String modelName;

    @NameInMap("Region")
    public String region;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("TimeUnit")
    public String timeUnit;

    public static GetInvokeStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInvokeStatisticsRequest self = new GetInvokeStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public GetInvokeStatisticsRequest setApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    public String getApiKey() {
        return this.apiKey;
    }

    public GetInvokeStatisticsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetInvokeStatisticsRequest setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public GetInvokeStatisticsRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public GetInvokeStatisticsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public GetInvokeStatisticsRequest setTimeUnit(String timeUnit) {
        this.timeUnit = timeUnit;
        return this;
    }
    public String getTimeUnit() {
        return this.timeUnit;
    }

}
