// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apds20220331.models;

import com.aliyun.tea.*;

public class DescribeSummaryByStatusRequest extends TeaModel {
    @NameInMap("regionId")
    public String regionId;

    public static DescribeSummaryByStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSummaryByStatusRequest self = new DescribeSummaryByStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSummaryByStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
