// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lx20150701.models;

import com.aliyun.tea.*;

public class ModifyReservedInstanceRequest extends TeaModel {
    @NameInMap("paramStr")
    public String paramStr;

    public static ModifyReservedInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyReservedInstanceRequest self = new ModifyReservedInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ModifyReservedInstanceRequest setParamStr(String paramStr) {
        this.paramStr = paramStr;
        return this;
    }
    public String getParamStr() {
        return this.paramStr;
    }

}
