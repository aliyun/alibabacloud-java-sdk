// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306.models;

import com.aliyun.tea.*;

public class RejectUserSolutionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>esp.companyreg</p>
     */
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
     * <p>S20211227151912000001</p>
     */
    @NameInMap("SolutionBizId")
    public String solutionBizId;

    public static RejectUserSolutionRequest build(java.util.Map<String, ?> map) throws Exception {
        RejectUserSolutionRequest self = new RejectUserSolutionRequest();
        return TeaModel.build(map, self);
    }

    public RejectUserSolutionRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public RejectUserSolutionRequest setNote(String note) {
        this.note = note;
        return this;
    }
    public String getNote() {
        return this.note;
    }

    public RejectUserSolutionRequest setSolutionBizId(String solutionBizId) {
        this.solutionBizId = solutionBizId;
        return this;
    }
    public String getSolutionBizId() {
        return this.solutionBizId;
    }

}
