// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CreateRoomRealTimeStreamAddressRequest extends TeaModel {
    /**
     * <p>The ID of the ARTC application. You can specify only one application ID. The ID can be up to 64 characters in length and can contain letters, digits, underscores (_), and hyphens (-).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>yourAppId</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The ID of the channel. You can specify only one ID. The ID can be up to 64 characters in length and can contain letters, digits, underscores (_), and hyphens (-).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>yourChannelId</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    /**
     * <p>The name of the RTMP stream. The name can be up to 40 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rtmp-dname</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>The validity period of the RTMP URL. Unit: seconds. The default value is 36,000 seconds, which is 10 hours.</p>
     * 
     * <strong>example:</strong>
     * <p>43200</p>
     */
    @NameInMap("ExpireTime")
    public Integer expireTime;

    /**
     * <p>The ID of the user who ingests the stream over RTMP. The user ID must be different from IDs of other users in the channel. The ID can be up to 64 characters in length and can contain letters, digits, underscores (_), and hyphens (-).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rtmp-uuid</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static CreateRoomRealTimeStreamAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRoomRealTimeStreamAddressRequest self = new CreateRoomRealTimeStreamAddressRequest();
        return TeaModel.build(map, self);
    }

    public CreateRoomRealTimeStreamAddressRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateRoomRealTimeStreamAddressRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public CreateRoomRealTimeStreamAddressRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CreateRoomRealTimeStreamAddressRequest setExpireTime(Integer expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public Integer getExpireTime() {
        return this.expireTime;
    }

    public CreateRoomRealTimeStreamAddressRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
