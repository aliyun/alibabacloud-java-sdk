// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class ListRemediationTemplatesRequest extends TeaModel {
    @NameInMap("RemediationType")
    public String remediationType;

    @NameInMap("ManagedRuleIdentifier")
    public String managedRuleIdentifier;

    public static ListRemediationTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRemediationTemplatesRequest self = new ListRemediationTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public ListRemediationTemplatesRequest setRemediationType(String remediationType) {
        this.remediationType = remediationType;
        return this;
    }
    public String getRemediationType() {
        return this.remediationType;
    }

    public ListRemediationTemplatesRequest setManagedRuleIdentifier(String managedRuleIdentifier) {
        this.managedRuleIdentifier = managedRuleIdentifier;
        return this;
    }
    public String getManagedRuleIdentifier() {
        return this.managedRuleIdentifier;
    }

}
