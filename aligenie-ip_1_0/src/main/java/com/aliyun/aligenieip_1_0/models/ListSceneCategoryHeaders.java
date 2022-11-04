// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ListSceneCategoryHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("x-acs-aligenie-access-token")
    public String xAcsAligenieAccessToken;

    @NameInMap("Authorization")
    public String authorization;

    public static ListSceneCategoryHeaders build(java.util.Map<String, ?> map) throws Exception {
        ListSceneCategoryHeaders self = new ListSceneCategoryHeaders();
        return TeaModel.build(map, self);
    }

    public ListSceneCategoryHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public ListSceneCategoryHeaders setXAcsAligenieAccessToken(String xAcsAligenieAccessToken) {
        this.xAcsAligenieAccessToken = xAcsAligenieAccessToken;
        return this;
    }
    public String getXAcsAligenieAccessToken() {
        return this.xAcsAligenieAccessToken;
    }

    public ListSceneCategoryHeaders setAuthorization(String authorization) {
        this.authorization = authorization;
        return this;
    }
    public String getAuthorization() {
        return this.authorization;
    }

}
