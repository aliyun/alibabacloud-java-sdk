// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetProblemRequest extends TeaModel {
    // 幂等号
    @NameInMap("clientToken")
    public String clientToken;

    // 故障ID
    @NameInMap("problemId")
    public Long problemId;

    public static GetProblemRequest build(java.util.Map<String, ?> map) throws Exception {
        GetProblemRequest self = new GetProblemRequest();
        return TeaModel.build(map, self);
    }

    public GetProblemRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public GetProblemRequest setProblemId(Long problemId) {
        this.problemId = problemId;
        return this;
    }
    public Long getProblemId() {
        return this.problemId;
    }

}
