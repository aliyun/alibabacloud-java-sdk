// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryAttackInstanceRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("AttackSuiteInstanceId")
    public String attackSuiteInstanceId;

    @NameInMap("Lang")
    public String lang;

    public static QueryAttackInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAttackInstanceRequest self = new QueryAttackInstanceRequest();
        return TeaModel.build(map, self);
    }

    public QueryAttackInstanceRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public QueryAttackInstanceRequest setAttackSuiteInstanceId(String attackSuiteInstanceId) {
        this.attackSuiteInstanceId = attackSuiteInstanceId;
        return this;
    }
    public String getAttackSuiteInstanceId() {
        return this.attackSuiteInstanceId;
    }

    public QueryAttackInstanceRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
