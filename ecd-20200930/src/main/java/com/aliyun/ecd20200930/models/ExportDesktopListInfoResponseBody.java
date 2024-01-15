// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ExportDesktopListInfoResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The URL from which you can download the file that contains information about exported cloud desktops.</p>
     */
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
