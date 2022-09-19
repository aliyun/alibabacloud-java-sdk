// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ExecuteProcessInstanceRequest extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("ExecuteType")
    public String executeType;

    @NameInMap("ProcessInstanceId")
    public Long processInstanceId;

    @NameInMap("ProjectCode")
    public Long projectCode;

    @NameInMap("RegionId")
    public String regionId;

    public static ExecuteProcessInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteProcessInstanceRequest self = new ExecuteProcessInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteProcessInstanceRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ExecuteProcessInstanceRequest setExecuteType(String executeType) {
        this.executeType = executeType;
        return this;
    }
    public String getExecuteType() {
        return this.executeType;
    }

    public ExecuteProcessInstanceRequest setProcessInstanceId(Long processInstanceId) {
        this.processInstanceId = processInstanceId;
        return this;
    }
    public Long getProcessInstanceId() {
        return this.processInstanceId;
    }

    public ExecuteProcessInstanceRequest setProjectCode(Long projectCode) {
        this.projectCode = projectCode;
        return this;
    }
    public Long getProjectCode() {
        return this.projectCode;
    }

    public ExecuteProcessInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
