// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class PutDcdnKvWithHighCapacityResponseBody extends TeaModel {
    @NameInMap("Length")
    public Integer length;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Value")
    public String value;

    public static PutDcdnKvWithHighCapacityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PutDcdnKvWithHighCapacityResponseBody self = new PutDcdnKvWithHighCapacityResponseBody();
        return TeaModel.build(map, self);
    }

    public PutDcdnKvWithHighCapacityResponseBody setLength(Integer length) {
        this.length = length;
        return this;
    }
    public Integer getLength() {
        return this.length;
    }

    public PutDcdnKvWithHighCapacityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PutDcdnKvWithHighCapacityResponseBody setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
