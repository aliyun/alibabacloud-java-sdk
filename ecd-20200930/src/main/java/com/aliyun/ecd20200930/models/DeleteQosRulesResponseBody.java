// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeleteQosRulesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>E54EB497-D7B7-5F04-B744-D8DFA7B******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteQosRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteQosRulesResponseBody self = new DeleteQosRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteQosRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
