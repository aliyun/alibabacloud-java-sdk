// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelservice20220614.models;

import com.aliyun.tea.*;

public class GetUserRequest extends TeaModel {
    @NameInMap("channel")
    public String channel;

    @NameInMap("region")
    public String region;

    public static GetUserRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserRequest self = new GetUserRequest();
        return TeaModel.build(map, self);
    }

    public GetUserRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public GetUserRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

}
