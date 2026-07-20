// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class VerifyCatalogKmsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
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
