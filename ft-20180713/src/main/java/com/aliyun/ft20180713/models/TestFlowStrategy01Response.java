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

}
