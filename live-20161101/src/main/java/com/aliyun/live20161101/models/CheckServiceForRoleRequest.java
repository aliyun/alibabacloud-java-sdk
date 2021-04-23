// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CheckServiceForRoleRequest extends TeaModel {
    @NameInMap("RoleArn")
    public String roleArn;

    @NameInMap("SPIRegionId")
    public String SPIRegionId;

    @NameInMap("ServiceName")
    public String serviceName;

    @NameInMap("DeletionTaskId")
    public String deletionTaskId;

    @NameInMap("AccountId")
    public String accountId;

    public static CheckServiceForRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckServiceForRoleRequest self = new CheckServiceForRoleRequest();
        return TeaModel.build(map, self);
    }

    public CheckServiceForRoleRequest setRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }
    public String getRoleArn() {
        return this.roleArn;
    }

    public CheckServiceForRoleRequest setSPIRegionId(String SPIRegionId) {
        this.SPIRegionId = SPIRegionId;
        return this;
    }
    public String getSPIRegionId() {
        return this.SPIRegionId;
    }

    public CheckServiceForRoleRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public CheckServiceForRoleRequest setDeletionTaskId(String deletionTaskId) {
        this.deletionTaskId = deletionTaskId;
        return this;
    }
    public String getDeletionTaskId() {
        return this.deletionTaskId;
    }

    public CheckServiceForRoleRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

}
