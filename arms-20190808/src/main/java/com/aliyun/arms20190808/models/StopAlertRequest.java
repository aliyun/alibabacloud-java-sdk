// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class StopAlertRequest extends TeaModel {
    @NameInMap("AlertId")
    @Validation(required = true)
    public String alertId;

    @NameInMap("ProxyUserId")
    public String proxyUserId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    public static StopAlertRequest build(java.util.Map<String, ?> map) throws Exception {
        StopAlertRequest self = new StopAlertRequest();
        return TeaModel.build(map, self);
    }

}
