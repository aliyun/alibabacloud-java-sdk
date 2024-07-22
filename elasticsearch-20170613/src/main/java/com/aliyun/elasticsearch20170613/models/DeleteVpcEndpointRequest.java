// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DeleteVpcEndpointRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>5FFD9ED4-C2EC-4E89-B22B-1ACB6FE1D***</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    public static DeleteVpcEndpointRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteVpcEndpointRequest self = new DeleteVpcEndpointRequest();
        return TeaModel.build(map, self);
    }

    public DeleteVpcEndpointRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
