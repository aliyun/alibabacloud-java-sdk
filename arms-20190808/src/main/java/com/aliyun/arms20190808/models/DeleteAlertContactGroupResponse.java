// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteAlertContactGroupResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("IsSuccess")
    @Validation(required = true)
    public Boolean isSuccess;

    public static DeleteAlertContactGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAlertContactGroupResponse self = new DeleteAlertContactGroupResponse();
        return TeaModel.build(map, self);
    }

}
