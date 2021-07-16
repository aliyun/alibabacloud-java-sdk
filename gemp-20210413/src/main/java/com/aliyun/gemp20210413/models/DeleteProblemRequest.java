// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class DeleteProblemRequest extends TeaModel {
    // 故障Id
    @NameInMap("problemId")
    public Long problemId;

    // 幂等校验
    @NameInMap("clientToken")
    public String clientToken;

    public static DeleteProblemRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteProblemRequest self = new DeleteProblemRequest();
        return TeaModel.build(map, self);
    }

    public DeleteProblemRequest setProblemId(Long problemId) {
        this.problemId = problemId;
        return this;
    }
    public Long getProblemId() {
        return this.problemId;
    }

    public DeleteProblemRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
