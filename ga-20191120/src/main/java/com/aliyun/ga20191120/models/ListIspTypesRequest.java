// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListIspTypesRequest extends TeaModel {
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    /**
     * <p>The type of the Global Accelerator (GA) instance to be queried. Valid values:</p>
     * <br>
     * <p>*   **basic**: basic GA instance</p>
     * <p>*   **standard**: standard GA instance</p>
     */
    @NameInMap("AcceleratorType")
    public String acceleratorType;

    /**
     * <p>The ID of the acceleration region to be queried.</p>
     */
    @NameInMap("BusinessRegionId")
    public String businessRegionId;

    public static ListIspTypesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListIspTypesRequest self = new ListIspTypesRequest();
        return TeaModel.build(map, self);
    }

    public ListIspTypesRequest setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
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
