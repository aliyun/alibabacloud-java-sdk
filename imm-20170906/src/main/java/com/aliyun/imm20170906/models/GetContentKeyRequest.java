// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class GetContentKeyRequest extends TeaModel {
    @NameInMap("Project")
    public String project;

    @NameInMap("VersionId")
    public String versionId;

    @NameInMap("DRMServerId")
    public String DRMServerId;

    @NameInMap("KeyIds")
    public String keyIds;

    public static GetContentKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetContentKeyRequest self = new GetContentKeyRequest();
        return TeaModel.build(map, self);
    }

    public GetContentKeyRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public GetContentKeyRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

    public GetContentKeyRequest setDRMServerId(String DRMServerId) {
        this.DRMServerId = DRMServerId;
        return this;
    }
    public String getDRMServerId() {
        return this.DRMServerId;
    }

    public GetContentKeyRequest setKeyIds(String keyIds) {
        this.keyIds = keyIds;
        return this;
    }
    public String getKeyIds() {
        return this.keyIds;
    }

}
