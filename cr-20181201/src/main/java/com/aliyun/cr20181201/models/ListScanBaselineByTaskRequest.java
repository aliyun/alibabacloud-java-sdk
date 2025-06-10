// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListScanBaselineByTaskRequest extends TeaModel {
    /**
     * <p>The digest value of the image.</p>
     * 
     * <strong>example:</strong>
     * <p>sha256:1c89806cfaf66d2990e2cf1131ebd56ff24b133745a33abf1228*************</p>
     */
    @NameInMap("Digest")
    public String digest;

    /**
     * <p>The ID of the Container Registry instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cri-***********</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The level of the baseline risk.</p>
     * 
     * <strong>example:</strong>
     * <p>High</p>
     */
    @NameInMap("Level")
    public String level;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the image repository.</p>
     * 
     * <strong>example:</strong>
     * <p>crr-**************</p>
     */
    @NameInMap("RepoId")
    public String repoId;

    /**
     * <p>The ID of the image scan task.</p>
     * 
     * <strong>example:</strong>
     * <p>3e526d7e-4b45-4703-b046-***********</p>
     */
    @NameInMap("ScanTaskId")
    public String scanTaskId;

    /**
     * <p>The image version.</p>
     * 
     * <strong>example:</strong>
     * <p>1.1.36</p>
     */
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
