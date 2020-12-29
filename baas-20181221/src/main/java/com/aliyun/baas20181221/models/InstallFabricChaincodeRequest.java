// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class InstallFabricChaincodeRequest extends TeaModel {
    @NameInMap("OrganizationId")
    public String organizationId;

    @NameInMap("ChaincodeId")
    public String chaincodeId;

    @NameInMap("Location")
    public String location;

    public static InstallFabricChaincodeRequest build(java.util.Map<String, ?> map) throws Exception {
        InstallFabricChaincodeRequest self = new InstallFabricChaincodeRequest();
        return TeaModel.build(map, self);
    }

    public InstallFabricChaincodeRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public InstallFabricChaincodeRequest setChaincodeId(String chaincodeId) {
        this.chaincodeId = chaincodeId;
        return this;
    }
    public String getChaincodeId() {
        return this.chaincodeId;
    }

    public InstallFabricChaincodeRequest setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

}
