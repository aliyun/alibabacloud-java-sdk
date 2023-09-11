// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class UpdateKmsInstanceBindVpcRequest extends TeaModel {
    @NameInMap("BindVpcs")
    public String bindVpcs;

    @NameInMap("KmsInstanceId")
    public String kmsInstanceId;

    public static UpdateKmsInstanceBindVpcRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateKmsInstanceBindVpcRequest self = new UpdateKmsInstanceBindVpcRequest();
        return TeaModel.build(map, self);
    }

    public UpdateKmsInstanceBindVpcRequest setBindVpcs(String bindVpcs) {
        this.bindVpcs = bindVpcs;
        return this;
    }
    public String getBindVpcs() {
        return this.bindVpcs;
    }

    public UpdateKmsInstanceBindVpcRequest setKmsInstanceId(String kmsInstanceId) {
        this.kmsInstanceId = kmsInstanceId;
        return this;
    }
    public String getKmsInstanceId() {
        return this.kmsInstanceId;
    }

}
