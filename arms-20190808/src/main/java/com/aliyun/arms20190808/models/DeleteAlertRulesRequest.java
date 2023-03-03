// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteAlertRulesRequest extends TeaModel {
    /**
     * <p>The IDs of the alert rules that you want to delete. The value is a JSON array, for example, `[123, 234]`. You can call the SearchAlertRules operation and view the `Id` parameter in the response to obtain the alert rule ID. For more information, see [SearchAlertRules](~~175825~~).</p>
     */
    @NameInMap("AlertIds")
    public String alertIds;

    /**
     * <p>The region ID. Default value: `cn-hangzhou`.</p>
     */
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
