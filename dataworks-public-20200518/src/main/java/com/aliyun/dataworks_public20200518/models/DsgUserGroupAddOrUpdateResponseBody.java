// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DsgUserGroupAddOrUpdateResponseBody extends TeaModel {
    /**
     * <p>The result of the operation. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: The operation succeeded.</p>
     * </li>
     * <li><p><code>false</code>: The operation failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Data")
    public Boolean data;

    /**
     * <p>The error code that is returned if the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>1029030003</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message that is returned if the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>param error</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>400</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The ID of the request. This is a common parameter. We recommend that you save this ID. If an issue occurs, you can use the ID to locate logs for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>102400001</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request succeeded. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: The request succeeded.</p>
     * </li>
     * <li><p><code>false</code>: The request failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DsgUserGroupAddOrUpdateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DsgUserGroupAddOrUpdateResponseBody self = new DsgUserGroupAddOrUpdateResponseBody();
        return TeaModel.build(map, self);
    }

    public DsgUserGroupAddOrUpdateResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public DsgUserGroupAddOrUpdateResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DsgUserGroupAddOrUpdateResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DsgUserGroupAddOrUpdateResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DsgUserGroupAddOrUpdateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DsgUserGroupAddOrUpdateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
