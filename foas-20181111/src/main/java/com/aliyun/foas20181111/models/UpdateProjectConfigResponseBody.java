// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class UpdateProjectConfigResponseBody extends TeaModel {
    @NameInMap("Data")
    public Boolean data;

    @NameInMap("RequestId")
    public String requestId;

    public static UpdateProjectConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateProjectConfigResponseBody self = new UpdateProjectConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateProjectConfigResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public UpdateProjectConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
