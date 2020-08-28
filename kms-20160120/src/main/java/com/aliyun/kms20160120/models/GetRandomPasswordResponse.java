// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class GetRandomPasswordResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("RandomPassword")
    @Validation(required = true)
    public String randomPassword;

    public static GetRandomPasswordResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRandomPasswordResponse self = new GetRandomPasswordResponse();
        return TeaModel.build(map, self);
    }

}
