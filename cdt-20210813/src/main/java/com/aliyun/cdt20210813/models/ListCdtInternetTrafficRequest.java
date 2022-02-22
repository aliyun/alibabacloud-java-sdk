// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdt20210813.models;

import com.aliyun.tea.*;

public class ListCdtInternetTrafficRequest extends TeaModel {
    @NameInMap("BusinessRegionId")
    public String businessRegionId;

    public static ListCdtInternetTrafficRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCdtInternetTrafficRequest self = new ListCdtInternetTrafficRequest();
        return TeaModel.build(map, self);
    }

    public ListCdtInternetTrafficRequest setBusinessRegionId(String businessRegionId) {
        this.businessRegionId = businessRegionId;
        return this;
    }
    public String getBusinessRegionId() {
        return this.businessRegionId;
    }

}
