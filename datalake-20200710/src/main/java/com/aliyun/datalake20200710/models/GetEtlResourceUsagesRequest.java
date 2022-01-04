// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GetEtlResourceUsagesRequest extends TeaModel {
    @NameInMap("Months")
    public String months;

    public static GetEtlResourceUsagesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEtlResourceUsagesRequest self = new GetEtlResourceUsagesRequest();
        return TeaModel.build(map, self);
    }

    public GetEtlResourceUsagesRequest setMonths(String months) {
        this.months = months;
        return this;
    }
    public String getMonths() {
        return this.months;
    }

}
