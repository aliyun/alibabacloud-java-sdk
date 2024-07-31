// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class AddMetaCollectionEntityResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>9999</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>The specified product does not exist.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The request ID. You can use the request ID to query logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>0000-ABCD-E****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The result of the operation. Valid values:</p>
     * <ul>
     * <li>true: succeeded</li>
     * <li>false: failed</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Status")
    public Boolean status;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <p>true false</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static AddMetaCollectionEntityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddMetaCollectionEntityResponseBody self = new AddMetaCollectionEntityResponseBody();
        return TeaModel.build(map, self);
    }

    public AddMetaCollectionEntityResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public AddMetaCollectionEntityResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public AddMetaCollectionEntityResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public AddMetaCollectionEntityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddMetaCollectionEntityResponseBody setStatus(Boolean status) {
        this.status = status;
        return this;
    }
    public Boolean getStatus() {
        return this.status;
    }

    public AddMetaCollectionEntityResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
