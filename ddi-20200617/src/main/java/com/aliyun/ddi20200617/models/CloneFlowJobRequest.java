// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class CloneFlowJobRequest extends TeaModel {
    // 克隆的目标作业ID。您可以调用ListFlowJob查看。
    @NameInMap("Id")
    public String id;

    // 克隆的目标作业名称。
    @NameInMap("Name")
    public String name;

    // 克隆的目标作业所属项目。您可以调用ListFlowProject查看项目的ID。
    @NameInMap("ProjectId")
    public String projectId;

    // 地域ID。您可以调用DescribeRegions查看最新的阿里云地域列表。
    @NameInMap("RegionId")
    public String regionId;

    public static CloneFlowJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CloneFlowJobRequest self = new CloneFlowJobRequest();
        return TeaModel.build(map, self);
    }

    public CloneFlowJobRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CloneFlowJobRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CloneFlowJobRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public CloneFlowJobRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
