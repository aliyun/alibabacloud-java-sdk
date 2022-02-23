// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csp20201020.models;

import com.aliyun.tea.*;

public class ListAuthenticatedUserRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static ListAuthenticatedUserRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAuthenticatedUserRequest self = new ListAuthenticatedUserRequest();
        return TeaModel.build(map, self);
    }

    public ListAuthenticatedUserRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
