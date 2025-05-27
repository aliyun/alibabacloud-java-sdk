// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class DiscoverEventSourceShrinkRequest extends TeaModel {
    @NameInMap("SourceMySQLParameters")
    public String sourceMySQLParametersShrink;

    public static DiscoverEventSourceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DiscoverEventSourceShrinkRequest self = new DiscoverEventSourceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DiscoverEventSourceShrinkRequest setSourceMySQLParametersShrink(String sourceMySQLParametersShrink) {
        this.sourceMySQLParametersShrink = sourceMySQLParametersShrink;
        return this;
    }
    public String getSourceMySQLParametersShrink() {
        return this.sourceMySQLParametersShrink;
    }

}
