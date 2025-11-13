// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateRspDomainServerHoldStatusOteRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>443F1A21-XXXX-55C4-93E1-FF020DF93D7B</p>
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

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gatewayId001</p>
     */
    @NameInMap("OperatorId")
    public String operatorId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>registryGateway</p>
     */
    @NameInMap("OperatorType")
    public String operatorType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>enable</p>
     */
    @NameInMap("ServerHoldStatus")
    public String serverHoldStatus;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("StatusMsg")
    public String statusMsg;

    public static UpdateRspDomainServerHoldStatusOteRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRspDomainServerHoldStatusOteRequest self = new UpdateRspDomainServerHoldStatusOteRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRspDomainServerHoldStatusOteRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateRspDomainServerHoldStatusOteRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public UpdateRspDomainServerHoldStatusOteRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public UpdateRspDomainServerHoldStatusOteRequest setOperatorType(String operatorType) {
        this.operatorType = operatorType;
        return this;
    }
    public String getOperatorType() {
        return this.operatorType;
    }

    public UpdateRspDomainServerHoldStatusOteRequest setServerHoldStatus(String serverHoldStatus) {
        this.serverHoldStatus = serverHoldStatus;
        return this;
    }
    public String getServerHoldStatus() {
        return this.serverHoldStatus;
    }

    public UpdateRspDomainServerHoldStatusOteRequest setStatusMsg(String statusMsg) {
        this.statusMsg = statusMsg;
        return this;
    }
    public String getStatusMsg() {
        return this.statusMsg;
    }

}
