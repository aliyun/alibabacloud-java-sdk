// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeScopeUsersRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeScopeUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeScopeUsersRequest self = new DescribeScopeUsersRequest();
        return TeaModel.build(map, self);
    }

    public DescribeScopeUsersRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
