// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class GetClientKeyRequest extends TeaModel {
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
