// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class GetSelectionProductSaleInfoRequest extends TeaModel {
    /**
     * <p>Administrative division code. We recommend using a five-level code (township or subdistrict level).</p>
     * 
     * <strong>example:</strong>
     * <p>330106109</p>
     */
    @NameInMap("divisionCode")
    public String divisionCode;

    /**
     * <p>Purchaser ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PID22000009</p>
     */
    @NameInMap("purchaserId")
    public String purchaserId;

    public static GetSelectionProductSaleInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSelectionProductSaleInfoRequest self = new GetSelectionProductSaleInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetSelectionProductSaleInfoRequest setDivisionCode(String divisionCode) {
        this.divisionCode = divisionCode;
        return this;
    }
    public String getDivisionCode() {
        return this.divisionCode;
    }

    public GetSelectionProductSaleInfoRequest setPurchaserId(String purchaserId) {
        this.purchaserId = purchaserId;
        return this;
    }
    public String getPurchaserId() {
        return this.purchaserId;
    }

}
