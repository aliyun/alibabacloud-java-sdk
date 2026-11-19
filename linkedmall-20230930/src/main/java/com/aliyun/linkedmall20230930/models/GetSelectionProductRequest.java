// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class GetSelectionProductRequest extends TeaModel {
    /**
     * <p>The division code. A fifth-level township or subdistrict address code is recommended.</p>
     * 
     * <strong>example:</strong>
     * <p>330106109</p>
     */
    @NameInMap("divisionCode")
    public String divisionCode;

    /**
     * <p>The purchaser ID.</p>
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
