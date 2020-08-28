// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateAlertContactResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ContactId")
    @Validation(required = true)
    public String contactId;

    public static CreateAlertContactResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAlertContactResponse self = new CreateAlertContactResponse();
        return TeaModel.build(map, self);
    }

}
