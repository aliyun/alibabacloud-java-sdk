// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class GetParametersForImportRequest extends TeaModel {
    @NameInMap("KeyId")
    @Validation(required = true)
    public String keyId;

    @NameInMap("WrappingAlgorithm")
    @Validation(required = true)
    public String wrappingAlgorithm;

    @NameInMap("WrappingKeySpec")
    @Validation(required = true)
    public String wrappingKeySpec;

    public static GetParametersForImportRequest build(java.util.Map<String, ?> map) throws Exception {
        GetParametersForImportRequest self = new GetParametersForImportRequest();
        return TeaModel.build(map, self);
    }

}
