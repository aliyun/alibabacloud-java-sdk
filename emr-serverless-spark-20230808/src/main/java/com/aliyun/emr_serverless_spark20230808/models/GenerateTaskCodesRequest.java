// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class GenerateTaskCodesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("genNum")
    public Integer genNum;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SS</p>
     */
    @NameInMap("productNamespace")
    public String productNamespace;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regionId")
    public String regionId;

    public static GenerateTaskCodesRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateTaskCodesRequest self = new GenerateTaskCodesRequest();
        return TeaModel.build(map, self);
    }

    public GenerateTaskCodesRequest setGenNum(Integer genNum) {
        this.genNum = genNum;
        return this;
    }
    public Integer getGenNum() {
        return this.genNum;
    }

    public GenerateTaskCodesRequest setProductNamespace(String productNamespace) {
        this.productNamespace = productNamespace;
        return this;
    }
    public String getProductNamespace() {
        return this.productNamespace;
    }

    public GenerateTaskCodesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
