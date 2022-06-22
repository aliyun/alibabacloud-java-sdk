// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class BatchQueryPluginStatusRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("InstanceIds")
    public String instanceIds;

    @NameInMap("Namespace")
    public String namespace;

    public static BatchQueryPluginStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchQueryPluginStatusRequest self = new BatchQueryPluginStatusRequest();
        return TeaModel.build(map, self);
    }

    public BatchQueryPluginStatusRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public BatchQueryPluginStatusRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

    public BatchQueryPluginStatusRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
