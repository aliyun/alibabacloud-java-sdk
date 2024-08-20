// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class OpenDcdnServiceRequest extends TeaModel {
    /**
     * <p>The metering method of DCDN. Valid values:</p>
     * <ul>
     * <li><strong>PayByTraffic</strong>: pay-by-traffic</li>
     * <li><strong>PayByBandwidth</strong>: pay-by-bandwidth</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PayByTraffic</p>
     */
    @NameInMap("BillType")
    public String billType;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The metering method of WebSocket. Valid values:</p>
     * <ul>
     * <li><strong>websockettraffic</strong>: pay-by-data-transfer</li>
     * <li><strong>websocketbps</strong>: pay-by-bandwidth</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>websockettraffic</p>
     */
    @NameInMap("WebsocketBillType")
    public String websocketBillType;

    public static OpenDcdnServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenDcdnServiceRequest self = new OpenDcdnServiceRequest();
        return TeaModel.build(map, self);
    }

    public OpenDcdnServiceRequest setBillType(String billType) {
        this.billType = billType;
        return this;
    }
    public String getBillType() {
        return this.billType;
    }

    public OpenDcdnServiceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public OpenDcdnServiceRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public OpenDcdnServiceRequest setWebsocketBillType(String websocketBillType) {
        this.websocketBillType = websocketBillType;
        return this;
    }
    public String getWebsocketBillType() {
        return this.websocketBillType;
    }

}
