// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListRetcodeAppsRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("RegionId")
    public String regionId;

    public static ListRetcodeAppsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRetcodeAppsRequest self = new ListRetcodeAppsRequest();
        return TeaModel.build(map, self);
    }

    public ListRetcodeAppsRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public ListRetcodeAppsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
