// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class GetStepResultOverviewRequest extends TeaModel {
    /**
     * <p>The unique ID of the validation result.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001</p>
     */
    @NameInMap("resultId")
    public String resultId;

    public static GetStepResultOverviewRequest build(java.util.Map<String, ?> map) throws Exception {
        GetStepResultOverviewRequest self = new GetStepResultOverviewRequest();
        return TeaModel.build(map, self);
    }

    public GetStepResultOverviewRequest setResultId(String resultId) {
        this.resultId = resultId;
        return this;
    }
    public String getResultId() {
        return this.resultId;
    }

}
