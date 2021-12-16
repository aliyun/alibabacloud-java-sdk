// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class DeleteChartReleaseRequest extends TeaModel {
    @NameInMap("Chart")
    public String chart;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Release")
    public String release;

    @NameInMap("RepoName")
    public String repoName;

    @NameInMap("RepoNamespaceName")
    public String repoNamespaceName;

    public static DeleteChartReleaseRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteChartReleaseRequest self = new DeleteChartReleaseRequest();
        return TeaModel.build(map, self);
    }

    public DeleteChartReleaseRequest setChart(String chart) {
        this.chart = chart;
        return this;
    }
    public String getChart() {
        return this.chart;
    }

    public DeleteChartReleaseRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteChartReleaseRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteChartReleaseRequest setRelease(String release) {
        this.release = release;
        return this;
    }
    public String getRelease() {
        return this.release;
    }

    public DeleteChartReleaseRequest setRepoName(String repoName) {
        this.repoName = repoName;
        return this;
    }
    public String getRepoName() {
        return this.repoName;
    }

    public DeleteChartReleaseRequest setRepoNamespaceName(String repoNamespaceName) {
        this.repoNamespaceName = repoNamespaceName;
        return this;
    }
    public String getRepoNamespaceName() {
        return this.repoNamespaceName;
    }

}
