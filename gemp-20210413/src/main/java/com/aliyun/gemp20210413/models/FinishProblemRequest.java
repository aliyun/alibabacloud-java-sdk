// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class FinishProblemRequest extends TeaModel {
    @NameInMap("clientToken")
    public String clientToken;

    @NameInMap("problemId")
    public Long problemId;

    public static FinishProblemRequest build(java.util.Map<String, ?> map) throws Exception {
        FinishProblemRequest self = new FinishProblemRequest();
        return TeaModel.build(map, self);
    }

    public FinishProblemRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public FinishProblemRequest setProblemId(Long problemId) {
        this.problemId = problemId;
        return this;
    }
    public Long getProblemId() {
        return this.problemId;
    }

}
