// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class UpdateInspectionSettingStatusRequest extends TeaModel {
    @NameInMap("OperaUid")
    public String operaUid;

    @NameInMap("RiskCode")
    public String riskCode;

    @NameInMap("RiskEnableStatus")
    public Integer riskEnableStatus;

    public static UpdateInspectionSettingStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateInspectionSettingStatusRequest self = new UpdateInspectionSettingStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateInspectionSettingStatusRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

    public UpdateInspectionSettingStatusRequest setRiskCode(String riskCode) {
        this.riskCode = riskCode;
        return this;
    }
    public String getRiskCode() {
        return this.riskCode;
    }

    public UpdateInspectionSettingStatusRequest setRiskEnableStatus(Integer riskEnableStatus) {
        this.riskEnableStatus = riskEnableStatus;
        return this;
    }
    public Integer getRiskEnableStatus() {
        return this.riskEnableStatus;
    }

}
