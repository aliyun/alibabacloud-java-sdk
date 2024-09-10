// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteExporterRuleRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the data export rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>myRuleName</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    public static DeleteExporterRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteExporterRuleRequest self = new DeleteExporterRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteExporterRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteExporterRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

}
