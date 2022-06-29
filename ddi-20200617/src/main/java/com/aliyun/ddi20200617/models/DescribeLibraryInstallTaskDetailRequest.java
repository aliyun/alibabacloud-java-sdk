// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class DescribeLibraryInstallTaskDetailRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("TaskBizId")
    public String taskBizId;

    public static DescribeLibraryInstallTaskDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLibraryInstallTaskDetailRequest self = new DescribeLibraryInstallTaskDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLibraryInstallTaskDetailRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeLibraryInstallTaskDetailRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeLibraryInstallTaskDetailRequest setTaskBizId(String taskBizId) {
        this.taskBizId = taskBizId;
        return this;
    }
    public String getTaskBizId() {
        return this.taskBizId;
    }

}
