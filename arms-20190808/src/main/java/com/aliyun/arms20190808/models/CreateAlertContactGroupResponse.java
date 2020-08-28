// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateAlertContactGroupResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ContactGroupId")
    @Validation(required = true)
    public String contactGroupId;

    public static CreateAlertContactGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAlertContactGroupResponse self = new CreateAlertContactGroupResponse();
        return TeaModel.build(map, self);
    }

}
