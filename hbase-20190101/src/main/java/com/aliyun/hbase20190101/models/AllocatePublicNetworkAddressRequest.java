// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class AllocatePublicNetworkAddressRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>83b2b5e117a5b8bce0fae88d90576a84_6452320_82718582</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hb-t4naqsay5gn******</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    public static AllocatePublicNetworkAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        AllocatePublicNetworkAddressRequest self = new AllocatePublicNetworkAddressRequest();
        return TeaModel.build(map, self);
    }

    public AllocatePublicNetworkAddressRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AllocatePublicNetworkAddressRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}
