// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class GetBaselineConfigRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("BaselineId")
    public Long baselineId;

    public static GetBaselineConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBaselineConfigRequest self = new GetBaselineConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetBaselineConfigRequest setBaselineId(Long baselineId) {
        this.baselineId = baselineId;
        return this;
    }
    public Long getBaselineId() {
        return this.baselineId;
    }

}
