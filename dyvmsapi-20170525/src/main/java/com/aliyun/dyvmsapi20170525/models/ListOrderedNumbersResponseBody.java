// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ListOrderedNumbersResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Numbers")
    public java.util.List<String> numbers;

    public static ListOrderedNumbersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOrderedNumbersResponseBody self = new ListOrderedNumbersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOrderedNumbersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListOrderedNumbersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListOrderedNumbersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOrderedNumbersResponseBody setNumbers(java.util.List<String> numbers) {
        this.numbers = numbers;
        return this;
    }
    public java.util.List<String> getNumbers() {
        return this.numbers;
    }

}
