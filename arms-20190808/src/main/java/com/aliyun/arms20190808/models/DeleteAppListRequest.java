// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteAppListRequest extends TeaModel {
    /**
     * <p>The PIDs of the applications monitored by ARMS Application Monitoring.</p>
     */
    @NameInMap("Pids")
    public java.util.List<String> pids;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DeleteAppListRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppListRequest self = new DeleteAppListRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAppListRequest setPids(java.util.List<String> pids) {
        this.pids = pids;
        return this;
    }
    public java.util.List<String> getPids() {
        return this.pids;
    }

    public DeleteAppListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
