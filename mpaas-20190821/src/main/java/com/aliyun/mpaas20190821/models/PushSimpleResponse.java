// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20190821.models;

import com.aliyun.tea.*;

public class PushSimpleResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ResultCode")
    @Validation(required = true)
    public String resultCode;

    @NameInMap("ResultMessage")
    @Validation(required = true)
    public String resultMessage;

    public static PushSimpleResponse build(java.util.Map<String, ?> map) throws Exception {
        PushSimpleResponse self = new PushSimpleResponse();
        return TeaModel.build(map, self);
    }

}
