// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class DescribeFingerPrintTemplatesRequest extends TeaModel {
    @NameInMap("ClientId")
    public String clientId;

    @NameInMap("LoginToken")
    public String loginToken;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SessionId")
    public String sessionId;

    public static DescribeFingerPrintTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFingerPrintTemplatesRequest self = new DescribeFingerPrintTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFingerPrintTemplatesRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public DescribeFingerPrintTemplatesRequest setLoginToken(String loginToken) {
        this.loginToken = loginToken;
        return this;
    }
    public String getLoginToken() {
        return this.loginToken;
    }

    public DescribeFingerPrintTemplatesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeFingerPrintTemplatesRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

}
