// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DeleteIpSetsRequest extends TeaModel {
    @NameInMap("IpSetIds")
    public java.util.List<String> ipSetIds;

    @NameInMap("RegionId")
    public String regionId;

    public static DeleteIpSetsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteIpSetsRequest self = new DeleteIpSetsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteIpSetsRequest setIpSetIds(java.util.List<String> ipSetIds) {
        this.ipSetIds = ipSetIds;
        return this;
    }
    public java.util.List<String> getIpSetIds() {
        return this.ipSetIds;
    }

    public DeleteIpSetsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
