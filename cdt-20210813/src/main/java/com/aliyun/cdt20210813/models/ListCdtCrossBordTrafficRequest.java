// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdt20210813.models;

import com.aliyun.tea.*;

public class ListCdtCrossBordTrafficRequest extends TeaModel {
    @NameInMap("BusinessRegionId")
    public String businessRegionId;

    public static ListCdtCrossBordTrafficRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCdtCrossBordTrafficRequest self = new ListCdtCrossBordTrafficRequest();
        return TeaModel.build(map, self);
    }

    public ListCdtCrossBordTrafficRequest setBusinessRegionId(String businessRegionId) {
        this.businessRegionId = businessRegionId;
        return this;
    }
    public String getBusinessRegionId() {
        return this.businessRegionId;
    }

}
