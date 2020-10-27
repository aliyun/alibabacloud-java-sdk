// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class TerminatePhysicalConnectionRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("PhysicalConnectionId")
    @Validation(required = true)
    public String physicalConnectionId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("UserCidr")
    public String userCidr;

    public static TerminatePhysicalConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        TerminatePhysicalConnectionRequest self = new TerminatePhysicalConnectionRequest();
        return TeaModel.build(map, self);
    }

    public TerminatePhysicalConnectionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public TerminatePhysicalConnectionRequest setPhysicalConnectionId(String physicalConnectionId) {
        this.physicalConnectionId = physicalConnectionId;
        return this;
    }
    public String getPhysicalConnectionId() {
        return this.physicalConnectionId;
    }

    public TerminatePhysicalConnectionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public TerminatePhysicalConnectionRequest setUserCidr(String userCidr) {
        this.userCidr = userCidr;
        return this;
    }
    public String getUserCidr() {
        return this.userCidr;
    }

}
