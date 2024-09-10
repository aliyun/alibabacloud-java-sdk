// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteEventRuleTargetsRequest extends TeaModel {
    /**
     * <p>The IDs of event-triggered alert rules.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Ids")
    public java.util.List<String> ids;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the event-triggered alert rule.</p>
     * <p>For information about how to obtain the name of an event-triggered alert rule, see <a href="https://help.aliyun.com/document_detail/114996.html">DescribeEventRuleList</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testRule</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    public static DeleteEventRuleTargetsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteEventRuleTargetsRequest self = new DeleteEventRuleTargetsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteEventRuleTargetsRequest setIds(java.util.List<String> ids) {
        this.ids = ids;
        return this;
    }
    public java.util.List<String> getIds() {
        return this.ids;
    }

    public DeleteEventRuleTargetsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteEventRuleTargetsRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

}
