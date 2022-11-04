// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ListDialogueTemplateHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("x-acs-aligenie-access-token")
    public String xAcsAligenieAccessToken;

    @NameInMap("Authorization")
    public String authorization;

    public static ListDialogueTemplateHeaders build(java.util.Map<String, ?> map) throws Exception {
        ListDialogueTemplateHeaders self = new ListDialogueTemplateHeaders();
        return TeaModel.build(map, self);
    }

    public ListDialogueTemplateHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public ListDialogueTemplateHeaders setXAcsAligenieAccessToken(String xAcsAligenieAccessToken) {
        this.xAcsAligenieAccessToken = xAcsAligenieAccessToken;
        return this;
    }
    public String getXAcsAligenieAccessToken() {
        return this.xAcsAligenieAccessToken;
    }

    public ListDialogueTemplateHeaders setAuthorization(String authorization) {
        this.authorization = authorization;
        return this;
    }
    public String getAuthorization() {
        return this.authorization;
    }

}
