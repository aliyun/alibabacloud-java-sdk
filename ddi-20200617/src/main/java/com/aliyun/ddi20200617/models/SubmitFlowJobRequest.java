// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class SubmitFlowJobRequest extends TeaModel {
    // 集群ID。您可以调用ListClusters查看集群的ID。
    @NameInMap("ClusterId")
    public String clusterId;

    // 配置参数信息：{"key1":"value1"}。key为params的参数值会覆盖实际作业中运行的内容。
    @NameInMap("Conf")
    public String conf;

    // 保留参数。
    @NameInMap("HostName")
    public String hostName;

    // 作业ID。您可以调用ListFlowJob查看作业ID。
    @NameInMap("JobId")
    public String jobId;

    // 项目ID。您可以调用ListFlowProject查看项目的ID。
    @NameInMap("ProjectId")
    public String projectId;

    // 地域ID。您可以调用DescribeRegions查看最新的阿里云地域列表。
    @NameInMap("RegionId")
    public String regionId;

    public static SubmitFlowJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitFlowJobRequest self = new SubmitFlowJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitFlowJobRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public SubmitFlowJobRequest setConf(String conf) {
        this.conf = conf;
        return this;
    }
    public String getConf() {
        return this.conf;
    }

    public SubmitFlowJobRequest setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public SubmitFlowJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public SubmitFlowJobRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public SubmitFlowJobRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
