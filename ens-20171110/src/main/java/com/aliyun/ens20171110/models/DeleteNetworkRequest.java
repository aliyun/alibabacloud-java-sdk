// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteNetworkRequest extends TeaModel {
    @NameInMap("NetworkId")
    public String networkId;

    public static DeleteNetworkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteNetworkRequest self = new DeleteNetworkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteNetworkRequest setNetworkId(String networkId) {
        this.networkId = networkId;
        return this;
    }
    public String getNetworkId() {
        return this.networkId;
    }

}
