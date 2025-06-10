// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetRepoTagScanStatusResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li><code>true</code>: The request is successful.</li>
     * <li><code>false</code>: The request fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BC648259-91A7-4502-BED3-EDF64361FA83</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The type of the scanning engine.</p>
     * <ul>
     * <li><code>ACR_SCAN_SERVICE</code>: Trivy scan engine provided by Container Registry</li>
     * <li><code>SAS_SCAN_SERVICE</code>: Security Center scan engine</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ACR_SCAN_SERVICE</p>
     */
    @NameInMap("ScanService")
    public String scanService;

    /**
     * <p>The scanning status of the image tag. Valid values:</p>
     * <ul>
     * <li><code>SCANNING</code>: The image tag is being scanned.</li>
     * <li><code>COMPLETE</code>: The scanning of the image tag is complete.</li>
     * <li><code>FAILED</code>: The image tag failed to be scanned.</li>
     * <li><code>RETRYING</code>: The system is retrying to scan the image tag.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>COMPLETE</p>
     */
    @NameInMap("Status")
    public String status;

    public static GetRepoTagScanStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRepoTagScanStatusResponseBody self = new GetRepoTagScanStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRepoTagScanStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetRepoTagScanStatusResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public GetRepoTagScanStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRepoTagScanStatusResponseBody setScanService(String scanService) {
        this.scanService = scanService;
        return this;
    }
    public String getScanService() {
        return this.scanService;
    }

    public GetRepoTagScanStatusResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
