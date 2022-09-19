// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class StartCheckProcessDefinitionRequest extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("ProcessCode")
    public Long processCode;

    @NameInMap("ProjectCode")
    public Long projectCode;

    @NameInMap("RegionId")
    public String regionId;

    public static StartCheckProcessDefinitionRequest build(java.util.Map<String, ?> map) throws Exception {
        StartCheckProcessDefinitionRequest self = new StartCheckProcessDefinitionRequest();
        return TeaModel.build(map, self);
    }

    public StartCheckProcessDefinitionRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public StartCheckProcessDefinitionRequest setProcessCode(Long processCode) {
        this.processCode = processCode;
        return this;
    }
    public Long getProcessCode() {
        return this.processCode;
    }

    public StartCheckProcessDefinitionRequest setProjectCode(Long projectCode) {
        this.projectCode = projectCode;
        return this;
    }
    public Long getProjectCode() {
        return this.projectCode;
    }

    public StartCheckProcessDefinitionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
