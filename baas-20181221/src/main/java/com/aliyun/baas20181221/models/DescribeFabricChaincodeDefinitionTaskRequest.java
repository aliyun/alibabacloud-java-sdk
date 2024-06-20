// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricChaincodeDefinitionTaskRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>code-sacc-jbkuldd3i7ad</p>
     */
    @NameInMap("ChaincodeId")
    public String chaincodeId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>peers-aaaaaa2-1eqnj5o5w9dt3</p>
     */
    @NameInMap("OrganizationId")
    public String organizationId;

    public static DescribeFabricChaincodeDefinitionTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricChaincodeDefinitionTaskRequest self = new DescribeFabricChaincodeDefinitionTaskRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFabricChaincodeDefinitionTaskRequest setChaincodeId(String chaincodeId) {
        this.chaincodeId = chaincodeId;
        return this;
    }
    public String getChaincodeId() {
        return this.chaincodeId;
    }

    public DescribeFabricChaincodeDefinitionTaskRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

}
