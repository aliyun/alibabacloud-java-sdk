// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianmodelonchip20240816.models;

import com.aliyun.tea.*;

public class DeviceRegisterRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("appId")
    public String appId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2a64edd96296880f55aa61987b</p>
     */
    @NameInMap("nonce")
    public String nonce;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1748312544852</p>
     */
    @NameInMap("requestTime")
    public String requestTime;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3spKwUgUpAGsXbbrHKnpVJPlI9wamoyhh96uqJuSyCKyJ7oscLAHRcz15dSzLG5L+ywFgYXSQNqdRtsn/Ri0j7pD0IuoKt9R7EnNo/U6viPvWD3Ldp3ehDDtOFtSrpUg6LTedvGtUWYU4x/zSD2jgCXijEdZCCMGCypcheMHRXfInYWF1xFtnCEXJfxtrBrnCk1p/pW3JSmdHJzmInnUEO3dWbNe3A==</p>
     */
    @NameInMap("signature")
    public String signature;

    @NameInMap("workspaceId")
    public String workspaceId;

    public static DeviceRegisterRequest build(java.util.Map<String, ?> map) throws Exception {
        DeviceRegisterRequest self = new DeviceRegisterRequest();
        return TeaModel.build(map, self);
    }

    public DeviceRegisterRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DeviceRegisterRequest setNonce(String nonce) {
        this.nonce = nonce;
        return this;
    }
    public String getNonce() {
        return this.nonce;
    }

    public DeviceRegisterRequest setRequestTime(String requestTime) {
        this.requestTime = requestTime;
        return this;
    }
    public String getRequestTime() {
        return this.requestTime;
    }

    public DeviceRegisterRequest setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

    public DeviceRegisterRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
