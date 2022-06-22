// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryRecentlyInstalledAhasAgentRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Namespace")
    public String namespace;

    public static QueryRecentlyInstalledAhasAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRecentlyInstalledAhasAgentRequest self = new QueryRecentlyInstalledAhasAgentRequest();
        return TeaModel.build(map, self);
    }

    public QueryRecentlyInstalledAhasAgentRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public QueryRecentlyInstalledAhasAgentRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public QueryRecentlyInstalledAhasAgentRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
