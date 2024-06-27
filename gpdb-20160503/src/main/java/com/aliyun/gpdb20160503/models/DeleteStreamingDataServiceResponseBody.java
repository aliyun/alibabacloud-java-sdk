// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DeleteStreamingDataServiceResponseBody extends TeaModel {
    /**
     * <p>The error message returned if the operation fails.</p>
     * <p>This parameter is returned only when the return value of <strong>Status</strong> is <strong>false</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>This external service cannot be deleted because it is still used by other data source.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B4CAF581-2AC7-41AD-8940-D56DF7AADF5B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the operation. Valid values:</p>
     * <ul>
     * <li><strong>false</strong>: The operation fails.</li>
     * <li><strong>true</strong>: The operation is successful.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Status")
    public Boolean status;

    public static DeleteStreamingDataServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteStreamingDataServiceResponseBody self = new DeleteStreamingDataServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteStreamingDataServiceResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DeleteStreamingDataServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteStreamingDataServiceResponseBody setStatus(Boolean status) {
        this.status = status;
        return this;
    }
    public Boolean getStatus() {
        return this.status;
    }

}
