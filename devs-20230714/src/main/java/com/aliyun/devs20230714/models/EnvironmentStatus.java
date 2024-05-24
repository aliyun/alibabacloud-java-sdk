// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class EnvironmentStatus extends TeaModel {
    @NameInMap("infraStackStatus")
    public InfraStackStatus infraStackStatus;

    @NameInMap("latestReleaseDetail")
    public ReleaseDetail latestReleaseDetail;

    @NameInMap("observedGeneration")
    public Long observedGeneration;

    @NameInMap("observedTime")
    public String observedTime;

    public static EnvironmentStatus build(java.util.Map<String, ?> map) throws Exception {
        EnvironmentStatus self = new EnvironmentStatus();
        return TeaModel.build(map, self);
    }

    public EnvironmentStatus setInfraStackStatus(InfraStackStatus infraStackStatus) {
        this.infraStackStatus = infraStackStatus;
        return this;
    }
    public InfraStackStatus getInfraStackStatus() {
        return this.infraStackStatus;
    }

    public EnvironmentStatus setLatestReleaseDetail(ReleaseDetail latestReleaseDetail) {
        this.latestReleaseDetail = latestReleaseDetail;
        return this;
    }
    public ReleaseDetail getLatestReleaseDetail() {
        return this.latestReleaseDetail;
    }

    public EnvironmentStatus setObservedGeneration(Long observedGeneration) {
        this.observedGeneration = observedGeneration;
        return this;
    }
    public Long getObservedGeneration() {
        return this.observedGeneration;
    }

    public EnvironmentStatus setObservedTime(String observedTime) {
        this.observedTime = observedTime;
        return this;
    }
    public String getObservedTime() {
        return this.observedTime;
    }

}
