// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeRiskResultStatisticalRequest extends TeaModel {
    @NameInMap("ContinuousDays")
    public Integer continuousDays;

    @NameInMap("OperaUid")
    public String operaUid;

    @NameInMap("ProductCode")
    public String productCode;

    public static DescribeRiskResultStatisticalRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRiskResultStatisticalRequest self = new DescribeRiskResultStatisticalRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRiskResultStatisticalRequest setContinuousDays(Integer continuousDays) {
        this.continuousDays = continuousDays;
        return this;
    }
    public Integer getContinuousDays() {
        return this.continuousDays;
    }

    public DescribeRiskResultStatisticalRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

    public DescribeRiskResultStatisticalRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

}
