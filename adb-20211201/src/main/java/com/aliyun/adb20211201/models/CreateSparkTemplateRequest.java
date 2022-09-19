// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class CreateSparkTemplateRequest extends TeaModel {
    @NameInMap("AppType")
    public String appType;

    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("Name")
    public String name;

    @NameInMap("ParentId")
    public Long parentId;

    @NameInMap("Type")
    public String type;

    public static CreateSparkTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSparkTemplateRequest self = new CreateSparkTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateSparkTemplateRequest setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public CreateSparkTemplateRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public CreateSparkTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateSparkTemplateRequest setParentId(Long parentId) {
        this.parentId = parentId;
        return this;
    }
    public Long getParentId() {
        return this.parentId;
    }

    public CreateSparkTemplateRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
