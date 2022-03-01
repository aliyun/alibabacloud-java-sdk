// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class SynchronizeFabricChaincodeRequest extends TeaModel {
    @NameInMap("ChaincodeId")
    public String chaincodeId;

    @NameInMap("OrganizationId")
    public String organizationId;

    public static SynchronizeFabricChaincodeRequest build(java.util.Map<String, ?> map) throws Exception {
        SynchronizeFabricChaincodeRequest self = new SynchronizeFabricChaincodeRequest();
        return TeaModel.build(map, self);
    }

    public SynchronizeFabricChaincodeRequest setChaincodeId(String chaincodeId) {
        this.chaincodeId = chaincodeId;
        return this;
    }
    public String getChaincodeId() {
        return this.chaincodeId;
    }

    public SynchronizeFabricChaincodeRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

}
