// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianvoicebot20250101.models;

import com.aliyun.tea.*;

public class ListNluModelsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>llm-3pptowd2olrctsvc</p>
     */
    @NameInMap("BusinessUnitId")
    public String businessUnitId;

    public static ListNluModelsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListNluModelsRequest self = new ListNluModelsRequest();
        return TeaModel.build(map, self);
    }

    public ListNluModelsRequest setBusinessUnitId(String businessUnitId) {
        this.businessUnitId = businessUnitId;
        return this;
    }
    public String getBusinessUnitId() {
        return this.businessUnitId;
    }

}
