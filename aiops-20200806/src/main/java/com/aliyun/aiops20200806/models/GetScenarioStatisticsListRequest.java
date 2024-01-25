// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetScenarioStatisticsListRequest extends TeaModel {
    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("OperaUid")
    public String operaUid;

    @NameInMap("ScenarioIds")
    public String scenarioIds;

    public static GetScenarioStatisticsListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetScenarioStatisticsListRequest self = new GetScenarioStatisticsListRequest();
        return TeaModel.build(map, self);
    }

    public GetScenarioStatisticsListRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetScenarioStatisticsListRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

    public GetScenarioStatisticsListRequest setScenarioIds(String scenarioIds) {
        this.scenarioIds = scenarioIds;
        return this;
    }
    public String getScenarioIds() {
        return this.scenarioIds;
    }

}
