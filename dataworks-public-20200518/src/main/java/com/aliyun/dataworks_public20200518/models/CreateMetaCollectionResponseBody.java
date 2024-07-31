// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateMetaCollectionResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>NoPermission</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>The specified parameters are invalid.</p>
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
    public String httpStatusCode;

    /**
     * <p>The unique identifier of the collection.</p>
     * 
     * <strong>example:</strong>
     * <p>album.11111</p>
     */
    @NameInMap("QualifiedName")
    public String qualifiedName;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E6F0DBDD-5AD****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static CreateMetaCollectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMetaCollectionResponseBody self = new CreateMetaCollectionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMetaCollectionResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateMetaCollectionResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateMetaCollectionResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateMetaCollectionResponseBody setQualifiedName(String qualifiedName) {
        this.qualifiedName = qualifiedName;
        return this;
    }
    public String getQualifiedName() {
        return this.qualifiedName;
    }

    public CreateMetaCollectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateMetaCollectionResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
