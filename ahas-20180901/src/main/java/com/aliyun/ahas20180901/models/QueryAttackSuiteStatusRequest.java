// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryAttackSuiteStatusRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("AttackSuiteId")
    public String attackSuiteId;

    @NameInMap("Namespace")
    public String namespace;

    public static QueryAttackSuiteStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAttackSuiteStatusRequest self = new QueryAttackSuiteStatusRequest();
        return TeaModel.build(map, self);
    }

    public QueryAttackSuiteStatusRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public QueryAttackSuiteStatusRequest setAttackSuiteId(String attackSuiteId) {
        this.attackSuiteId = attackSuiteId;
        return this;
    }
    public String getAttackSuiteId() {
        return this.attackSuiteId;
    }

    public QueryAttackSuiteStatusRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
