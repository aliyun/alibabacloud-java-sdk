// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ModifyCasterLayoutResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("LayoutId")
    public String layoutId;

    public static ModifyCasterLayoutResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyCasterLayoutResponseBody self = new ModifyCasterLayoutResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyCasterLayoutResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyCasterLayoutResponseBody setLayoutId(String layoutId) {
        this.layoutId = layoutId;
        return this;
    }
    public String getLayoutId() {
        return this.layoutId;
    }

}
