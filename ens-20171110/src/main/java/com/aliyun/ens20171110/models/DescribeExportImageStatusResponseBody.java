// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeExportImageStatusResponseBody extends TeaModel {
    /**
     * <p>The image export status. Valid values:</p>
     * <ul>
     * <li>Exporting: The image is being exported.</li>
     * <li>Exported: The image is exported.</li>
     * <li>ExportError: An error occurred during the image export.</li>
     * <li>Unexported: The image is not exported.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Exporting</p>
     */
    @NameInMap("ImageExportStatus")
    public String imageExportStatus;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>14BBB3A0-3DBE-54F5-AEC8-01D3F6B1EBE2</p>
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
