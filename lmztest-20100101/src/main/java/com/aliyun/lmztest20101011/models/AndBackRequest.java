// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lmztest20101011.models;

import com.aliyun.tea.*;

public class AndBackRequest extends TeaModel {
    // 幂等参数
    @NameInMap("ClientToken2")
    public String clientToken2;

    // test
    @NameInMap("TestDemo")
    public String testDemo;

    public static AndBackRequest build(java.util.Map<String, ?> map) throws Exception {
        AndBackRequest self = new AndBackRequest();
        return TeaModel.build(map, self);
    }

    public AndBackRequest setClientToken2(String clientToken2) {
        this.clientToken2 = clientToken2;
        return this;
    }
    public String getClientToken2() {
        return this.clientToken2;
    }

    public AndBackRequest setTestDemo(String testDemo) {
        this.testDemo = testDemo;
        return this;
    }
    public String getTestDemo() {
        return this.testDemo;
    }

}
