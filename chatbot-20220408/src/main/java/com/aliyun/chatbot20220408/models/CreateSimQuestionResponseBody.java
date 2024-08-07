// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class CreateSimQuestionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>16AC1B3C-66E0-438B-BB7C-71B692407B67</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1000002788</p>
     */
    @NameInMap("SimQuestionId")
    public Long simQuestionId;

    public static CreateSimQuestionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSimQuestionResponseBody self = new CreateSimQuestionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSimQuestionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSimQuestionResponseBody setSimQuestionId(Long simQuestionId) {
        this.simQuestionId = simQuestionId;
        return this;
    }
    public Long getSimQuestionId() {
        return this.simQuestionId;
    }

}
