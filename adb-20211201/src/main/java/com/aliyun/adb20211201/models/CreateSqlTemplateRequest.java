// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class CreateSqlTemplateRequest extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("TemplateGroupId")
    public Long templateGroupId;

    @NameInMap("TemplateName")
    public String templateName;

    @NameInMap("TemplateValue")
    public String templateValue;

    public static CreateSqlTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSqlTemplateRequest self = new CreateSqlTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateSqlTemplateRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public CreateSqlTemplateRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateSqlTemplateRequest setTemplateGroupId(Long templateGroupId) {
        this.templateGroupId = templateGroupId;
        return this;
    }
    public Long getTemplateGroupId() {
        return this.templateGroupId;
    }

    public CreateSqlTemplateRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public CreateSqlTemplateRequest setTemplateValue(String templateValue) {
        this.templateValue = templateValue;
        return this;
    }
    public String getTemplateValue() {
        return this.templateValue;
    }

}
