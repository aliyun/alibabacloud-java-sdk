// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class DeleteProblemEffectionServiceRequest extends TeaModel {
    // clientToken
    @NameInMap("clientToken")
    public String clientToken;

    // 影响服务ID
    @NameInMap("effectionServiceId")
    public Long effectionServiceId;

    // 故障id
    @NameInMap("problemId")
    public Long problemId;

    public static DeleteProblemEffectionServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteProblemEffectionServiceRequest self = new DeleteProblemEffectionServiceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteProblemEffectionServiceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteProblemEffectionServiceRequest setEffectionServiceId(Long effectionServiceId) {
        this.effectionServiceId = effectionServiceId;
        return this;
    }
    public Long getEffectionServiceId() {
        return this.effectionServiceId;
    }

    public DeleteProblemEffectionServiceRequest setProblemId(Long problemId) {
        this.problemId = problemId;
        return this;
    }
    public Long getProblemId() {
        return this.problemId;
    }

}
