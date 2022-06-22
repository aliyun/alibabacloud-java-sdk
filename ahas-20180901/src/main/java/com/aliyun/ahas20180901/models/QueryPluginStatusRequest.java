// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryPluginStatusRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Namespace")
    public String namespace;

    public static QueryPluginStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryPluginStatusRequest self = new QueryPluginStatusRequest();
        return TeaModel.build(map, self);
    }

    public QueryPluginStatusRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public QueryPluginStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryPluginStatusRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
