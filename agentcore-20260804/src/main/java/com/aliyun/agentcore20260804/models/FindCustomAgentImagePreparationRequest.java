// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class FindCustomAgentImagePreparationRequest extends TeaModel {
    /**
     * <p>The idempotency token passed as a query parameter. Required when explicitly submitting customImage or container.type=custom. Optional for ACR image and code package submissions. The value must be 1 to 128 characters in length and can contain letters, digits, periods, underscores, colons, and hyphens. Reuse the same token for retries of the same submission. Using the same token for different parameters is rejected.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>image-update-20261022-001</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static FindCustomAgentImagePreparationRequest build(java.util.Map<String, ?> map) throws Exception {
        FindCustomAgentImagePreparationRequest self = new FindCustomAgentImagePreparationRequest();
        return TeaModel.build(map, self);
    }

    public FindCustomAgentImagePreparationRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
