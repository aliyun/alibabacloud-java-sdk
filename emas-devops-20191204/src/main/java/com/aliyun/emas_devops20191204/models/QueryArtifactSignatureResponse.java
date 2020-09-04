// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_devops20191204.models;

import com.aliyun.tea.*;

public class QueryArtifactSignatureResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Result")
    @Validation(required = true)
    public String result;

    public static QueryArtifactSignatureResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryArtifactSignatureResponse self = new QueryArtifactSignatureResponse();
        return TeaModel.build(map, self);
    }

    public QueryArtifactSignatureResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryArtifactSignatureResponse setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
