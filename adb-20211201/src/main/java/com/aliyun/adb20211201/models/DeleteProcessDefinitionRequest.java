// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DeleteProcessDefinitionRequest extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("DirectoryId")
    public Long directoryId;

    @NameInMap("ProcessCode")
    public Long processCode;

    @NameInMap("ProjectCode")
    public Long projectCode;

    @NameInMap("RegionId")
    public String regionId;

    public static DeleteProcessDefinitionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteProcessDefinitionRequest self = new DeleteProcessDefinitionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteProcessDefinitionRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DeleteProcessDefinitionRequest setDirectoryId(Long directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public Long getDirectoryId() {
        return this.directoryId;
    }

    public DeleteProcessDefinitionRequest setProcessCode(Long processCode) {
        this.processCode = processCode;
        return this;
    }
    public Long getProcessCode() {
        return this.processCode;
    }

    public DeleteProcessDefinitionRequest setProjectCode(Long projectCode) {
        this.projectCode = projectCode;
        return this;
    }
    public Long getProjectCode() {
        return this.projectCode;
    }

    public DeleteProcessDefinitionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
