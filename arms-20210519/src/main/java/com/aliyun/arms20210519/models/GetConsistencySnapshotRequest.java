// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210519.models;

import com.aliyun.tea.*;

public class GetConsistencySnapshotRequest extends TeaModel {
    @NameInMap("CurrentTimestamp")
    public Long currentTimestamp;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ProxyUserId")
    public String proxyUserId;

    @NameInMap("Pid")
    public String pid;

    @NameInMap("AppType")
    public String appType;

    public static GetConsistencySnapshotRequest build(java.util.Map<String, ?> map) throws Exception {
        GetConsistencySnapshotRequest self = new GetConsistencySnapshotRequest();
        return TeaModel.build(map, self);
    }

    public GetConsistencySnapshotRequest setCurrentTimestamp(Long currentTimestamp) {
        this.currentTimestamp = currentTimestamp;
        return this;
    }
    public Long getCurrentTimestamp() {
        return this.currentTimestamp;
    }

    public GetConsistencySnapshotRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetConsistencySnapshotRequest setProxyUserId(String proxyUserId) {
        this.proxyUserId = proxyUserId;
        return this;
    }
    public String getProxyUserId() {
        return this.proxyUserId;
    }

    public GetConsistencySnapshotRequest setPid(String pid) {
        this.pid = pid;
        return this;
    }
    public String getPid() {
        return this.pid;
    }

    public GetConsistencySnapshotRequest setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

}
