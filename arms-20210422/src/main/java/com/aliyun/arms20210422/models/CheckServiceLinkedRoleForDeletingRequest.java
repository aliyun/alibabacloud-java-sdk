// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class CheckServiceLinkedRoleForDeletingRequest extends TeaModel {
    @NameInMap("DeletionTaskId")
    public String deletionTaskId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RoleArn")
    public String roleArn;

    @NameInMap("SPIRegionId")
    public String SPIRegionId;

    @NameInMap("ServiceName")
    public String serviceName;

    public static CheckServiceLinkedRoleForDeletingRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckServiceLinkedRoleForDeletingRequest self = new CheckServiceLinkedRoleForDeletingRequest();
        return TeaModel.build(map, self);
    }

    public CheckServiceLinkedRoleForDeletingRequest setDeletionTaskId(String deletionTaskId) {
        this.deletionTaskId = deletionTaskId;
        return this;
    }
    public String getDeletionTaskId() {
        return this.deletionTaskId;
    }

    public CheckServiceLinkedRoleForDeletingRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CheckServiceLinkedRoleForDeletingRequest setRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }
    public String getRoleArn() {
        return this.roleArn;
    }

    public CheckServiceLinkedRoleForDeletingRequest setSPIRegionId(String SPIRegionId) {
        this.SPIRegionId = SPIRegionId;
        return this;
    }
    public String getSPIRegionId() {
        return this.SPIRegionId;
    }

    public CheckServiceLinkedRoleForDeletingRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

}
