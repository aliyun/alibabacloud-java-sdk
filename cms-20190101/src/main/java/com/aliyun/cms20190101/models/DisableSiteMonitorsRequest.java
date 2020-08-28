// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DisableSiteMonitorsRequest extends TeaModel {
    @NameInMap("TaskIds")
    @Validation(required = true)
    public String taskIds;

    public static DisableSiteMonitorsRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableSiteMonitorsRequest self = new DisableSiteMonitorsRequest();
        return TeaModel.build(map, self);
    }

}
