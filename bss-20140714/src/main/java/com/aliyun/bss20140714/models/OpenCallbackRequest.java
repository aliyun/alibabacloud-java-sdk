// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bss20140714.models;

import com.aliyun.tea.*;

public class OpenCallbackRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("paramStr")
    public String paramStr;

    public static OpenCallbackRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenCallbackRequest self = new OpenCallbackRequest();
        return TeaModel.build(map, self);
    }

    public OpenCallbackRequest setParamStr(String paramStr) {
        this.paramStr = paramStr;
        return this;
    }
    public String getParamStr() {
        return this.paramStr;
    }

}
