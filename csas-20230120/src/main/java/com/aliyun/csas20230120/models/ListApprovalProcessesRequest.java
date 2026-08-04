// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListApprovalProcessesRequest extends TeaModel {
    /**
     * <p>The page number of the current page when paging is used. Valid values: 1 to 10000.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Long currentPage;

    /**
     * <p>The number of entries per page when paging is used. Valid values: 1 to 500.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The ID of the associated business policy.</p>
     * 
     * <strong>example:</strong>
     * <p>pid-6d6ad77d5b52****</p>
     */
    @NameInMap("PolicyId")
    public String policyId;

    /**
     * <p>The type of the associated policy. Valid values:</p>
     * <ul>
     * <li><strong>DomainBlacklist</strong>: domain name blacklist.</li>
     * <li><strong>DomainWhitelist</strong>: domain name whitelist.</li>
     * <li><strong>SoftwareBlock</strong>: software blocking.</li>
     * <li><strong>AppUninstall</strong>: agent uninstallation.</li>
     * <li><strong>DlpSend</strong>: file outgoing.</li>
     * <li><strong>PeripheralBlock</strong>: peripheral control.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DlpSend</p>
     */
    @NameInMap("PolicyType")
    public String policyType;

    /**
     * <p>The collection of approval process IDs.</p>
     */
    @NameInMap("ProcessIds")
    public java.util.List<String> processIds;

    /**
     * <p>The template name. The name must be 1 to 128 characters in length and can contain letters, digits, periods (.), underscores (_), and hyphens (-). Chinese characters are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("ProcessName")
    public String processName;

    /**
     * <p>The ID of the associated approver. You can call the following operation to obtain the ID:</p>
     * <ul>
     * <li><a href="~~ListUsers~~">ListUsers</a>: lists users.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>su_e8f218fb171edd167c2ad917d21f53148bdefc510ca1f3c3cc0249d3643d****</p>
     */
    @NameInMap("SaseUserId")
    public String saseUserId;

    /**
     * <p>The username of the associated approver.</p>
     * 
     * <strong>example:</strong>
     * <p>王先生</p>
     */
    @NameInMap("Username")
    public String username;

    public static ListApprovalProcessesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListApprovalProcessesRequest self = new ListApprovalProcessesRequest();
        return TeaModel.build(map, self);
    }

    public ListApprovalProcessesRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public ListApprovalProcessesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListApprovalProcessesRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

    public ListApprovalProcessesRequest setPolicyType(String policyType) {
        this.policyType = policyType;
        return this;
    }
    public String getPolicyType() {
        return this.policyType;
    }

    public ListApprovalProcessesRequest setProcessIds(java.util.List<String> processIds) {
        this.processIds = processIds;
        return this;
    }
    public java.util.List<String> getProcessIds() {
        return this.processIds;
    }

    public ListApprovalProcessesRequest setProcessName(String processName) {
        this.processName = processName;
        return this;
    }
    public String getProcessName() {
        return this.processName;
    }

    public ListApprovalProcessesRequest setSaseUserId(String saseUserId) {
        this.saseUserId = saseUserId;
        return this;
    }
    public String getSaseUserId() {
        return this.saseUserId;
    }

    public ListApprovalProcessesRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

}
