// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetProblemImprovementRequest extends TeaModel {
    // 故障ID
    @NameInMap("problemId")
    public String problemId;

    // 幂等校验token
    @NameInMap("clientToken")
    public String clientToken;

    public static GetProblemImprovementRequest build(java.util.Map<String, ?> map) throws Exception {
        GetProblemImprovementRequest self = new GetProblemImprovementRequest();
        return TeaModel.build(map, self);
    }

    public GetProblemImprovementRequest setProblemId(String problemId) {
        this.problemId = problemId;
        return this;
    }
    public String getProblemId() {
        return this.problemId;
    }

    public GetProblemImprovementRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
