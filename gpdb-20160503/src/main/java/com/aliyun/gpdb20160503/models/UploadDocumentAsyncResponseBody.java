// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class UploadDocumentAsyncResponseBody extends TeaModel {
    /**
     * <p>The job ID, which is used to check the job status or cancel the job.</p>
     * 
     * <strong>example:</strong>
     * <p>231460f8-75dc-405e-a669-0c5204887e91</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The creation status. Valid values:</p>
     * <ul>
     * <li>success: The document was uploaded.</li>
     * <li>fail: The document failed to be uploaded.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Status")
    public String status;

    public static UploadDocumentAsyncResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UploadDocumentAsyncResponseBody self = new UploadDocumentAsyncResponseBody();
        return TeaModel.build(map, self);
    }

    public UploadDocumentAsyncResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public UploadDocumentAsyncResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UploadDocumentAsyncResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UploadDocumentAsyncResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
