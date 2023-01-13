// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class UpdateAliasResponseBody extends TeaModel {
    /**
     * <p>The canary release version to which the alias points and the weight of the canary release version.</p>
     * <br>
     * <p>*   The canary release version takes effect only when the function is invoked.</p>
     * <p>*   The value consists of a version number and a specific weight. For example, 2:0.05 indicates that when a function is invoked, Version 2 is the canary release version, 5% of the traffic is distributed to the canary release version, and 95% of the traffic is distributed to the major version.</p>
     */
    @NameInMap("additionalVersionWeight")
    public java.util.Map<String, Float> additionalVersionWeight;

    /**
     * <p>The name of the alias.</p>
     */
    @NameInMap("aliasName")
    public String aliasName;

    /**
     * <p>The time when the alias was created.</p>
     */
    @NameInMap("createdTime")
    public String createdTime;

    /**
     * <p>The description of the alias.</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The time when the alias was last modified.</p>
     */
    @NameInMap("lastModifiedTime")
    public String lastModifiedTime;

    /**
     * <p>The ID of the version to which the alias points.</p>
     */
    @NameInMap("versionId")
    public String versionId;

    public static UpdateAliasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAliasResponseBody self = new UpdateAliasResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAliasResponseBody setAdditionalVersionWeight(java.util.Map<String, Float> additionalVersionWeight) {
        this.additionalVersionWeight = additionalVersionWeight;
        return this;
    }
    public java.util.Map<String, Float> getAdditionalVersionWeight() {
        return this.additionalVersionWeight;
    }

    public UpdateAliasResponseBody setAliasName(String aliasName) {
        this.aliasName = aliasName;
        return this;
    }
    public String getAliasName() {
        return this.aliasName;
    }

    public UpdateAliasResponseBody setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public UpdateAliasResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateAliasResponseBody setLastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }
    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    public UpdateAliasResponseBody setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
