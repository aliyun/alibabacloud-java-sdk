// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class GetAclRequest extends TeaModel {
    @NameInMap("AclId")
    public String aclId;

    @NameInMap("RegionId")
    public String regionId;

    public static GetAclRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAclRequest self = new GetAclRequest();
        return TeaModel.build(map, self);
    }

    public GetAclRequest setAclId(String aclId) {
        this.aclId = aclId;
        return this;
    }
    public String getAclId() {
        return this.aclId;
    }

    public GetAclRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
