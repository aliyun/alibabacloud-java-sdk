// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class RefreshWebofficeTokenRequest extends TeaModel {
    @NameInMap("AccessToken")
    public String accessToken;

    @NameInMap("Project")
    public String project;

    @NameInMap("RefreshToken")
    public String refreshToken;

    public static RefreshWebofficeTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        RefreshWebofficeTokenRequest self = new RefreshWebofficeTokenRequest();
        return TeaModel.build(map, self);
    }

    public RefreshWebofficeTokenRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public RefreshWebofficeTokenRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public RefreshWebofficeTokenRequest setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }
    public String getRefreshToken() {
        return this.refreshToken;
    }

}
