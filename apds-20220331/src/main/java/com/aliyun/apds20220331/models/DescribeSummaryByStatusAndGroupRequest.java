// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apds20220331.models;

import com.aliyun.tea.*;

public class DescribeSummaryByStatusAndGroupRequest extends TeaModel {
    @NameInMap("regionId")
    public String regionId;

    public static DescribeSummaryByStatusAndGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSummaryByStatusAndGroupRequest self = new DescribeSummaryByStatusAndGroupRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSummaryByStatusAndGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
