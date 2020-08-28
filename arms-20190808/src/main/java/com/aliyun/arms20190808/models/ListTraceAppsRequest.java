// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListTraceAppsRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    public static ListTraceAppsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTraceAppsRequest self = new ListTraceAppsRequest();
        return TeaModel.build(map, self);
    }

}
