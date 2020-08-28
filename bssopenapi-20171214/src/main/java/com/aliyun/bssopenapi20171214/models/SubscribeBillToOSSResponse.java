// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class SubscribeBillToOSSResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    public static SubscribeBillToOSSResponse build(java.util.Map<String, ?> map) throws Exception {
        SubscribeBillToOSSResponse self = new SubscribeBillToOSSResponse();
        return TeaModel.build(map, self);
    }

}
