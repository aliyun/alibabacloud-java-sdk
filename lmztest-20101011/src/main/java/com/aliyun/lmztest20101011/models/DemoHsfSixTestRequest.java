// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lmztest20101011.models;

import com.aliyun.tea.*;

public class DemoHsfSixTestRequest extends TeaModel {
    @NameInMap("codeMap")
    public java.util.Map<String, CodeMapValue> codeMap;

    public static DemoHsfSixTestRequest build(java.util.Map<String, ?> map) throws Exception {
        DemoHsfSixTestRequest self = new DemoHsfSixTestRequest();
        return TeaModel.build(map, self);
    }

    public DemoHsfSixTestRequest setCodeMap(java.util.Map<String, CodeMapValue> codeMap) {
        this.codeMap = codeMap;
        return this;
    }
    public java.util.Map<String, CodeMapValue> getCodeMap() {
        return this.codeMap;
    }

}
