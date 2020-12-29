// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class CreateFabricChannelMemberRequest extends TeaModel {
    @NameInMap("ChannelId")
    public String channelId;

    @NameInMap("Organization")
    public java.util.List<CreateFabricChannelMemberRequestOrganization> organization;

    public static CreateFabricChannelMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFabricChannelMemberRequest self = new CreateFabricChannelMemberRequest();
        return TeaModel.build(map, self);
    }

    public CreateFabricChannelMemberRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public CreateFabricChannelMemberRequest setOrganization(java.util.List<CreateFabricChannelMemberRequestOrganization> organization) {
        this.organization = organization;
        return this;
    }
    public java.util.List<CreateFabricChannelMemberRequestOrganization> getOrganization() {
        return this.organization;
    }

    public static class CreateFabricChannelMemberRequestOrganization extends TeaModel {
        @NameInMap("OrganizationId")
        public String organizationId;

        public static CreateFabricChannelMemberRequestOrganization build(java.util.Map<String, ?> map) throws Exception {
            CreateFabricChannelMemberRequestOrganization self = new CreateFabricChannelMemberRequestOrganization();
            return TeaModel.build(map, self);
        }

        public CreateFabricChannelMemberRequestOrganization setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
