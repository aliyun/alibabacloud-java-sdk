// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class CreateAliasRequest extends TeaModel {
    // 额外版本权重
    @NameInMap("additionalVersionWeight")
    public java.util.Map<String, Float> additionalVersionWeight;

    // 别名名称
    @NameInMap("aliasName")
    public String aliasName;

    // 别名描述
    @NameInMap("description")
    public String description;

    // 版本ID
    @NameInMap("versionId")
    public String versionId;

    public static CreateAliasRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAliasRequest self = new CreateAliasRequest();
        return TeaModel.build(map, self);
    }

    public CreateAliasRequest setAdditionalVersionWeight(java.util.Map<String, Float> additionalVersionWeight) {
        this.additionalVersionWeight = additionalVersionWeight;
        return this;
    }
    public java.util.Map<String, Float> getAdditionalVersionWeight() {
        return this.additionalVersionWeight;
    }

    public CreateAliasRequest setAliasName(String aliasName) {
        this.aliasName = aliasName;
        return this;
    }
    public String getAliasName() {
        return this.aliasName;
    }

    public CreateAliasRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateAliasRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
