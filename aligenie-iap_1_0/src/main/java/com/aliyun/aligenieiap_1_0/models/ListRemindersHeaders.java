// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieiap_1_0.models;

import com.aliyun.tea.*;

public class ListRemindersHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("x-acs-aligenie-access-token")
    public String xAcsAligenieAccessToken;

    @NameInMap("Authorization")
    public String authorization;

    public static ListRemindersHeaders build(java.util.Map<String, ?> map) throws Exception {
        ListRemindersHeaders self = new ListRemindersHeaders();
        return TeaModel.build(map, self);
    }

    public ListRemindersHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public ListRemindersHeaders setXAcsAligenieAccessToken(String xAcsAligenieAccessToken) {
        this.xAcsAligenieAccessToken = xAcsAligenieAccessToken;
        return this;
    }
    public String getXAcsAligenieAccessToken() {
        return this.xAcsAligenieAccessToken;
    }

    public ListRemindersHeaders setAuthorization(String authorization) {
        this.authorization = authorization;
        return this;
    }
    public String getAuthorization() {
        return this.authorization;
    }

}
