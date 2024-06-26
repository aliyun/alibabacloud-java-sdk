// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class SynchronizeChaincodeRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>code-sacc-1pr09q7jm****</p>
     */
    @NameInMap("ChaincodeId")
    public String chaincodeId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>peers-aaaaaa2-1eqnj5o5w****</p>
     */
    @NameInMap("OrganizationId")
    public String organizationId;

    public static SynchronizeChaincodeRequest build(java.util.Map<String, ?> map) throws Exception {
        SynchronizeChaincodeRequest self = new SynchronizeChaincodeRequest();
        return TeaModel.build(map, self);
    }

    public SynchronizeChaincodeRequest setChaincodeId(String chaincodeId) {
        this.chaincodeId = chaincodeId;
        return this;
    }
    public String getChaincodeId() {
        return this.chaincodeId;
    }

    public SynchronizeChaincodeRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

}
