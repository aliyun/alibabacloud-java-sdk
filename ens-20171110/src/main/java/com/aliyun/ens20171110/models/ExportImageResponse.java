// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ExportImageResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ExportedImageURL")
    @Validation(required = true)
    public String exportedImageURL;

    public static ExportImageResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportImageResponse self = new ExportImageResponse();
        return TeaModel.build(map, self);
    }

    public ExportImageResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExportImageResponse setExportedImageURL(String exportedImageURL) {
        this.exportedImageURL = exportedImageURL;
        return this;
    }
    public String getExportedImageURL() {
        return this.exportedImageURL;
    }

}
