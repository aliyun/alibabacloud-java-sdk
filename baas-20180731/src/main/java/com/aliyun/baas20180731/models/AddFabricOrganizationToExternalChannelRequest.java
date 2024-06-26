// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class AddFabricOrganizationToExternalChannelRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("JoinResponse")
    public String joinResponse;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("OrganizationId")
    public String organizationId;

    public static AddFabricOrganizationToExternalChannelRequest build(java.util.Map<String, ?> map) throws Exception {
        AddFabricOrganizationToExternalChannelRequest self = new AddFabricOrganizationToExternalChannelRequest();
        return TeaModel.build(map, self);
    }

    public AddFabricOrganizationToExternalChannelRequest setJoinResponse(String joinResponse) {
        this.joinResponse = joinResponse;
        return this;
    }
    public String getJoinResponse() {
        return this.joinResponse;
    }

    public AddFabricOrganizationToExternalChannelRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

}
