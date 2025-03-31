// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class DeleteChainRequest extends TeaModel {
    /**
     * <p>The ID of the delivery pipeline.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>chi-02ymhtwl3cq8****</p>
     */
    @NameInMap("ChainId")
    public String chainId;

    /**
     * <p>The ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cri-4cdrlqmhn4gm****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static DeleteChainRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteChainRequest self = new DeleteChainRequest();
        return TeaModel.build(map, self);
    }

    public DeleteChainRequest setChainId(String chainId) {
        this.chainId = chainId;
        return this;
    }
    public String getChainId() {
        return this.chainId;
    }

    public DeleteChainRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
