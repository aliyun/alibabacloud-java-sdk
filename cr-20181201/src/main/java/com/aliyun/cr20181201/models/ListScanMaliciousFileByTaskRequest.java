// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListScanMaliciousFileByTaskRequest extends TeaModel {
    /**
     * <p>The image digest.</p>
     * 
     * <strong>example:</strong>
     * <p>sha256:aa4bffff6406785e930dab1f94c9a1297ba22xxxx71d71504a015764*********</p>
     */
    @NameInMap("Digest")
    public String digest;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cri-gu94qynvpwk*****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The severity of the malicious file.</p>
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
     * <p>The number of entries per page. Maximum value: 100. If you specify a value greater than 100 for this parameter, the system reports a parameter error or uses 100 as the maximum value.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The image repository ID.</p>
     * 
     * <strong>example:</strong>
     * <p>crr-h1y4l279wb8*****</p>
     */
    @NameInMap("RepoId")
    public String repoId;

    /**
     * <p>The ID of the image scan task.</p>
     * 
     * <strong>example:</strong>
     * <p>79ee6bc2-3288-4c56-b967-**********</p>
     */
    @NameInMap("ScanTaskId")
    public String scanTaskId;

    /**
     * <p>The image tag.</p>
     * 
     * <strong>example:</strong>
     * <p>V6.11</p>
     */
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
