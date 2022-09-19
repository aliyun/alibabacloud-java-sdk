// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class CreateSqlTemplateGroupRequest extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("TemplateGroupName")
    public String templateGroupName;

    public static CreateSqlTemplateGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSqlTemplateGroupRequest self = new CreateSqlTemplateGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateSqlTemplateGroupRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public CreateSqlTemplateGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateSqlTemplateGroupRequest setTemplateGroupName(String templateGroupName) {
        this.templateGroupName = templateGroupName;
        return this;
    }
    public String getTemplateGroupName() {
        return this.templateGroupName;
    }

}
