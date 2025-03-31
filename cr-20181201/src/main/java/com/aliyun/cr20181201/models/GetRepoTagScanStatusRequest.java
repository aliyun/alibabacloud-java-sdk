// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetRepoTagScanStatusRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>67bfbcc12b67936ec7f867927817cbb071832b873dbcaed312a1930ba5f1d529</p>
     */
    @NameInMap("Digest")
    public String digest;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cri-2j88dtld8yel****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>crr-uf082u9dg8do****</p>
     */
    @NameInMap("RepoId")
    public String repoId;

    /**
     * <strong>example:</strong>
     * <p>838152F9-F725-5A52-A344-8972D65AC045</p>
     */
    @NameInMap("ScanTaskId")
    public String scanTaskId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Tag")
    public String tag;

    public static GetRepoTagScanStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRepoTagScanStatusRequest self = new GetRepoTagScanStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetRepoTagScanStatusRequest setDigest(String digest) {
        this.digest = digest;
        return this;
    }
    public String getDigest() {
        return this.digest;
    }

    public GetRepoTagScanStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetRepoTagScanStatusRequest setRepoId(String repoId) {
        this.repoId = repoId;
        return this;
    }
    public String getRepoId() {
        return this.repoId;
    }

    public GetRepoTagScanStatusRequest setScanTaskId(String scanTaskId) {
        this.scanTaskId = scanTaskId;
        return this;
    }
    public String getScanTaskId() {
        return this.scanTaskId;
    }

    public GetRepoTagScanStatusRequest setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

}
