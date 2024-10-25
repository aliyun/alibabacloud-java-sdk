// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class AttachNetworkInterfaceRequest extends TeaModel {
    /**
     * <p>The ID of the instance</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-5p67acfmxazb4p****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the ENI.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eni-58z57orgmt6d1****</p>
     */
    @NameInMap("NetworkInterfaceId")
    public String networkInterfaceId;

    public static AttachNetworkInterfaceRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachNetworkInterfaceRequest self = new AttachNetworkInterfaceRequest();
        return TeaModel.build(map, self);
    }

    public AttachNetworkInterfaceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AttachNetworkInterfaceRequest setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }
    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

}
