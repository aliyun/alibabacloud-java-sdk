// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetNodeOnBaselineRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("BaselineId")
    public Long baselineId;

    public static GetNodeOnBaselineRequest build(java.util.Map<String, ?> map) throws Exception {
        GetNodeOnBaselineRequest self = new GetNodeOnBaselineRequest();
        return TeaModel.build(map, self);
    }

    public GetNodeOnBaselineRequest setBaselineId(Long baselineId) {
        this.baselineId = baselineId;
        return this;
    }
    public Long getBaselineId() {
        return this.baselineId;
    }

}
