// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateKibanaPvlNetworkRequest extends TeaModel {
    @NameInMap("endpointName")
    public String endpointName;

    @NameInMap("securityGroups")
    public java.util.List<String> securityGroups;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("pvlId")
    public String pvlId;

    public static UpdateKibanaPvlNetworkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateKibanaPvlNetworkRequest self = new UpdateKibanaPvlNetworkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateKibanaPvlNetworkRequest setEndpointName(String endpointName) {
        this.endpointName = endpointName;
        return this;
    }
    public String getEndpointName() {
        return this.endpointName;
    }

    public UpdateKibanaPvlNetworkRequest setSecurityGroups(java.util.List<String> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }
    public java.util.List<String> getSecurityGroups() {
        return this.securityGroups;
    }

    public UpdateKibanaPvlNetworkRequest setPvlId(String pvlId) {
        this.pvlId = pvlId;
        return this;
    }
    public String getPvlId() {
        return this.pvlId;
    }

}
