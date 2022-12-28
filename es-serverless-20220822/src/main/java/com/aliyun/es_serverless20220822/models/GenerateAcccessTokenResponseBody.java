// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.es_serverless20220822.models;

import com.aliyun.tea.*;

public class GenerateAcccessTokenResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    public static GenerateAcccessTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateAcccessTokenResponseBody self = new GenerateAcccessTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateAcccessTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
