// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DeleteIpSetsRequest extends TeaModel {
    /**
     * <p>The IDs of the acceleration regions that you want to delete.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ips-bp11c9mpphtb1xkds****</p>
     */
    @NameInMap("IpSetIds")
    public java.util.List<String> ipSetIds;

    /**
     * <p>The region ID of the GA instance. Set the value to <strong>cn-hangzhou</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
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
