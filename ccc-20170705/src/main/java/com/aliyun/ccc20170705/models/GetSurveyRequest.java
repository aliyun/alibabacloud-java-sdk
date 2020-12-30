// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class GetSurveyRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ScenarioId")
    public String scenarioId;

    @NameInMap("SurveyId")
    public String surveyId;

    public static GetSurveyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSurveyRequest self = new GetSurveyRequest();
        return TeaModel.build(map, self);
    }

    public GetSurveyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetSurveyRequest setScenarioId(String scenarioId) {
        this.scenarioId = scenarioId;
        return this;
    }
    public String getScenarioId() {
        return this.scenarioId;
    }

    public GetSurveyRequest setSurveyId(String surveyId) {
        this.surveyId = surveyId;
        return this;
    }
    public String getSurveyId() {
        return this.surveyId;
    }

}
