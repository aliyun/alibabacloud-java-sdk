// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class CloneFlowJobRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("Name")
    public String name;

    @NameInMap("ProjectId")
    public String projectId;

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
