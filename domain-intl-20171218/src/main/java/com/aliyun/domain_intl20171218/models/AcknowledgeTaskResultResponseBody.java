// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class AcknowledgeTaskResultResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
