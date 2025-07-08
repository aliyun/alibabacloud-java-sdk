// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class CalculateSmsLengthNewResponseBody extends TeaModel {
    @NameInMap("Length")
    public Integer length;

    @NameInMap("Number")
    public Integer number;

    @NameInMap("RequestId")
    public String requestId;

    public static CalculateSmsLengthNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CalculateSmsLengthNewResponseBody self = new CalculateSmsLengthNewResponseBody();
        return TeaModel.build(map, self);
    }

    public CalculateSmsLengthNewResponseBody setLength(Integer length) {
        this.length = length;
        return this;
    }
    public Integer getLength() {
        return this.length;
    }

    public CalculateSmsLengthNewResponseBody setNumber(Integer number) {
        this.number = number;
        return this;
    }
    public Integer getNumber() {
        return this.number;
    }

    public CalculateSmsLengthNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
