// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class DeleteChartReleaseRequest extends TeaModel {
    /**
     * <p>The name of the chart.</p>
     */
    @NameInMap("Chart")
    public String chart;

    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The version of the chart that you want to delete.</p>
     */
    @NameInMap("Release")
    public String release;

    /**
     * <p>The name of the repository.</p>
     */
    @NameInMap("RepoName")
    public String repoName;

    /**
     * <p>The name of the namespace.</p>
     */
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
