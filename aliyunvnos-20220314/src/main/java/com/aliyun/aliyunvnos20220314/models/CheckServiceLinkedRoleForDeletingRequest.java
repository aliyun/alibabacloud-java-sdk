// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliyunvnos20220314.models;

import com.aliyun.tea.*;

public class CheckServiceLinkedRoleForDeletingRequest extends TeaModel {
    // deletionTaskId
    @NameInMap("DeletionTaskId")
    public String deletionTaskId;

    // roleArn
    @NameInMap("RoleArn")
    public String roleArn;

    // ServiceName
    @NameInMap("ServiceName")
    public String serviceName;

    // spiRegionId
    @NameInMap("SpiRegionId")
    public String spiRegionId;

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

    public CheckServiceLinkedRoleForDeletingRequest setRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }
    public String getRoleArn() {
        return this.roleArn;
    }

    public CheckServiceLinkedRoleForDeletingRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public CheckServiceLinkedRoleForDeletingRequest setSpiRegionId(String spiRegionId) {
        this.spiRegionId = spiRegionId;
        return this;
    }
    public String getSpiRegionId() {
        return this.spiRegionId;
    }

}
