// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class DeleteFlowProjectClusterSettingRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("RegionId")
    public String regionId;

    public static DeleteFlowProjectClusterSettingRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteFlowProjectClusterSettingRequest self = new DeleteFlowProjectClusterSettingRequest();
        return TeaModel.build(map, self);
    }

    public DeleteFlowProjectClusterSettingRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DeleteFlowProjectClusterSettingRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public DeleteFlowProjectClusterSettingRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
