// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class DivisionQuery extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("divisionCode")
    public String divisionCode;

    public static DivisionQuery build(java.util.Map<String, ?> map) throws Exception {
        DivisionQuery self = new DivisionQuery();
        return TeaModel.build(map, self);
    }

    public DivisionQuery setDivisionCode(String divisionCode) {
        this.divisionCode = divisionCode;
        return this;
    }
    public String getDivisionCode() {
        return this.divisionCode;
    }

}
