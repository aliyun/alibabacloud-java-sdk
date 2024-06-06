// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idaas_doraemon20210520.models;

import com.aliyun.tea.*;

public class FetchAccessTokenRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApplicationExternalId")
    public String applicationExternalId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("MobileExtendParamsJson")
    public String mobileExtendParamsJson;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("MobileExtendParamsJsonSign")
    public String mobileExtendParamsJsonSign;

    @NameInMap("ServerExtendParamsJson")
    public String serverExtendParamsJson;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("XClientIp")
    public String XClientIp;

    public static FetchAccessTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        FetchAccessTokenRequest self = new FetchAccessTokenRequest();
        return TeaModel.build(map, self);
    }

    public FetchAccessTokenRequest setApplicationExternalId(String applicationExternalId) {
        this.applicationExternalId = applicationExternalId;
        return this;
    }
    public String getApplicationExternalId() {
        return this.applicationExternalId;
    }

    public FetchAccessTokenRequest setMobileExtendParamsJson(String mobileExtendParamsJson) {
        this.mobileExtendParamsJson = mobileExtendParamsJson;
        return this;
    }
    public String getMobileExtendParamsJson() {
        return this.mobileExtendParamsJson;
    }

    public FetchAccessTokenRequest setMobileExtendParamsJsonSign(String mobileExtendParamsJsonSign) {
        this.mobileExtendParamsJsonSign = mobileExtendParamsJsonSign;
        return this;
    }
    public String getMobileExtendParamsJsonSign() {
        return this.mobileExtendParamsJsonSign;
    }

    public FetchAccessTokenRequest setServerExtendParamsJson(String serverExtendParamsJson) {
        this.serverExtendParamsJson = serverExtendParamsJson;
        return this;
    }
    public String getServerExtendParamsJson() {
        return this.serverExtendParamsJson;
    }

    public FetchAccessTokenRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public FetchAccessTokenRequest setXClientIp(String XClientIp) {
        this.XClientIp = XClientIp;
        return this;
    }
    public String getXClientIp() {
        return this.XClientIp;
    }

}
