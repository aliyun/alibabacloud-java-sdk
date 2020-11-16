// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ModifyCasterLayoutResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("LayoutId")
    @Validation(required = true)
    public String layoutId;

    public static ModifyCasterLayoutResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyCasterLayoutResponse self = new ModifyCasterLayoutResponse();
        return TeaModel.build(map, self);
    }

    public ModifyCasterLayoutResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyCasterLayoutResponse setLayoutId(String layoutId) {
        this.layoutId = layoutId;
        return this;
    }
    public String getLayoutId() {
        return this.layoutId;
    }

}
