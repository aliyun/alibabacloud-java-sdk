// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddRspDomainServerHoldStatusForGatewayRequest extends TeaModel {
    /**
     * <p>An idempotency parameter.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>token123</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The domain name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dns-example.top</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The status description.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>实名认证通过，解除serverHold状态</p>
     */
    @NameInMap("StatusMsg")
    public String statusMsg;

    public static AddRspDomainServerHoldStatusForGatewayRequest build(java.util.Map<String, ?> map) throws Exception {
        AddRspDomainServerHoldStatusForGatewayRequest self = new AddRspDomainServerHoldStatusForGatewayRequest();
        return TeaModel.build(map, self);
    }

    public AddRspDomainServerHoldStatusForGatewayRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AddRspDomainServerHoldStatusForGatewayRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public AddRspDomainServerHoldStatusForGatewayRequest setStatusMsg(String statusMsg) {
        this.statusMsg = statusMsg;
        return this;
    }
    public String getStatusMsg() {
        return this.statusMsg;
    }

}
