// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateLakeHouseSpaceRequest extends TeaModel {
    /**
     * <p>The description of the workspace.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the development database. You can call the [ListDatabases](https://help.aliyun.com/document_detail/141873.html) or [SearchDatabase](https://help.aliyun.com/document_detail/141876.html) operation to obtain the ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DevDbId")
    public String devDbId;

    /**
     * <p>The type of the database. Valid values:</p>
     * <br>
     * <p>*   **14**: AnalyticDB for MySQL</p>
     * <p>*   **18**: AnalyticDB for PostgreSQL</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DwDbType")
    public String dwDbType;

    /**
     * <p>The mode in which the workspace runs. Valid values:</p>
     * <br>
     * <p>*   **0**: basic mode. This mode is unavailable.</p>
     * <p>*   **1**: standard mode.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Mode")
    public String mode;

    /**
     * <p>The ID of the production database. You can call the [ListDatabases](https://help.aliyun.com/document_detail/141873.html) or [SearchDatabase](https://help.aliyun.com/document_detail/141876.html) operation to obtain the ID.</p>
     */
    @NameInMap("ProdDbId")
    public String prodDbId;

    /**
     * <p>The configuration of the workspace. Valid values:</p>
     * <br>
     * <p>*   **skipManualRunCheck**: No security rule check is required in the trial run phase.</p>
     * <p>*   **skipPublishApprove**: No approval is required for publishing and O\\&M.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SpaceConfig")
    public String spaceConfig;

    /**
     * <p>The name of the workspace.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SpaceName")
    public String spaceName;

    /**
     * <p>The ID of the tenant. You can call the [GetUserActiveTenant](https://help.aliyun.com/document_detail/198073.html) or [ListUserTenants](https://help.aliyun.com/document_detail/198074.html) operation to obtain the tenant ID.</p>
     */
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
