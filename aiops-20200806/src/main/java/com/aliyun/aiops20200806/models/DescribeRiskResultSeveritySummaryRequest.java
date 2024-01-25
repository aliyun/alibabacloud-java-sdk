// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeRiskResultSeveritySummaryRequest extends TeaModel {
    @NameInMap("ContinuousDays")
    public Integer continuousDays;

    @NameInMap("OperaUid")
    public String operaUid;

    @NameInMap("ProductCode")
    public String productCode;

    public static DescribeRiskResultSeveritySummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRiskResultSeveritySummaryRequest self = new DescribeRiskResultSeveritySummaryRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRiskResultSeveritySummaryRequest setContinuousDays(Integer continuousDays) {
        this.continuousDays = continuousDays;
        return this;
    }
    public Integer getContinuousDays() {
        return this.continuousDays;
    }

    public DescribeRiskResultSeveritySummaryRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

    public DescribeRiskResultSeveritySummaryRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

}
