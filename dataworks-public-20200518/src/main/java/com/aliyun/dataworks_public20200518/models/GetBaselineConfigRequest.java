// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetBaselineConfigRequest extends TeaModel {
    /**
     * <p>The baseline ID. You can call the <a href="https://help.aliyun.com/document_detail/173977.html">GetNode</a> operation to query the baseline ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
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
