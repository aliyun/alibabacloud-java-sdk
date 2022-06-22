// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class UpdateAttackSuiteRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("AttackSuiteId")
    public String attackSuiteId;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("ScenarioDisplayVO")
    public String scenarioDisplayVO;

    public static UpdateAttackSuiteRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAttackSuiteRequest self = new UpdateAttackSuiteRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAttackSuiteRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public UpdateAttackSuiteRequest setAttackSuiteId(String attackSuiteId) {
        this.attackSuiteId = attackSuiteId;
        return this;
    }
    public String getAttackSuiteId() {
        return this.attackSuiteId;
    }

    public UpdateAttackSuiteRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateAttackSuiteRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public UpdateAttackSuiteRequest setScenarioDisplayVO(String scenarioDisplayVO) {
        this.scenarioDisplayVO = scenarioDisplayVO;
        return this;
    }
    public String getScenarioDisplayVO() {
        return this.scenarioDisplayVO;
    }

}
