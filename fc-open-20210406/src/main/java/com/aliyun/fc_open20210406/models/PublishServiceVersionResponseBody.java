// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class PublishServiceVersionResponseBody extends TeaModel {
    // The time when the service version was created.
    @NameInMap("createdTime")
    public String createdTime;

    // The description of the service version.
    @NameInMap("description")
    public String description;

    // The time when the service version was last modified.
    @NameInMap("lastModifiedTime")
    public String lastModifiedTime;

    // The version of the service.
    @NameInMap("versionId")
    public String versionId;

    public static PublishServiceVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PublishServiceVersionResponseBody self = new PublishServiceVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public PublishServiceVersionResponseBody setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public PublishServiceVersionResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public PublishServiceVersionResponseBody setLastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }
    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    public PublishServiceVersionResponseBody setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
