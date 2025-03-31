// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListRepoTagScanResultRequest extends TeaModel {
    /**
     * <p>The digest of the image.</p>
     * 
     * <strong>example:</strong>
     * <p>sha256:6b0b094f8a904f8fb6602427aed0d1fa</p>
     */
    @NameInMap("Digest")
    public String digest;

    /**
     * <p>The parameter whose value that you want to query. Fox example, if the value is <code>FixCmd</code>, only the <code>FixCmd</code> parameter is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>FixCmd</p>
     */
    @NameInMap("FilterValue")
    public String filterValue;

    /**
     * <p>The ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cri-2j88dtld8yel****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The number of the page to return.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries to return on each page.</p>
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
     * <p>crr-uf082u9dg8do****</p>
     */
    @NameInMap("RepoId")
    public String repoId;

    /**
     * <p>The ID of the security scan task.</p>
     * 
     * <strong>example:</strong>
     * <p>6b0b094f-8a90-4f8f-b660-2427aed0****</p>
     */
    @NameInMap("ScanTaskId")
    public String scanTaskId;

    /**
     * <p>The type of the vulnerability. Valid values:</p>
     * <ul>
     * <li><code>cve</code>: image system vulnerability</li>
     * <li><code>sca</code>: image application vulnerability</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>sca</p>
     */
    @NameInMap("ScanType")
    public String scanType;

    /**
     * <p>The severity of the vulnerability. Valid values:</p>
     * <ul>
     * <li><code>High</code></li>
     * <li><code>Medium</code></li>
     * <li><code>Low</code></li>
     * <li><code>Unknown</code></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>High</p>
     */
    @NameInMap("Severity")
    public String severity;

    /**
     * <p>The name of the image tag.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Tag")
    public String tag;

    /**
     * <p>The keyword for fuzzy search used in scanning. The value can be a CVE name.</p>
     * 
     * <strong>example:</strong>
     * <p>CVE-2021</p>
     */
    @NameInMap("VulQueryKey")
    public String vulQueryKey;

    public static ListRepoTagScanResultRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRepoTagScanResultRequest self = new ListRepoTagScanResultRequest();
        return TeaModel.build(map, self);
    }

    public ListRepoTagScanResultRequest setDigest(String digest) {
        this.digest = digest;
        return this;
    }
    public String getDigest() {
        return this.digest;
    }

    public ListRepoTagScanResultRequest setFilterValue(String filterValue) {
        this.filterValue = filterValue;
        return this;
    }
    public String getFilterValue() {
        return this.filterValue;
    }

    public ListRepoTagScanResultRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListRepoTagScanResultRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListRepoTagScanResultRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListRepoTagScanResultRequest setRepoId(String repoId) {
        this.repoId = repoId;
        return this;
    }
    public String getRepoId() {
        return this.repoId;
    }

    public ListRepoTagScanResultRequest setScanTaskId(String scanTaskId) {
        this.scanTaskId = scanTaskId;
        return this;
    }
    public String getScanTaskId() {
        return this.scanTaskId;
    }

    public ListRepoTagScanResultRequest setScanType(String scanType) {
        this.scanType = scanType;
        return this;
    }
    public String getScanType() {
        return this.scanType;
    }

    public ListRepoTagScanResultRequest setSeverity(String severity) {
        this.severity = severity;
        return this;
    }
    public String getSeverity() {
        return this.severity;
    }

    public ListRepoTagScanResultRequest setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

    public ListRepoTagScanResultRequest setVulQueryKey(String vulQueryKey) {
        this.vulQueryKey = vulQueryKey;
        return this;
    }
    public String getVulQueryKey() {
        return this.vulQueryKey;
    }

}
