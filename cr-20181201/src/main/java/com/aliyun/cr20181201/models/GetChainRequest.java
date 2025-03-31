// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetChainRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>chi-0ops0gsmw5x2****</p>
     */
    @NameInMap("ChainId")
    public String chainId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cri-4cdrlqmhn4gm****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetChainRequest build(java.util.Map<String, ?> map) throws Exception {
        GetChainRequest self = new GetChainRequest();
        return TeaModel.build(map, self);
    }

    public GetChainRequest setChainId(String chainId) {
        this.chainId = chainId;
        return this;
    }
    public String getChainId() {
        return this.chainId;
    }

    public GetChainRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
