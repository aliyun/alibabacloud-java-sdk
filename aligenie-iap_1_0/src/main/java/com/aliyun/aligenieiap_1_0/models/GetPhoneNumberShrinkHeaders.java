// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieiap_1_0.models;

import com.aliyun.tea.*;

public class GetPhoneNumberShrinkHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    // 公共入参名称
    @NameInMap("CommonParams")
    public String commonParamsShrink;

    @NameInMap("x-acs-aligenie-access-token")
    public String xAcsAligenieAccessToken;

    @NameInMap("Authorization")
    public String authorization;

    public static GetPhoneNumberShrinkHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetPhoneNumberShrinkHeaders self = new GetPhoneNumberShrinkHeaders();
        return TeaModel.build(map, self);
    }

    public GetPhoneNumberShrinkHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetPhoneNumberShrinkHeaders setCommonParamsShrink(String commonParamsShrink) {
        this.commonParamsShrink = commonParamsShrink;
        return this;
    }
    public String getCommonParamsShrink() {
        return this.commonParamsShrink;
    }

    public GetPhoneNumberShrinkHeaders setXAcsAligenieAccessToken(String xAcsAligenieAccessToken) {
        this.xAcsAligenieAccessToken = xAcsAligenieAccessToken;
        return this;
    }
    public String getXAcsAligenieAccessToken() {
        return this.xAcsAligenieAccessToken;
    }

    public GetPhoneNumberShrinkHeaders setAuthorization(String authorization) {
        this.authorization = authorization;
        return this;
    }
    public String getAuthorization() {
        return this.authorization;
    }

}
