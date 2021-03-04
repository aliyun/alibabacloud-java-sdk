// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class GetParametersForImportRequest extends TeaModel {
    @NameInMap("KeyId")
    public String keyId;

    @NameInMap("WrappingAlgorithm")
    public String wrappingAlgorithm;

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
