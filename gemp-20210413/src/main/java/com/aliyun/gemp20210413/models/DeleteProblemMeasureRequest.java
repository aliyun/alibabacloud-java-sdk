// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class DeleteProblemMeasureRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>4361a0e1-6747-4834-96ce-0c4840fd3812</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>1213</p>
     */
    @NameInMap("measureId")
    public Long measureId;

    /**
     * <strong>example:</strong>
     * <p>2131</p>
     */
    @NameInMap("problemId")
    public String problemId;

    public static DeleteProblemMeasureRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteProblemMeasureRequest self = new DeleteProblemMeasureRequest();
        return TeaModel.build(map, self);
    }

    public DeleteProblemMeasureRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
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

}
