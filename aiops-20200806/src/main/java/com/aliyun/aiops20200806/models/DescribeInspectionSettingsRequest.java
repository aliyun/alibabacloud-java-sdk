// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeInspectionSettingsRequest extends TeaModel {
    @NameInMap("OperaUid")
    public String operaUid;

    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("ProductType")
    public Integer productType;

    @NameInMap("RiskDesc")
    public String riskDesc;

    @NameInMap("RiskEnableStatus")
    public Integer riskEnableStatus;

    @NameInMap("RiskName")
    public String riskName;

    @NameInMap("RiskType")
    public Integer riskType;

    public static DescribeInspectionSettingsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInspectionSettingsRequest self = new DescribeInspectionSettingsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInspectionSettingsRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

    public DescribeInspectionSettingsRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public DescribeInspectionSettingsRequest setProductType(Integer productType) {
        this.productType = productType;
        return this;
    }
    public Integer getProductType() {
        return this.productType;
    }

    public DescribeInspectionSettingsRequest setRiskDesc(String riskDesc) {
        this.riskDesc = riskDesc;
        return this;
    }
    public String getRiskDesc() {
        return this.riskDesc;
    }

    public DescribeInspectionSettingsRequest setRiskEnableStatus(Integer riskEnableStatus) {
        this.riskEnableStatus = riskEnableStatus;
        return this;
    }
    public Integer getRiskEnableStatus() {
        return this.riskEnableStatus;
    }

    public DescribeInspectionSettingsRequest setRiskName(String riskName) {
        this.riskName = riskName;
        return this;
    }
    public String getRiskName() {
        return this.riskName;
    }

    public DescribeInspectionSettingsRequest setRiskType(Integer riskType) {
        this.riskType = riskType;
        return this;
    }
    public Integer getRiskType() {
        return this.riskType;
    }

}
