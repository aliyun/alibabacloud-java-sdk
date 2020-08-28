// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteAlertContactGroupRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ProxyUserId")
    public String proxyUserId;

    @NameInMap("ContactGroupId")
    @Validation(required = true)
    public Long contactGroupId;

    public static DeleteAlertContactGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAlertContactGroupRequest self = new DeleteAlertContactGroupRequest();
        return TeaModel.build(map, self);
    }

}
