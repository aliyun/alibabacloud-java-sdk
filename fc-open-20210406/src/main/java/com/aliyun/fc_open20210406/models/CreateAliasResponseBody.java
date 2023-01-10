// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class CreateAliasResponseBody extends TeaModel {
    // The canary release version to which the alias points and the weight of the canary release version.
    // 
    // *   The canary release version takes effect only when the function is invoked.
    // *   The value consists of a version number and a specific weight. For example, 2:0.05 indicates that when a function is invoked, Version 2 is the canary release version, 5% of the traffic is distributed to the canary release version, and 95% of the traffic is distributed to the major version.
    @NameInMap("additionalVersionWeight")
    public java.util.Map<String, Float> additionalVersionWeight;

    // The name of the alias.
    @NameInMap("aliasName")
    public String aliasName;

    // The time when the alias was created.
    @NameInMap("createdTime")
    public String createdTime;

    // The description of the alias.
    @NameInMap("description")
    public String description;

    // The time when the alias was last modified.
    @NameInMap("lastModifiedTime")
    public String lastModifiedTime;

    // The ID of the version to which the alias points.
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
