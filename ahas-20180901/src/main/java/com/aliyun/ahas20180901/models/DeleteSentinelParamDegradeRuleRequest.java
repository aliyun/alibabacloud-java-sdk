// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class DeleteSentinelParamDegradeRuleRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("Id")
    public Long id;

    @NameInMap("Namespace")
    public String namespace;

    public static DeleteSentinelParamDegradeRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSentinelParamDegradeRuleRequest self = new DeleteSentinelParamDegradeRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSentinelParamDegradeRuleRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public DeleteSentinelParamDegradeRuleRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DeleteSentinelParamDegradeRuleRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
