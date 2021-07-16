// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class FinishProblemRequest extends TeaModel {
    // 故障Id
    @NameInMap("problemId")
    public Long problemId;

    // 幂等校验
    @NameInMap("clientToken")
    public String clientToken;

    public static FinishProblemRequest build(java.util.Map<String, ?> map) throws Exception {
        FinishProblemRequest self = new FinishProblemRequest();
        return TeaModel.build(map, self);
    }

    public FinishProblemRequest setProblemId(Long problemId) {
        this.problemId = problemId;
        return this;
    }
    public Long getProblemId() {
        return this.problemId;
    }

    public FinishProblemRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
