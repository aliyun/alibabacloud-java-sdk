// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricOrganizationChaincodePackageRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>peers-aaaaaa2-1eqnj5o5w9dt3</p>
     */
    @NameInMap("OrganizationId")
    public String organizationId;

    public static DescribeFabricOrganizationChaincodePackageRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricOrganizationChaincodePackageRequest self = new DescribeFabricOrganizationChaincodePackageRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFabricOrganizationChaincodePackageRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

}
