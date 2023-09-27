// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetAuthorizationTokenRequest extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetAuthorizationTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAuthorizationTokenRequest self = new GetAuthorizationTokenRequest();
        return TeaModel.build(map, self);
    }

    public GetAuthorizationTokenRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
