// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lx20150701.models;

import com.aliyun.tea.*;

public class DescribeReservedInstancePriceResponseBody extends TeaModel {
    @NameInMap("Data")
    public String data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrCode")
    public String errCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    public static DescribeReservedInstancePriceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeReservedInstancePriceResponseBody self = new DescribeReservedInstancePriceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeReservedInstancePriceResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public DescribeReservedInstancePriceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeReservedInstancePriceResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DescribeReservedInstancePriceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeReservedInstancePriceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeReservedInstancePriceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
