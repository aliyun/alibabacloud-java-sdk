// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.epg20260715.models;

import com.aliyun.tea.*;

public class DeleteEgressProxyGatewayRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can generate the value of this parameter on the client side. Make sure that the value is unique across different requests. The ClientToken parameter supports only ASCII characters.</p>
     * <blockquote>
     * <p>Note: If you do not specify this parameter, the system automatically uses the RequestId of the API request as the ClientToken. The RequestId of each API request is unique.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B******</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform only a dry run on the request. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Sends a check request and does not delete the egress proxy gateway instance. The system checks whether required parameters are specified, the request format is valid, and service limits are met. If the check fails, the system returns an error. If the check succeeds, the system returns the error code DryRunOperation.</p>
     * </li>
     * <li><p><strong>false</strong> (default): Sends a regular request. If the check succeeds, the system returns an HTTP 2xx status code and performs the operation.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The ID of the egress proxy gateway instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>epg-gw80bb6a94f835db****</p>
     */
    @NameInMap("EgressProxyGatewayId")
    public String egressProxyGatewayId;

    public static DeleteEgressProxyGatewayRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteEgressProxyGatewayRequest self = new DeleteEgressProxyGatewayRequest();
        return TeaModel.build(map, self);
    }

    public DeleteEgressProxyGatewayRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteEgressProxyGatewayRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public DeleteEgressProxyGatewayRequest setEgressProxyGatewayId(String egressProxyGatewayId) {
        this.egressProxyGatewayId = egressProxyGatewayId;
        return this;
    }
    public String getEgressProxyGatewayId() {
        return this.egressProxyGatewayId;
    }

}
