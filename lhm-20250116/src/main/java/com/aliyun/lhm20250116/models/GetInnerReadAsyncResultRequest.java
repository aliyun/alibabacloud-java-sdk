// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class GetInnerReadAsyncResultRequest extends TeaModel {
    /**
     * <p>The data source name. The probe task uses this field as its dimension identifier.</p>
     * 
     * <strong>example:</strong>
     * <p>ds_dolphin_prod</p>
     */
    @NameInMap("dataSourceName")
    public String dataSourceName;

    public static GetInnerReadAsyncResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInnerReadAsyncResultRequest self = new GetInnerReadAsyncResultRequest();
        return TeaModel.build(map, self);
    }

    public GetInnerReadAsyncResultRequest setDataSourceName(String dataSourceName) {
        this.dataSourceName = dataSourceName;
        return this;
    }
    public String getDataSourceName() {
        return this.dataSourceName;
    }

}
