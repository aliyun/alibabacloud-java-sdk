// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class DeleteBaselineConfigRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("BaselineId")
    public Long baselineId;

    public static DeleteBaselineConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteBaselineConfigRequest self = new DeleteBaselineConfigRequest();
        return TeaModel.build(map, self);
    }

    public DeleteBaselineConfigRequest setBaselineId(Long baselineId) {
        this.baselineId = baselineId;
        return this;
    }
    public Long getBaselineId() {
        return this.baselineId;
    }

}
