// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lmztest20101011.models;

import com.aliyun.tea.*;

public class DemoHsfSixTestResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<java.util.Map<String, String>> data;

    public static DemoHsfSixTestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DemoHsfSixTestResponseBody self = new DemoHsfSixTestResponseBody();
        return TeaModel.build(map, self);
    }

    public DemoHsfSixTestResponseBody setData(java.util.List<java.util.Map<String, String>> data) {
        this.data = data;
        return this;
    }
    public java.util.List<java.util.Map<String, String>> getData() {
        return this.data;
    }

}
