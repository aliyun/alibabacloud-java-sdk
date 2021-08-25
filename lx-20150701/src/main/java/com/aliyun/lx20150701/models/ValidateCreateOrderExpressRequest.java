// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lx20150701.models;

import com.aliyun.tea.*;

public class ValidateCreateOrderExpressRequest extends TeaModel {
    @NameInMap("ParamStr")
    public String paramStr;

    public static ValidateCreateOrderExpressRequest build(java.util.Map<String, ?> map) throws Exception {
        ValidateCreateOrderExpressRequest self = new ValidateCreateOrderExpressRequest();
        return TeaModel.build(map, self);
    }

    public ValidateCreateOrderExpressRequest setParamStr(String paramStr) {
        this.paramStr = paramStr;
        return this;
    }
    public String getParamStr() {
        return this.paramStr;
    }

}
