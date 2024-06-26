// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class InstallChaincodeRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>chan-channelx-1l1hmckuuisxo</p>
     */
    @NameInMap("ChaincodeId")
    public String chaincodeId;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("Location")
    public String location;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>peers-aaaaaa2-1eqnj5o5w9dt3</p>
     */
    @NameInMap("OrganizationId")
    public String organizationId;

    public static InstallChaincodeRequest build(java.util.Map<String, ?> map) throws Exception {
        InstallChaincodeRequest self = new InstallChaincodeRequest();
        return TeaModel.build(map, self);
    }

    public InstallChaincodeRequest setChaincodeId(String chaincodeId) {
        this.chaincodeId = chaincodeId;
        return this;
    }
    public String getChaincodeId() {
        return this.chaincodeId;
    }

    public InstallChaincodeRequest setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public InstallChaincodeRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

}
