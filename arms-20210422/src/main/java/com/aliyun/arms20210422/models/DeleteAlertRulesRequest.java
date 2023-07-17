// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class DeleteAlertRulesRequest extends TeaModel {
    @NameInMap("AlertIds")
    public String alertIds;

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
