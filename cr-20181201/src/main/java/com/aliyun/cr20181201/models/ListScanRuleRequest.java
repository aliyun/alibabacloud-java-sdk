// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListScanRuleRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cri-upoulewerx*****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

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
     * <p>The type of the vulnerability. Valid values:</p>
     * <ul>
     * <li><code>VUL</code>: Products Cloud Security Scanner.</li>
     * <li><code>SBOM</code>: Product Content Analysis.</li>
     * </ul>
     * <p>Default value: <code>VUL</code></p>
     * 
     * <strong>example:</strong>
     * <p>SBOM</p>
     */
    @NameInMap("ScanType")
    public String scanType;

    public static ListScanRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ListScanRuleRequest self = new ListScanRuleRequest();
        return TeaModel.build(map, self);
    }

    public ListScanRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListScanRuleRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListScanRuleRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListScanRuleRequest setScanType(String scanType) {
        this.scanType = scanType;
        return this;
    }
    public String getScanType() {
        return this.scanType;
    }

}
