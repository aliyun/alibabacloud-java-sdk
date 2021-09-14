// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datav_outer20190402.models;

import com.aliyun.tea.*;

public class UpdateScreenDatasourceConfigResponseBody extends TeaModel {
    @NameInMap("Success")
    public String success;

    @NameInMap("RequestId")
    public String requestId;

    public static UpdateScreenDatasourceConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateScreenDatasourceConfigResponseBody self = new UpdateScreenDatasourceConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateScreenDatasourceConfigResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public UpdateScreenDatasourceConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
