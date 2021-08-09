// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.msha20200414.models;

import com.aliyun.tea.*;

public class GetSpringCloudFlowItemRulesRequest extends TeaModel {
    // 单元
    @NameInMap("UnitFlag")
    public String unitFlag;

    // 多活命名空间ID
    @NameInMap("MshaTenantId")
    public String mshaTenantId;

    // 应用名
    @NameInMap("AppName")
    public String appName;

    public static GetSpringCloudFlowItemRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSpringCloudFlowItemRulesRequest self = new GetSpringCloudFlowItemRulesRequest();
        return TeaModel.build(map, self);
    }

    public GetSpringCloudFlowItemRulesRequest setUnitFlag(String unitFlag) {
        this.unitFlag = unitFlag;
        return this;
    }
    public String getUnitFlag() {
        return this.unitFlag;
    }

    public GetSpringCloudFlowItemRulesRequest setMshaTenantId(String mshaTenantId) {
        this.mshaTenantId = mshaTenantId;
        return this;
    }
    public String getMshaTenantId() {
        return this.mshaTenantId;
    }

    public GetSpringCloudFlowItemRulesRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

}
