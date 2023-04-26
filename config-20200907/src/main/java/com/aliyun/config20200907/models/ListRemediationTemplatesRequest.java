// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListRemediationTemplatesRequest extends TeaModel {
    /**
     * <p>The identifier of the managed rule.</p>
     * <br>
     * <p>You can call the [ListCompliancePackTemplates](~~261176~~) operation to obtain the managed rule identifier.</p>
     */
    @NameInMap("ManagedRuleIdentifier")
    public String managedRuleIdentifier;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The type of the remediation template. Valid value: OOS, which stands for Operation Orchestration Service.</p>
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
