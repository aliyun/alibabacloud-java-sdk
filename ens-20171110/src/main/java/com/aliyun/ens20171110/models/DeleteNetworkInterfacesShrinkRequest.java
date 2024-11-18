// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteNetworkInterfacesShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("NetworkInterfaceIds")
    public String networkInterfaceIdsShrink;

    public static DeleteNetworkInterfacesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteNetworkInterfacesShrinkRequest self = new DeleteNetworkInterfacesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteNetworkInterfacesShrinkRequest setNetworkInterfaceIdsShrink(String networkInterfaceIdsShrink) {
        this.networkInterfaceIdsShrink = networkInterfaceIdsShrink;
        return this;
    }
    public String getNetworkInterfaceIdsShrink() {
        return this.networkInterfaceIdsShrink;
    }

}
