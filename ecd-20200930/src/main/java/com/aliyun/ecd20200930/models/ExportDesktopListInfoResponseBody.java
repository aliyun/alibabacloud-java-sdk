// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ExportDesktopListInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Url")
    public String url;

    public static ExportDesktopListInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExportDesktopListInfoResponseBody self = new ExportDesktopListInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public ExportDesktopListInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExportDesktopListInfoResponseBody setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
