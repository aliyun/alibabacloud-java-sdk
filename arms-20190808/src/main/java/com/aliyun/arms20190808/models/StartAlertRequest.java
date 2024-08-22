// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class StartAlertRequest extends TeaModel {
    /**
     * <p>The ID of the alert rule. You can call the SearchAlertRules operation and view the <code>Id</code> parameter in the response. For more information, see <a href="https://help.aliyun.com/document_detail/175825.html">SearchAlertRules</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1610***</p>
     */
    @NameInMap("AlertId")
    public String alertId;

    /**
     * <p>The ID of the region. Set the value to <code>cn-hangzhou</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static StartAlertRequest build(java.util.Map<String, ?> map) throws Exception {
        StartAlertRequest self = new StartAlertRequest();
        return TeaModel.build(map, self);
    }

    public StartAlertRequest setAlertId(String alertId) {
        this.alertId = alertId;
        return this;
    }
    public String getAlertId() {
        return this.alertId;
    }

    public StartAlertRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
