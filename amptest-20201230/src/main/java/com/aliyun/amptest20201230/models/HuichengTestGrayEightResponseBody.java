// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amptest20201230.models;

import com.aliyun.tea.*;

public class HuichengTestGrayEightResponseBody extends TeaModel {
    // RequestId
    @NameInMap("RequestId")
    public String requestId;

    // size
    @NameInMap("Size")
    public Integer size;

    // value
    @NameInMap("Value")
    public String value;

    public static HuichengTestGrayEightResponseBody build(java.util.Map<String, ?> map) throws Exception {
        HuichengTestGrayEightResponseBody self = new HuichengTestGrayEightResponseBody();
        return TeaModel.build(map, self);
    }

    public HuichengTestGrayEightResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public HuichengTestGrayEightResponseBody setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public HuichengTestGrayEightResponseBody setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
