// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateRepoTagScanTaskRequest extends TeaModel {
    @NameInMap("Digest")
    public String digest;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RepoId")
    public String repoId;

    @NameInMap("ScanService")
    public String scanService;

    @NameInMap("Tag")
    public String tag;

    public static CreateRepoTagScanTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRepoTagScanTaskRequest self = new CreateRepoTagScanTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateRepoTagScanTaskRequest setDigest(String digest) {
        this.digest = digest;
        return this;
    }
    public String getDigest() {
        return this.digest;
    }

    public CreateRepoTagScanTaskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateRepoTagScanTaskRequest setRepoId(String repoId) {
        this.repoId = repoId;
        return this;
    }
    public String getRepoId() {
        return this.repoId;
    }

    public CreateRepoTagScanTaskRequest setScanService(String scanService) {
        this.scanService = scanService;
        return this;
    }
    public String getScanService() {
        return this.scanService;
    }

    public CreateRepoTagScanTaskRequest setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

}
