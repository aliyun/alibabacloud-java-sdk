// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class GetAICoachAssessmentPointRequest extends TeaModel {
    @NameInMap("pointId")
    public String pointId;

    public static GetAICoachAssessmentPointRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAICoachAssessmentPointRequest self = new GetAICoachAssessmentPointRequest();
        return TeaModel.build(map, self);
    }

    public GetAICoachAssessmentPointRequest setPointId(String pointId) {
        this.pointId = pointId;
        return this;
    }
    public String getPointId() {
        return this.pointId;
    }

}
