// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.jeepproduct20211213.models;

import com.aliyun.tea.*;

public class TestDocDetailShowErrorRequest extends TeaModel {
    @NameInMap("serviceName")
    public String serviceName;

    @NameInMap("functionName")
    public String functionName;

    @NameInMap("qualifier")
    public String qualifier;

    public static TestDocDetailShowErrorRequest build(java.util.Map<String, ?> map) throws Exception {
        TestDocDetailShowErrorRequest self = new TestDocDetailShowErrorRequest();
        return TeaModel.build(map, self);
    }

    public TestDocDetailShowErrorRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public TestDocDetailShowErrorRequest setFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }
    public String getFunctionName() {
        return this.functionName;
    }

    public TestDocDetailShowErrorRequest setQualifier(String qualifier) {
        this.qualifier = qualifier;
        return this;
    }
    public String getQualifier() {
        return this.qualifier;
    }

}
