// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteChannelRequest extends TeaModel {
    /**
     * <p>The application ID. Only a single ID is supported. This parameter is required. If this parameter is not specified, the service returns InvalidInput.</p>
     * 
     * <strong>example:</strong>
     * <p>eo85****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The ID of the channel that has been joined. Only a single ID is supported. This parameter is required. If this parameter is not specified, the service returns InvalidInput.</p>
     * 
     * <strong>example:</strong>
     * <p>testid</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    public static DeleteChannelRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteChannelRequest self = new DeleteChannelRequest();
        return TeaModel.build(map, self);
    }

    public DeleteChannelRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DeleteChannelRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

}
