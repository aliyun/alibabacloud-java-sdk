// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class BindFabricManagementChaincodeRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ChaincodeId")
    public String chaincodeId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("OrganizationId")
    public String organizationId;

    public static BindFabricManagementChaincodeRequest build(java.util.Map<String, ?> map) throws Exception {
        BindFabricManagementChaincodeRequest self = new BindFabricManagementChaincodeRequest();
        return TeaModel.build(map, self);
    }

    public BindFabricManagementChaincodeRequest setChaincodeId(String chaincodeId) {
        this.chaincodeId = chaincodeId;
        return this;
    }
    public String getChaincodeId() {
        return this.chaincodeId;
    }

    public BindFabricManagementChaincodeRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public BindFabricManagementChaincodeRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

}
