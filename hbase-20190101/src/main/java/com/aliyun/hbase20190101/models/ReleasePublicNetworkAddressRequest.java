// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class ReleasePublicNetworkAddressRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hb-t4naqsay5gn******</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    public static ReleasePublicNetworkAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleasePublicNetworkAddressRequest self = new ReleasePublicNetworkAddressRequest();
        return TeaModel.build(map, self);
    }

    public ReleasePublicNetworkAddressRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}
