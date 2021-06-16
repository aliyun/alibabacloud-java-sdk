// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class ListPipelinesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Object")
    public java.util.Map<String, ?> object;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Success")
    public Boolean success;

    public static ListPipelinesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPipelinesResponseBody self = new ListPipelinesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPipelinesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPipelinesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListPipelinesResponseBody setObject(java.util.Map<String, ?> object) {
        this.object = object;
        return this;
    }
    public java.util.Map<String, ?> getObject() {
        return this.object;
    }

    public ListPipelinesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListPipelinesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
