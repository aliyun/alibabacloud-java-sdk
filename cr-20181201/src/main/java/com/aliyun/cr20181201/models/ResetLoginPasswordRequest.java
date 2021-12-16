// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ResetLoginPasswordRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Password")
    public String password;

    @NameInMap("RegionId")
    public String regionId;

    public static ResetLoginPasswordRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetLoginPasswordRequest self = new ResetLoginPasswordRequest();
        return TeaModel.build(map, self);
    }

    public ResetLoginPasswordRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ResetLoginPasswordRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public ResetLoginPasswordRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
