// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ExportImageResponseBody extends TeaModel {
    @NameInMap("ExportedImageURL")
    public String exportedImageURL;

    @NameInMap("RequestId")
    public String requestId;

    public static ExportImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExportImageResponseBody self = new ExportImageResponseBody();
        return TeaModel.build(map, self);
    }

    public ExportImageResponseBody setExportedImageURL(String exportedImageURL) {
        this.exportedImageURL = exportedImageURL;
        return this;
    }
    public String getExportedImageURL() {
        return this.exportedImageURL;
    }

    public ExportImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
