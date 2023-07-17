// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class ListRetcodeAppsRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static ListRetcodeAppsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRetcodeAppsRequest self = new ListRetcodeAppsRequest();
        return TeaModel.build(map, self);
    }

    public ListRetcodeAppsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListRetcodeAppsRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
