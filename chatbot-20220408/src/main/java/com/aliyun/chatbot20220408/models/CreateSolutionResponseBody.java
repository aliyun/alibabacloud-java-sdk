// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class CreateSolutionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    // 答案ID
    @NameInMap("SolutionId")
    public Long solutionId;

    public static CreateSolutionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSolutionResponseBody self = new CreateSolutionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSolutionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSolutionResponseBody setSolutionId(Long solutionId) {
        this.solutionId = solutionId;
        return this;
    }
    public Long getSolutionId() {
        return this.solutionId;
    }

}
