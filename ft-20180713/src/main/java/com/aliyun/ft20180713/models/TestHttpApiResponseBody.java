// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20180713.models;

import com.aliyun.tea.*;

public class TestHttpApiResponseBody extends TeaModel {
    @NameInMap("ServiceRpcSign")
    public String serviceRpcSign;

    @NameInMap("Params")
    public String params;

    public static TestHttpApiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TestHttpApiResponseBody self = new TestHttpApiResponseBody();
        return TeaModel.build(map, self);
    }

    public TestHttpApiResponseBody setServiceRpcSign(String serviceRpcSign) {
        this.serviceRpcSign = serviceRpcSign;
        return this;
    }
    public String getServiceRpcSign() {
        return this.serviceRpcSign;
    }

    public TestHttpApiResponseBody setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

}
