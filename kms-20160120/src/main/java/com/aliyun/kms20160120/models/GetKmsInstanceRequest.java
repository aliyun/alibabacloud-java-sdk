// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class GetKmsInstanceRequest extends TeaModel {
    /**
     * <p>The ID of the KMS instance that you want to query.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("KmsInstanceId")
    public String kmsInstanceId;

    public static GetKmsInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetKmsInstanceRequest self = new GetKmsInstanceRequest();
        return TeaModel.build(map, self);
    }

    public GetKmsInstanceRequest setKmsInstanceId(String kmsInstanceId) {
        this.kmsInstanceId = kmsInstanceId;
        return this;
    }
    public String getKmsInstanceId() {
        return this.kmsInstanceId;
    }

}
