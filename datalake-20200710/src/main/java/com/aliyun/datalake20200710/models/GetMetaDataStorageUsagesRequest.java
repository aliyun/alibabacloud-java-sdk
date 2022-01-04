// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GetMetaDataStorageUsagesRequest extends TeaModel {
    @NameInMap("Months")
    public String months;

    public static GetMetaDataStorageUsagesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMetaDataStorageUsagesRequest self = new GetMetaDataStorageUsagesRequest();
        return TeaModel.build(map, self);
    }

    public GetMetaDataStorageUsagesRequest setMonths(String months) {
        this.months = months;
        return this;
    }
    public String getMonths() {
        return this.months;
    }

}
