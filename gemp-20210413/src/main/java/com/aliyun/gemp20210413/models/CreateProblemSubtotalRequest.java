// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class CreateProblemSubtotalRequest extends TeaModel {
    @NameInMap("clientToken")
    public String clientToken;

    @NameInMap("description")
    public String description;

    @NameInMap("problemId")
    public Long problemId;

    public static CreateProblemSubtotalRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProblemSubtotalRequest self = new CreateProblemSubtotalRequest();
        return TeaModel.build(map, self);
    }

    public CreateProblemSubtotalRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateProblemSubtotalRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateProblemSubtotalRequest setProblemId(Long problemId) {
        this.problemId = problemId;
        return this;
    }
    public Long getProblemId() {
        return this.problemId;
    }

}
