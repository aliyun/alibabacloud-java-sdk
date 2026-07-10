// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class QueryVerifyFlowPackageRequest extends TeaModel {
    /**
     * <p>The product type. Valid values:</p>
     * <ul>
     * <li><strong>FINANCE_VERIFY</strong>: Financial-Grade ID Verification</li>
     * <li><strong>SMART_VERIFY</strong>: Enhanced ID Verification (discontinued)</li>
     * <li><strong>FACE_VERIFY</strong>: ID Verification (discontinued).</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>FINANCE_VERIFY</p>
     */
    @NameInMap("ProductType")
    public String productType;

    public static QueryVerifyFlowPackageRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryVerifyFlowPackageRequest self = new QueryVerifyFlowPackageRequest();
        return TeaModel.build(map, self);
    }

    public QueryVerifyFlowPackageRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

}
