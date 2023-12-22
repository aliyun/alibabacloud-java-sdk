// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetLoginDetailsRequest extends TeaModel {
    @NameInMap("ChatDeviceId")
    public String chatDeviceId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("UserId")
    public String userId;

    public static GetLoginDetailsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLoginDetailsRequest self = new GetLoginDetailsRequest();
        return TeaModel.build(map, self);
    }

    public GetLoginDetailsRequest setChatDeviceId(String chatDeviceId) {
        this.chatDeviceId = chatDeviceId;
        return this;
    }
    public String getChatDeviceId() {
        return this.chatDeviceId;
    }

    public GetLoginDetailsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetLoginDetailsRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
