// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class GenerateZeroEtlTokenResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Token")
    public String token;

    public static GenerateZeroEtlTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateZeroEtlTokenResponseBody self = new GenerateZeroEtlTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateZeroEtlTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GenerateZeroEtlTokenResponseBody setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
