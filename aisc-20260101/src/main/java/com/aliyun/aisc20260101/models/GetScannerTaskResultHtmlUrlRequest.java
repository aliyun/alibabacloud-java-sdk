// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisc20260101.models;

import com.aliyun.tea.*;

public class GetScannerTaskResultHtmlUrlRequest extends TeaModel {
    /**
     * <p>The unique identifier of the scan task. This is the TaskId returned by CreateTargetScanTask or the ScannerTaskId returned by ListScanTasksByTarget. If the task does not exist or belongs to another tenant, a 400 error is returned to avoid exposing whether the resource exists.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>task-abc123def4567</p>
     */
    @NameInMap("ScannerTaskId")
    public String scannerTaskId;

    public static GetScannerTaskResultHtmlUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetScannerTaskResultHtmlUrlRequest self = new GetScannerTaskResultHtmlUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetScannerTaskResultHtmlUrlRequest setScannerTaskId(String scannerTaskId) {
        this.scannerTaskId = scannerTaskId;
        return this;
    }
    public String getScannerTaskId() {
        return this.scannerTaskId;
    }

}
