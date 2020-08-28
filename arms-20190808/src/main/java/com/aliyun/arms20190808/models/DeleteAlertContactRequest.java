// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteAlertContactRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ProxyUserId")
    public String proxyUserId;

    @NameInMap("ContactId")
    @Validation(required = true)
    public Long contactId;

    public static DeleteAlertContactRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAlertContactRequest self = new DeleteAlertContactRequest();
        return TeaModel.build(map, self);
    }

}
