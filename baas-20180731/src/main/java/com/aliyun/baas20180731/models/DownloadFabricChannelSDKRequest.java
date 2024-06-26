// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DownloadFabricChannelSDKRequest extends TeaModel {
    @NameInMap("ChannelId")
    public String channelId;

    @NameInMap("Location")
    public String location;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("OrganizationId")
    public String organizationId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Username")
    public String username;

    public static DownloadFabricChannelSDKRequest build(java.util.Map<String, ?> map) throws Exception {
        DownloadFabricChannelSDKRequest self = new DownloadFabricChannelSDKRequest();
        return TeaModel.build(map, self);
    }

    public DownloadFabricChannelSDKRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public DownloadFabricChannelSDKRequest setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public DownloadFabricChannelSDKRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public DownloadFabricChannelSDKRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

}
