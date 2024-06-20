// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.milvus20231012.models;

import com.aliyun.tea.*;

public class UpdateInstanceNameRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>milvus-test</p>
     */
    @NameInMap("ClusterName")
    public String clusterName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c-123xxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static UpdateInstanceNameRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceNameRequest self = new UpdateInstanceNameRequest();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceNameRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public UpdateInstanceNameRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
