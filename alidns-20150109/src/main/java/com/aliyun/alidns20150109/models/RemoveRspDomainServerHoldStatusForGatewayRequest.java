// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class RemoveRspDomainServerHoldStatusForGatewayRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>asdf</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The domain name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The description of the status.</p>
     * 
     * <strong>example:</strong>
     * <p>实名认证通过，解除serverHold状态</p>
     */
    @NameInMap("StatusMsg")
    public String statusMsg;

    public static RemoveRspDomainServerHoldStatusForGatewayRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveRspDomainServerHoldStatusForGatewayRequest self = new RemoveRspDomainServerHoldStatusForGatewayRequest();
        return TeaModel.build(map, self);
    }

    public RemoveRspDomainServerHoldStatusForGatewayRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RemoveRspDomainServerHoldStatusForGatewayRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public RemoveRspDomainServerHoldStatusForGatewayRequest setStatusMsg(String statusMsg) {
        this.statusMsg = statusMsg;
        return this;
    }
    public String getStatusMsg() {
        return this.statusMsg;
    }

}
