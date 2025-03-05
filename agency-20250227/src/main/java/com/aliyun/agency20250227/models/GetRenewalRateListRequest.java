// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20250227.models;

import com.aliyun.tea.*;

public class GetRenewalRateListRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2025Q4</p>
     */
    @NameInMap("FiscalYearAndQuarter")
    public String fiscalYearAndQuarter;

    public static GetRenewalRateListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRenewalRateListRequest self = new GetRenewalRateListRequest();
        return TeaModel.build(map, self);
    }

    public GetRenewalRateListRequest setFiscalYearAndQuarter(String fiscalYearAndQuarter) {
        this.fiscalYearAndQuarter = fiscalYearAndQuarter;
        return this;
    }
    public String getFiscalYearAndQuarter() {
        return this.fiscalYearAndQuarter;
    }

}
