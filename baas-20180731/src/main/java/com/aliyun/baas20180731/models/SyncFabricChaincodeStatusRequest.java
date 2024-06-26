// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class SyncFabricChaincodeStatusRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ChaincodeId")
    public String chaincodeId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("OrganizationId")
    public String organizationId;

    public static SyncFabricChaincodeStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncFabricChaincodeStatusRequest self = new SyncFabricChaincodeStatusRequest();
        return TeaModel.build(map, self);
    }

    public SyncFabricChaincodeStatusRequest setChaincodeId(String chaincodeId) {
        this.chaincodeId = chaincodeId;
        return this;
    }
    public String getChaincodeId() {
        return this.chaincodeId;
    }

    public SyncFabricChaincodeStatusRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

}
