// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CheckDataConsistencyRequest extends TeaModel {
    @NameInMap("CurrentTimestamp")
    public Long currentTimestamp;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ProxyUserId")
    public String proxyUserId;

    @NameInMap("Pid")
    @Validation(required = true)
    public String pid;

    @NameInMap("AppType")
    @Validation(required = true)
    public String appType;

    public static CheckDataConsistencyRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckDataConsistencyRequest self = new CheckDataConsistencyRequest();
        return TeaModel.build(map, self);
    }

}
