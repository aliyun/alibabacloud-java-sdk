// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class CheckDataConsistencyRequest extends TeaModel {
    @NameInMap("AppType")
    public String appType;

    @NameInMap("CurrentTimestamp")
    public Long currentTimestamp;

    @NameInMap("Pid")
    public String pid;

    @NameInMap("ProxyUserId")
    public String proxyUserId;

    @NameInMap("RegionId")
    public String regionId;

    public static CheckDataConsistencyRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckDataConsistencyRequest self = new CheckDataConsistencyRequest();
        return TeaModel.build(map, self);
    }

    public CheckDataConsistencyRequest setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public CheckDataConsistencyRequest setCurrentTimestamp(Long currentTimestamp) {
        this.currentTimestamp = currentTimestamp;
        return this;
    }
    public Long getCurrentTimestamp() {
        return this.currentTimestamp;
    }

    public CheckDataConsistencyRequest setPid(String pid) {
        this.pid = pid;
        return this;
    }
    public String getPid() {
        return this.pid;
    }

    public CheckDataConsistencyRequest setProxyUserId(String proxyUserId) {
        this.proxyUserId = proxyUserId;
        return this;
    }
    public String getProxyUserId() {
        return this.proxyUserId;
    }

    public CheckDataConsistencyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
