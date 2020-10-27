// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class RecoverVirtualBorderRouterRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("VbrId")
    @Validation(required = true)
    public String vbrId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("UserCidr")
    public String userCidr;

    public static RecoverVirtualBorderRouterRequest build(java.util.Map<String, ?> map) throws Exception {
        RecoverVirtualBorderRouterRequest self = new RecoverVirtualBorderRouterRequest();
        return TeaModel.build(map, self);
    }

    public RecoverVirtualBorderRouterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RecoverVirtualBorderRouterRequest setVbrId(String vbrId) {
        this.vbrId = vbrId;
        return this;
    }
    public String getVbrId() {
        return this.vbrId;
    }

    public RecoverVirtualBorderRouterRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RecoverVirtualBorderRouterRequest setUserCidr(String userCidr) {
        this.userCidr = userCidr;
        return this;
    }
    public String getUserCidr() {
        return this.userCidr;
    }

}
