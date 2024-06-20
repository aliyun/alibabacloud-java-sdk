// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.milvus20231012.models;

import com.aliyun.tea.*;

public class GetInstanceDetailRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>c-123xxx</p>
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
