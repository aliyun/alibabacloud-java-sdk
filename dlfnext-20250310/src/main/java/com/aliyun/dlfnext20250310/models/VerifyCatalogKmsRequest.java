// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class VerifyCatalogKmsRequest extends TeaModel {
    /**
     * <p>The ID of the KMS customer master key (CMK) to be validated. The server uses this key to perform an SSE-KMS write probe.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>key-1234567890abcdef</p>
     */
    @NameInMap("kmsKeyId")
    public String kmsKeyId;

    public static VerifyCatalogKmsRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyCatalogKmsRequest self = new VerifyCatalogKmsRequest();
        return TeaModel.build(map, self);
    }

    public VerifyCatalogKmsRequest setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }
    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

}
