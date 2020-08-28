// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListRetcodeAppsRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    public static ListRetcodeAppsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRetcodeAppsRequest self = new ListRetcodeAppsRequest();
        return TeaModel.build(map, self);
    }

}
