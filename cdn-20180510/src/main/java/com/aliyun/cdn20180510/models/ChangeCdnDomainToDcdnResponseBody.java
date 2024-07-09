// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class ChangeCdnDomainToDcdnResponseBody extends TeaModel {
    /**
     * <p>The content of the migration instructions.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *         &quot;The_domain_name_quota_for_the_target_account_has_reached_the_upper_limit&quot;: true,
     *         &quot;Domain_name_requires_node2_architecture_to_be_enabled&quot;: true,
     *         &quot;Internal_customer_domain_name_migration_prohibited&quot;: true,
     *         &quot;Prohibit_the_migration_of_important_customer_domain_names&quot;: true,
     *         &quot;Protected_domain_names_are_prohibited_from_migration&quot;: true,
     *         &quot;Domain_names_accessed_through_TopDomain_are_prohibited_from_migration&quot;: true,
     *         &quot;Prohibit_migration_of_customer_domain_names_for_integrated_access&quot;: true
     *     }</p>
     */
    @NameInMap("Content")
    public java.util.Map<String, ?> content;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E6172599-7DA7-5471-9D22-359A4E0C9B94</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ChangeCdnDomainToDcdnResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ChangeCdnDomainToDcdnResponseBody self = new ChangeCdnDomainToDcdnResponseBody();
        return TeaModel.build(map, self);
    }

    public ChangeCdnDomainToDcdnResponseBody setContent(java.util.Map<String, ?> content) {
        this.content = content;
        return this;
    }
    public java.util.Map<String, ?> getContent() {
        return this.content;
    }

    public ChangeCdnDomainToDcdnResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
