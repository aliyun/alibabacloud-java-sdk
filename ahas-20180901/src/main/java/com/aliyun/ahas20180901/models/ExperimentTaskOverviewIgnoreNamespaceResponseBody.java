// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class ExperimentTaskOverviewIgnoreNamespaceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public String data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ExperimentTaskOverviewIgnoreNamespaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExperimentTaskOverviewIgnoreNamespaceResponseBody self = new ExperimentTaskOverviewIgnoreNamespaceResponseBody();
        return TeaModel.build(map, self);
    }

    public ExperimentTaskOverviewIgnoreNamespaceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ExperimentTaskOverviewIgnoreNamespaceResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public ExperimentTaskOverviewIgnoreNamespaceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ExperimentTaskOverviewIgnoreNamespaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExperimentTaskOverviewIgnoreNamespaceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
