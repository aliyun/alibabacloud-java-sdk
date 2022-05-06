// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amptest20201230.models;

import com.aliyun.tea.*;

public class HuichengTestGrayNineResponseBody extends TeaModel {
    // RequestId
    @NameInMap("RequestId")
    public String requestId;

    // size
    @NameInMap("Size")
    public Integer size;

    // value
    @NameInMap("Value")
    public String value;

    public static HuichengTestGrayNineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        HuichengTestGrayNineResponseBody self = new HuichengTestGrayNineResponseBody();
        return TeaModel.build(map, self);
    }

    public HuichengTestGrayNineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public HuichengTestGrayNineResponseBody setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public HuichengTestGrayNineResponseBody setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
