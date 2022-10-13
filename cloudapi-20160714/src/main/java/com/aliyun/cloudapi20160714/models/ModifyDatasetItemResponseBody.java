// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ModifyDatasetItemResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDatasetItemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDatasetItemResponseBody self = new ModifyDatasetItemResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDatasetItemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
