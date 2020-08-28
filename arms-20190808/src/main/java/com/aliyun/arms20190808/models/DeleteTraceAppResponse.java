// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteTraceAppResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public String data;

    public static DeleteTraceAppResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTraceAppResponse self = new DeleteTraceAppResponse();
        return TeaModel.build(map, self);
    }

}
