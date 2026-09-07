// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListGrafanaWorkspaceAccountResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public java.util.List<GrafanaWorkspaceAccount> data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>4789C3E9-A85A-524B-B97B-9D2B14BA06BC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>eac0a8048716731735000007137d000b</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    public static ListGrafanaWorkspaceAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGrafanaWorkspaceAccountResponseBody self = new ListGrafanaWorkspaceAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGrafanaWorkspaceAccountResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListGrafanaWorkspaceAccountResponseBody setData(java.util.List<GrafanaWorkspaceAccount> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GrafanaWorkspaceAccount> getData() {
        return this.data;
    }

    public ListGrafanaWorkspaceAccountResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListGrafanaWorkspaceAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListGrafanaWorkspaceAccountResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListGrafanaWorkspaceAccountResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
