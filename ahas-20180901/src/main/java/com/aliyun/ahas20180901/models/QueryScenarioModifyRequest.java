// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryScenarioModifyRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("AttackSuiteId")
    public String attackSuiteId;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Namespace")
    public String namespace;

    public static QueryScenarioModifyRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryScenarioModifyRequest self = new QueryScenarioModifyRequest();
        return TeaModel.build(map, self);
    }

    public QueryScenarioModifyRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public QueryScenarioModifyRequest setAttackSuiteId(String attackSuiteId) {
        this.attackSuiteId = attackSuiteId;
        return this;
    }
    public String getAttackSuiteId() {
        return this.attackSuiteId;
    }

    public QueryScenarioModifyRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public QueryScenarioModifyRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
