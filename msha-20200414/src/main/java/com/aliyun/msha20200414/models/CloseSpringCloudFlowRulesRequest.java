// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.msha20200414.models;

import com.aliyun.tea.*;

public class CloseSpringCloudFlowRulesRequest extends TeaModel {
    // 单元
    @NameInMap("UnitFlag")
    public String unitFlag;

    // 多活命名空间
    @NameInMap("MshaTenantId")
    public String mshaTenantId;

    // 应用名
    @NameInMap("AppNames")
    public java.util.List<String> appNames;

    public static CloseSpringCloudFlowRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        CloseSpringCloudFlowRulesRequest self = new CloseSpringCloudFlowRulesRequest();
        return TeaModel.build(map, self);
    }

    public CloseSpringCloudFlowRulesRequest setUnitFlag(String unitFlag) {
        this.unitFlag = unitFlag;
        return this;
    }
    public String getUnitFlag() {
        return this.unitFlag;
    }

    public CloseSpringCloudFlowRulesRequest setMshaTenantId(String mshaTenantId) {
        this.mshaTenantId = mshaTenantId;
        return this;
    }
    public String getMshaTenantId() {
        return this.mshaTenantId;
    }

    public CloseSpringCloudFlowRulesRequest setAppNames(java.util.List<String> appNames) {
        this.appNames = appNames;
        return this;
    }
    public java.util.List<String> getAppNames() {
        return this.appNames;
    }

}
