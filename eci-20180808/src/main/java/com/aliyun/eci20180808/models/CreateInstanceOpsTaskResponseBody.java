// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class CreateInstanceOpsTaskResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>89945DD3-9072-47D0-A318-353284CFC7B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The creation result of the O&amp;M task.</p>
     * 
     * <strong>example:</strong>
     * <p>Coredump settings has been configured successfully.</p>
     */
    @NameInMap("Result")
    public String result;

    public static CreateInstanceOpsTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceOpsTaskResponseBody self = new CreateInstanceOpsTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateInstanceOpsTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateInstanceOpsTaskResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
