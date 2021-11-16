// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListProblemTimeLinesRequest extends TeaModel {
    // clientToken
    @NameInMap("clientToken")
    public String clientToken;

    // 故障ID
    @NameInMap("problemId")
    public Long problemId;

    public static ListProblemTimeLinesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProblemTimeLinesRequest self = new ListProblemTimeLinesRequest();
        return TeaModel.build(map, self);
    }

    public ListProblemTimeLinesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ListProblemTimeLinesRequest setProblemId(Long problemId) {
        this.problemId = problemId;
        return this;
    }
    public Long getProblemId() {
        return this.problemId;
    }

}
