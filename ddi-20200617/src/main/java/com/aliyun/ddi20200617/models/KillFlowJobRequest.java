// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class KillFlowJobRequest extends TeaModel {
    // 作业实例ID。您可以调用DescribeFlowJob查看作业实例ID。
    @NameInMap("JobInstanceId")
    public String jobInstanceId;

    // 项目ID。您可以调用ListFlowProject查看项目的ID。
    @NameInMap("ProjectId")
    public String projectId;

    // 地域ID。您可以调用DescribeRegions查看最新的阿里云地域列表。
    @NameInMap("RegionId")
    public String regionId;

    public static KillFlowJobRequest build(java.util.Map<String, ?> map) throws Exception {
        KillFlowJobRequest self = new KillFlowJobRequest();
        return TeaModel.build(map, self);
    }

    public KillFlowJobRequest setJobInstanceId(String jobInstanceId) {
        this.jobInstanceId = jobInstanceId;
        return this;
    }
    public String getJobInstanceId() {
        return this.jobInstanceId;
    }

    public KillFlowJobRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public KillFlowJobRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
