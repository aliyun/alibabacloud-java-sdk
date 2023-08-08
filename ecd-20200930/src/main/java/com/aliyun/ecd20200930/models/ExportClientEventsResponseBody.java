// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ExportClientEventsResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The download address from which you can export desktop groups.</p>
     */
    @NameInMap("Url")
    public String url;

    public static ExportClientEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExportClientEventsResponseBody self = new ExportClientEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public ExportClientEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExportClientEventsResponseBody setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
