// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class GetSelectionProductRequest extends TeaModel {
    /**
     * <p>Region code (use a five-level township or subdistrict address code)</p>
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

    public static GetSelectionProductRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSelectionProductRequest self = new GetSelectionProductRequest();
        return TeaModel.build(map, self);
    }

    public GetSelectionProductRequest setDivisionCode(String divisionCode) {
        this.divisionCode = divisionCode;
        return this;
    }
    public String getDivisionCode() {
        return this.divisionCode;
    }

    public GetSelectionProductRequest setPurchaserId(String purchaserId) {
        this.purchaserId = purchaserId;
        return this;
    }
    public String getPurchaserId() {
        return this.purchaserId;
    }

}
