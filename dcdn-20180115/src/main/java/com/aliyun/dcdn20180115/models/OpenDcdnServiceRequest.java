// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class OpenDcdnServiceRequest extends TeaModel {
    /**
     * <p>The metering method of DCDN. Valid values:</p>
     * <br>
     * <p>*   **PayByTraffic**: pay-by-traffic</p>
     * <p>*   **PayByBandwidth**: pay-by-bandwidth</p>
     */
    @NameInMap("BillType")
    public String billType;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The metering method of WebSocket. Valid values:</p>
     * <br>
     * <p>*   **websockettraffic**: pay-by-data-transfer</p>
     * <p>*   **websocketbps**: pay-by-bandwidth</p>
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
