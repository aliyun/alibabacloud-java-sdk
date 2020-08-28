// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteCustomMetricResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteCustomMetricResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomMetricResponse self = new DeleteCustomMetricResponse();
        return TeaModel.build(map, self);
    }

}
