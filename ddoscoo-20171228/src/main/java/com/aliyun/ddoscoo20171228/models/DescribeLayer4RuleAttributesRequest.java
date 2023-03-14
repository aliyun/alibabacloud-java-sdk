// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeLayer4RuleAttributesRequest extends TeaModel {
    @NameInMap("Listeners")
    public String listeners;

    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeLayer4RuleAttributesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLayer4RuleAttributesRequest self = new DescribeLayer4RuleAttributesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLayer4RuleAttributesRequest setListeners(String listeners) {
        this.listeners = listeners;
        return this;
    }
    public String getListeners() {
        return this.listeners;
    }

    public DescribeLayer4RuleAttributesRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
