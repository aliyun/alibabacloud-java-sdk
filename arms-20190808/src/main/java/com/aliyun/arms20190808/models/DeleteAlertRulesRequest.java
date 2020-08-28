// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteAlertRulesRequest extends TeaModel {
    @NameInMap("AlertIds")
    @Validation(required = true)
    public String alertIds;

    @NameInMap("ProxyUserId")
    public String proxyUserId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    public static DeleteAlertRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAlertRulesRequest self = new DeleteAlertRulesRequest();
        return TeaModel.build(map, self);
    }

}
