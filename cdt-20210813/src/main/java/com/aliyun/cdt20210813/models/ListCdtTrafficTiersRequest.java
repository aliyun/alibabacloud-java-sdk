// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdt20210813.models;

import com.aliyun.tea.*;

public class ListCdtTrafficTiersRequest extends TeaModel {
    @NameInMap("BusinessRegionId")
    public String businessRegionId;

    public static ListCdtTrafficTiersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCdtTrafficTiersRequest self = new ListCdtTrafficTiersRequest();
        return TeaModel.build(map, self);
    }

    public ListCdtTrafficTiersRequest setBusinessRegionId(String businessRegionId) {
        this.businessRegionId = businessRegionId;
        return this;
    }
    public String getBusinessRegionId() {
        return this.businessRegionId;
    }

}
