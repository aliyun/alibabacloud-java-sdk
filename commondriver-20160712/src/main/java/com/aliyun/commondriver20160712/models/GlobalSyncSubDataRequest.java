// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.commondriver20160712.models;

import com.aliyun.tea.*;

public class GlobalSyncSubDataRequest extends TeaModel {
    @NameInMap("paramStr")
    public String paramStr;

    public static GlobalSyncSubDataRequest build(java.util.Map<String, ?> map) throws Exception {
        GlobalSyncSubDataRequest self = new GlobalSyncSubDataRequest();
        return TeaModel.build(map, self);
    }

    public GlobalSyncSubDataRequest setParamStr(String paramStr) {
        this.paramStr = paramStr;
        return this;
    }
    public String getParamStr() {
        return this.paramStr;
    }

}
