// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.es_serverless20230627.models;

import com.aliyun.tea.*;

public class UpdateDictResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>12797BCC-E0B5-5A47-B4B9-A14DDF0B0200</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("result")
    public Boolean result;

    public static UpdateDictResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDictResponseBody self = new UpdateDictResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDictResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateDictResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
