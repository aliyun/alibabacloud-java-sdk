// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryUninstallCommandRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("ConfigurationId")
    public String configurationId;

    @NameInMap("Namespace")
    public String namespace;

    public static QueryUninstallCommandRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryUninstallCommandRequest self = new QueryUninstallCommandRequest();
        return TeaModel.build(map, self);
    }

    public QueryUninstallCommandRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public QueryUninstallCommandRequest setConfigurationId(String configurationId) {
        this.configurationId = configurationId;
        return this;
    }
    public String getConfigurationId() {
        return this.configurationId;
    }

    public QueryUninstallCommandRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
