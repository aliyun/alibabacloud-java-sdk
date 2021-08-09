// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.msha20200414.models;

import com.aliyun.tea.*;

public class CommitSpringCloudFlowRuleRequest extends TeaModel {
    // 单元
    @NameInMap("UnitFlag")
    public String unitFlag;

    // 多活命名空间
    @NameInMap("MshaTenantId")
    public String mshaTenantId;

    // 应用名
    @NameInMap("AppNames")
    public java.util.List<String> appNames;

    public static CommitSpringCloudFlowRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CommitSpringCloudFlowRuleRequest self = new CommitSpringCloudFlowRuleRequest();
        return TeaModel.build(map, self);
    }

    public CommitSpringCloudFlowRuleRequest setUnitFlag(String unitFlag) {
        this.unitFlag = unitFlag;
        return this;
    }
    public String getUnitFlag() {
        return this.unitFlag;
    }

    public CommitSpringCloudFlowRuleRequest setMshaTenantId(String mshaTenantId) {
        this.mshaTenantId = mshaTenantId;
        return this;
    }
    public String getMshaTenantId() {
        return this.mshaTenantId;
    }

    public CommitSpringCloudFlowRuleRequest setAppNames(java.util.List<String> appNames) {
        this.appNames = appNames;
        return this;
    }
    public java.util.List<String> getAppNames() {
        return this.appNames;
    }

}
