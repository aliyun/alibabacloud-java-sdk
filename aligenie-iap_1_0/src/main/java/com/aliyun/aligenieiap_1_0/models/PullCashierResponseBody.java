// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieiap_1_0.models;

import com.aliyun.tea.*;

public class PullCashierResponseBody extends TeaModel {
    @NameInMap("RetCode")
    public Integer retCode;

    @NameInMap("RetMsg")
    public String retMsg;

    @NameInMap("RetValue")
    public Boolean retValue;

    public static PullCashierResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PullCashierResponseBody self = new PullCashierResponseBody();
        return TeaModel.build(map, self);
    }

    public PullCashierResponseBody setRetCode(Integer retCode) {
        this.retCode = retCode;
        return this;
    }
    public Integer getRetCode() {
        return this.retCode;
    }

    public PullCashierResponseBody setRetMsg(String retMsg) {
        this.retMsg = retMsg;
        return this;
    }
    public String getRetMsg() {
        return this.retMsg;
    }

    public PullCashierResponseBody setRetValue(Boolean retValue) {
        this.retValue = retValue;
        return this;
    }
    public Boolean getRetValue() {
        return this.retValue;
    }

}
