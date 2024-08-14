// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class DeleteClientKeyRequest extends TeaModel {
    /**
     * <p>The ID of the client key.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>KAAP.66abf237-63f6-4625-b8cf-47e1086e****</p>
     */
    @NameInMap("ClientKeyId")
    public String clientKeyId;

    public static DeleteClientKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteClientKeyRequest self = new DeleteClientKeyRequest();
        return TeaModel.build(map, self);
    }

    public DeleteClientKeyRequest setClientKeyId(String clientKeyId) {
        this.clientKeyId = clientKeyId;
        return this;
    }
    public String getClientKeyId() {
        return this.clientKeyId;
    }

}
