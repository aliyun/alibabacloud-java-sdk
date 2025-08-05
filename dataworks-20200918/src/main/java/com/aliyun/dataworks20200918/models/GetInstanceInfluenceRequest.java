// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class GetInstanceInfluenceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public Long instanceId;

    public static GetInstanceInfluenceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceInfluenceRequest self = new GetInstanceInfluenceRequest();
        return TeaModel.build(map, self);
    }

    public GetInstanceInfluenceRequest setInstanceId(Long instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public Long getInstanceId() {
        return this.instanceId;
    }

}
