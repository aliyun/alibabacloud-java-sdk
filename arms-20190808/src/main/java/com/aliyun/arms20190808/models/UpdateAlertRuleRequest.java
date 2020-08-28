// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UpdateAlertRuleRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ContactGroupIds")
    public String contactGroupIds;

    @NameInMap("IsAutoStart")
    public Boolean isAutoStart;

    @NameInMap("TemplageAlertConfig")
    @Validation(required = true)
    public String templageAlertConfig;

    @NameInMap("ProxyUserId")
    public String proxyUserId;

    @NameInMap("AlertId")
    @Validation(required = true)
    public Long alertId;

    public static UpdateAlertRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAlertRuleRequest self = new UpdateAlertRuleRequest();
        return TeaModel.build(map, self);
    }

}
