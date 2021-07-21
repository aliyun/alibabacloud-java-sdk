// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeSiteMonitorQuotaRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeSiteMonitorQuotaRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSiteMonitorQuotaRequest self = new DescribeSiteMonitorQuotaRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSiteMonitorQuotaRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
