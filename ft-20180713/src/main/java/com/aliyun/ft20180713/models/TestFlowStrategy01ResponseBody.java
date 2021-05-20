// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20180713.models;

import com.aliyun.tea.*;

public class TestFlowStrategy01ResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("List")
    public java.util.List<String> list;

    @NameInMap("Names")
    public java.util.List<String> names;

    public static TestFlowStrategy01ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TestFlowStrategy01ResponseBody self = new TestFlowStrategy01ResponseBody();
        return TeaModel.build(map, self);
    }

    public TestFlowStrategy01ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TestFlowStrategy01ResponseBody setList(java.util.List<String> list) {
        this.list = list;
        return this;
    }
    public java.util.List<String> getList() {
        return this.list;
    }

    public TestFlowStrategy01ResponseBody setNames(java.util.List<String> names) {
        this.names = names;
        return this;
    }
    public java.util.List<String> getNames() {
        return this.names;
    }

}
