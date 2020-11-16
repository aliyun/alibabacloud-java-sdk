// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddCasterLayoutResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("LayoutId")
    @Validation(required = true)
    public String layoutId;

    public static AddCasterLayoutResponse build(java.util.Map<String, ?> map) throws Exception {
        AddCasterLayoutResponse self = new AddCasterLayoutResponse();
        return TeaModel.build(map, self);
    }

    public AddCasterLayoutResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddCasterLayoutResponse setLayoutId(String layoutId) {
        this.layoutId = layoutId;
        return this;
    }
    public String getLayoutId() {
        return this.layoutId;
    }

}
