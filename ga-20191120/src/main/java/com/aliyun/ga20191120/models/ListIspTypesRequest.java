// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListIspTypesRequest extends TeaModel {
    /**
     * <p>The ID of the GA instance that you want to query.</p>
     * 
     * <strong>example:</strong>
     * <p>ga-bp1odcab8tmno0hdq****</p>
     */
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    /**
     * <p>The type of the Global Accelerator (GA) instance to be queried. Valid values:</p>
     * <ul>
     * <li><strong>basic</strong>: basic GA instance</li>
     * <li><strong>standard</strong>: standard GA instance</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>basic</p>
     */
    @NameInMap("AcceleratorType")
    public String acceleratorType;

    /**
     * <p>The ID of the acceleration region to be queried.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
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
