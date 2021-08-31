// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class ListOuterOrderedNumbersResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Numbers")
    public java.util.List<String> numbers;

    public static ListOuterOrderedNumbersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOuterOrderedNumbersResponseBody self = new ListOuterOrderedNumbersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOuterOrderedNumbersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListOuterOrderedNumbersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListOuterOrderedNumbersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOuterOrderedNumbersResponseBody setNumbers(java.util.List<String> numbers) {
        this.numbers = numbers;
        return this;
    }
    public java.util.List<String> getNumbers() {
        return this.numbers;
    }

}
