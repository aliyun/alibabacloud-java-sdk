// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class UpdateInspectionThresholdRequest extends TeaModel {
    @NameInMap("OperaUid")
    public String operaUid;

    @NameInMap("RiskCode")
    public String riskCode;

    @NameInMap("ThresholdItemListJson")
    public String thresholdItemListJson;

    public static UpdateInspectionThresholdRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateInspectionThresholdRequest self = new UpdateInspectionThresholdRequest();
        return TeaModel.build(map, self);
    }

    public UpdateInspectionThresholdRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

    public UpdateInspectionThresholdRequest setRiskCode(String riskCode) {
        this.riskCode = riskCode;
        return this;
    }
    public String getRiskCode() {
        return this.riskCode;
    }

    public UpdateInspectionThresholdRequest setThresholdItemListJson(String thresholdItemListJson) {
        this.thresholdItemListJson = thresholdItemListJson;
        return this;
    }
    public String getThresholdItemListJson() {
        return this.thresholdItemListJson;
    }

}
