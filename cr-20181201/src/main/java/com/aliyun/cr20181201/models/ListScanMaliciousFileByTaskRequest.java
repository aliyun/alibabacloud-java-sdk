// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListScanMaliciousFileByTaskRequest extends TeaModel {
    @NameInMap("Digest")
    public String digest;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Level")
    public String level;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RepoId")
    public String repoId;

    @NameInMap("ScanTaskId")
    public String scanTaskId;

    @NameInMap("Tag")
    public String tag;

    public static ListScanMaliciousFileByTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ListScanMaliciousFileByTaskRequest self = new ListScanMaliciousFileByTaskRequest();
        return TeaModel.build(map, self);
    }

    public ListScanMaliciousFileByTaskRequest setDigest(String digest) {
        this.digest = digest;
        return this;
    }
    public String getDigest() {
        return this.digest;
    }

    public ListScanMaliciousFileByTaskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListScanMaliciousFileByTaskRequest setLevel(String level) {
        this.level = level;
        return this;
    }
    public String getLevel() {
        return this.level;
    }

    public ListScanMaliciousFileByTaskRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListScanMaliciousFileByTaskRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListScanMaliciousFileByTaskRequest setRepoId(String repoId) {
        this.repoId = repoId;
        return this;
    }
    public String getRepoId() {
        return this.repoId;
    }

    public ListScanMaliciousFileByTaskRequest setScanTaskId(String scanTaskId) {
        this.scanTaskId = scanTaskId;
        return this;
    }
    public String getScanTaskId() {
        return this.scanTaskId;
    }

    public ListScanMaliciousFileByTaskRequest setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

}
