// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ReleaseProcessDefinitionRequest extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("ProcessCode")
    public Long processCode;

    @NameInMap("ProjectCode")
    public Long projectCode;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ReleaseState")
    public String releaseState;

    public static ReleaseProcessDefinitionRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleaseProcessDefinitionRequest self = new ReleaseProcessDefinitionRequest();
        return TeaModel.build(map, self);
    }

    public ReleaseProcessDefinitionRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ReleaseProcessDefinitionRequest setProcessCode(Long processCode) {
        this.processCode = processCode;
        return this;
    }
    public Long getProcessCode() {
        return this.processCode;
    }

    public ReleaseProcessDefinitionRequest setProjectCode(Long projectCode) {
        this.projectCode = projectCode;
        return this;
    }
    public Long getProjectCode() {
        return this.projectCode;
    }

    public ReleaseProcessDefinitionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ReleaseProcessDefinitionRequest setReleaseState(String releaseState) {
        this.releaseState = releaseState;
        return this;
    }
    public String getReleaseState() {
        return this.releaseState;
    }

}
