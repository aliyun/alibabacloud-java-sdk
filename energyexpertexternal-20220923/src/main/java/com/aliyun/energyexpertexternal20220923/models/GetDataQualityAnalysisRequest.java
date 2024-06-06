// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class GetDataQualityAnalysisRequest extends TeaModel {
    /**
     * <p>The enterprise code.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>Data quality assessment type: 1 is DQI and 2 is DQR.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("dataQualityEvaluationType")
    public Long dataQualityEvaluationType;

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

    public static GetDataQualityAnalysisRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDataQualityAnalysisRequest self = new GetDataQualityAnalysisRequest();
        return TeaModel.build(map, self);
    }

    public GetDataQualityAnalysisRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDataQualityAnalysisRequest setDataQualityEvaluationType(Long dataQualityEvaluationType) {
        this.dataQualityEvaluationType = dataQualityEvaluationType;
        return this;
    }
    public Long getDataQualityEvaluationType() {
        return this.dataQualityEvaluationType;
    }

    public GetDataQualityAnalysisRequest setProductId(Long productId) {
        this.productId = productId;
        return this;
    }
    public Long getProductId() {
        return this.productId;
    }

    public GetDataQualityAnalysisRequest setProductType(Long productType) {
        this.productType = productType;
        return this;
    }
    public Long getProductType() {
        return this.productType;
    }

}
