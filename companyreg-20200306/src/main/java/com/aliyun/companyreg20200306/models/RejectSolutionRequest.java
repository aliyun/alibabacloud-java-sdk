// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306.models;

import com.aliyun.tea.*;

public class RejectSolutionRequest extends TeaModel {
    @NameInMap("Note")
    public String note;

    @NameInMap("SolutionBizId")
    public String solutionBizId;

    public static RejectSolutionRequest build(java.util.Map<String, ?> map) throws Exception {
        RejectSolutionRequest self = new RejectSolutionRequest();
        return TeaModel.build(map, self);
    }

    public RejectSolutionRequest setNote(String note) {
        this.note = note;
        return this;
    }
    public String getNote() {
        return this.note;
    }

    public RejectSolutionRequest setSolutionBizId(String solutionBizId) {
        this.solutionBizId = solutionBizId;
        return this;
    }
    public String getSolutionBizId() {
        return this.solutionBizId;
    }

}
