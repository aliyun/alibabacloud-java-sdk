// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListScanBaselineByTaskRequest extends TeaModel {
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

    public static ListScanBaselineByTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ListScanBaselineByTaskRequest self = new ListScanBaselineByTaskRequest();
        return TeaModel.build(map, self);
    }

    public ListScanBaselineByTaskRequest setDigest(String digest) {
        this.digest = digest;
        return this;
    }
    public String getDigest() {
        return this.digest;
    }

    public ListScanBaselineByTaskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListScanBaselineByTaskRequest setLevel(String level) {
        this.level = level;
        return this;
    }
    public String getLevel() {
        return this.level;
    }

    public ListScanBaselineByTaskRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListScanBaselineByTaskRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListScanBaselineByTaskRequest setRepoId(String repoId) {
        this.repoId = repoId;
        return this;
    }
    public String getRepoId() {
        return this.repoId;
    }

    public ListScanBaselineByTaskRequest setScanTaskId(String scanTaskId) {
        this.scanTaskId = scanTaskId;
        return this;
    }
    public String getScanTaskId() {
        return this.scanTaskId;
    }

    public ListScanBaselineByTaskRequest setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

}
