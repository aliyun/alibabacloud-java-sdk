// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class GetClientKeyRequest extends TeaModel {
    /**
     * <p>The ID of the client key.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>KAAP.66abf237-63f6-4625-b8cf-47e1086e****</p>
     */
    @NameInMap("ClientKeyId")
    public String clientKeyId;

    public static GetClientKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetClientKeyRequest self = new GetClientKeyRequest();
        return TeaModel.build(map, self);
    }

    public GetClientKeyRequest setClientKeyId(String clientKeyId) {
        this.clientKeyId = clientKeyId;
        return this;
    }
    public String getClientKeyId() {
        return this.clientKeyId;
    }

}
