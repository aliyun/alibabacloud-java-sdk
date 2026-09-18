// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisc20260101.models;

import com.aliyun.tea.*;

public class GetScannerTaskHitDataUrlRequest extends TeaModel {
    /**
     * <p>The unique identifier of the scan task. This is the TaskId returned by CreateTargetScanTask or the ScannerTaskId returned by ListScanTasksByTarget. This parameter is registered as optional but is required in practice. An empty value returns HTTP status code 400. If the task does not exist or belongs to another tenant, HTTP status code 400 is returned uniformly to avoid exposing whether the resource exists.</p>
     * 
     * <strong>example:</strong>
     * <p>task-abc123def4567</p>
     */
    @NameInMap("ScannerTaskId")
    public String scannerTaskId;

    public static GetScannerTaskHitDataUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetScannerTaskHitDataUrlRequest self = new GetScannerTaskHitDataUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetScannerTaskHitDataUrlRequest setScannerTaskId(String scannerTaskId) {
        this.scannerTaskId = scannerTaskId;
        return this;
    }
    public String getScannerTaskId() {
        return this.scannerTaskId;
    }

}
