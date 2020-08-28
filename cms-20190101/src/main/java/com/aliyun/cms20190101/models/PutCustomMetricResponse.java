// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutCustomMetricResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    public static PutCustomMetricResponse build(java.util.Map<String, ?> map) throws Exception {
        PutCustomMetricResponse self = new PutCustomMetricResponse();
        return TeaModel.build(map, self);
    }

}
