// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class ModifyWebHostingConfigResponseBody extends TeaModel {
    @NameInMap("Data")
    public Boolean data;

    @NameInMap("RequestId")
    public String requestId;

    public static ModifyWebHostingConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyWebHostingConfigResponseBody self = new ModifyWebHostingConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyWebHostingConfigResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public ModifyWebHostingConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
