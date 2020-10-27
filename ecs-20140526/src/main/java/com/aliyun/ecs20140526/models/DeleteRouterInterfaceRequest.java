// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteRouterInterfaceRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("RouterInterfaceId")
    @Validation(required = true)
    public String routerInterfaceId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("UserCidr")
    public String userCidr;

    public static DeleteRouterInterfaceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRouterInterfaceRequest self = new DeleteRouterInterfaceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRouterInterfaceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteRouterInterfaceRequest setRouterInterfaceId(String routerInterfaceId) {
        this.routerInterfaceId = routerInterfaceId;
        return this;
    }
    public String getRouterInterfaceId() {
        return this.routerInterfaceId;
    }

    public DeleteRouterInterfaceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteRouterInterfaceRequest setUserCidr(String userCidr) {
        this.userCidr = userCidr;
        return this;
    }
    public String getUserCidr() {
        return this.userCidr;
    }

}
