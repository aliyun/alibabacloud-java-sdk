// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddRspDomainServerHoldStatusForGatewayOteRequest extends TeaModel {
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
     * <p>dns-example.top</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("StatusMsg")
    public String statusMsg;

    public static AddRspDomainServerHoldStatusForGatewayOteRequest build(java.util.Map<String, ?> map) throws Exception {
        AddRspDomainServerHoldStatusForGatewayOteRequest self = new AddRspDomainServerHoldStatusForGatewayOteRequest();
        return TeaModel.build(map, self);
    }

    public AddRspDomainServerHoldStatusForGatewayOteRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AddRspDomainServerHoldStatusForGatewayOteRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public AddRspDomainServerHoldStatusForGatewayOteRequest setStatusMsg(String statusMsg) {
        this.statusMsg = statusMsg;
        return this;
    }
    public String getStatusMsg() {
        return this.statusMsg;
    }

}
