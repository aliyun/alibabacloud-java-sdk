// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricChaincodeUploadPolicyRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>peers-aaaaaa1-1oxw31d04****</p>
     */
    @NameInMap("OrganizationId")
    public String organizationId;

    public static DescribeFabricChaincodeUploadPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricChaincodeUploadPolicyRequest self = new DescribeFabricChaincodeUploadPolicyRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFabricChaincodeUploadPolicyRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

}
