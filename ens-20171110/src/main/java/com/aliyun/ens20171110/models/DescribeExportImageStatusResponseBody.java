// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeExportImageStatusResponseBody extends TeaModel {
    /**
     * <p>The export status of the image. Valid values:</p>
     * <ul>
     * <li>Exporting</li>
     * <li>Exported</li>
     * <li>ExportError</li>
     * <li>Unexported</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Exporting</p>
     */
    @NameInMap("ImageExportStatus")
    public String imageExportStatus;

    /**
     * <p>The ID of the request.</p>
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
