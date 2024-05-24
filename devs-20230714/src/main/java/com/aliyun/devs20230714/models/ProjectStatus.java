// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class ProjectStatus extends TeaModel {
    @NameInMap("latestReleaseDetail")
    public ReleaseDetail latestReleaseDetail;

    @NameInMap("observedGeneration")
    public Long observedGeneration;

    @NameInMap("observedTime")
    public String observedTime;

    public static ProjectStatus build(java.util.Map<String, ?> map) throws Exception {
        ProjectStatus self = new ProjectStatus();
        return TeaModel.build(map, self);
    }

    public ProjectStatus setLatestReleaseDetail(ReleaseDetail latestReleaseDetail) {
        this.latestReleaseDetail = latestReleaseDetail;
        return this;
    }
    public ReleaseDetail getLatestReleaseDetail() {
        return this.latestReleaseDetail;
    }

    public ProjectStatus setObservedGeneration(Long observedGeneration) {
        this.observedGeneration = observedGeneration;
        return this;
    }
    public Long getObservedGeneration() {
        return this.observedGeneration;
    }

    public ProjectStatus setObservedTime(String observedTime) {
        this.observedTime = observedTime;
        return this;
    }
    public String getObservedTime() {
        return this.observedTime;
    }

}
