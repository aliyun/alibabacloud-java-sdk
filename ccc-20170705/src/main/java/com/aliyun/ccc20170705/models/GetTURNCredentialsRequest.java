// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class GetTURNCredentialsRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("UserName")
    public String userName;

    public static GetTURNCredentialsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTURNCredentialsRequest self = new GetTURNCredentialsRequest();
        return TeaModel.build(map, self);
    }

    public GetTURNCredentialsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetTURNCredentialsRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
