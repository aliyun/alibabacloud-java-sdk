// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryAhasAgentPluginInstallScriptRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("Namespace")
    public String namespace;

    public static QueryAhasAgentPluginInstallScriptRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAhasAgentPluginInstallScriptRequest self = new QueryAhasAgentPluginInstallScriptRequest();
        return TeaModel.build(map, self);
    }

    public QueryAhasAgentPluginInstallScriptRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public QueryAhasAgentPluginInstallScriptRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
