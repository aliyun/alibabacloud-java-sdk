// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteNetworkPeerConnectionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pcc-5rr19av7tkpgi9os52ag1****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static DeleteNetworkPeerConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteNetworkPeerConnectionRequest self = new DeleteNetworkPeerConnectionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteNetworkPeerConnectionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
