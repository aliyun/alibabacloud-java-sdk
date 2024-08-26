// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class AcknowledgeTaskResultResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>D6CB3623-4726-4947-AC2B-2C6E673B447C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Result")
    public Integer result;

    public static AcknowledgeTaskResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AcknowledgeTaskResultResponseBody self = new AcknowledgeTaskResultResponseBody();
        return TeaModel.build(map, self);
    }

    public AcknowledgeTaskResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AcknowledgeTaskResultResponseBody setResult(Integer result) {
        this.result = result;
        return this;
    }
    public Integer getResult() {
        return this.result;
    }

}
