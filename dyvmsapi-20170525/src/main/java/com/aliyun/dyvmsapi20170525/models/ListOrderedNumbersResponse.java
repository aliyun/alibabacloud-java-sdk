// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ListOrderedNumbersResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Numbers")
    @Validation(required = true)
    public java.util.List<String> numbers;

    public static ListOrderedNumbersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOrderedNumbersResponse self = new ListOrderedNumbersResponse();
        return TeaModel.build(map, self);
    }

}
