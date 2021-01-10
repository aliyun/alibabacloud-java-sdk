// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class SaveAppAuthTokenRequest extends TeaModel {
    @NameInMap("SpaceId")
    public String spaceId;

    @NameInMap("IsvAppId")
    public String isvAppId;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("AppAuthToken")
    public String appAuthToken;

    public static SaveAppAuthTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveAppAuthTokenRequest self = new SaveAppAuthTokenRequest();
        return TeaModel.build(map, self);
    }

    public SaveAppAuthTokenRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

    public SaveAppAuthTokenRequest setIsvAppId(String isvAppId) {
        this.isvAppId = isvAppId;
        return this;
    }
    public String getIsvAppId() {
        return this.isvAppId;
    }

    public SaveAppAuthTokenRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public SaveAppAuthTokenRequest setAppAuthToken(String appAuthToken) {
        this.appAuthToken = appAuthToken;
        return this;
    }
    public String getAppAuthToken() {
        return this.appAuthToken;
    }

}
