// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class AddConnectableClusterRequest extends TeaModel {
    @NameInMap("clientToken")
    public String clientToken;

    public static AddConnectableClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        AddConnectableClusterRequest self = new AddConnectableClusterRequest();
        return TeaModel.build(map, self);
    }

    public AddConnectableClusterRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
