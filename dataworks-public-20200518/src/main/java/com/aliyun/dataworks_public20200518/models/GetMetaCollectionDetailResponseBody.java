// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaCollectionDetailResponseBody extends TeaModel {
    /**
     * <p>The details of the collection.</p>
     */
    @NameInMap("Collection")
    public Collection collection;

    /**
     * <p>The error code.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The HTTP status code.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>true</p>
     * <br>
     * <p>false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetMetaCollectionDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMetaCollectionDetailResponseBody self = new GetMetaCollectionDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMetaCollectionDetailResponseBody setCollection(Collection collection) {
        this.collection = collection;
        return this;
    }
    public Collection getCollection() {
        return this.collection;
    }

    public GetMetaCollectionDetailResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetMetaCollectionDetailResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetMetaCollectionDetailResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetMetaCollectionDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMetaCollectionDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
