// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetOssPolicyRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetOssPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOssPolicyRequest self = new GetOssPolicyRequest();
        return TeaModel.build(map, self);
    }

    public GetOssPolicyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
