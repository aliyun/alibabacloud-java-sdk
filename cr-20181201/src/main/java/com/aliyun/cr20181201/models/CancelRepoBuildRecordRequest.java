// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CancelRepoBuildRecordRequest extends TeaModel {
    /**
     * <p>The build record ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>74FDBA62-30C0-4F22-BE7B-F1D36FD1****</p>
     */
    @NameInMap("BuildRecordId")
    public String buildRecordId;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cri-kmsiwlxxdcva****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The image repository ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>crr-tquyps22md8p****</p>
     */
    @NameInMap("RepoId")
    public String repoId;

    public static CancelRepoBuildRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelRepoBuildRecordRequest self = new CancelRepoBuildRecordRequest();
        return TeaModel.build(map, self);
    }

    public CancelRepoBuildRecordRequest setBuildRecordId(String buildRecordId) {
        this.buildRecordId = buildRecordId;
        return this;
    }
    public String getBuildRecordId() {
        return this.buildRecordId;
    }

    public CancelRepoBuildRecordRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CancelRepoBuildRecordRequest setRepoId(String repoId) {
        this.repoId = repoId;
        return this;
    }
    public String getRepoId() {
        return this.repoId;
    }

}
