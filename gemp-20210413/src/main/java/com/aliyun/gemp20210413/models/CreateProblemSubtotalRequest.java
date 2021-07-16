// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class CreateProblemSubtotalRequest extends TeaModel {
    // 故障Id
    @NameInMap("problemId")
    public Long problemId;

    // 小计文本
    @NameInMap("description")
    public String description;

    // 幂等校验token
    @NameInMap("clientToken")
    public String clientToken;

    public static CreateProblemSubtotalRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProblemSubtotalRequest self = new CreateProblemSubtotalRequest();
        return TeaModel.build(map, self);
    }

    public CreateProblemSubtotalRequest setProblemId(Long problemId) {
        this.problemId = problemId;
        return this;
    }
    public Long getProblemId() {
        return this.problemId;
    }

    public CreateProblemSubtotalRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateProblemSubtotalRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
