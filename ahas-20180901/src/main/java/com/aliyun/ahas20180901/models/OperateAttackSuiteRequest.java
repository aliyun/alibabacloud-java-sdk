// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class OperateAttackSuiteRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("AttackSuiteId")
    public String attackSuiteId;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("Ops")
    public String ops;

    public static OperateAttackSuiteRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateAttackSuiteRequest self = new OperateAttackSuiteRequest();
        return TeaModel.build(map, self);
    }

    public OperateAttackSuiteRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public OperateAttackSuiteRequest setAttackSuiteId(String attackSuiteId) {
        this.attackSuiteId = attackSuiteId;
        return this;
    }
    public String getAttackSuiteId() {
        return this.attackSuiteId;
    }

    public OperateAttackSuiteRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public OperateAttackSuiteRequest setOps(String ops) {
        this.ops = ops;
        return this;
    }
    public String getOps() {
        return this.ops;
    }

}
