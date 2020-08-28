// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteAlertRulesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("IsSuccess")
    @Validation(required = true)
    public Boolean isSuccess;

    public static DeleteAlertRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAlertRulesResponse self = new DeleteAlertRulesResponse();
        return TeaModel.build(map, self);
    }

}
