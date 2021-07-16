// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class DeleteProblemMeasureRequest extends TeaModel {
    // 故障改成措施id
    @NameInMap("measureId")
    public Long measureId;

    // 故障Id
    @NameInMap("problemId")
    public String problemId;

    // 幂等校验token
    @NameInMap("clientToken")
    public String clientToken;

    public static DeleteProblemMeasureRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteProblemMeasureRequest self = new DeleteProblemMeasureRequest();
        return TeaModel.build(map, self);
    }

    public DeleteProblemMeasureRequest setMeasureId(Long measureId) {
        this.measureId = measureId;
        return this;
    }
    public Long getMeasureId() {
        return this.measureId;
    }

    public DeleteProblemMeasureRequest setProblemId(String problemId) {
        this.problemId = problemId;
        return this;
    }
    public String getProblemId() {
        return this.problemId;
    }

    public DeleteProblemMeasureRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
