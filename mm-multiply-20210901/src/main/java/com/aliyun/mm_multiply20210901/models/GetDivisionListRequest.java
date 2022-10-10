// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class GetDivisionListRequest extends TeaModel {
    @NameInMap("DivisionCode")
    public String divisionCode;

    public static GetDivisionListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDivisionListRequest self = new GetDivisionListRequest();
        return TeaModel.build(map, self);
    }

    public GetDivisionListRequest setDivisionCode(String divisionCode) {
        this.divisionCode = divisionCode;
        return this;
    }
    public String getDivisionCode() {
        return this.divisionCode;
    }

}
