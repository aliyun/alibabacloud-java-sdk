// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UpdateAggTaskGroupStatusRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("status")
    public String status;

    public static UpdateAggTaskGroupStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAggTaskGroupStatusRequest self = new UpdateAggTaskGroupStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAggTaskGroupStatusRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
