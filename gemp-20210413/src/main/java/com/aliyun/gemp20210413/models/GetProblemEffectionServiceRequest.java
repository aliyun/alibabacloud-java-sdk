// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetProblemEffectionServiceRequest extends TeaModel {
    // clientToken
    @NameInMap("clientToken")
    public String clientToken;

    // id主键
    @NameInMap("effectionServiceId")
    public Long effectionServiceId;

    // 故障id
    @NameInMap("problemId")
    public Long problemId;

    public static GetProblemEffectionServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetProblemEffectionServiceRequest self = new GetProblemEffectionServiceRequest();
        return TeaModel.build(map, self);
    }

    public GetProblemEffectionServiceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public GetProblemEffectionServiceRequest setEffectionServiceId(Long effectionServiceId) {
        this.effectionServiceId = effectionServiceId;
        return this;
    }
    public Long getEffectionServiceId() {
        return this.effectionServiceId;
    }

    public GetProblemEffectionServiceRequest setProblemId(Long problemId) {
        this.problemId = problemId;
        return this;
    }
    public Long getProblemId() {
        return this.problemId;
    }

}
