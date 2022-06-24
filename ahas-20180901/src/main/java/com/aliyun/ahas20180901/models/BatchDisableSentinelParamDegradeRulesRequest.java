// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class BatchDisableSentinelParamDegradeRulesRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("Ids")
    public String ids;

    @NameInMap("Namespace")
    public String namespace;

    public static BatchDisableSentinelParamDegradeRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchDisableSentinelParamDegradeRulesRequest self = new BatchDisableSentinelParamDegradeRulesRequest();
        return TeaModel.build(map, self);
    }

    public BatchDisableSentinelParamDegradeRulesRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public BatchDisableSentinelParamDegradeRulesRequest setIds(String ids) {
        this.ids = ids;
        return this;
    }
    public String getIds() {
        return this.ids;
    }

    public BatchDisableSentinelParamDegradeRulesRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
