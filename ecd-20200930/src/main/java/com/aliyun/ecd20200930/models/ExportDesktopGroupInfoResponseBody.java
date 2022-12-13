// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ExportDesktopGroupInfoResponseBody extends TeaModel {
    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The download address from which you can export desktop groups.
    @NameInMap("Url")
    public String url;

    public static ExportDesktopGroupInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExportDesktopGroupInfoResponseBody self = new ExportDesktopGroupInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public ExportDesktopGroupInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExportDesktopGroupInfoResponseBody setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
