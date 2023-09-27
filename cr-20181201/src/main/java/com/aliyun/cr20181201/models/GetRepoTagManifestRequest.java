// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetRepoTagManifestRequest extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the repository.</p>
     */
    @NameInMap("RepoId")
    public String repoId;

    /**
     * <p>The schema version of the manifest. Valid values: 1 and 2.</p>
     */
    @NameInMap("SchemaVersion")
    public Integer schemaVersion;

    /**
     * <p>The tag of the image.</p>
     */
    @NameInMap("Tag")
    public String tag;

    public static GetRepoTagManifestRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRepoTagManifestRequest self = new GetRepoTagManifestRequest();
        return TeaModel.build(map, self);
    }

    public GetRepoTagManifestRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetRepoTagManifestRequest setRepoId(String repoId) {
        this.repoId = repoId;
        return this;
    }
    public String getRepoId() {
        return this.repoId;
    }

    public GetRepoTagManifestRequest setSchemaVersion(Integer schemaVersion) {
        this.schemaVersion = schemaVersion;
        return this;
    }
    public Integer getSchemaVersion() {
        return this.schemaVersion;
    }

    public GetRepoTagManifestRequest setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

}
