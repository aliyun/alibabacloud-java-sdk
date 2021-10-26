// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class CreateAliasResponseBody extends TeaModel {
    // 额外版本权重
    @NameInMap("additionalVersionWeight")
    public java.util.Map<String, Float> additionalVersionWeight;

    // 别名名称
    @NameInMap("aliasName")
    public String aliasName;

    // 创建时间
    @NameInMap("createdTime")
    public String createdTime;

    // 别名描述
    @NameInMap("description")
    public String description;

    // 上次更新时间
    @NameInMap("lastModifiedTime")
    public String lastModifiedTime;

    // 版本ID
    @NameInMap("versionId")
    public String versionId;

    public static CreateAliasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAliasResponseBody self = new CreateAliasResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAliasResponseBody setAdditionalVersionWeight(java.util.Map<String, Float> additionalVersionWeight) {
        this.additionalVersionWeight = additionalVersionWeight;
        return this;
    }
    public java.util.Map<String, Float> getAdditionalVersionWeight() {
        return this.additionalVersionWeight;
    }

    public CreateAliasResponseBody setAliasName(String aliasName) {
        this.aliasName = aliasName;
        return this;
    }
    public String getAliasName() {
        return this.aliasName;
    }

    public CreateAliasResponseBody setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public CreateAliasResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateAliasResponseBody setLastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }
    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    public CreateAliasResponseBody setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
