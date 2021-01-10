// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddCasterLayoutResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("LayoutId")
    public String layoutId;

    public static AddCasterLayoutResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddCasterLayoutResponseBody self = new AddCasterLayoutResponseBody();
        return TeaModel.build(map, self);
    }

    public AddCasterLayoutResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddCasterLayoutResponseBody setLayoutId(String layoutId) {
        this.layoutId = layoutId;
        return this;
    }
    public String getLayoutId() {
        return this.layoutId;
    }

}
