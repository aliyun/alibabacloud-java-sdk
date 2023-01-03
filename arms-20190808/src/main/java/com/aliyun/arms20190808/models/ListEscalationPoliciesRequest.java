// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListEscalationPoliciesRequest extends TeaModel {
    // The name of the escalation policy.
    @NameInMap("Name")
    public String name;

    // The number of the page to return.
    @NameInMap("Page")
    public Long page;

    // The number of entries to return on each page.
    @NameInMap("Size")
    public Long size;

    public static ListEscalationPoliciesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEscalationPoliciesRequest self = new ListEscalationPoliciesRequest();
        return TeaModel.build(map, self);
    }

    public ListEscalationPoliciesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListEscalationPoliciesRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public ListEscalationPoliciesRequest setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

}
