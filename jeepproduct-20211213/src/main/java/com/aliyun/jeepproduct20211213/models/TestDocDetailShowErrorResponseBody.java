// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.jeepproduct20211213.models;

import com.aliyun.tea.*;

public class TestDocDetailShowErrorResponseBody extends TeaModel {
    @NameInMap("resource")
    public String resource;

    public static TestDocDetailShowErrorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TestDocDetailShowErrorResponseBody self = new TestDocDetailShowErrorResponseBody();
        return TeaModel.build(map, self);
    }

    public TestDocDetailShowErrorResponseBody setResource(String resource) {
        this.resource = resource;
        return this;
    }
    public String getResource() {
        return this.resource;
    }

}
