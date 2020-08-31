// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20180713.models;

import com.aliyun.tea.*;

public class TestFlowStrategy01Request extends TeaModel {
    @NameInMap("Names")
    public java.util.Map<String, ?> names;

    public static TestFlowStrategy01Request build(java.util.Map<String, ?> map) throws Exception {
        TestFlowStrategy01Request self = new TestFlowStrategy01Request();
        return TeaModel.build(map, self);
    }

    public TestFlowStrategy01Request setNames(java.util.Map<String, ?> names) {
        this.names = names;
        return this;
    }
    public java.util.Map<String, ?> getNames() {
        return this.names;
    }

}
