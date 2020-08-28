// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UpdateAlertContactGroupRequest extends TeaModel {
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

    @NameInMap("ContactGroupId")
    @Validation(required = true)
    public Long contactGroupId;

    public static UpdateAlertContactGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAlertContactGroupRequest self = new UpdateAlertContactGroupRequest();
        return TeaModel.build(map, self);
    }

}
