// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class Version extends TeaModel {
    /**
     * <p>The time when the version was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2006-01-02T15:04:05Z07:00</p>
     */
    @NameInMap("createdTime")
    public String createdTime;

    /**
     * <p>The description of the layer version.</p>
     * 
     * <strong>example:</strong>
     * <p>my version</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The time when the version was last updated.</p>
     * 
     * <strong>example:</strong>
     * <p>2006-01-02T15:04:05Z07:00</p>
     */
    @NameInMap("lastModifiedTime")
    public String lastModifiedTime;

    /**
     * <p>The version ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
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
