// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class RefreshOfficeEditTokenRequest extends TeaModel {
    @NameInMap("AccessToken")
    public String accessToken;

    @NameInMap("Project")
    public String project;

    @NameInMap("RefreshToken")
    public String refreshToken;

    public static RefreshOfficeEditTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        RefreshOfficeEditTokenRequest self = new RefreshOfficeEditTokenRequest();
        return TeaModel.build(map, self);
    }

    public RefreshOfficeEditTokenRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public RefreshOfficeEditTokenRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public RefreshOfficeEditTokenRequest setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }
    public String getRefreshToken() {
        return this.refreshToken;
    }

}
