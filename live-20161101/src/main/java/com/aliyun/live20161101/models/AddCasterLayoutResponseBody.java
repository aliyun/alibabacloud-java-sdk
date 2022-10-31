// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddCasterLayoutResponseBody extends TeaModel {
    @NameInMap("LayoutId")
    public String layoutId;

    @NameInMap("RequestId")
    public String requestId;

    public static AddCasterLayoutResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddCasterLayoutResponseBody self = new AddCasterLayoutResponseBody();
        return TeaModel.build(map, self);
    }

    public AddCasterLayoutResponseBody setLayoutId(String layoutId) {
        this.layoutId = layoutId;
        return this;
    }
    public String getLayoutId() {
        return this.layoutId;
    }

    public AddCasterLayoutResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
