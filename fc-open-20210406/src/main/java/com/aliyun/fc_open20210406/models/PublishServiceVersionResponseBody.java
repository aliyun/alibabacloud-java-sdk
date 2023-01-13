// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class PublishServiceVersionResponseBody extends TeaModel {
    /**
     * <p>The time when the service version was created.</p>
     */
    @NameInMap("createdTime")
    public String createdTime;

    /**
     * <p>The description of the service version.</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The time when the service version was last modified.</p>
     */
    @NameInMap("lastModifiedTime")
    public String lastModifiedTime;

    /**
     * <p>The version of the service.</p>
     */
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
