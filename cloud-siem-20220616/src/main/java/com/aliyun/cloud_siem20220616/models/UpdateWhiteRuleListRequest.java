// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class UpdateWhiteRuleListRequest extends TeaModel {
    @NameInMap("Expression")
    public String expression;

    @NameInMap("IncidentUuid")
    public String incidentUuid;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("WhiteRuleId")
    public Long whiteRuleId;

    public static UpdateWhiteRuleListRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWhiteRuleListRequest self = new UpdateWhiteRuleListRequest();
        return TeaModel.build(map, self);
    }

    public UpdateWhiteRuleListRequest setExpression(String expression) {
        this.expression = expression;
        return this;
    }
    public String getExpression() {
        return this.expression;
    }

    public UpdateWhiteRuleListRequest setIncidentUuid(String incidentUuid) {
        this.incidentUuid = incidentUuid;
        return this;
    }
    public String getIncidentUuid() {
        return this.incidentUuid;
    }

    public UpdateWhiteRuleListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateWhiteRuleListRequest setWhiteRuleId(Long whiteRuleId) {
        this.whiteRuleId = whiteRuleId;
        return this;
    }
    public Long getWhiteRuleId() {
        return this.whiteRuleId;
    }

}
