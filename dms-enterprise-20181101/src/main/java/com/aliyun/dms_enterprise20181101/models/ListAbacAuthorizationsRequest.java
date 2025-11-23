// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListAbacAuthorizationsRequest extends TeaModel {
    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The ID of the policy.</p>
     * 
     * <strong>example:</strong>
     * <p>12****</p>
     */
    @NameInMap("PolicyId")
    public String policyId;

    /**
     * <p>The type of the policy. The value can be custom or system.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>USER_DEFINE</li>
     * <li>SYSTEM</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>USER_DEFINE</p>
     */
    @NameInMap("PolicySource")
    public String policySource;

    /**
     * <p>The ID of the tenant.</p>
     * <blockquote>
     * <p>To view the tenant ID, go to the Data Management (DMS) console and move the pointer over the profile picture in the upper-right corner. For more information, see the <a href="https://help.aliyun.com/document_detail/181330.html">View information about the current tenant</a> section of the &quot;Manage DMS tenants&quot; topic.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3***</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static ListAbacAuthorizationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAbacAuthorizationsRequest self = new ListAbacAuthorizationsRequest();
        return TeaModel.build(map, self);
    }

    public ListAbacAuthorizationsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListAbacAuthorizationsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListAbacAuthorizationsRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

    public ListAbacAuthorizationsRequest setPolicySource(String policySource) {
        this.policySource = policySource;
        return this;
    }
    public String getPolicySource() {
        return this.policySource;
    }

    public ListAbacAuthorizationsRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
