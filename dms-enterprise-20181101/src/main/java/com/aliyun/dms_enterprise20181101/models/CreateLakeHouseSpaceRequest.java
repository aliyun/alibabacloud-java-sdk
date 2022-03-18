// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateLakeHouseSpaceRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("DevDbId")
    public String devDbId;

    @NameInMap("DwDbType")
    public String dwDbType;

    @NameInMap("Mode")
    public String mode;

    @NameInMap("ProdDbId")
    public String prodDbId;

    @NameInMap("SpaceConfig")
    public String spaceConfig;

    @NameInMap("SpaceName")
    public String spaceName;

    @NameInMap("Tid")
    public Long tid;

    @NameInMap("UserId")
    public Long userId;

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

    public CreateLakeHouseSpaceRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

}
