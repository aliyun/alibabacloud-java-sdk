// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CreateRoomRealTimeStreamAddressRequest extends TeaModel {
    /**
     * <p>The ID of the ApsaraVideo Real-time Communication application. Only a single ID is supported. The value can contain uppercase and lowercase letters, digits, underscores, and hyphens (-), with a maximum of 64 characters. You can view your application IDs by navigating to <strong>ApsaraVideo Live &gt; Live+ &gt; Real-time Communication &gt; Application Management</strong>. If no application exists, create one by clicking <strong>Create Application</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>yourAppId</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The ID of the channel to join. Only a single ID is supported. The value can contain uppercase and lowercase letters, digits, underscores, and hyphens (-), with a maximum of 64 characters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>yourChannelId</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    /**
     * <p>The display name of the RTMP stream in the channel. Maximum length: 40 characters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rtmp-dname</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>The validity period of the RTMP URL. Unit: seconds. Default value: 36000 (10 hours).</p>
     * 
     * <strong>example:</strong>
     * <p>43200</p>
     */
    @NameInMap("ExpireTime")
    public Integer expireTime;

    /**
     * <p>The user ID for the RTMP stream ingest. This value must not duplicate any other user ID in the channel. The value can contain uppercase and lowercase letters, digits, underscores, and hyphens (-), with a maximum of 64 characters.</p>
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
