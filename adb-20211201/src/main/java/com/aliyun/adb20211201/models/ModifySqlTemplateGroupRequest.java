// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ModifySqlTemplateGroupRequest extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("TemplateGroupId")
    public Long templateGroupId;

    @NameInMap("TemplateGroupName")
    public String templateGroupName;

    public static ModifySqlTemplateGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySqlTemplateGroupRequest self = new ModifySqlTemplateGroupRequest();
        return TeaModel.build(map, self);
    }

    public ModifySqlTemplateGroupRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifySqlTemplateGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifySqlTemplateGroupRequest setTemplateGroupId(Long templateGroupId) {
        this.templateGroupId = templateGroupId;
        return this;
    }
    public Long getTemplateGroupId() {
        return this.templateGroupId;
    }

    public ModifySqlTemplateGroupRequest setTemplateGroupName(String templateGroupName) {
        this.templateGroupName = templateGroupName;
        return this;
    }
    public String getTemplateGroupName() {
        return this.templateGroupName;
    }

}
