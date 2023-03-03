// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteGrafanaResourceResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The ID of the request. You can use the ID to query logs and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteGrafanaResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteGrafanaResourceResponseBody self = new DeleteGrafanaResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteGrafanaResourceResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public DeleteGrafanaResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
