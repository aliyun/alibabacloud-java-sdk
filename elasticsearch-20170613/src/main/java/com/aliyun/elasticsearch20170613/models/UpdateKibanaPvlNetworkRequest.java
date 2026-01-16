// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateKibanaPvlNetworkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>es-cn-27a3mul6l00***-kibana</p>
     */
    @NameInMap("endpointName")
    public String endpointName;

    @NameInMap("securityGroups")
    public java.util.List<String> securityGroups;

    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>es-cn-27a3mul6l0***-kibana-internal</p>
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

    public UpdateKibanaPvlNetworkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateKibanaPvlNetworkRequest setPvlId(String pvlId) {
        this.pvlId = pvlId;
        return this;
    }
    public String getPvlId() {
        return this.pvlId;
    }

}
