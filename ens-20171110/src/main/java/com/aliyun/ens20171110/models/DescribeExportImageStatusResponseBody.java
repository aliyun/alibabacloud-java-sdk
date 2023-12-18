// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeExportImageStatusResponseBody extends TeaModel {
    /**
     * <p>The export status of the image. Valid values:</p>
     * <br>
     * <p>*   Exporting</p>
     * <p>*   Exported</p>
     * <p>*   ExportError</p>
     * <p>*   Unexported</p>
     */
    @NameInMap("ImageExportStatus")
    public String imageExportStatus;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeExportImageStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeExportImageStatusResponseBody self = new DescribeExportImageStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeExportImageStatusResponseBody setImageExportStatus(String imageExportStatus) {
        this.imageExportStatus = imageExportStatus;
        return this;
    }
    public String getImageExportStatus() {
        return this.imageExportStatus;
    }

    public DescribeExportImageStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
