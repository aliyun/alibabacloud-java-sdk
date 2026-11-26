// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class AddScriptHotWordResponseBody extends TeaModel {
    @NameInMap("hotWordId")
    public String hotWordId;

    @NameInMap("requestId")
    public String requestId;

    public static AddScriptHotWordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddScriptHotWordResponseBody self = new AddScriptHotWordResponseBody();
        return TeaModel.build(map, self);
    }

    public AddScriptHotWordResponseBody setHotWordId(String hotWordId) {
        this.hotWordId = hotWordId;
        return this;
    }
    public String getHotWordId() {
        return this.hotWordId;
    }

    public AddScriptHotWordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
