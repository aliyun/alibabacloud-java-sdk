// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class GetInstanceDetailRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cas_dv-cn-123</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetInstanceDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceDetailRequest self = new GetInstanceDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetInstanceDetailRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
