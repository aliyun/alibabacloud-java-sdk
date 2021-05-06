// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CheckUserInSecurityCenterWhiteListRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    public static CheckUserInSecurityCenterWhiteListRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckUserInSecurityCenterWhiteListRequest self = new CheckUserInSecurityCenterWhiteListRequest();
        return TeaModel.build(map, self);
    }

    public CheckUserInSecurityCenterWhiteListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
