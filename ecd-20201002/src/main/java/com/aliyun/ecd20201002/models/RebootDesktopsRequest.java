// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class RebootDesktopsRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ClientId")
    @Validation(required = true)
    public String clientId;

    @NameInMap("LoginToken")
    @Validation(required = true)
    public String loginToken;

    @NameInMap("DesktopId")
    @Validation(required = true)
    public java.util.List<String> desktopId;

    public static RebootDesktopsRequest build(java.util.Map<String, ?> map) throws Exception {
        RebootDesktopsRequest self = new RebootDesktopsRequest();
        return TeaModel.build(map, self);
    }

    public RebootDesktopsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RebootDesktopsRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public RebootDesktopsRequest setLoginToken(String loginToken) {
        this.loginToken = loginToken;
        return this;
    }
    public String getLoginToken() {
        return this.loginToken;
    }

    public RebootDesktopsRequest setDesktopId(java.util.List<String> desktopId) {
        this.desktopId = desktopId;
        return this;
    }
    public java.util.List<String> getDesktopId() {
        return this.desktopId;
    }

}
