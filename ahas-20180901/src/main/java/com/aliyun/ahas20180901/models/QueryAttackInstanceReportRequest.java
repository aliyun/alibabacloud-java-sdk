// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryAttackInstanceReportRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("AttackSuiteInstanceId")
    public String attackSuiteInstanceId;

    @NameInMap("Namespace")
    public String namespace;

    public static QueryAttackInstanceReportRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAttackInstanceReportRequest self = new QueryAttackInstanceReportRequest();
        return TeaModel.build(map, self);
    }

    public QueryAttackInstanceReportRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public QueryAttackInstanceReportRequest setAttackSuiteInstanceId(String attackSuiteInstanceId) {
        this.attackSuiteInstanceId = attackSuiteInstanceId;
        return this;
    }
    public String getAttackSuiteInstanceId() {
        return this.attackSuiteInstanceId;
    }

    public QueryAttackInstanceReportRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
