// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.es_serverless20230627.models;

import com.aliyun.tea.*;

public class ListIndicesResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>8C85CCB3-C0C9-521C-B599-F903E14A8793</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<?> result;

    public static ListIndicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIndicesResponseBody self = new ListIndicesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIndicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListIndicesResponseBody setResult(java.util.List<?> result) {
        this.result = result;
        return this;
    }
    public java.util.List<?> getResult() {
        return this.result;
    }

}
