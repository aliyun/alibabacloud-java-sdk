// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class MoveWebHostingFileResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public Boolean data;

    public static MoveWebHostingFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MoveWebHostingFileResponseBody self = new MoveWebHostingFileResponseBody();
        return TeaModel.build(map, self);
    }

    public MoveWebHostingFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MoveWebHostingFileResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

}
