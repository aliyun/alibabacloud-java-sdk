// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class DeleteClientKeyRequest extends TeaModel {
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
