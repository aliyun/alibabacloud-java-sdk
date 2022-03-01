// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricChaincodeDefinitionTaskRequest extends TeaModel {
    @NameInMap("ChaincodeId")
    public String chaincodeId;

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
