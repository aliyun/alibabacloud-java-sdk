// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class CreateKubernetesTriggerRequest extends TeaModel {
    // 地域ID。
    @NameInMap("RegionId")
    public String regionId;

    // 集群ID。
    @NameInMap("ClusterId")
    public String clusterId;

    // 项目名称。
    @NameInMap("ProjectId")
    public String projectId;

    // 触发器类型。
    @NameInMap("Type")
    public String type;

    public static CreateKubernetesTriggerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateKubernetesTriggerRequest self = new CreateKubernetesTriggerRequest();
        return TeaModel.build(map, self);
    }

    public CreateKubernetesTriggerRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateKubernetesTriggerRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateKubernetesTriggerRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public CreateKubernetesTriggerRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
