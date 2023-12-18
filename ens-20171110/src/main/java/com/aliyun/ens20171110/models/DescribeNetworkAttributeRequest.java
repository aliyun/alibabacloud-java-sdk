// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeNetworkAttributeRequest extends TeaModel {
    /**
     * <p>The ID of the network.</p>
     */
    @NameInMap("NetworkId")
    public String networkId;

    public static DescribeNetworkAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworkAttributeRequest self = new DescribeNetworkAttributeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNetworkAttributeRequest setNetworkId(String networkId) {
        this.networkId = networkId;
        return this;
    }
    public String getNetworkId() {
        return this.networkId;
    }

}
