// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class GetUAIDApplyTokenSignRequest extends TeaModel {
    /**
     * <p>The authorization code.</p>
     * <blockquote>
     * <p>To obtain this authorization code, navigate to <strong>Tag Plaza</strong> in the <a href="https://dytns.console.aliyun.com/analysis/square"><strong>Phone Number Verification Service</strong></a> console, select a tag, and submit an application. You receive the code after your application is approved.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>HwD97InG</p>
     */
    @NameInMap("AuthCode")
    public String authCode;

    /**
     * <p>The mobile carrier. Valid values:</p>
     * <ul>
     * <li><p><strong>CM</strong>: China Mobile</p>
     * </li>
     * <li><p><strong>CU</strong>: China Unicom</p>
     * </li>
     * <li><p><strong>CT</strong>: China Telecom</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CM</p>
     */
    @NameInMap("Carrier")
    public String carrier;

    /**
     * <p>The client type. Valid values:</p>
     * <ul>
     * <li><p><code>30100</code>: Android</p>
     * </li>
     * <li><p><code>30300</code>: iOS</p>
     * </li>
     * <li><p><code>20200</code>: H5</p>
     * </li>
     * <li><p><code>10010</code>: Web</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30300</p>
     */
    @NameInMap("ClientType")
    public String clientType;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("Format")
    public String format;

    /**
     * <p>The external ID.</p>
     * <blockquote>
     * <p>For China Mobile (CM), this parameter corresponds to <code>traceId</code> and <code>msgId</code>. The values of <code>OutId</code>, <code>traceId</code>, and <code>msgId</code> must be the same.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>b8b5b3a*******0b9893484fdf412c99</p>
     */
    @NameInMap("OutId")
    public String outId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>This parameter is required if the carrier is China Telecom (CT). For details, see the China Telecom documentation.</p>
     * 
     * <strong>example:</strong>
     * <p>955EC1A869852EA8BC66F********D7C6E92017BBD5B001C736EFEAFB775C232</p>
     */
    @NameInMap("ParamKey")
    public String paramKey;

    /**
     * <p>This parameter is required if the carrier is China Telecom (CT). For details, see the China Telecom documentation.</p>
     * 
     * <strong>example:</strong>
     * <p>B2F0D4CD7A216D16CE2AF4BBC********29A454FDDD991F919106C12CB89ABA8</p>
     */
    @NameInMap("ParamStr")
    public String paramStr;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The event timestamp, accurate to the millisecond.<br>
     * Format: <code>yyyyMMddHHmmssSSS</code>.<br></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20121227180001165</p>
     */
    @NameInMap("Time")
    public String time;

    public static GetUAIDApplyTokenSignRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUAIDApplyTokenSignRequest self = new GetUAIDApplyTokenSignRequest();
        return TeaModel.build(map, self);
    }

    public GetUAIDApplyTokenSignRequest setAuthCode(String authCode) {
        this.authCode = authCode;
        return this;
    }
    public String getAuthCode() {
        return this.authCode;
    }

    public GetUAIDApplyTokenSignRequest setCarrier(String carrier) {
        this.carrier = carrier;
        return this;
    }
    public String getCarrier() {
        return this.carrier;
    }

    public GetUAIDApplyTokenSignRequest setClientType(String clientType) {
        this.clientType = clientType;
        return this;
    }
    public String getClientType() {
        return this.clientType;
    }

    public GetUAIDApplyTokenSignRequest setFormat(String format) {
        this.format = format;
        return this;
    }
    public String getFormat() {
        return this.format;
    }

    public GetUAIDApplyTokenSignRequest setOutId(String outId) {
        this.outId = outId;
        return this;
    }
    public String getOutId() {
        return this.outId;
    }

    public GetUAIDApplyTokenSignRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public GetUAIDApplyTokenSignRequest setParamKey(String paramKey) {
        this.paramKey = paramKey;
        return this;
    }
    public String getParamKey() {
        return this.paramKey;
    }

    public GetUAIDApplyTokenSignRequest setParamStr(String paramStr) {
        this.paramStr = paramStr;
        return this;
    }
    public String getParamStr() {
        return this.paramStr;
    }

    public GetUAIDApplyTokenSignRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public GetUAIDApplyTokenSignRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public GetUAIDApplyTokenSignRequest setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

}
