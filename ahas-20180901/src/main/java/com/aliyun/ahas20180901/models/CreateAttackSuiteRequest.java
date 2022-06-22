// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class CreateAttackSuiteRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("ScenarioDisplayVO")
    public String scenarioDisplayVO;

    @NameInMap("SourceType")
    public Integer sourceType;

    public static CreateAttackSuiteRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAttackSuiteRequest self = new CreateAttackSuiteRequest();
        return TeaModel.build(map, self);
    }

    public CreateAttackSuiteRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public CreateAttackSuiteRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateAttackSuiteRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public CreateAttackSuiteRequest setScenarioDisplayVO(String scenarioDisplayVO) {
        this.scenarioDisplayVO = scenarioDisplayVO;
        return this;
    }
    public String getScenarioDisplayVO() {
        return this.scenarioDisplayVO;
    }

    public CreateAttackSuiteRequest setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public Integer getSourceType() {
        return this.sourceType;
    }

}
