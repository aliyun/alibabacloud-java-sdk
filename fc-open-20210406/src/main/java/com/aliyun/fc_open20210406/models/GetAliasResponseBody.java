// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class GetAliasResponseBody extends TeaModel {
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

    public static GetAliasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAliasResponseBody self = new GetAliasResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAliasResponseBody setAdditionalVersionWeight(java.util.Map<String, Float> additionalVersionWeight) {
        this.additionalVersionWeight = additionalVersionWeight;
        return this;
    }
    public java.util.Map<String, Float> getAdditionalVersionWeight() {
        return this.additionalVersionWeight;
    }

    public GetAliasResponseBody setAliasName(String aliasName) {
        this.aliasName = aliasName;
        return this;
    }
    public String getAliasName() {
        return this.aliasName;
    }

    public GetAliasResponseBody setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public GetAliasResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetAliasResponseBody setLastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }
    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    public GetAliasResponseBody setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
