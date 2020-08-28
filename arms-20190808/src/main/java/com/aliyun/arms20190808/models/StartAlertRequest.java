// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class StartAlertRequest extends TeaModel {
    @NameInMap("AlertId")
    @Validation(required = true)
    public String alertId;

    @NameInMap("ProxyUserId")
    public String proxyUserId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    public static StartAlertRequest build(java.util.Map<String, ?> map) throws Exception {
        StartAlertRequest self = new StartAlertRequest();
        return TeaModel.build(map, self);
    }

}
