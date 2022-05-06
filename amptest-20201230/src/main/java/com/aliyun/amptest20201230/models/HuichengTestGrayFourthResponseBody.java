// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amptest20201230.models;

import com.aliyun.tea.*;

public class HuichengTestGrayFourthResponseBody extends TeaModel {
    // RequestId
    @NameInMap("RequestId")
    public String requestId;

    // size
    @NameInMap("Size")
    public Integer size;

    // value
    @NameInMap("Value")
    public String value;

    public static HuichengTestGrayFourthResponseBody build(java.util.Map<String, ?> map) throws Exception {
        HuichengTestGrayFourthResponseBody self = new HuichengTestGrayFourthResponseBody();
        return TeaModel.build(map, self);
    }

    public HuichengTestGrayFourthResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public HuichengTestGrayFourthResponseBody setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public HuichengTestGrayFourthResponseBody setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
