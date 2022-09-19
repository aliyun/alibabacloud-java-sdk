// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DeleteProcessInstanceRequest extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("ProcessInstanceId")
    public Long processInstanceId;

    @NameInMap("ProjectCode")
    public Long projectCode;

    @NameInMap("RegionId")
    public String regionId;

    public static DeleteProcessInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteProcessInstanceRequest self = new DeleteProcessInstanceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteProcessInstanceRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DeleteProcessInstanceRequest setProcessInstanceId(Long processInstanceId) {
        this.processInstanceId = processInstanceId;
        return this;
    }
    public Long getProcessInstanceId() {
        return this.processInstanceId;
    }

    public DeleteProcessInstanceRequest setProjectCode(Long projectCode) {
        this.projectCode = projectCode;
        return this;
    }
    public Long getProjectCode() {
        return this.projectCode;
    }

    public DeleteProcessInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
