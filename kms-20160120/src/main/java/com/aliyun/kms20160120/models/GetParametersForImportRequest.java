// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class GetParametersForImportRequest extends TeaModel {
    /**
     * <p>The globally unique ID of the CMK.</p>
     * <br>
     * <p>>  You can import key material only for CMKs whose Origin parameter is set to EXTERNAL.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("KeyId")
    public String keyId;

    /**
     * <p>The algorithm that is used to encrypt key material.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("WrappingAlgorithm")
    public String wrappingAlgorithm;

    /**
     * <p>The type of the public key that is used to encrypt key material.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("WrappingKeySpec")
    public String wrappingKeySpec;

    public static GetParametersForImportRequest build(java.util.Map<String, ?> map) throws Exception {
        GetParametersForImportRequest self = new GetParametersForImportRequest();
        return TeaModel.build(map, self);
    }

    public GetParametersForImportRequest setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

    public GetParametersForImportRequest setWrappingAlgorithm(String wrappingAlgorithm) {
        this.wrappingAlgorithm = wrappingAlgorithm;
        return this;
    }
    public String getWrappingAlgorithm() {
        return this.wrappingAlgorithm;
    }

    public GetParametersForImportRequest setWrappingKeySpec(String wrappingKeySpec) {
        this.wrappingKeySpec = wrappingKeySpec;
        return this;
    }
    public String getWrappingKeySpec() {
        return this.wrappingKeySpec;
    }

}
