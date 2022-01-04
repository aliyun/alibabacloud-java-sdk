// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GetMetaDataApiCallUsagesRequest extends TeaModel {
    @NameInMap("Months")
    public String months;

    public static GetMetaDataApiCallUsagesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMetaDataApiCallUsagesRequest self = new GetMetaDataApiCallUsagesRequest();
        return TeaModel.build(map, self);
    }

    public GetMetaDataApiCallUsagesRequest setMonths(String months) {
        this.months = months;
        return this;
    }
    public String getMonths() {
        return this.months;
    }

}
