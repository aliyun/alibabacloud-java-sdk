// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class JoinChannelRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>chan-channelx-1l1hmckuu****</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>accept</p>
     */
    @NameInMap("Do")
    public String _do;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("Location")
    public String location;

    public static JoinChannelRequest build(java.util.Map<String, ?> map) throws Exception {
        JoinChannelRequest self = new JoinChannelRequest();
        return TeaModel.build(map, self);
    }

    public JoinChannelRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public JoinChannelRequest set_do(String _do) {
        this._do = _do;
        return this;
    }
    public String get_do() {
        return this._do;
    }

    public JoinChannelRequest setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

}
