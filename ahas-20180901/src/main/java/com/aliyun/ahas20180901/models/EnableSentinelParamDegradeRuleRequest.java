// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class EnableSentinelParamDegradeRuleRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("Ids")
    public String ids;

    @NameInMap("Namespace")
    public String namespace;

    public static EnableSentinelParamDegradeRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableSentinelParamDegradeRuleRequest self = new EnableSentinelParamDegradeRuleRequest();
        return TeaModel.build(map, self);
    }

    public EnableSentinelParamDegradeRuleRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public EnableSentinelParamDegradeRuleRequest setIds(String ids) {
        this.ids = ids;
        return this;
    }
    public String getIds() {
        return this.ids;
    }

    public EnableSentinelParamDegradeRuleRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
