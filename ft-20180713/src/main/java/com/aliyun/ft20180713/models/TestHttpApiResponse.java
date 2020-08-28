// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20180713.models;

import com.aliyun.tea.*;

public class TestHttpApiResponse extends TeaModel {
    @NameInMap("Params")
    @Validation(required = true)
    public String params;

    @NameInMap("ServiceRpcSign")
    @Validation(required = true)
    public String serviceRpcSign;

    public static TestHttpApiResponse build(java.util.Map<String, ?> map) throws Exception {
        TestHttpApiResponse self = new TestHttpApiResponse();
        return TeaModel.build(map, self);
    }

}
