// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddStudioLayoutResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("LayoutId")
    public String layoutId;

    public static AddStudioLayoutResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddStudioLayoutResponseBody self = new AddStudioLayoutResponseBody();
        return TeaModel.build(map, self);
    }

    public AddStudioLayoutResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddStudioLayoutResponseBody setLayoutId(String layoutId) {
        this.layoutId = layoutId;
        return this;
    }
    public String getLayoutId() {
        return this.layoutId;
    }

}
