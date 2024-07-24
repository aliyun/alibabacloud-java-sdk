// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.es_serverless20230627.models;

import com.aliyun.tea.*;

public class DeleteDictResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2BF6B57E-5AAD-5389-80CD-E200BBF91FF9</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("result")
    public Boolean result;

    public static DeleteDictResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDictResponseBody self = new DeleteDictResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDictResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteDictResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
