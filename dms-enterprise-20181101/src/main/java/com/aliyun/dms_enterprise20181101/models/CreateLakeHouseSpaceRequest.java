// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateLakeHouseSpaceRequest extends TeaModel {
    // The description of the workspace.
    @NameInMap("Description")
    public String description;

    // The ID of the development database. You can call the [ListDatabases](~~141873~~) or [SearchDatabase](~~141876~~) operation to obtain the ID.
    @NameInMap("DevDbId")
    public String devDbId;

    // The type of the database. Valid values:
    // 
    // *   **14**: AnalyticDB for MySQL
    // *   **18**: AnalyticDB for PostgreSQL
    @NameInMap("DwDbType")
    public String dwDbType;

    // The mode in which the workspace runs. Valid values:
    // 
    // *   **0**: basic mode. This mode is unavailable.
    // *   **1**: standard mode.
    @NameInMap("Mode")
    public String mode;

    // The ID of the production database. You can call the [ListDatabases](~~141873~~) or [SearchDatabase](~~141876~~) operation to obtain the ID.
    @NameInMap("ProdDbId")
    public String prodDbId;

    // The configuration of the workspace. Valid values:
    // 
    // *   **skipManualRunCheck**: No security rule check is required in the trial run phase.
    // *   **skipPublishApprove**: No approval is required for publishing and O\&M.
    @NameInMap("SpaceConfig")
    public String spaceConfig;

    // The name of the workspace.
    @NameInMap("SpaceName")
    public String spaceName;

    // The ID of the tenant. You can call the [GetUserActiveTenant](~~198073~~) or [ListUserTenants](~~198074~~) operation to obtain the tenant ID.
    @NameInMap("Tid")
    public Long tid;

    public static CreateLakeHouseSpaceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLakeHouseSpaceRequest self = new CreateLakeHouseSpaceRequest();
        return TeaModel.build(map, self);
    }

    public CreateLakeHouseSpaceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateLakeHouseSpaceRequest setDevDbId(String devDbId) {
        this.devDbId = devDbId;
        return this;
    }
    public String getDevDbId() {
        return this.devDbId;
    }

    public CreateLakeHouseSpaceRequest setDwDbType(String dwDbType) {
        this.dwDbType = dwDbType;
        return this;
    }
    public String getDwDbType() {
        return this.dwDbType;
    }

    public CreateLakeHouseSpaceRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public CreateLakeHouseSpaceRequest setProdDbId(String prodDbId) {
        this.prodDbId = prodDbId;
        return this;
    }
    public String getProdDbId() {
        return this.prodDbId;
    }

    public CreateLakeHouseSpaceRequest setSpaceConfig(String spaceConfig) {
        this.spaceConfig = spaceConfig;
        return this;
    }
    public String getSpaceConfig() {
        return this.spaceConfig;
    }

    public CreateLakeHouseSpaceRequest setSpaceName(String spaceName) {
        this.spaceName = spaceName;
        return this;
    }
    public String getSpaceName() {
        return this.spaceName;
    }

    public CreateLakeHouseSpaceRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
