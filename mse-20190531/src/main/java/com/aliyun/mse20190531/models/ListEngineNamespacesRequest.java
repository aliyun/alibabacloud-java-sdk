// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListEngineNamespacesRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static ListEngineNamespacesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEngineNamespacesRequest self = new ListEngineNamespacesRequest();
        return TeaModel.build(map, self);
    }

    public ListEngineNamespacesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
