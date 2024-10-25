// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DetachNetworkInterfaceRequest extends TeaModel {
    /**
     * <p>The ID of the ENI.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eni-58z57orgmt6d1****</p>
     */
    @NameInMap("NetworkInterfaceId")
    public String networkInterfaceId;

    public static DetachNetworkInterfaceRequest build(java.util.Map<String, ?> map) throws Exception {
        DetachNetworkInterfaceRequest self = new DetachNetworkInterfaceRequest();
        return TeaModel.build(map, self);
    }

    public DetachNetworkInterfaceRequest setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }
    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

}
