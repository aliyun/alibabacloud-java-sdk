// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20180713.models;

import com.aliyun.tea.*;

public class TestFlowStrategy01Response extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("List")
    @Validation(required = true)
    public java.util.List<String> list;

    @NameInMap("Names")
    @Validation(required = true)
    public java.util.List<String> names;

    public static TestFlowStrategy01Response build(java.util.Map<String, ?> map) throws Exception {
        TestFlowStrategy01Response self = new TestFlowStrategy01Response();
        return TeaModel.build(map, self);
    }

    public TestFlowStrategy01Response setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TestFlowStrategy01Response setList(java.util.List<String> list) {
        this.list = list;
        return this;
    }
    public java.util.List<String> getList() {
        return this.list;
    }

    public TestFlowStrategy01Response setNames(java.util.List<String> names) {
        this.names = names;
        return this;
    }
    public java.util.List<String> getNames() {
        return this.names;
    }

}
