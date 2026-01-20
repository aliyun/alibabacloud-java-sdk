// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class RemoveRspDomainServerHoldStatusForGatewayOteRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>qwoefasdf</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("StatusMsg")
    public String statusMsg;

    public static RemoveRspDomainServerHoldStatusForGatewayOteRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveRspDomainServerHoldStatusForGatewayOteRequest self = new RemoveRspDomainServerHoldStatusForGatewayOteRequest();
        return TeaModel.build(map, self);
    }

    public RemoveRspDomainServerHoldStatusForGatewayOteRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RemoveRspDomainServerHoldStatusForGatewayOteRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public RemoveRspDomainServerHoldStatusForGatewayOteRequest setStatusMsg(String statusMsg) {
        this.statusMsg = statusMsg;
        return this;
    }
    public String getStatusMsg() {
        return this.statusMsg;
    }

}
