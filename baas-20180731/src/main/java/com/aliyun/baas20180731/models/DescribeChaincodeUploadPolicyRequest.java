// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeChaincodeUploadPolicyRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>peers-aaaaaa1-1oxw31d04****</p>
     */
    @NameInMap("OrganizationId")
    public String organizationId;

    public static DescribeChaincodeUploadPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeChaincodeUploadPolicyRequest self = new DescribeChaincodeUploadPolicyRequest();
        return TeaModel.build(map, self);
    }

    public DescribeChaincodeUploadPolicyRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

}
