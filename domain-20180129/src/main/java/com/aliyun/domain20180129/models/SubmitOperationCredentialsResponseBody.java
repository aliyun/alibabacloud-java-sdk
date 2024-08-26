// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SubmitOperationCredentialsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>9DFCF6F8-243C-40EC-8035-4B12FEFX7D98</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SubmitOperationCredentialsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitOperationCredentialsResponseBody self = new SubmitOperationCredentialsResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitOperationCredentialsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
