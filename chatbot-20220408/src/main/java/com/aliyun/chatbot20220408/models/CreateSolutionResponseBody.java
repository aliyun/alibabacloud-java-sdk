// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class CreateSolutionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>F55D90C1-31BE-4B2A-AA3F-25EFC36F9419</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>100001089003</p>
     */
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
