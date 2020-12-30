// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class RequestLoginInfoRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("UserId")
    public String userId;

    public static RequestLoginInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        RequestLoginInfoRequest self = new RequestLoginInfoRequest();
        return TeaModel.build(map, self);
    }

    public RequestLoginInfoRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RequestLoginInfoRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
