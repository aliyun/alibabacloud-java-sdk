// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class QueryFeaturesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>at-xxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>worker-a</p>
     */
    @NameInMap("ResourceName")
    public String resourceName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>INSTANCE</p>
     */
    @NameInMap("TargetScope")
    public String targetScope;

    public static QueryFeaturesRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryFeaturesRequest self = new QueryFeaturesRequest();
        return TeaModel.build(map, self);
    }

    public QueryFeaturesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryFeaturesRequest setResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }
    public String getResourceName() {
        return this.resourceName;
    }

    public QueryFeaturesRequest setTargetScope(String targetScope) {
        this.targetScope = targetScope;
        return this;
    }
    public String getTargetScope() {
        return this.targetScope;
    }

}
