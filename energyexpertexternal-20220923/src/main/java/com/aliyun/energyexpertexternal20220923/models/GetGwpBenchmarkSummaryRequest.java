// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class GetGwpBenchmarkSummaryRequest extends TeaModel {
    /**
     * <p>The enterprise code.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("code")
    public String code;

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

    public static GetGwpBenchmarkSummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetGwpBenchmarkSummaryRequest self = new GetGwpBenchmarkSummaryRequest();
        return TeaModel.build(map, self);
    }

    public GetGwpBenchmarkSummaryRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetGwpBenchmarkSummaryRequest setProductId(Long productId) {
        this.productId = productId;
        return this;
    }
    public Long getProductId() {
        return this.productId;
    }

    public GetGwpBenchmarkSummaryRequest setProductType(Long productType) {
        this.productType = productType;
        return this;
    }
    public Long getProductType() {
        return this.productType;
    }

}
