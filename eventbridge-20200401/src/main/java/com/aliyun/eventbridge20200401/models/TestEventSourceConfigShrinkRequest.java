// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class TestEventSourceConfigShrinkRequest extends TeaModel {
    @NameInMap("SourceMySQLParameters")
    public String sourceMySQLParametersShrink;

    public static TestEventSourceConfigShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        TestEventSourceConfigShrinkRequest self = new TestEventSourceConfigShrinkRequest();
        return TeaModel.build(map, self);
    }

    public TestEventSourceConfigShrinkRequest setSourceMySQLParametersShrink(String sourceMySQLParametersShrink) {
        this.sourceMySQLParametersShrink = sourceMySQLParametersShrink;
        return this;
    }
    public String getSourceMySQLParametersShrink() {
        return this.sourceMySQLParametersShrink;
    }

}
