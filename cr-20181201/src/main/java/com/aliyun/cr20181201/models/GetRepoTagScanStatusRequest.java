// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetRepoTagScanStatusRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RepoId")
    public String repoId;

    @NameInMap("Tag")
    public String tag;

    @NameInMap("ScanTaskId")
    public String scanTaskId;

    @NameInMap("Digest")
    public String digest;

    public static GetRepoTagScanStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRepoTagScanStatusRequest self = new GetRepoTagScanStatusRequest();
        return TeaModel.build(map, self);
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

    public GetRepoTagScanStatusRequest setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

    public GetRepoTagScanStatusRequest setScanTaskId(String scanTaskId) {
        this.scanTaskId = scanTaskId;
        return this;
    }
    public String getScanTaskId() {
        return this.scanTaskId;
    }

    public GetRepoTagScanStatusRequest setDigest(String digest) {
        this.digest = digest;
        return this;
    }
    public String getDigest() {
        return this.digest;
    }

}
