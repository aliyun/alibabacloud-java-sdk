// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphone20201230.models;

import com.aliyun.tea.*;

public class ListInstanceVncUrlResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("VncUrl")
    public String vncUrl;

    public static ListInstanceVncUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceVncUrlResponseBody self = new ListInstanceVncUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstanceVncUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInstanceVncUrlResponseBody setVncUrl(String vncUrl) {
        this.vncUrl = vncUrl;
        return this;
    }
    public String getVncUrl() {
        return this.vncUrl;
    }

}
