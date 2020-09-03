// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20180713.models;

import com.aliyun.tea.*;

public class TestFlowStrategy01ShrinkRequest extends TeaModel {
    @NameInMap("Names")
    public String namesShrink;

    public static TestFlowStrategy01ShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        TestFlowStrategy01ShrinkRequest self = new TestFlowStrategy01ShrinkRequest();
        return TeaModel.build(map, self);
    }

    public TestFlowStrategy01ShrinkRequest setNamesShrink(String namesShrink) {
        this.namesShrink = namesShrink;
        return this;
    }
    public String getNamesShrink() {
        return this.namesShrink;
    }

}
