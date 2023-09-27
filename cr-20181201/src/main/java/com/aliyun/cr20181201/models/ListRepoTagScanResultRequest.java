// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListRepoTagScanResultRequest extends TeaModel {
    /**
     * <p>The digest of the image.</p>
     */
    @NameInMap("Digest")
    public String digest;

    /**
     * <p>The parameter whose value that you want to query. Fox example, if the value is `FixCmd`, only the `FixCmd` parameter is returned.</p>
     */
    @NameInMap("FilterValue")
    public String filterValue;

    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The number of the page to return.</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries to return on each page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the image repository.</p>
     */
    @NameInMap("RepoId")
    public String repoId;

    /**
     * <p>The ID of the security scan task.</p>
     */
    @NameInMap("ScanTaskId")
    public String scanTaskId;

    /**
     * <p>The type of the vulnerability. Valid values:</p>
     * <br>
     * <p>*   `cve`: image system vulnerability</p>
     * <p>*   `sca`: image application vulnerability</p>
     */
    @NameInMap("ScanType")
    public String scanType;

    /**
     * <p>The severity of the vulnerability. Valid values:</p>
     * <br>
     * <p>*   `High`</p>
     * <p>*   `Medium`</p>
     * <p>*   `Low`</p>
     * <p>*   `Unknown`</p>
     */
    @NameInMap("Severity")
    public String severity;

    /**
     * <p>The name of the image tag.</p>
     */
    @NameInMap("Tag")
    public String tag;

    /**
     * <p>The keyword for fuzzy search used in scanning. The value can be a CVE name.</p>
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
