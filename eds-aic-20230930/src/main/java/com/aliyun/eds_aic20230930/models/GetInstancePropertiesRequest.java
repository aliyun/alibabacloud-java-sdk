// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class GetInstancePropertiesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cpn-2ofr9kf41apy3****-014</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetInstancePropertiesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInstancePropertiesRequest self = new GetInstancePropertiesRequest();
        return TeaModel.build(map, self);
    }

    public GetInstancePropertiesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
