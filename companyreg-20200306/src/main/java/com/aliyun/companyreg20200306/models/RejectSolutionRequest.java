// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306.models;

import com.aliyun.tea.*;

public class RejectSolutionRequest extends TeaModel {
    @NameInMap("BizType")
    public String bizType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Note")
    public String note;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>S20200512114050000001</p>
     */
    @NameInMap("SolutionBizId")
    public String solutionBizId;

    public static RejectSolutionRequest build(java.util.Map<String, ?> map) throws Exception {
        RejectSolutionRequest self = new RejectSolutionRequest();
        return TeaModel.build(map, self);
    }

    public RejectSolutionRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
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
