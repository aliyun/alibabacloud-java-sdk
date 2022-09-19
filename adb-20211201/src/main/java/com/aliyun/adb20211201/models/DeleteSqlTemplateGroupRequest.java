// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DeleteSqlTemplateGroupRequest extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("TemplateGroupId")
    public Long templateGroupId;

    public static DeleteSqlTemplateGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSqlTemplateGroupRequest self = new DeleteSqlTemplateGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSqlTemplateGroupRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DeleteSqlTemplateGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteSqlTemplateGroupRequest setTemplateGroupId(Long templateGroupId) {
        this.templateGroupId = templateGroupId;
        return this;
    }
    public Long getTemplateGroupId() {
        return this.templateGroupId;
    }

}
