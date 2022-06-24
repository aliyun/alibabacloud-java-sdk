// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class DisableSentinelParamDegradeRuleRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("Ids")
    public String ids;

    @NameInMap("Namespace")
    public String namespace;

    public static DisableSentinelParamDegradeRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableSentinelParamDegradeRuleRequest self = new DisableSentinelParamDegradeRuleRequest();
        return TeaModel.build(map, self);
    }

    public DisableSentinelParamDegradeRuleRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public DisableSentinelParamDegradeRuleRequest setIds(String ids) {
        this.ids = ids;
        return this;
    }
    public String getIds() {
        return this.ids;
    }

    public DisableSentinelParamDegradeRuleRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
