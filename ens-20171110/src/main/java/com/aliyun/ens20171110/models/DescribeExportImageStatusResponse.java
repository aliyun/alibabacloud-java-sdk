// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeExportImageStatusResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ImageExportStatus")
    @Validation(required = true)
    public String imageExportStatus;

    public static DescribeExportImageStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeExportImageStatusResponse self = new DescribeExportImageStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeExportImageStatusResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeExportImageStatusResponse setImageExportStatus(String imageExportStatus) {
        this.imageExportStatus = imageExportStatus;
        return this;
    }
    public String getImageExportStatus() {
        return this.imageExportStatus;
    }

}
