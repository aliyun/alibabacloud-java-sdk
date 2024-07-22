// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class RemoveApmResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>29A879FB-86BF-54CA-9426-B769A099E1A1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Result")
    public Boolean result;

    public static RemoveApmResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveApmResponseBody self = new RemoveApmResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveApmResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RemoveApmResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
