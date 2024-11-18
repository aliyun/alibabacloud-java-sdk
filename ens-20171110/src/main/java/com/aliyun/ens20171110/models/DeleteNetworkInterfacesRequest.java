// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteNetworkInterfacesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("NetworkInterfaceIds")
    public java.util.List<String> networkInterfaceIds;

    public static DeleteNetworkInterfacesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteNetworkInterfacesRequest self = new DeleteNetworkInterfacesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteNetworkInterfacesRequest setNetworkInterfaceIds(java.util.List<String> networkInterfaceIds) {
        this.networkInterfaceIds = networkInterfaceIds;
        return this;
    }
    public java.util.List<String> getNetworkInterfaceIds() {
        return this.networkInterfaceIds;
    }

}
