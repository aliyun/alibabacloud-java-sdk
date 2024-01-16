// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateGrafanaWorkspaceResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public GrafanaWorkspace data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TraceId")
    public String traceId;

    public static CreateGrafanaWorkspaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateGrafanaWorkspaceResponseBody self = new CreateGrafanaWorkspaceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateGrafanaWorkspaceResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CreateGrafanaWorkspaceResponseBody setData(GrafanaWorkspace data) {
        this.data = data;
        return this;
    }
    public GrafanaWorkspace getData() {
        return this.data;
    }

    public CreateGrafanaWorkspaceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateGrafanaWorkspaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateGrafanaWorkspaceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateGrafanaWorkspaceResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
