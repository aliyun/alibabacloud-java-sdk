// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class EnableSiteMonitorsRequest extends TeaModel {
    @NameInMap("TaskIds")
    @Validation(required = true)
    public String taskIds;

    public static EnableSiteMonitorsRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableSiteMonitorsRequest self = new EnableSiteMonitorsRequest();
        return TeaModel.build(map, self);
    }

}
