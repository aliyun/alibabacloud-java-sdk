// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class SaveAppAuthTokenRequest extends TeaModel {
    @NameInMap("AppAuthToken")
    public String appAuthToken;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("IsvAppId")
    public String isvAppId;

    @NameInMap("SpaceId")
    public String spaceId;

    public static SaveAppAuthTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveAppAuthTokenRequest self = new SaveAppAuthTokenRequest();
        return TeaModel.build(map, self);
    }

    public SaveAppAuthTokenRequest setAppAuthToken(String appAuthToken) {
        this.appAuthToken = appAuthToken;
        return this;
    }
    public String getAppAuthToken() {
        return this.appAuthToken;
    }

    public SaveAppAuthTokenRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public SaveAppAuthTokenRequest setIsvAppId(String isvAppId) {
        this.isvAppId = isvAppId;
        return this;
    }
    public String getIsvAppId() {
        return this.isvAppId;
    }

    public SaveAppAuthTokenRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

}
