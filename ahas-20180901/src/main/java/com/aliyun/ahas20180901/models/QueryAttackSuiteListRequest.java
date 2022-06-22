// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryAttackSuiteListRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("AttackName")
    public String attackName;

    @NameInMap("AttackStatus")
    public String attackStatus;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Namespace")
    public String namespace;

    public static QueryAttackSuiteListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAttackSuiteListRequest self = new QueryAttackSuiteListRequest();
        return TeaModel.build(map, self);
    }

    public QueryAttackSuiteListRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public QueryAttackSuiteListRequest setAttackName(String attackName) {
        this.attackName = attackName;
        return this;
    }
    public String getAttackName() {
        return this.attackName;
    }

    public QueryAttackSuiteListRequest setAttackStatus(String attackStatus) {
        this.attackStatus = attackStatus;
        return this;
    }
    public String getAttackStatus() {
        return this.attackStatus;
    }

    public QueryAttackSuiteListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public QueryAttackSuiteListRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
