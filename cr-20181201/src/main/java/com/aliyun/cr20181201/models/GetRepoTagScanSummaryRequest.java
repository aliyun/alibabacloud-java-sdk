// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetRepoTagScanSummaryRequest extends TeaModel {
    /**
     * <p>The number of unknown-severity vulnerabilities.</p>
     * 
     * <strong>example:</strong>
     * <p>sha256:c9f370a4eb1c00d0b0d7212a0a9fa4a7697756c90f0f680afaf9737a25725f4c</p>
     */
    @NameInMap("Digest")
    public String digest;

    /**
     * <p>The ID of the image repository.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cri-2j88dtld8yel****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the image tag.</p>
     * 
     * <strong>example:</strong>
     * <p>crr-c2i5yk6h6pu9d5o8</p>
     */
    @NameInMap("RepoId")
    public String repoId;

    /**
     * <p>The digest of the image.</p>
     * 
     * <strong>example:</strong>
     * <p>47A3E5A3-6AD4-5F02-93B8-59F778AE25D4</p>
     */
    @NameInMap("ScanTaskId")
    public String scanTaskId;

    /**
     * <p>The ID of the security scan task.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Tag")
    public String tag;

    public static GetRepoTagScanSummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRepoTagScanSummaryRequest self = new GetRepoTagScanSummaryRequest();
        return TeaModel.build(map, self);
    }

    public GetRepoTagScanSummaryRequest setDigest(String digest) {
        this.digest = digest;
        return this;
    }
    public String getDigest() {
        return this.digest;
    }

    public GetRepoTagScanSummaryRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetRepoTagScanSummaryRequest setRepoId(String repoId) {
        this.repoId = repoId;
        return this;
    }
    public String getRepoId() {
        return this.repoId;
    }

    public GetRepoTagScanSummaryRequest setScanTaskId(String scanTaskId) {
        this.scanTaskId = scanTaskId;
        return this;
    }
    public String getScanTaskId() {
        return this.scanTaskId;
    }

    public GetRepoTagScanSummaryRequest setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

}
