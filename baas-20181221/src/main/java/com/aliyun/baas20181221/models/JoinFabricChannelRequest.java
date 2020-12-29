// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class JoinFabricChannelRequest extends TeaModel {
    @NameInMap("ChannelId")
    public String channelId;

    @NameInMap("Do")
    public String _do;

    @NameInMap("Location")
    public String location;

    public static JoinFabricChannelRequest build(java.util.Map<String, ?> map) throws Exception {
        JoinFabricChannelRequest self = new JoinFabricChannelRequest();
        return TeaModel.build(map, self);
    }

    public JoinFabricChannelRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public JoinFabricChannelRequest set_do(String _do) {
        this._do = _do;
        return this;
    }
    public String get_do() {
        return this._do;
    }

    public JoinFabricChannelRequest setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

}
