// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class RefreshOfficePreviewTokenRequest extends TeaModel {
    @NameInMap("AccessToken")
    public String accessToken;

    @NameInMap("Project")
    public String project;

    @NameInMap("RefreshToken")
    public String refreshToken;

    public static RefreshOfficePreviewTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        RefreshOfficePreviewTokenRequest self = new RefreshOfficePreviewTokenRequest();
        return TeaModel.build(map, self);
    }

    public RefreshOfficePreviewTokenRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public RefreshOfficePreviewTokenRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public RefreshOfficePreviewTokenRequest setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }
    public String getRefreshToken() {
        return this.refreshToken;
    }

}
