// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetConsistencySnapshotRequest extends TeaModel {
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

    public static GetConsistencySnapshotRequest build(java.util.Map<String, ?> map) throws Exception {
        GetConsistencySnapshotRequest self = new GetConsistencySnapshotRequest();
        return TeaModel.build(map, self);
    }

}
