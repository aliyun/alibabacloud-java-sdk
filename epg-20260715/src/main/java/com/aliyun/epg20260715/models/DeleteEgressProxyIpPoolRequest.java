// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.epg20260715.models;

import com.aliyun.tea.*;

public class DeleteEgressProxyIpPoolRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can generate the value of this parameter on the client side. Make sure that the value is unique across different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>Note: If you do not specify this parameter, the system automatically uses the RequestId of the API request as the client token. The RequestId of each API request is different.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B******</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to only precheck the request. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The system sends a check request and does not delete the egress proxy IP address pool. The system checks whether the required parameters are specified, the request format is valid, and the service limits are met. If the check fails, the system returns the corresponding error. If the check succeeds, the system returns the error code DryRunOperation.</p>
     * </li>
     * <li><p><strong>false</strong> (default): The system sends a normal request. If the check succeeds, the system returns an HTTP 2xx status code and performs the operation.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The ID of the egress proxy IP address pool.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eppool-gw80d96a96ca0b00****</p>
     */
    @NameInMap("EgressProxyIpPoolId")
    public String egressProxyIpPoolId;

    public static DeleteEgressProxyIpPoolRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteEgressProxyIpPoolRequest self = new DeleteEgressProxyIpPoolRequest();
        return TeaModel.build(map, self);
    }

    public DeleteEgressProxyIpPoolRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteEgressProxyIpPoolRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public DeleteEgressProxyIpPoolRequest setEgressProxyIpPoolId(String egressProxyIpPoolId) {
        this.egressProxyIpPoolId = egressProxyIpPoolId;
        return this;
    }
    public String getEgressProxyIpPoolId() {
        return this.egressProxyIpPoolId;
    }

}
