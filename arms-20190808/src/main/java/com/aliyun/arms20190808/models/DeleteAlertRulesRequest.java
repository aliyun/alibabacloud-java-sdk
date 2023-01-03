// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteAlertRulesRequest extends TeaModel {
    // The IDs of the alert rules that you want to delete. The value is a JSON array, for example, `[123, 234]`. You can call the SearchAlertRules operation and view the `Id` parameter in the response parameters. For more information, see [SearchAlertRules](https://www.alibabacloud.com/help/en/application-real-time-monitoring-service/latest/searchalertrules).
    @NameInMap("AlertIds")
    public String alertIds;

    // The ID of the region. Default value: `cn-hangzhou`.
    @NameInMap("RegionId")
    public String regionId;

    public static DeleteAlertRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAlertRulesRequest self = new DeleteAlertRulesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAlertRulesRequest setAlertIds(String alertIds) {
        this.alertIds = alertIds;
        return this;
    }
    public String getAlertIds() {
        return this.alertIds;
    }

    public DeleteAlertRulesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
