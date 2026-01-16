// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class GetClusterAddonInstanceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eck-xxxxxxxx</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>edge-csi-lite</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    public static GetClusterAddonInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetClusterAddonInstanceRequest self = new GetClusterAddonInstanceRequest();
        return TeaModel.build(map, self);
    }

    public GetClusterAddonInstanceRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetClusterAddonInstanceRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

}
