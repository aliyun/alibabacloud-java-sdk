// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateRepoTagScanTaskRequest extends TeaModel {
    /**
     * <p>The digest of the image.</p>
     * 
     * <strong>example:</strong>
     * <p>sha256:815386ebbe9a3490f38785ab11bda34ec8dacf4634af77b8912832d4f85dca04</p>
     */
    @NameInMap("Digest")
    public String digest;

    /**
     * <p>The ID of the Container Registry instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cri-xkx6vujuhay0****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the image repository.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>crr-xwvi3osiy4ff****</p>
     */
    @NameInMap("RepoId")
    public String repoId;

    /**
     * <p>The type of the scanning engine.</p>
     * <ul>
     * <li><code>SAS_SCAN_SERVICE</code>: Security Center scan engine (paid service)</li>
     * <li><code>ACR_SCAN_SERVICE</code>: Container Registry scan engine</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ACR_SCAN_SERVICE</p>
     */
    @NameInMap("ScanService")
    public String scanService;

    @NameInMap("ScanType")
    public String scanType;

    /**
     * <p>The image version.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1.24</p>
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

    public CreateRepoTagScanTaskRequest setScanType(String scanType) {
        this.scanType = scanType;
        return this;
    }
    public String getScanType() {
        return this.scanType;
    }

    public CreateRepoTagScanTaskRequest setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

}
