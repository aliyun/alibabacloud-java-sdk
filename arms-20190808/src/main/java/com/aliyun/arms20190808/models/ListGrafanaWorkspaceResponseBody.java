// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListGrafanaWorkspaceResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public java.util.List<GrafanaWorkspace> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TraceId")
    public String traceId;

    public static ListGrafanaWorkspaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGrafanaWorkspaceResponseBody self = new ListGrafanaWorkspaceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGrafanaWorkspaceResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListGrafanaWorkspaceResponseBody setData(java.util.List<GrafanaWorkspace> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GrafanaWorkspace> getData() {
        return this.data;
    }

    public ListGrafanaWorkspaceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListGrafanaWorkspaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListGrafanaWorkspaceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListGrafanaWorkspaceResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
