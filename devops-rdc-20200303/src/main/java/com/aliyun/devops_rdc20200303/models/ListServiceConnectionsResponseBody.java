// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class ListServiceConnectionsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Object")
    public java.util.List<java.util.Map<String, ?>> object;

    public static ListServiceConnectionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListServiceConnectionsResponseBody self = new ListServiceConnectionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListServiceConnectionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListServiceConnectionsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListServiceConnectionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListServiceConnectionsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListServiceConnectionsResponseBody setObject(java.util.List<java.util.Map<String, ?>> object) {
        this.object = object;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getObject() {
        return this.object;
    }

}
