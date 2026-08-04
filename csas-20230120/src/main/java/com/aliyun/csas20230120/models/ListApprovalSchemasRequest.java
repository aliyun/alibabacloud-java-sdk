// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListApprovalSchemasRequest extends TeaModel {
    /**
     * <p>The current page number for paged queries. Valid values: 1 to 10000.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Long currentPage;

    /**
     * <p>The number of entries per page for paged queries. Valid values: 1 to 500.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The policy type. Valid values:</p>
     * <ul>
     * <li><p><strong>DomainBlacklist</strong>: Domain blacklist.</p>
     * </li>
     * <li><p><strong>DomainWhitelist</strong>: Domain whitelist.</p>
     * </li>
     * <li><p><strong>SoftwareBlock</strong>: Software disable.</p>
     * </li>
     * <li><p><strong>AppUninstall</strong>: Terminal uninstall.</p>
     * </li>
     * <li><p><strong>DlpSend</strong>: File outbound.</p>
     * </li>
     * <li><p><strong>PeripheralBlock</strong>: Peripheral control.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DlpSend</p>
     */
    @NameInMap("PolicyType")
    public String policyType;

    /**
     * <p>Collection of approval template IDs.</p>
     */
    @NameInMap("SchemaIds")
    public java.util.List<String> schemaIds;

    /**
     * <p>The template name. It can be 1 to 128 characters long. It supports Chinese characters, uppercase and lowercase English letters, numbers, periods (.), underscores (_), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("SchemaName")
    public String schemaName;

    public static ListApprovalSchemasRequest build(java.util.Map<String, ?> map) throws Exception {
        ListApprovalSchemasRequest self = new ListApprovalSchemasRequest();
        return TeaModel.build(map, self);
    }

    public ListApprovalSchemasRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public ListApprovalSchemasRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListApprovalSchemasRequest setPolicyType(String policyType) {
        this.policyType = policyType;
        return this;
    }
    public String getPolicyType() {
        return this.policyType;
    }

    public ListApprovalSchemasRequest setSchemaIds(java.util.List<String> schemaIds) {
        this.schemaIds = schemaIds;
        return this;
    }
    public java.util.List<String> getSchemaIds() {
        return this.schemaIds;
    }

    public ListApprovalSchemasRequest setSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }
    public String getSchemaName() {
        return this.schemaName;
    }

}
