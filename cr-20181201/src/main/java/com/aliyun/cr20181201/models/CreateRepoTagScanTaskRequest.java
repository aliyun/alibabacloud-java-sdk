// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateRepoTagScanTaskRequest extends TeaModel {
    /**
     * <p>The digest of the image.</p>
     */
    @NameInMap("Digest")
    public String digest;

    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the image repository.</p>
     */
    @NameInMap("RepoId")
    public String repoId;

    /**
     * <p>The type of the scanning engine.</p>
     * <br>
     * <p>*   `SAS_SCAN_SERVICE`: Security Center scan engine (paid service)</p>
     * <p>*   `ACR_SCAN_SERVICE`: Container Registry scan engine</p>
     */
    @NameInMap("ScanService")
    public String scanService;

    /**
     * <p>The version of the image.</p>
     */
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
