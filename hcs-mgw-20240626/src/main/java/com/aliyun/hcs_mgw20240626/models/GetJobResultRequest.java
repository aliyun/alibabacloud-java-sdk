// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hcs_mgw20240626.models;

import com.aliyun.tea.*;

public class GetJobResultRequest extends TeaModel {
    /**
     * <p>The execution ID of the task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("runtimeId")
    public Integer runtimeId;

    public static GetJobResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetJobResultRequest self = new GetJobResultRequest();
        return TeaModel.build(map, self);
    }

    public GetJobResultRequest setRuntimeId(Integer runtimeId) {
        this.runtimeId = runtimeId;
        return this;
    }
    public Integer getRuntimeId() {
        return this.runtimeId;
    }

}
