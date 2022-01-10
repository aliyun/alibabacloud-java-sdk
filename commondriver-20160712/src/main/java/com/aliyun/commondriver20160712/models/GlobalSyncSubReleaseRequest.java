// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.commondriver20160712.models;

import com.aliyun.tea.*;

public class GlobalSyncSubReleaseRequest extends TeaModel {
    @NameInMap("paramStr")
    public String paramStr;

    public static GlobalSyncSubReleaseRequest build(java.util.Map<String, ?> map) throws Exception {
        GlobalSyncSubReleaseRequest self = new GlobalSyncSubReleaseRequest();
        return TeaModel.build(map, self);
    }

    public GlobalSyncSubReleaseRequest setParamStr(String paramStr) {
        this.paramStr = paramStr;
        return this;
    }
    public String getParamStr() {
        return this.paramStr;
    }

}
