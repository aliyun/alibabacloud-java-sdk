// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class AddChannelRequest extends TeaModel {
    @NameInMap("GbId")
    public String gbId;

    @NameInMap("ClientToken")
    public String clientToken;

    public static AddChannelRequest build(java.util.Map<String, ?> map) throws Exception {
        AddChannelRequest self = new AddChannelRequest();
        return TeaModel.build(map, self);
    }

    public AddChannelRequest setGbId(String gbId) {
        this.gbId = gbId;
        return this;
    }
    public String getGbId() {
        return this.gbId;
    }

    public AddChannelRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
