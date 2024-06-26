// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class CreateChannelMemberRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>chan-channelx-1l1hmckuuisxo</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Organization")
    public java.util.List<CreateChannelMemberRequestOrganization> organization;

    public static CreateChannelMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateChannelMemberRequest self = new CreateChannelMemberRequest();
        return TeaModel.build(map, self);
    }

    public CreateChannelMemberRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public CreateChannelMemberRequest setOrganization(java.util.List<CreateChannelMemberRequestOrganization> organization) {
        this.organization = organization;
        return this;
    }
    public java.util.List<CreateChannelMemberRequestOrganization> getOrganization() {
        return this.organization;
    }

    public static class CreateChannelMemberRequestOrganization extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>peers-aaaaaa1-1oxw31d046jtl</p>
         */
        @NameInMap("Id")
        public String id;

        public static CreateChannelMemberRequestOrganization build(java.util.Map<String, ?> map) throws Exception {
            CreateChannelMemberRequestOrganization self = new CreateChannelMemberRequestOrganization();
            return TeaModel.build(map, self);
        }

        public CreateChannelMemberRequestOrganization setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
