// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetRepoBuildRecordStatusRequest extends TeaModel {
    /**
     * <p>The ID of the image building record.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a78ec6fb-16ea-4649-93b7-f52afba7d****</p>
     */
    @NameInMap("BuildRecordId")
    public String buildRecordId;

    /**
     * <p>The ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cri-kmsiwlxxdcva****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the image repository.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>crr-jnzm47ihjmgc****</p>
     */
    @NameInMap("RepoId")
    public String repoId;

    public static GetRepoBuildRecordStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRepoBuildRecordStatusRequest self = new GetRepoBuildRecordStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetRepoBuildRecordStatusRequest setBuildRecordId(String buildRecordId) {
        this.buildRecordId = buildRecordId;
        return this;
    }
    public String getBuildRecordId() {
        return this.buildRecordId;
    }

    public GetRepoBuildRecordStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetRepoBuildRecordStatusRequest setRepoId(String repoId) {
        this.repoId = repoId;
        return this;
    }
    public String getRepoId() {
        return this.repoId;
    }

}
