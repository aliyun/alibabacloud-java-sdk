// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class BatchEnableSentinelParamDegradeRulesRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("Ids")
    public String ids;

    @NameInMap("Namespace")
    public String namespace;

    public static BatchEnableSentinelParamDegradeRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchEnableSentinelParamDegradeRulesRequest self = new BatchEnableSentinelParamDegradeRulesRequest();
        return TeaModel.build(map, self);
    }

    public BatchEnableSentinelParamDegradeRulesRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public BatchEnableSentinelParamDegradeRulesRequest setIds(String ids) {
        this.ids = ids;
        return this;
    }
    public String getIds() {
        return this.ids;
    }

    public BatchEnableSentinelParamDegradeRulesRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
