// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class ApproveFabricChaincodeDefinitionRequest extends TeaModel {
    @NameInMap("ChaincodeId")
    public String chaincodeId;

    @NameInMap("ChaincodePackageId")
    public String chaincodePackageId;

    @NameInMap("Location")
    public String location;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("OrganizationId")
    public String organizationId;

    public static ApproveFabricChaincodeDefinitionRequest build(java.util.Map<String, ?> map) throws Exception {
        ApproveFabricChaincodeDefinitionRequest self = new ApproveFabricChaincodeDefinitionRequest();
        return TeaModel.build(map, self);
    }

    public ApproveFabricChaincodeDefinitionRequest setChaincodeId(String chaincodeId) {
        this.chaincodeId = chaincodeId;
        return this;
    }
    public String getChaincodeId() {
        return this.chaincodeId;
    }

    public ApproveFabricChaincodeDefinitionRequest setChaincodePackageId(String chaincodePackageId) {
        this.chaincodePackageId = chaincodePackageId;
        return this;
    }
    public String getChaincodePackageId() {
        return this.chaincodePackageId;
    }

    public ApproveFabricChaincodeDefinitionRequest setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public ApproveFabricChaincodeDefinitionRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

}
