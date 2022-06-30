// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeLayer4RulePolicyRequest extends TeaModel {
    @NameInMap("Listeners")
    public String listeners;

    public static DescribeLayer4RulePolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLayer4RulePolicyRequest self = new DescribeLayer4RulePolicyRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLayer4RulePolicyRequest setListeners(String listeners) {
        this.listeners = listeners;
        return this;
    }
    public String getListeners() {
        return this.listeners;
    }

}
