// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class PublishSurveyRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ScenarioId")
    public String scenarioId;

    @NameInMap("SurveyId")
    public String surveyId;

    public static PublishSurveyRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishSurveyRequest self = new PublishSurveyRequest();
        return TeaModel.build(map, self);
    }

    public PublishSurveyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public PublishSurveyRequest setScenarioId(String scenarioId) {
        this.scenarioId = scenarioId;
        return this;
    }
    public String getScenarioId() {
        return this.scenarioId;
    }

    public PublishSurveyRequest setSurveyId(String surveyId) {
        this.surveyId = surveyId;
        return this;
    }
    public String getSurveyId() {
        return this.surveyId;
    }

}
