// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lmztest20101011.models;

import com.aliyun.tea.*;

public class AAbckRequest extends TeaModel {
    // 幂等参数
    @NameInMap("ClientToken3")
    public String clientToken3;

    // test
    @NameInMap("TestDemo")
    public String testDemo;

    public static AAbckRequest build(java.util.Map<String, ?> map) throws Exception {
        AAbckRequest self = new AAbckRequest();
        return TeaModel.build(map, self);
    }

    public AAbckRequest setClientToken3(String clientToken3) {
        this.clientToken3 = clientToken3;
        return this;
    }
    public String getClientToken3() {
        return this.clientToken3;
    }

    public AAbckRequest setTestDemo(String testDemo) {
        this.testDemo = testDemo;
        return this;
    }
    public String getTestDemo() {
        return this.testDemo;
    }

}
