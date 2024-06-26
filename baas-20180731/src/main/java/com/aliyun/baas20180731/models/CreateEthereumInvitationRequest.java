// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class CreateEthereumInvitationRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("EthereumId")
    public String ethereumId;

    public static CreateEthereumInvitationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEthereumInvitationRequest self = new CreateEthereumInvitationRequest();
        return TeaModel.build(map, self);
    }

    public CreateEthereumInvitationRequest setEthereumId(String ethereumId) {
        this.ethereumId = ethereumId;
        return this;
    }
    public String getEthereumId() {
        return this.ethereumId;
    }

}
