// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteAlertRulesRequest extends TeaModel {
    /**
     * <p>The IDs of the alert rules that you want to delete. The value is a JSON array, for example, <code>[123, 234]</code>. You can call the SearchAlertRules operation and view the <code>Id</code> parameter in the response to obtain the alert rule ID. For more information, see <a href="https://help.aliyun.com/document_detail/175825.html">SearchAlertRules</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[123, 234]</p>
     */
    @NameInMap("AlertIds")
    public String alertIds;

    /**
     * <p>The region ID. Default value: <code>cn-hangzhou</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
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
