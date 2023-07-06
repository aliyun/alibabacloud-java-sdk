// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class GetLoginTokenResponseBody extends TeaModel {
    @NameInMap("Email")
    public String email;

    @NameInMap("EndUserId")
    public String endUserId;

    @NameInMap("Industry")
    public String industry;

    @NameInMap("KeepAliveToken")
    public String keepAliveToken;

    @NameInMap("Label")
    public String label;

    @NameInMap("LoginToken")
    public String loginToken;

    @NameInMap("NextStage")
    public String nextStage;

    @NameInMap("Phone")
    public String phone;

    @NameInMap("Props")
    public java.util.Map<String, String> props;

    @NameInMap("QrCodePng")
    public String qrCodePng;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Secret")
    public String secret;

    @NameInMap("SessionId")
    public String sessionId;

    @NameInMap("TenantId")
    public Long tenantId;

    @NameInMap("WindowDisplayMode")
    public String windowDisplayMode;

    public static GetLoginTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLoginTokenResponseBody self = new GetLoginTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLoginTokenResponseBody setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public GetLoginTokenResponseBody setEndUserId(String endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public String getEndUserId() {
        return this.endUserId;
    }

    public GetLoginTokenResponseBody setIndustry(String industry) {
        this.industry = industry;
        return this;
    }
    public String getIndustry() {
        return this.industry;
    }

    public GetLoginTokenResponseBody setKeepAliveToken(String keepAliveToken) {
        this.keepAliveToken = keepAliveToken;
        return this;
    }
    public String getKeepAliveToken() {
        return this.keepAliveToken;
    }

    public GetLoginTokenResponseBody setLabel(String label) {
        this.label = label;
        return this;
    }
    public String getLabel() {
        return this.label;
    }

    public GetLoginTokenResponseBody setLoginToken(String loginToken) {
        this.loginToken = loginToken;
        return this;
    }
    public String getLoginToken() {
        return this.loginToken;
    }

    public GetLoginTokenResponseBody setNextStage(String nextStage) {
        this.nextStage = nextStage;
        return this;
    }
    public String getNextStage() {
        return this.nextStage;
    }

    public GetLoginTokenResponseBody setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public GetLoginTokenResponseBody setProps(java.util.Map<String, String> props) {
        this.props = props;
        return this;
    }
    public java.util.Map<String, String> getProps() {
        return this.props;
    }

    public GetLoginTokenResponseBody setQrCodePng(String qrCodePng) {
        this.qrCodePng = qrCodePng;
        return this;
    }
    public String getQrCodePng() {
        return this.qrCodePng;
    }

    public GetLoginTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLoginTokenResponseBody setSecret(String secret) {
        this.secret = secret;
        return this;
    }
    public String getSecret() {
        return this.secret;
    }

    public GetLoginTokenResponseBody setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public GetLoginTokenResponseBody setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public GetLoginTokenResponseBody setWindowDisplayMode(String windowDisplayMode) {
        this.windowDisplayMode = windowDisplayMode;
        return this;
    }
    public String getWindowDisplayMode() {
        return this.windowDisplayMode;
    }

}
