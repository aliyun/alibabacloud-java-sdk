// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryAttackInstanceListRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("AttackSuiteId")
    public String attackSuiteId;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("PageNO")
    public Integer pageNO;

    public static QueryAttackInstanceListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAttackInstanceListRequest self = new QueryAttackInstanceListRequest();
        return TeaModel.build(map, self);
    }

    public QueryAttackInstanceListRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public QueryAttackInstanceListRequest setAttackSuiteId(String attackSuiteId) {
        this.attackSuiteId = attackSuiteId;
        return this;
    }
    public String getAttackSuiteId() {
        return this.attackSuiteId;
    }

    public QueryAttackInstanceListRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public QueryAttackInstanceListRequest setPageNO(Integer pageNO) {
        this.pageNO = pageNO;
        return this;
    }
    public Integer getPageNO() {
        return this.pageNO;
    }

}
