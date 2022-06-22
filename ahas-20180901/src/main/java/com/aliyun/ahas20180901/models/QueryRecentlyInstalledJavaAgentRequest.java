// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryRecentlyInstalledJavaAgentRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("Namespace")
    public String namespace;

    public static QueryRecentlyInstalledJavaAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRecentlyInstalledJavaAgentRequest self = new QueryRecentlyInstalledJavaAgentRequest();
        return TeaModel.build(map, self);
    }

    public QueryRecentlyInstalledJavaAgentRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public QueryRecentlyInstalledJavaAgentRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
