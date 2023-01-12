// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListIspTypesRequest extends TeaModel {
    @NameInMap("AcceleratorType")
    public String acceleratorType;

    @NameInMap("BusinessRegionId")
    public String businessRegionId;

    public static ListIspTypesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListIspTypesRequest self = new ListIspTypesRequest();
        return TeaModel.build(map, self);
    }

    public ListIspTypesRequest setAcceleratorType(String acceleratorType) {
        this.acceleratorType = acceleratorType;
        return this;
    }
    public String getAcceleratorType() {
        return this.acceleratorType;
    }

    public ListIspTypesRequest setBusinessRegionId(String businessRegionId) {
        this.businessRegionId = businessRegionId;
        return this;
    }
    public String getBusinessRegionId() {
        return this.businessRegionId;
    }

}
