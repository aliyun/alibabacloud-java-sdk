// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeChannelMembersRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>chan-channelx-1l1hmckuu****</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    @NameInMap("OrganizationId")
    public String organizationId;

    public static DescribeChannelMembersRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeChannelMembersRequest self = new DescribeChannelMembersRequest();
        return TeaModel.build(map, self);
    }

    public DescribeChannelMembersRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public DescribeChannelMembersRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

}
