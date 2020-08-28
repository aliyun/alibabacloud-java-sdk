// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateAlertContactGroupRequest extends TeaModel {
    @NameInMap("ContactGroupName")
    @Validation(required = true)
    public String contactGroupName;

    @NameInMap("ContactIds")
    public String contactIds;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ProxyUserId")
    public String proxyUserId;

    public static CreateAlertContactGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAlertContactGroupRequest self = new CreateAlertContactGroupRequest();
        return TeaModel.build(map, self);
    }

}
