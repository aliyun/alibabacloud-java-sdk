// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class RefreshLoginTokenRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ClientId")
    @Validation(required = true)
    public String clientId;

    @NameInMap("DirectoryId")
    @Validation(required = true)
    public String directoryId;

    @NameInMap("EndUserId")
    @Validation(required = true)
    public String endUserId;

    @NameInMap("LoginToken")
    @Validation(required = true)
    public String loginToken;

    public static RefreshLoginTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        RefreshLoginTokenRequest self = new RefreshLoginTokenRequest();
        return TeaModel.build(map, self);
    }

    public RefreshLoginTokenRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RefreshLoginTokenRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public RefreshLoginTokenRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public RefreshLoginTokenRequest setEndUserId(String endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public String getEndUserId() {
        return this.endUserId;
    }

    public RefreshLoginTokenRequest setLoginToken(String loginToken) {
        this.loginToken = loginToken;
        return this;
    }
    public String getLoginToken() {
        return this.loginToken;
    }

}
