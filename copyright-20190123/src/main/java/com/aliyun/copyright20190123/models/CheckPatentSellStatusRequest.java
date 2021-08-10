// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.copyright20190123.models;

import com.aliyun.tea.*;

public class CheckPatentSellStatusRequest extends TeaModel {
    @NameInMap("ApplyNumber")
    public String applyNumber;

    public static CheckPatentSellStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckPatentSellStatusRequest self = new CheckPatentSellStatusRequest();
        return TeaModel.build(map, self);
    }

    public CheckPatentSellStatusRequest setApplyNumber(String applyNumber) {
        this.applyNumber = applyNumber;
        return this;
    }
    public String getApplyNumber() {
        return this.applyNumber;
    }

}
