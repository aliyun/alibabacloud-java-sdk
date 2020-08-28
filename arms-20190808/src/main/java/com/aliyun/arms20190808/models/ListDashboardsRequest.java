// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListDashboardsRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ClusterId")
    @Validation(required = true)
    public String clusterId;

    public static ListDashboardsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDashboardsRequest self = new ListDashboardsRequest();
        return TeaModel.build(map, self);
    }

}
