// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306.models;

import com.aliyun.tea.*;

public class SubmitSolutionRequest extends TeaModel {
    @NameInMap("BizType")
    public String bizType;

    @NameInMap("IntentionBizId")
    public String intentionBizId;

    @NameInMap("OperateType")
    public String operateType;

    @NameInMap("Solution")
    public String solution;

    @NameInMap("UserId")
    public String userId;

    public static SubmitSolutionRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitSolutionRequest self = new SubmitSolutionRequest();
        return TeaModel.build(map, self);
    }

    public SubmitSolutionRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public SubmitSolutionRequest setIntentionBizId(String intentionBizId) {
        this.intentionBizId = intentionBizId;
        return this;
    }
    public String getIntentionBizId() {
        return this.intentionBizId;
    }

    public SubmitSolutionRequest setOperateType(String operateType) {
        this.operateType = operateType;
        return this;
    }
    public String getOperateType() {
        return this.operateType;
    }

    public SubmitSolutionRequest setSolution(String solution) {
        this.solution = solution;
        return this;
    }
    public String getSolution() {
        return this.solution;
    }

    public SubmitSolutionRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
