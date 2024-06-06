// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class GetInventoryListRequest extends TeaModel {
    /**
     * <p>The enterprise code.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>Type of emission</p>
     * <br>
     * <p>>  Valid values: footprint | emission. Meaning: footprint: all inventories are involved in the calculation; emission: only inventories with positive and zero emissions are involved in the calculation, and negative numbers are not involved in the calculation.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("emissionType")
    public String emissionType;

    /**
     * <p>Group by</p>
     * <br>
     * <p>>  Valid values: resource | process | resourceType | processType. Meaning: resource: aggregation by inventory group, process: aggregation by operation group, resourceType: aggregation by inventory type, processType: aggregation by phase group</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("group")
    public String group;

    /**
     * <p>The type of the obtained environmental impact: gwp indicates the carbon footprint of climate change. For more information, see the type value of the enumerated values.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("methodType")
    public String methodType;

    /**
     * <p>The product id.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("productId")
    public Long productId;

    /**
     * <p>Product type: 1 indicates that the carbon footprint of the product is requested, and 5 indicates that the carbon footprint of the supply chain is requested.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("productType")
    public Long productType;

    public static GetInventoryListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInventoryListRequest self = new GetInventoryListRequest();
        return TeaModel.build(map, self);
    }

    public GetInventoryListRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetInventoryListRequest setEmissionType(String emissionType) {
        this.emissionType = emissionType;
        return this;
    }
    public String getEmissionType() {
        return this.emissionType;
    }

    public GetInventoryListRequest setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

    public GetInventoryListRequest setMethodType(String methodType) {
        this.methodType = methodType;
        return this;
    }
    public String getMethodType() {
        return this.methodType;
    }

    public GetInventoryListRequest setProductId(Long productId) {
        this.productId = productId;
        return this;
    }
    public Long getProductId() {
        return this.productId;
    }

    public GetInventoryListRequest setProductType(Long productType) {
        this.productType = productType;
        return this;
    }
    public Long getProductType() {
        return this.productType;
    }

}
