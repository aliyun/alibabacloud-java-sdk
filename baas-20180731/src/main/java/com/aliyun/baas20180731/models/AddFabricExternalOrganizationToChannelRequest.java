// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class AddFabricExternalOrganizationToChannelRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("JoinRequest")
    public String joinRequest;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("OrganizationId")
    public String organizationId;

    public static AddFabricExternalOrganizationToChannelRequest build(java.util.Map<String, ?> map) throws Exception {
        AddFabricExternalOrganizationToChannelRequest self = new AddFabricExternalOrganizationToChannelRequest();
        return TeaModel.build(map, self);
    }

    public AddFabricExternalOrganizationToChannelRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public AddFabricExternalOrganizationToChannelRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AddFabricExternalOrganizationToChannelRequest setJoinRequest(String joinRequest) {
        this.joinRequest = joinRequest;
        return this;
    }
    public String getJoinRequest() {
        return this.joinRequest;
    }

    public AddFabricExternalOrganizationToChannelRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

}
