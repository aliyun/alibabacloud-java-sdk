// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class GetSelectionProductSaleInfoRequest extends TeaModel {
    @NameInMap("divisionCode")
    public String divisionCode;

    /**
     * <p>This parameter is required.</p>
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
