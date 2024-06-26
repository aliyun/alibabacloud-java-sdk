// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class InstallFabricChaincodePackageRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ChaincodePackageId")
    public String chaincodePackageId;

    @NameInMap("Location")
    public String location;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("OrganizationId")
    public String organizationId;

    public static InstallFabricChaincodePackageRequest build(java.util.Map<String, ?> map) throws Exception {
        InstallFabricChaincodePackageRequest self = new InstallFabricChaincodePackageRequest();
        return TeaModel.build(map, self);
    }

    public InstallFabricChaincodePackageRequest setChaincodePackageId(String chaincodePackageId) {
        this.chaincodePackageId = chaincodePackageId;
        return this;
    }
    public String getChaincodePackageId() {
        return this.chaincodePackageId;
    }

    public InstallFabricChaincodePackageRequest setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public InstallFabricChaincodePackageRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

}
