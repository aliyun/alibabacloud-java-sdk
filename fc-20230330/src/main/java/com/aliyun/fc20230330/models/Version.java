// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class Version extends TeaModel {
    @NameInMap("createdTime")
    public String createdTime;

    @NameInMap("description")
    public String description;

    @NameInMap("lastModifiedTime")
    public String lastModifiedTime;

    @NameInMap("versionId")
    public String versionId;

    public static Version build(java.util.Map<String, ?> map) throws Exception {
        Version self = new Version();
        return TeaModel.build(map, self);
    }

    public Version setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public Version setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public Version setLastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }
    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    public Version setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
