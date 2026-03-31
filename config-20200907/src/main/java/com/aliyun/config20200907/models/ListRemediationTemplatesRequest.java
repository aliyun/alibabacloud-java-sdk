// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListRemediationTemplatesRequest extends TeaModel {
    /**
     * <p>The identifier of the managed rule.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/261176.html">ListCompliancePackTemplates</a> operation to obtain the managed rule identifier.</p>
     * 
     * <strong>example:</strong>
     * <p>oss-bucket-public-write-prohibited</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("ManagedRuleIdentifier")
    public String managedRuleIdentifier;

    /**
     * <p>The page number. Pages start from 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page. Valid values: 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The type of the remediation template. Valid value: OOS, which stands for Operation Orchestration Service.</p>
     * 
     * <strong>example:</strong>
     * <p>OOS</p>
     */
    @NameInMap("RemediationType")
    public String remediationType;

    public static ListRemediationTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRemediationTemplatesRequest self = new ListRemediationTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public ListRemediationTemplatesRequest setManagedRuleIdentifier(String managedRuleIdentifier) {
        this.managedRuleIdentifier = managedRuleIdentifier;
        return this;
    }
    public String getManagedRuleIdentifier() {
        return this.managedRuleIdentifier;
    }

    public ListRemediationTemplatesRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListRemediationTemplatesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListRemediationTemplatesRequest setRemediationType(String remediationType) {
        this.remediationType = remediationType;
        return this;
    }
    public String getRemediationType() {
        return this.remediationType;
    }

}
