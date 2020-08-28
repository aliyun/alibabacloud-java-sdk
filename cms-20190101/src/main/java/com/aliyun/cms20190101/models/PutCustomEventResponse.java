// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutCustomEventResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    public static PutCustomEventResponse build(java.util.Map<String, ?> map) throws Exception {
        PutCustomEventResponse self = new PutCustomEventResponse();
        return TeaModel.build(map, self);
    }

}
