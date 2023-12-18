// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ExportImageResponseBody extends TeaModel {
    /**
     * <p>The URL that points to the exported image.</p>
     */
    @NameInMap("ExportedImageURL")
    public String exportedImageURL;

    /**
     * <p>The ID of the request.</p>
     */
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
