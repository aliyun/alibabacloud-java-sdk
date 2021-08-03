// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class AddUserToSecurityCenterWhiteListRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static AddUserToSecurityCenterWhiteListRequest build(java.util.Map<String, ?> map) throws Exception {
        AddUserToSecurityCenterWhiteListRequest self = new AddUserToSecurityCenterWhiteListRequest();
        return TeaModel.build(map, self);
    }

    public AddUserToSecurityCenterWhiteListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
