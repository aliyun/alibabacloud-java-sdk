// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteHybridMonitorSLSGroupRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SLSGroupName")
    public String SLSGroupName;

    public static DeleteHybridMonitorSLSGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteHybridMonitorSLSGroupRequest self = new DeleteHybridMonitorSLSGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteHybridMonitorSLSGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteHybridMonitorSLSGroupRequest setSLSGroupName(String SLSGroupName) {
        this.SLSGroupName = SLSGroupName;
        return this;
    }
    public String getSLSGroupName() {
        return this.SLSGroupName;
    }

}
