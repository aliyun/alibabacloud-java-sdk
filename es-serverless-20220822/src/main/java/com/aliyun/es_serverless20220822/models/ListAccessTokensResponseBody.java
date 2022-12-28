// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.es_serverless20220822.models;

import com.aliyun.tea.*;

public class ListAccessTokensResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    public static ListAccessTokensResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAccessTokensResponseBody self = new ListAccessTokensResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAccessTokensResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
