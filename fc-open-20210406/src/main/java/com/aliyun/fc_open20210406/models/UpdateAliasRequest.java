// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class UpdateAliasRequest extends TeaModel {
    // 额外版本权重
    @NameInMap("additionalVersionWeight")
    public java.util.Map<String, Float> additionalVersionWeight;

    // 别名描述
    @NameInMap("description")
    public String description;

    // 版本ID
    @NameInMap("versionId")
    public String versionId;

    public static UpdateAliasRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAliasRequest self = new UpdateAliasRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAliasRequest setAdditionalVersionWeight(java.util.Map<String, Float> additionalVersionWeight) {
        this.additionalVersionWeight = additionalVersionWeight;
        return this;
    }
    public java.util.Map<String, Float> getAdditionalVersionWeight() {
        return this.additionalVersionWeight;
    }

    public UpdateAliasRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateAliasRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
