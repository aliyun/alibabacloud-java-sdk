// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetBaselineConfigRequest extends TeaModel {
    /**
     * <p>The ID of the baseline. You can call the [GetNode](https://help.aliyun.com/document_detail/173977.html) operation to obtain the ID.</p>
     * <br>
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
